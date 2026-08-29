package jh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.u51;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class fa extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final u51 a;
    public final org.telegram.ui.ActionBar.c6 b;
    public final int c;
    public final int d;
    public final boolean e;
    public final long f;
    public final ea h;

    public fa(Context context, boolean z10, long j10, int i10, int i11, int i12, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.d = i10;
        this.e = z10;
        this.c = i11;
        this.f = j10;
        this.b = c6Var;
        this.h = new ea(j10, i11, i10, z10);
        u51 u51Var = new u51(context, i11, i12, true, new bg.t1(this, 23), new eg.n(this, 26), null, c6Var);
        this.a = u51Var;
        addView(u51Var, i7.f6.c(-1.0f, -1));
        u51Var.setOnScrollListener(new cg.g2(this, 9));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        u51 u51Var = this.a;
        if (i10 != i12) {
            if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f) {
                u51Var.U2.N(true);
                return;
            }
            return;
        }
        u51Var.U2.N(true);
        if (u51Var.canScrollVertically(1)) {
            for (int i13 = 0; i13 < u51Var.getChildCount(); i13++) {
                if (!(u51Var.getChildAt(i13) instanceof p00)) {
                }
            }
            return;
        }
        this.h.run();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j10 = this.f;
        int i10 = this.c;
        if (j10 != 0) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starTransactionsLoaded);
        }
        this.a.U2.N(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        long j10 = this.f;
        int i10 = this.c;
        if (j10 != 0) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        }
    }
}
