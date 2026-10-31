package org.telegram.ui.Wallet;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.j20;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ q4 a;
    public final /* synthetic */ TL_wallet.walletTransaction[] b;
    public final /* synthetic */ us c;
    public final /* synthetic */ int d;
    public final /* synthetic */ j20 e;
    public final /* synthetic */ z2[] f;
    public final /* synthetic */ String[] h;
    public final /* synthetic */ boolean[] n;

    public h5(q4 q4Var, TL_wallet.walletTransaction[] wallettransactionArr, g5 g5Var, int i10, j20 j20Var, z2[] z2VarArr, String[] strArr, boolean[] zArr) {
        this.a = q4Var;
        this.b = wallettransactionArr;
        this.c = g5Var;
        this.d = i10;
        this.e = j20Var;
        this.f = z2VarArr;
        this.h = strArr;
        this.n = zArr;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean[], java.io.Serializable] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.a(this.b[0]);
        us usVar = this.c;
        if (usVar != null) {
            int i10 = this.d;
            zs.f(i10).c(usVar, zs.a4);
            zs.f(i10).c(usVar, zs.b4);
        }
        j20 j20Var = this.e;
        if (j20Var != null) {
            this.f[0].o(new g(j20Var, (Serializable) this.h, (Serializable) this.n, 14));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        us usVar = this.c;
        if (usVar != null) {
            int i10 = this.d;
            zs.f(i10).n(usVar, zs.a4);
            zs.f(i10).n(usVar, zs.b4);
        }
    }
}
