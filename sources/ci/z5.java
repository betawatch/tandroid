package ci;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class z5 extends FrameLayout implements r0.m {
    public final b2.u0 a;
    public final /* synthetic */ b6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(b6 b6Var, Context context) {
        super(context);
        this.b = b6Var;
        this.a = new b2.u0();
    }

    @Override // r0.l
    public final void D(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        b6 b6Var = this.b;
        z9 z9Var = b6Var.r;
        if (b6Var.x > 0) {
            return;
        }
        float f7 = z9Var.e0;
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
        z9Var.e0 = f10;
        p4 currentPeerView = z9Var.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.invalidate();
        }
        o9 o9Var = z9Var.v;
        if (o9Var != null) {
            o9Var.invalidate();
        }
    }

    @Override // r0.m
    public final void h(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        b6 b6Var = this.b;
        z9 z9Var = b6Var.r;
        if (b6Var.x <= 0 && i13 != 0 && i11 == 0) {
            float f7 = z9Var.e0;
            float f10 = i13 + f7;
            if (f10 <= f7) {
                f7 = f10;
            }
            b6Var.setOffset(f7);
            z9Var.e0 = f7;
            p4 currentPeerView = z9Var.n0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            o9 o9Var = z9Var.v;
            if (o9Var != null) {
                o9Var.invalidate();
            }
        }
    }

    @Override // r0.l
    public final void m(int i10, View view) {
        this.a.a = 0;
    }

    @Override // r0.l
    public final boolean o(View view, View view2, int i10, int i11) {
        return this.b.x <= 0 && i10 == 2;
    }

    @Override // r0.l
    public final void r(View view, View view2, int i10, int i11) {
        this.a.a = i10;
    }

    @Override // r0.l
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
