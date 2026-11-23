package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class v5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ fi.r a;
    public final /* synthetic */ TL_wallet.walletTransaction[] b;
    public final /* synthetic */ fs c;
    public final /* synthetic */ int d;
    public final /* synthetic */ p10 e;
    public final /* synthetic */ f3[] f;
    public final /* synthetic */ String[] h;
    public final /* synthetic */ boolean[] n;

    public v5(fi.r rVar, TL_wallet.walletTransaction[] wallettransactionArr, u5 u5Var, int i7, p10 p10Var, f3[] f3VarArr, String[] strArr, boolean[] zArr) {
        this.a = rVar;
        this.b = wallettransactionArr;
        this.c = u5Var;
        this.d = i7;
        this.e = p10Var;
        this.f = f3VarArr;
        this.h = strArr;
        this.n = zArr;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.a(this.b[0]);
        fs fsVar = this.c;
        if (fsVar != null) {
            int i7 = this.d;
            ks.f(i7).c(fsVar, ks.d4);
            ks.f(i7).c(fsVar, ks.e4);
        }
        p10 p10Var = this.e;
        if (p10Var != null) {
            this.f[0].n(new p(p10Var, this.h, this.n, 15));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        fs fsVar = this.c;
        if (fsVar != null) {
            int i7 = this.d;
            ks.f(i7).n(fsVar, ks.d4);
            ks.f(i7).n(fsVar, ks.e4);
        }
    }
}
