package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ip implements ResultCallback {
    public final /* synthetic */ org.telegram.messenger.f4 a;
    public final /* synthetic */ lp b;

    public ip(lp lpVar, org.telegram.messenger.f4 f4Var) {
        this.b = lpVar;
        this.a = f4Var;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        org.telegram.messenger.f4 f4Var = this.a;
        ArrayList e10 = f4Var.e((f4Var.f.c ? 2 : 0) | 5);
        lp lpVar = this.b;
        org.telegram.messenger.ks.f(lpVar.a).d(new mg(19, this, e10));
        lpVar.V1 = false;
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
