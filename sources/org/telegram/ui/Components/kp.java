package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class kp implements ResultCallback {
    public final /* synthetic */ org.telegram.messenger.f4 a;
    public final /* synthetic */ np b;

    public kp(np npVar, org.telegram.messenger.f4 f4Var) {
        this.b = npVar;
        this.a = f4Var;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        org.telegram.messenger.f4 f4Var = this.a;
        ArrayList e10 = f4Var.e((f4Var.f.c ? 2 : 0) | 5);
        np npVar = this.b;
        org.telegram.messenger.ks.f(npVar.a).d(new mf(21, this, e10));
        npVar.V1 = false;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.b.getContext(), tL_error.text, 0).show();
    }
}
