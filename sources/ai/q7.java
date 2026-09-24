package ai;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class q7 extends FrameLayout implements r0.m {
    public final b2.q0 a;
    public final /* synthetic */ s7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(s7 s7Var, Context context) {
        super(context);
        this.b = s7Var;
        this.a = new b2.q0();
    }

    @Override // r0.l
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        s7 s7Var = this.b;
        jc jcVar = s7Var.r;
        if (s7Var.x > 0) {
            return;
        }
        float f7 = jcVar.e0;
        float f10 = s7Var.c;
        if (f7 >= f10 || i11 <= 0) {
            return;
        }
        float f11 = f7 + i11;
        iArr[1] = i11;
        if (f11 <= f10) {
            f10 = f11;
        }
        s7Var.setOffset(f10);
        jcVar.e0 = f10;
        e6 currentPeerView = jcVar.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.invalidate();
        }
        yb ybVar = jcVar.v;
        if (ybVar != null) {
            ybVar.invalidate();
        }
    }

    @Override // r0.m
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        s7 s7Var = this.b;
        jc jcVar = s7Var.r;
        if (s7Var.x <= 0 && i13 != 0 && i11 == 0) {
            float f7 = jcVar.e0;
            float f10 = i13 + f7;
            if (f10 <= f7) {
                f7 = f10;
            }
            s7Var.setOffset(f7);
            jcVar.e0 = f7;
            e6 currentPeerView = jcVar.n0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            yb ybVar = jcVar.v;
            if (ybVar != null) {
                ybVar.invalidate();
            }
        }
    }

    @Override // r0.l
    public final void o(int i10, View view) {
        this.a.a = 0;
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
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
