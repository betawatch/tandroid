package fi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i5 extends FrameLayout implements r0.l {
    public final e2.r0 a;
    public final /* synthetic */ k5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(k5 k5Var, Context context) {
        super(context);
        this.b = k5Var;
        this.a = new e2.r0();
    }

    @Override // r0.k
    public final void k(int i7, View view) {
        this.a.a = 0;
    }

    @Override // r0.l
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        k5 k5Var = this.b;
        i9 i9Var = k5Var.r;
        if (k5Var.y <= 0 && i12 != 0 && i10 == 0) {
            float f10 = i9Var.f0;
            float f11 = i12 + f10;
            if (f11 <= f10) {
                f10 = f11;
            }
            k5Var.setOffset(f10);
            i9Var.f0 = f10;
            b4 currentPeerView = i9Var.o0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            x8 x8Var = i9Var.w;
            if (x8Var != null) {
                x8Var.invalidate();
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
        k5 k5Var = this.b;
        i9 i9Var = k5Var.r;
        if (k5Var.y > 0) {
            return;
        }
        float f10 = i9Var.f0;
        float f11 = k5Var.c;
        if (f10 >= f11 || i10 <= 0) {
            return;
        }
        float f12 = f10 + i10;
        iArr[1] = i10;
        if (f12 <= f11) {
            f11 = f12;
        }
        k5Var.setOffset(f11);
        i9Var.f0 = f11;
        b4 currentPeerView = i9Var.o0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.invalidate();
        }
        x8 x8Var = i9Var.w;
        if (x8Var != null) {
            x8Var.invalidate();
        }
    }

    @Override // r0.k
    public final void m(View view, int i7, int i10, int i11, int i12, int i13) {
    }
}
