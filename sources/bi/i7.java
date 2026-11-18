package bi;

import android.content.Context;
import android.text.SpannableString;
import android.widget.LinearLayout;
import c8.ma;
import di.pb;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.p80;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class i7 extends LinearLayout implements fs {
    public final int a;
    public final org.telegram.ui.Components.n6 b;
    public final org.telegram.ui.Components.n6 c;
    public final lq[] d;
    public final lq[] e;
    public SpannableString f;
    public x10 h;
    public long n;

    public i7(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.d = new lq[1];
        this.e = new lq[1];
        this.n = -1L;
        this.a = i7;
        setOrientation(1);
        setGravity(21);
        int L = org.telegram.messenger.g0.L(6.0f);
        setPadding(org.telegram.messenger.g0.L(13.0f) + L, L, org.telegram.messenger.g0.L(14.0f) + L, L);
        org.telegram.ui.Components.n6 a10 = a(context, i6Var);
        this.b = a10;
        addView(a10, ma.r(-2, 18, 5));
        org.telegram.ui.Components.n6 a11 = a(context, i6Var);
        this.c = a11;
        addView(a11, ma.r(-2, 18, 5));
        b(false);
    }

    public static org.telegram.ui.Components.n6 a(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, true, false);
        n6Var.n = true;
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        n6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        n6Var.setGravity(5);
        org.telegram.ui.ActionBar.u6.Y(n6Var, org.telegram.ui.ActionBar.n6.G6, i6Var);
        return n6Var;
    }

    public final void b(boolean z10) {
        int i7 = this.a;
        di.x8 y10 = di.x8.y(i7, false);
        di.x8 y11 = di.x8.y(i7, true);
        long j3 = y10.p().amount;
        cg.a s5 = y11.s();
        if (ii.n.c(i7)) {
            s5 = cg.a.j(Math.max(0L, org.telegram.ui.Wallet.u0.D(i7).A()) + s5.b, cg.b.b);
        }
        boolean z11 = y10.e;
        org.telegram.ui.Components.n6 n6Var = this.b;
        org.telegram.ui.Components.n6 n6Var2 = this.c;
        if (!z11 || !y11.e) {
            if (this.f == null) {
                SpannableString spannableString = new SpannableString("x");
                this.f = spannableString;
                spannableString.setSpan(new p80(org.telegram.messenger.g0.L(48.0f), n6Var), 0, 1, 33);
            }
            n6Var.c(this.f, false, true);
            n6Var2.setVisibility(8);
            this.n = -1L;
            return;
        }
        n6Var.c(pb.b1(false, i5.c.l(j3, ' ', new StringBuilder("⭐️")), 0.7f, this.d), z10, true);
        if (s5.l()) {
            n6Var2.setVisibility(8);
        } else {
            n6Var2.setVisibility(0);
            String str = "⭐️" + s5.o(2).d();
            lq[] lqVarArr = this.e;
            n6Var2.c(pb.b1(true, str, 0.7f, lqVarArr), z10, true);
            lq lqVar = lqVarArr[0];
            if (lqVar != null) {
                lqVar.a(org.telegram.ui.ActionBar.n6.Zl);
            }
        }
        this.n = j3;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.A3 || i7 == ks.d4) {
            b(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b(false);
        int i7 = this.a;
        ks.f(i7).b(this, ks.A3);
        ks.f(i7).b(this, ks.d4);
        if (ii.n.c(i7) && org.telegram.ui.Wallet.u0.D(i7).y() == null) {
            org.telegram.ui.Wallet.u0.D(i7).K();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.a;
        ks.f(i7).n(this, ks.A3);
        ks.f(i7).n(this, ks.d4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        x10 x10Var = this.h;
        if (x10Var == null || i7 == i11) {
            return;
        }
        x10Var.a(Integer.valueOf(i7));
    }

    public void setOnWidthChanged(x10 x10Var) {
        this.h = x10Var;
    }
}
