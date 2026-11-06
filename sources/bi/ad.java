package bi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.lz;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ad extends FrameLayout implements ls {
    public final k41 a;
    public final org.telegram.ui.ActionBar.f6 b;
    public final int c;
    public final int d;
    public final boolean e;
    public final long f;
    public final zc h;

    public ad(Context context, boolean z9, long j3, int i7, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = i7;
        this.e = z9;
        this.c = i10;
        this.f = j3;
        this.b = f6Var;
        this.h = new zc(i10, i7, j3, z9);
        k41 k41Var = new k41(context, i10, i11, true, new ai.e(this, 12), new a1.c(this, 19), null, f6Var);
        this.a = k41Var;
        addView(k41Var, c8.ha.c(-1.0f, -1));
        k41Var.setOnScrollListener(new ai.b(this, 6));
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = qs.z3;
        k41 k41Var = this.a;
        if (i7 != i11) {
            if (i7 == qs.D3 && ((Long) objArr[0]).longValue() == this.f) {
                k41Var.f3.O(true);
                return;
            }
            return;
        }
        k41Var.f3.O(true);
        if (k41Var.canScrollVertically(1)) {
            for (int i12 = 0; i12 < k41Var.getChildCount(); i12++) {
                if (!(k41Var.getChildAt(i12) instanceof lz)) {
                }
            }
            return;
        }
        this.h.run();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j3 = this.f;
        int i7 = this.c;
        if (j3 != 0) {
            qs.f(i7).c(this, qs.D3);
        } else {
            qs.f(i7).c(this, qs.z3);
        }
        this.a.f3.O(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        long j3 = this.f;
        int i7 = this.c;
        if (j3 != 0) {
            qs.f(i7).n(this, qs.D3);
        } else {
            qs.f(i7).n(this, qs.z3);
        }
    }
}
