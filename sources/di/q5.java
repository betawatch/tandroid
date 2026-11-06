package di;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class q5 extends FrameLayout implements r0.l {
    public final e2.r0 a;
    public final /* synthetic */ s5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(s5 s5Var, Context context) {
        super(context);
        this.b = s5Var;
        this.a = new e2.r0();
    }

    @Override // r0.k
    public final void k(int i7, View view) {
        this.a.a = 0;
    }

    @Override // r0.l
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        s5 s5Var = this.b;
        p9 p9Var = s5Var.r;
        if (s5Var.y <= 0 && i12 != 0 && i10 == 0) {
            float f10 = p9Var.e0;
            float f11 = i12 + f10;
            if (f11 <= f10) {
                f10 = f11;
            }
            s5Var.setOffset(f10);
            p9Var.e0 = f10;
            i4 currentPeerView = p9Var.n0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            e9 e9Var = p9Var.w;
            if (e9Var != null) {
                e9Var.invalidate();
            }
        }
    }

    @Override // r0.k
    public final boolean o(View view, View view2, int i7, int i10) {
        return this.b.y <= 0 && i7 == 2;
    }

    @Override // r0.k
    public final void r(View view, View view2, int i7, int i10) {
        this.a.a = i7;
    }

    @Override // r0.k
    public final void s(View view, int i7, int i10, int[] iArr, int i11) {
        s5 s5Var = this.b;
        p9 p9Var = s5Var.r;
        if (s5Var.y > 0) {
            return;
        }
        float f10 = p9Var.e0;
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
        p9Var.e0 = f11;
        i4 currentPeerView = p9Var.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.invalidate();
        }
        e9 e9Var = p9Var.w;
        if (e9Var != null) {
            e9Var.invalidate();
        }
    }

    @Override // r0.k
    public final void m(View view, int i7, int i10, int i11, int i12, int i13) {
    }
}
