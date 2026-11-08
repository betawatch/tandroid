package org.telegram.messenger;

import android.os.Bundle;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.zc0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class h9 implements v0.g {
    public final /* synthetic */ CancellationToken a;
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ zc0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Runnable[] e;

    public h9(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, zc0 zc0Var, int i7, Runnable[] runnableArr) {
        this.a = cancellationToken;
        this.b = taskCompletionSource;
        this.c = zc0Var;
        this.d = i7;
        this.e = runnableArr;
    }

    @Override // v0.g
    public final void a(Object obj) {
        w0.i iVar = (w0.i) obj;
        if (this.a.isCancellationRequested()) {
            return;
        }
        boolean z9 = iVar instanceof w0.k;
        TaskCompletionSource taskCompletionSource = this.b;
        if (z9) {
            taskCompletionSource.trySetException(new Exception("EMPTY"));
        } else if ((iVar instanceof w0.g) || (iVar instanceof w0.j)) {
            taskCompletionSource.trySetException(new CancellationException());
        } else {
            taskCompletionSource.trySetException(iVar);
        }
    }

    @Override // v0.g
    public final void onResult(Object obj) {
        v0.o oVar = (v0.o) obj;
        TaskCompletionSource taskCompletionSource = this.b;
        CancellationToken cancellationToken = this.a;
        if (cancellationToken.isCancellationRequested()) {
            return;
        }
        try {
            String string = new JSONObject(((Bundle) oVar.a.a).getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON")).getJSONObject("data").getJSONObject("vp_token").getJSONArray("firebase").getString(0);
            this.c.run();
            TLRPC.TL_auth_finishFirebasePnvLogin tL_auth_finishFirebasePnvLogin = new TLRPC.TL_auth_finishFirebasePnvLogin();
            tL_auth_finishFirebasePnvLogin.google_token = string;
            int i7 = this.d;
            g9 g9Var = new g9(i7, ConnectionsManager.getInstance(i7).sendRequestTyped(tL_auth_finishFirebasePnvLogin, new d3.b(1), new x3(1, cancellationToken, taskCompletionSource), 8), 1);
            Runnable[] runnableArr = this.e;
            runnableArr[0] = g9Var;
            if (cancellationToken.isCancellationRequested()) {
                runnableArr[0].run();
            }
        } catch (Exception e10) {
            taskCompletionSource.trySetException(e10);
        }
    }
}
