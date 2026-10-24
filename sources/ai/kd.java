package ai;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.j71;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class kd extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final j71 a;
    public final org.telegram.ui.ActionBar.g6 b;
    public final int c;
    public final int d;
    public final boolean e;
    public final long f;
    public final jd h;

    public kd(Context context, boolean z10, long j10, int i10, int i11, int i12, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.d = i10;
        this.e = z10;
        this.c = i11;
        this.f = j10;
        this.b = g6Var;
        this.h = new jd(j10, i11, i10, z10);
        j71 j71Var = new j71(context, i11, i12, true, new q(this, 10), new a1.c(this, 11), null, g6Var);
        this.a = j71Var;
        addView(j71Var, w7.z5.c(-1.0f, -1));
        j71Var.setOnScrollListener(new ah.d0(this, 4));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        j71 j71Var = this.a;
        if (i10 != i12) {
            if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f) {
                j71Var.Z2.N(true);
                return;
            }
            return;
        }
        j71Var.Z2.N(true);
        if (j71Var.canScrollVertically(1)) {
            for (int i13 = 0; i13 < j71Var.getChildCount(); i13++) {
                if (!(j71Var.getChildAt(i13) instanceof b10)) {
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
        this.a.Z2.N(false);
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
