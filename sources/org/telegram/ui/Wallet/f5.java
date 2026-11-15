package org.telegram.ui.Wallet;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.messenger.s10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class f5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ fi.r a;
    public final /* synthetic */ TL_wallet.walletTransaction[] b;
    public final /* synthetic */ is c;
    public final /* synthetic */ int d;
    public final /* synthetic */ s10 e;
    public final /* synthetic */ x2[] f;
    public final /* synthetic */ String[] h;
    public final /* synthetic */ boolean[] n;

    public f5(fi.r rVar, TL_wallet.walletTransaction[] wallettransactionArr, e5 e5Var, int i7, s10 s10Var, x2[] x2VarArr, String[] strArr, boolean[] zArr) {
        this.a = rVar;
        this.b = wallettransactionArr;
        this.c = e5Var;
        this.d = i7;
        this.e = s10Var;
        this.f = x2VarArr;
        this.h = strArr;
        this.n = zArr;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean[], java.io.Serializable] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.a(this.b[0]);
        is isVar = this.c;
        if (isVar != null) {
            int i7 = this.d;
            ns.f(i7).c(isVar, ns.a4);
            ns.f(i7).c(isVar, ns.b4);
        }
        s10 s10Var = this.e;
        if (s10Var != null) {
            this.f[0].n(new g(s10Var, (Serializable) this.h, (Serializable) this.n, 15));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        is isVar = this.c;
        if (isVar != null) {
            int i7 = this.d;
            ns.f(i7).n(isVar, ns.a4);
            ns.f(i7).n(isVar, ns.b4);
        }
    }
}
