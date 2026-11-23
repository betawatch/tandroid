package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
import org.telegram.messenger.r10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class u5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ fi.r a;
    public final /* synthetic */ TL_wallet.walletTransaction[] b;
    public final /* synthetic */ gs c;
    public final /* synthetic */ int d;
    public final /* synthetic */ r10 e;
    public final /* synthetic */ e3[] f;
    public final /* synthetic */ String[] h;
    public final /* synthetic */ boolean[] n;

    public u5(fi.r rVar, TL_wallet.walletTransaction[] wallettransactionArr, t5 t5Var, int i7, r10 r10Var, e3[] e3VarArr, String[] strArr, boolean[] zArr) {
        this.a = rVar;
        this.b = wallettransactionArr;
        this.c = t5Var;
        this.d = i7;
        this.e = r10Var;
        this.f = e3VarArr;
        this.h = strArr;
        this.n = zArr;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.a(this.b[0]);
        gs gsVar = this.c;
        if (gsVar != null) {
            int i7 = this.d;
            ls.f(i7).c(gsVar, ls.d4);
            ls.f(i7).c(gsVar, ls.e4);
        }
        r10 r10Var = this.e;
        if (r10Var != null) {
            this.f[0].n(new p(r10Var, this.h, this.n, 15));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        gs gsVar = this.c;
        if (gsVar != null) {
            int i7 = this.d;
            ls.f(i7).n(gsVar, ls.d4);
            ls.f(i7).n(gsVar, ls.e4);
        }
    }
}
