package org.telegram.ui.Wallet;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class d5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ di.r a;
    public final /* synthetic */ TL_wallet.walletTransaction[] b;
    public final /* synthetic */ ls c;
    public final /* synthetic */ int d;
    public final /* synthetic */ v10 e;
    public final /* synthetic */ y2[] f;
    public final /* synthetic */ String[] h;
    public final /* synthetic */ boolean[] n;

    public d5(di.r rVar, TL_wallet.walletTransaction[] wallettransactionArr, c5 c5Var, int i7, v10 v10Var, y2[] y2VarArr, String[] strArr, boolean[] zArr) {
        this.a = rVar;
        this.b = wallettransactionArr;
        this.c = c5Var;
        this.d = i7;
        this.e = v10Var;
        this.f = y2VarArr;
        this.h = strArr;
        this.n = zArr;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean[], java.io.Serializable] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.a(this.b[0]);
        ls lsVar = this.c;
        if (lsVar != null) {
            int i7 = this.d;
            qs.f(i7).c(lsVar, qs.a4);
            qs.f(i7).c(lsVar, qs.b4);
        }
        v10 v10Var = this.e;
        if (v10Var != null) {
            this.f[0].n(new g(v10Var, (Serializable) this.h, (Serializable) this.n, 14));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ls lsVar = this.c;
        if (lsVar != null) {
            int i7 = this.d;
            qs.f(i7).n(lsVar, qs.a4);
            qs.f(i7).n(lsVar, qs.b4);
        }
    }
}
