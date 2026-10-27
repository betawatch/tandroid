package bi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.s71;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class ad extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final s71 a;
    public final org.telegram.ui.ActionBar.u6 b;
    public final int c;
    public final int d;
    public final boolean e;
    public final long f;
    public final zc h;

    public ad(Context context, boolean z10, long j10, int i10, int i11, int i12, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.d = i10;
        this.e = z10;
        this.c = i11;
        this.f = j10;
        this.b = u6Var;
        this.h = new zc(j10, i11, i10, z10);
        s71 s71Var = new s71(context, i11, i12, true, new ai.e(this, 13), new a1.c(this, 13), null, u6Var);
        this.a = s71Var;
        addView(s71Var, kb1.g(-1.0f, -1));
        s71Var.setOnScrollListener(new ai.b(this, 7));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        s71 s71Var = this.a;
        if (i10 != i12) {
            if (i10 == NotificationCenter.botStarsTransactionsLoaded && ((Long) objArr[0]).longValue() == this.f) {
                s71Var.g3.O(true);
                return;
            }
            return;
        }
        s71Var.g3.O(true);
        if (s71Var.canScrollVertically(1)) {
            for (int i13 = 0; i13 < s71Var.getChildCount(); i13++) {
                if (!(s71Var.getChildAt(i13) instanceof c10)) {
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
            NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.botStarsTransactionsLoaded);
        } else {
            NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.starTransactionsLoaded);
        }
        this.a.g3.O(false);
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
