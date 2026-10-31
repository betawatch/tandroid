package org.telegram.ui.Components;

import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ap implements ResultCallback {
    public final /* synthetic */ org.telegram.messenger.g4 a;
    public final /* synthetic */ dp b;

    public ap(dp dpVar, org.telegram.messenger.g4 g4Var) {
        this.b = dpVar;
        this.a = g4Var;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onComplete(Object obj) {
        org.telegram.messenger.g4 g4Var = this.a;
        ArrayList e = g4Var.e((g4Var.f.c ? 2 : 0) | 5);
        dp dpVar = this.b;
        org.telegram.messenger.zs.f(dpVar.a).d(new cd(23, this, e));
        dpVar.R1 = false;
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final /* synthetic */ void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override // org.telegram.tgnet.ResultCallback
    public final void onError(TLRPC.TL_error tL_error) {
        Toast.makeText(this.b.getContext(), tL_error.text, 0).show();
    }
}
