package org.telegram.ui.Wallet;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.at;
import org.telegram.messenger.k20;
import org.telegram.messenger.vs;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class h5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ q4 a;
    public final /* synthetic */ TL_wallet.walletTransaction[] b;
    public final /* synthetic */ vs c;
    public final /* synthetic */ int d;
    public final /* synthetic */ k20 e;
    public final /* synthetic */ a3[] f;
    public final /* synthetic */ String[] h;
    public final /* synthetic */ boolean[] n;

    public h5(q4 q4Var, TL_wallet.walletTransaction[] wallettransactionArr, g5 g5Var, int i10, k20 k20Var, a3[] a3VarArr, String[] strArr, boolean[] zArr) {
        this.a = q4Var;
        this.b = wallettransactionArr;
        this.c = g5Var;
        this.d = i10;
        this.e = k20Var;
        this.f = a3VarArr;
        this.h = strArr;
        this.n = zArr;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean[], java.io.Serializable] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.a(this.b[0]);
        vs vsVar = this.c;
        if (vsVar != null) {
            int i10 = this.d;
            at.f(i10).c(vsVar, at.a4);
            at.f(i10).c(vsVar, at.b4);
        }
        k20 k20Var = this.e;
        if (k20Var != null) {
            this.f[0].n(new g(k20Var, (Serializable) this.h, (Serializable) this.n, 14));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        vs vsVar = this.c;
        if (vsVar != null) {
            int i10 = this.d;
            at.f(i10).n(vsVar, at.a4);
            at.f(i10).n(vsVar, at.b4);
        }
    }
}
