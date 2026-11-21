package org.telegram.ui.Wallet;

import android.view.View;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.q10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class u5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ fi.r a;
    public final /* synthetic */ TL_wallet.walletTransaction[] b;
    public final /* synthetic */ fs c;
    public final /* synthetic */ int d;
    public final /* synthetic */ q10 e;
    public final /* synthetic */ e3[] f;
    public final /* synthetic */ String[] h;
    public final /* synthetic */ boolean[] n;

    public u5(fi.r rVar, TL_wallet.walletTransaction[] wallettransactionArr, t5 t5Var, int i7, q10 q10Var, e3[] e3VarArr, String[] strArr, boolean[] zArr) {
        this.a = rVar;
        this.b = wallettransactionArr;
        this.c = t5Var;
        this.d = i7;
        this.e = q10Var;
        this.f = e3VarArr;
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
        q10 q10Var = this.e;
        if (q10Var != null) {
            this.f[0].n(new p(q10Var, this.h, this.n, 15));
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
