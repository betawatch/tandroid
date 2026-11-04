package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ro implements ResultCallback {
    public final /* synthetic */ org.telegram.messenger.d4 a;
    public final /* synthetic */ vo b;

    public ro(vo voVar, org.telegram.messenger.d4 d4Var) {
        this.b = voVar;
        this.a = d4Var;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        ArrayList e10 = this.a.e(7);
        vo voVar = this.b;
        org.telegram.messenger.hs.f(voVar.a).d(new cl(3, this, e10));
        voVar.S1 = false;
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
