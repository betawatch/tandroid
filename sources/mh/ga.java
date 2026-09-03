package mh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.u00;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class ga extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final h61 a;
    public final org.telegram.ui.ActionBar.g6 b;
    public final int c;
    public final int d;
    public final boolean e;
    public final long f;
    public final fa h;

    public ga(Context context, boolean z4, long j10, int i10, int i11, int i12, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.d = i10;
        this.e = z4;
        this.c = i11;
        this.f = j10;
        this.b = g6Var;
        this.h = new fa(j10, i11, i10, z4);
        h61 h61Var = new h61(context, i11, i12, true, new eg.p1(this, 23), new m5(this, 4), null, g6Var);
        this.a = h61Var;
        addView(h61Var, k7.c6.c(-1.0f, -1));
        h61Var.setOnScrollListener(new fg.e2(this, 9));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        h61 h61Var = this.a;
        if (i10 != i12) {
            if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f) {
                h61Var.V2.N(true);
                return;
            }
            return;
        }
        h61Var.V2.N(true);
        if (h61Var.canScrollVertically(1)) {
            for (int i13 = 0; i13 < h61Var.getChildCount(); i13++) {
                if (!(h61Var.getChildAt(i13) instanceof u00)) {
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
        this.a.V2.N(false);
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
