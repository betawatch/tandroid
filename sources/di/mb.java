package di;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.yz;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class mb extends FrameLayout implements gs {
    public final h51 a;
    public final org.telegram.ui.ActionBar.h6 b;
    public final int c;
    public final int d;
    public final boolean e;
    public final long f;
    public final lb h;
    public org.telegram.ui.Wallet.e4 n;
    public String r;

    public mb(Context context, boolean z10, long j3, int i7, int i10, int i11, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.d = i7;
        this.e = z10;
        this.c = i10;
        this.f = j3;
        this.b = h6Var;
        this.h = new lb(i10, i7, j3, z10);
        h51 h51Var = new h51(context, i10, i11, true, new bi.b(this, 22), new v6(this, 2), null, h6Var);
        this.a = h51Var;
        addView(h51Var, c8.ma.c(-1.0f, -1));
        h51Var.setOnScrollListener(new bi.u1(this, 11));
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ls.B3;
        h51 h51Var = this.a;
        if (i7 == i11) {
            h51Var.g3.O(true);
            if (h51Var.canScrollVertically(1)) {
                for (int i12 = 0; i12 < h51Var.getChildCount(); i12++) {
                    if (!(h51Var.getChildAt(i12) instanceof yz)) {
                    }
                }
                return;
            }
            this.h.run();
            return;
        }
        if (i7 == ls.F3) {
            if (((Long) objArr[0]).longValue() == this.f) {
                h51Var.g3.O(true);
            }
        } else {
            if (i7 != ls.d4 || this.n == null || TextUtils.equals(this.r, org.telegram.ui.Wallet.u0.D(this.c).y())) {
                return;
            }
            h51Var.g3.O(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j3 = this.f;
        int i7 = this.c;
        if (j3 != 0) {
            ls.f(i7).c(this, ls.F3);
        } else {
            ls.f(i7).c(this, ls.B3);
            if (this.e) {
                ls.f(i7).c(this, ls.d4);
            }
        }
        this.a.g3.O(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        long j3 = this.f;
        int i7 = this.c;
        if (j3 != 0) {
            ls.f(i7).n(this, ls.F3);
            return;
        }
        ls.f(i7).n(this, ls.B3);
        if (this.e) {
            ls.f(i7).n(this, ls.d4);
        }
    }
}
