package bi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.q41;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class ad extends FrameLayout implements ls {
    public final q41 a;
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
        q41 q41Var = new q41(context, i10, i11, true, new ai.e(this, 12), new a1.c(this, 19), null, f6Var);
        this.a = q41Var;
        addView(q41Var, c8.ha.c(-1.0f, -1));
        q41Var.setOnScrollListener(new ai.b(this, 6));
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = qs.z3;
        q41 q41Var = this.a;
        if (i7 != i11) {
            if (i7 == qs.D3 && ((Long) objArr[0]).longValue() == this.f) {
                q41Var.f3.O(true);
                return;
            }
            return;
        }
        q41Var.f3.O(true);
        if (q41Var.canScrollVertically(1)) {
            for (int i12 = 0; i12 < q41Var.getChildCount(); i12++) {
                if (!(q41Var.getChildAt(i12) instanceof mz)) {
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
