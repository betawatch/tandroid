package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class so implements ResultCallback {
    public final /* synthetic */ org.telegram.messenger.d4 a;
    public final /* synthetic */ vo b;

    public so(vo voVar, org.telegram.messenger.d4 d4Var) {
        this.b = voVar;
        this.a = d4Var;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        org.telegram.messenger.d4 d4Var = this.a;
        ArrayList e10 = d4Var.e((d4Var.f.c ? 2 : 0) | 5);
        vo voVar = this.b;
        org.telegram.messenger.qs.f(voVar.a).d(new f(29, this, e10));
        voVar.R1 = false;
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
