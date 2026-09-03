package oh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class l5 extends FrameLayout implements r0.n {
    public final c5.e a;
    public final /* synthetic */ n5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(n5 n5Var, Context context) {
        super(context);
        this.b = n5Var;
        this.a = new c5.e();
    }

    @Override // r0.m
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        n5 n5Var = this.b;
        i9 i9Var = n5Var.r;
        if (n5Var.x > 0) {
            return;
        }
        float f10 = i9Var.b0;
        float f11 = n5Var.c;
        if (f10 >= f11 || i11 <= 0) {
            return;
        }
        float f12 = f10 + i11;
        iArr[1] = i11;
        if (f12 <= f11) {
            f11 = f12;
        }
        n5Var.setOffset(f11);
        i9Var.b0 = f11;
        f4 currentPeerView = i9Var.k0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.invalidate();
        }
        x8 x8Var = i9Var.v;
        if (x8Var != null) {
            x8Var.invalidate();
        }
    }

    @Override // r0.n
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        n5 n5Var = this.b;
        i9 i9Var = n5Var.r;
        if (n5Var.x <= 0 && i13 != 0 && i11 == 0) {
            float f10 = i9Var.b0;
            float f11 = i13 + f10;
            if (f11 <= f10) {
                f10 = f11;
            }
            n5Var.setOffset(f10);
            i9Var.b0 = f10;
            f4 currentPeerView = i9Var.k0.getCurrentPeerView();
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
    public final void o(int i10, View view) {
        this.a.a = 0;
    }

    @Override // r0.m
    public final boolean p(View view, View view2, int i10, int i11) {
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
