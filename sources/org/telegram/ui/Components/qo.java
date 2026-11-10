package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class qo implements ResultCallback {
    public final /* synthetic */ org.telegram.messenger.d4 a;
    public final /* synthetic */ vo b;

    public qo(vo voVar, org.telegram.messenger.d4 d4Var) {
        this.b = voVar;
        this.a = d4Var;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        ArrayList e10 = this.a.e(7);
        vo voVar = this.b;
        org.telegram.messenger.qs.f(voVar.a).d(new org.telegram.ui.fq(29, this, e10));
        voVar.U1 = false;
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
