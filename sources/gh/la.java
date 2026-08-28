package gh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.i51;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class la extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final i51 a;
    public final org.telegram.ui.ActionBar.b6 b;
    public final int c;
    public final int d;
    public final boolean e;
    public final long f;
    public final ka h;

    public la(Context context, boolean z10, long j10, int i9, int i10, int i11, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.d = i9;
        this.e = z10;
        this.c = i10;
        this.f = j10;
        this.b = b6Var;
        this.h = new ka(j10, i10, i9, z10);
        i51 i51Var = new i51(context, i10, i11, true, new bh.c(this, 22), new i3(this, 7), null, b6Var);
        this.a = i51Var;
        addView(i51Var, g7.e6.c(-1.0f, -1));
        i51Var.setOnScrollListener(new bg.o2(this, 8));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = NotificationCenter.starTransactionsLoaded;
        i51 i51Var = this.a;
        if (i9 != i11) {
            if (i9 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f) {
                i51Var.U2.N(true);
                return;
            }
            return;
        }
        i51Var.U2.N(true);
        if (i51Var.canScrollVertically(1)) {
            for (int i12 = 0; i12 < i51Var.getChildCount(); i12++) {
                if (!(i51Var.getChildAt(i12) instanceof e00)) {
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
        int i9 = this.c;
        if (j10 != 0) {
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.starTransactionsLoaded);
        }
        this.a.U2.N(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        long j10 = this.f;
        int i9 = this.c;
        if (j10 != 0) {
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        }
    }
}
