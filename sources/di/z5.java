package di;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class z5 extends FrameLayout implements r0.m {
    public final b2.v0 a;
    public final /* synthetic */ b6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(b6 b6Var, Context context) {
        super(context);
        this.b = b6Var;
        this.a = new b2.v0();
    }

    @Override // r0.l
    public final void m(int i10, View view) {
        this.a.a = 0;
    }

    @Override // r0.m
    public final void n(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        b6 b6Var = this.b;
        y9 y9Var = b6Var.r;
        if (b6Var.x <= 0 && i13 != 0 && i11 == 0) {
            float f7 = y9Var.e0;
            float f10 = i13 + f7;
            if (f10 <= f7) {
                f7 = f10;
            }
            b6Var.setOffset(f7);
            y9Var.e0 = f7;
            q4 currentPeerView = y9Var.n0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            n9 n9Var = y9Var.v;
            if (n9Var != null) {
                n9Var.invalidate();
            }
        }
    }

    @Override // r0.l
    public final boolean p(View view, View view2, int i10, int i11) {
        return this.b.x <= 0 && i10 == 2;
    }

    @Override // r0.l
    public final void s(View view, View view2, int i10, int i11) {
        this.a.a = i10;
    }

    @Override // r0.l
    public final void t(View view, int i10, int i11, int[] iArr, int i12) {
        b6 b6Var = this.b;
        y9 y9Var = b6Var.r;
        if (b6Var.x > 0) {
            return;
        }
        float f7 = y9Var.e0;
        float f10 = b6Var.c;
        if (f7 >= f10 || i11 <= 0) {
            return;
        }
        float f11 = f7 + i11;
        iArr[1] = i11;
        if (f11 <= f10) {
            f10 = f11;
        }
        b6Var.setOffset(f10);
        y9Var.e0 = f10;
        q4 currentPeerView = y9Var.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.invalidate();
        }
        n9 n9Var = y9Var.v;
        if (n9Var != null) {
            n9Var.invalidate();
        }
    }

    @Override // r0.l
    public final void o(View view, int i10, int i11, int i12, int i13, int i14) {
    }
}
