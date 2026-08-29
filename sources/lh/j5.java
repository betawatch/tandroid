package lh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class j5 extends FrameLayout implements r0.n {
    public final a5.e a;
    public final /* synthetic */ l5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(l5 l5Var, Context context) {
        super(context);
        this.b = l5Var;
        this.a = new a5.e();
    }

    @Override // r0.m
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        l5 l5Var = this.b;
        i9 i9Var = l5Var.r;
        if (l5Var.x > 0) {
            return;
        }
        float f9 = i9Var.a0;
        float f10 = l5Var.c;
        if (f9 >= f10 || i11 <= 0) {
            return;
        }
        float f11 = f9 + i11;
        iArr[1] = i11;
        if (f11 <= f10) {
            f10 = f11;
        }
        l5Var.setOffset(f10);
        i9Var.a0 = f10;
        d4 currentPeerView = i9Var.j0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.invalidate();
        }
        x8 x8Var = i9Var.v;
        if (x8Var != null) {
            x8Var.invalidate();
        }
    }

    @Override // r0.n
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        l5 l5Var = this.b;
        i9 i9Var = l5Var.r;
        if (l5Var.x <= 0 && i13 != 0 && i11 == 0) {
            float f9 = i9Var.a0;
            float f10 = i13 + f9;
            if (f10 <= f9) {
                f9 = f10;
            }
            l5Var.setOffset(f9);
            i9Var.a0 = f9;
            d4 currentPeerView = i9Var.j0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            x8 x8Var = i9Var.v;
            if (x8Var != null) {
                x8Var.invalidate();
            }
        }
    }

    @Override // r0.m
    public final void n(int i10, View view) {
        this.a.a = 0;
    }

    @Override // r0.m
    public final boolean o(View view, View view2, int i10, int i11) {
        return this.b.x <= 0 && i10 == 2;
    }

    @Override // r0.m
    public final void s(View view, View view2, int i10, int i11) {
        this.a.a = i10;
    }

    @Override // r0.m
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
