package di;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class r5 extends FrameLayout implements r0.l {
    public final e2.r0 a;
    public final /* synthetic */ t5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(t5 t5Var, Context context) {
        super(context);
        this.b = t5Var;
        this.a = new e2.r0();
    }

    @Override // r0.k
    public final void k(int i7, View view) {
        this.a.a = 0;
    }

    @Override // r0.l
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        t5 t5Var = this.b;
        q9 q9Var = t5Var.r;
        if (t5Var.y <= 0 && i12 != 0 && i10 == 0) {
            float f10 = q9Var.e0;
            float f11 = i12 + f10;
            if (f11 <= f10) {
                f10 = f11;
            }
            t5Var.setOffset(f10);
            q9Var.e0 = f10;
            j4 currentPeerView = q9Var.n0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            f9 f9Var = q9Var.w;
            if (f9Var != null) {
                f9Var.invalidate();
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
        t5 t5Var = this.b;
        q9 q9Var = t5Var.r;
        if (t5Var.y > 0) {
            return;
        }
        float f10 = q9Var.e0;
        float f11 = t5Var.c;
        if (f10 >= f11 || i10 <= 0) {
            return;
        }
        float f12 = f10 + i10;
        iArr[1] = i10;
        if (f12 <= f11) {
            f11 = f12;
        }
        t5Var.setOffset(f11);
        q9Var.e0 = f11;
        j4 currentPeerView = q9Var.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.invalidate();
        }
        f9 f9Var = q9Var.w;
        if (f9Var != null) {
            f9Var.invalidate();
        }
    }

    @Override // r0.k
    public final void m(View view, int i7, int i10, int i11, int i12, int i13) {
    }
}
