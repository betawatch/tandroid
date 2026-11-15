package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class bp implements ResultCallback {
    public final /* synthetic */ org.telegram.messenger.d4 a;
    public final /* synthetic */ ep b;

    public bp(ep epVar, org.telegram.messenger.d4 d4Var) {
        this.b = epVar;
        this.a = d4Var;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        org.telegram.messenger.d4 d4Var = this.a;
        ArrayList e10 = d4Var.e((d4Var.f.c ? 2 : 0) | 5);
        ep epVar = this.b;
        org.telegram.messenger.ns.f(epVar.a).d(new od(23, this, e10));
        epVar.V1 = false;
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
