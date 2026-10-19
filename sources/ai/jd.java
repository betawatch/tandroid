package ai;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.b71;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class jd extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final b71 a;
    public final org.telegram.ui.ActionBar.d6 b;
    public final int c;
    public final int d;
    public final boolean e;
    public final long f;
    public final id h;

    public jd(Context context, boolean z10, long j10, int i10, int i11, int i12, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = i10;
        this.e = z10;
        this.c = i11;
        this.f = j10;
        this.b = d6Var;
        this.h = new id(j10, i11, i10, z10);
        b71 b71Var = new b71(context, i11, i12, true, new q(this, 10), new a1.c(this, 11), null, d6Var);
        this.a = b71Var;
        addView(b71Var, w7.z5.c(-1.0f, -1));
        b71Var.setOnScrollListener(new ah.d0(this, 4));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        b71 b71Var = this.a;
        if (i10 != i12) {
            if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f) {
                b71Var.W2.N(true);
                return;
            }
            return;
        }
        b71Var.W2.N(true);
        if (b71Var.canScrollVertically(1)) {
            for (int i13 = 0; i13 < b71Var.getChildCount(); i13++) {
                if (!(b71Var.getChildAt(i13) instanceof b10)) {
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
        this.a.W2.N(false);
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
