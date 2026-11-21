package fi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class h5 extends FrameLayout implements r0.l {
    public final e2.r0 a;
    public final /* synthetic */ j5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(j5 j5Var, Context context) {
        super(context);
        this.b = j5Var;
        this.a = new e2.r0();
    }

    @Override // r0.k
    public final void k(int i7, View view) {
        this.a.a = 0;
    }

    @Override // r0.l
    public final void l(View view, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        j5 j5Var = this.b;
        f9 f9Var = j5Var.r;
        if (j5Var.y <= 0 && i12 != 0 && i10 == 0) {
            float f10 = f9Var.f0;
            float f11 = i12 + f10;
            if (f11 <= f10) {
                f10 = f11;
            }
            j5Var.setOffset(f10);
            f9Var.f0 = f10;
            z3 currentPeerView = f9Var.o0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            u8 u8Var = f9Var.w;
            if (u8Var != null) {
                u8Var.invalidate();
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
        j5 j5Var = this.b;
        f9 f9Var = j5Var.r;
        if (j5Var.y > 0) {
            return;
        }
        float f10 = f9Var.f0;
        float f11 = j5Var.c;
        if (f10 >= f11 || i10 <= 0) {
            return;
        }
        float f12 = f10 + i10;
        iArr[1] = i10;
        if (f12 <= f11) {
            f11 = f12;
        }
        j5Var.setOffset(f11);
        f9Var.f0 = f11;
        z3 currentPeerView = f9Var.o0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.invalidate();
        }
        u8 u8Var = f9Var.w;
        if (u8Var != null) {
            u8Var.invalidate();
        }
    }

    @Override // r0.k
    public final void m(View view, int i7, int i10, int i11, int i12, int i13) {
    }
}
