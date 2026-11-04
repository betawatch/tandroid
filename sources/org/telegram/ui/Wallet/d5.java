package org.telegram.ui.Wallet;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.n10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ ei.s a;
    public final /* synthetic */ TL_wallet.walletTransaction[] b;
    public final /* synthetic */ cs c;
    public final /* synthetic */ int d;
    public final /* synthetic */ n10 e;
    public final /* synthetic */ y2[] f;
    public final /* synthetic */ String[] h;
    public final /* synthetic */ boolean[] n;

    public d5(ei.s sVar, TL_wallet.walletTransaction[] wallettransactionArr, c5 c5Var, int i3, n10 n10Var, y2[] y2VarArr, String[] strArr, boolean[] zArr) {
        this.a = sVar;
        this.b = wallettransactionArr;
        this.c = c5Var;
        this.d = i3;
        this.e = n10Var;
        this.f = y2VarArr;
        this.h = strArr;
        this.n = zArr;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean[], java.io.Serializable] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.a(this.b[0]);
        cs csVar = this.c;
        if (csVar != null) {
            int i3 = this.d;
            hs.f(i3).c(csVar, hs.a4);
            hs.f(i3).c(csVar, hs.b4);
        }
        n10 n10Var = this.e;
        if (n10Var != null) {
            this.f[0].n(new g(n10Var, (Serializable) this.h, (Serializable) this.n, 14));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        cs csVar = this.c;
        if (csVar != null) {
            int i3 = this.d;
            hs.f(i3).n(csVar, hs.a4);
            hs.f(i3).n(csVar, hs.b4);
        }
    }
}
