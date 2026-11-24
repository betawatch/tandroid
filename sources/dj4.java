// default package

import android.os.Bundle;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class dj4 implements a33 {
    public final /* synthetic */ CancellationToken a;
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ k16 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Runnable[] e;

    public dj4(CancellationToken cancellationToken, TaskCompletionSource taskCompletionSource, k16 k16Var, int i, Runnable[] runnableArr) {
        this.a = cancellationToken;
        this.b = taskCompletionSource;
        this.c = k16Var;
        this.d = i;
        this.e = runnableArr;
    }

    @Override // a33
    public final void A(Object obj) {
        vu4 vu4Var = (vu4) obj;
        if (this.a.isCancellationRequested()) {
            return;
        }
        boolean z = vu4Var instanceof sl7;
        TaskCompletionSource taskCompletionSource = this.b;
        if (z) {
            taskCompletionSource.trySetException(new Exception("EMPTY"));
        } else if ((vu4Var instanceof su4) || (vu4Var instanceof wu4)) {
            taskCompletionSource.trySetException(new CancellationException());
        } else {
            taskCompletionSource.trySetException(vu4Var);
        }
    }

    @Override // a33
    public final void onResult(Object obj) {
        yu4 yu4Var = (yu4) obj;
        TaskCompletionSource taskCompletionSource = this.b;
        CancellationToken cancellationToken = this.a;
        if (cancellationToken.isCancellationRequested()) {
            return;
        }
        try {
            String string = new JSONObject(((Bundle) yu4Var.a.a).getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON")).getJSONObject("data").getJSONObject("vp_token").getJSONArray("firebase").getString(0);
            this.c.run();
            TLRPC.TL_auth_finishFirebasePnvLogin tL_auth_finishFirebasePnvLogin = new TLRPC.TL_auth_finishFirebasePnvLogin();
            tL_auth_finishFirebasePnvLogin.google_token = string;
            int i = this.d;
            rt2 rt2Var = new rt2(i, ConnectionsManager.getInstance(i).sendRequestTyped(tL_auth_finishFirebasePnvLogin, new kc((byte) 0), new lf2(cancellationToken, taskCompletionSource, (byte) 15), 8), (byte) 3);
            Runnable[] runnableArr = this.e;
            runnableArr[0] = rt2Var;
            if (cancellationToken.isCancellationRequested()) {
                runnableArr[0].run();
            }
        } catch (Exception e) {
            taskCompletionSource.trySetException(e);
        }
    }
}
