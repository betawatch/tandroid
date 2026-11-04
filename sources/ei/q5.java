package ei;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q5 extends FrameLayout implements r0.l {
    public final d2.t0 a;
    public final /* synthetic */ s5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(s5 s5Var, Context context) {
        super(context);
        this.b = s5Var;
        this.a = new d2.t0();
    }

    @Override // r0.k
    public final void m(int i3, View view) {
        this.a.a = 0;
    }

    @Override // r0.l
    public final void n(View view, int i3, int i10, int i11, int i12, int i13, int[] iArr) {
        s5 s5Var = this.b;
        r9 r9Var = s5Var.r;
        if (s5Var.y <= 0 && i12 != 0 && i10 == 0) {
            float f10 = r9Var.f0;
            float f11 = i12 + f10;
            if (f11 <= f10) {
                f10 = f11;
            }
            s5Var.setOffset(f10);
            r9Var.f0 = f10;
            j4 currentPeerView = r9Var.o0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            f9 f9Var = r9Var.w;
            if (f9Var != null) {
                f9Var.invalidate();
            }
        }
    }

    @Override // r0.k
    public final boolean p(View view, View view2, int i3, int i10) {
        return this.b.y <= 0 && i3 == 2;
    }

    @Override // r0.k
    public final void s(View view, View view2, int i3, int i10) {
        this.a.a = i3;
    }

    @Override // r0.k
    public final void t(View view, int i3, int i10, int[] iArr, int i11) {
        s5 s5Var = this.b;
        r9 r9Var = s5Var.r;
        if (s5Var.y > 0) {
            return;
        }
        float f10 = r9Var.f0;
        float f11 = s5Var.c;
        if (f10 >= f11 || i10 <= 0) {
            return;
        }
        float f12 = f10 + i10;
        iArr[1] = i10;
        if (f12 <= f11) {
            f11 = f12;
        }
        s5Var.setOffset(f11);
        r9Var.f0 = f11;
        j4 currentPeerView = r9Var.o0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.invalidate();
        }
        f9 f9Var = r9Var.w;
        if (f9Var != null) {
            f9Var.invalidate();
        }
    }

    @Override // r0.k
    public final void o(View view, int i3, int i10, int i11, int i12, int i13) {
    }
}
