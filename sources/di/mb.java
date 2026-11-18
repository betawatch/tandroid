package di;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.wz;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class mb extends FrameLayout implements fs {
    public final e51 a;
    public final org.telegram.ui.ActionBar.i6 b;
    public final int c;
    public final int d;
    public final boolean e;
    public final long f;
    public final lb h;
    public org.telegram.ui.Wallet.e4 n;
    public String r;

    public mb(Context context, boolean z10, long j3, int i7, int i10, int i11, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.d = i7;
        this.e = z10;
        this.c = i10;
        this.f = j3;
        this.b = i6Var;
        this.h = new lb(i10, i7, j3, z10);
        e51 e51Var = new e51(context, i10, i11, true, new bi.b(this, 22), new c7(this, 1), null, i6Var);
        this.a = e51Var;
        addView(e51Var, c8.ma.c(-1.0f, -1));
        e51Var.setOnScrollListener(new bi.q1(this, 11));
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ks.B3;
        e51 e51Var = this.a;
        if (i7 == i11) {
            e51Var.g3.O(true);
            if (e51Var.canScrollVertically(1)) {
                for (int i12 = 0; i12 < e51Var.getChildCount(); i12++) {
                    if (!(e51Var.getChildAt(i12) instanceof wz)) {
                    }
                }
                return;
            }
            this.h.run();
            return;
        }
        if (i7 == ks.F3) {
            if (((Long) objArr[0]).longValue() == this.f) {
                e51Var.g3.O(true);
            }
        } else {
            if (i7 != ks.c4 || this.n == null || TextUtils.equals(this.r, org.telegram.ui.Wallet.u0.D(this.c).y())) {
                return;
            }
            e51Var.g3.O(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j3 = this.f;
        int i7 = this.c;
        if (j3 != 0) {
            ks.f(i7).c(this, ks.F3);
        } else {
            ks.f(i7).c(this, ks.B3);
            if (this.e) {
                ks.f(i7).c(this, ks.c4);
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
            ks.f(i7).n(this, ks.F3);
            return;
        }
        ks.f(i7).n(this, ks.B3);
        if (this.e) {
            ks.f(i7).n(this, ks.c4);
        }
    }
}
