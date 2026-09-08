package bi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class y6 extends FrameLayout implements r0.m {
    public final b2.q0 a;
    public final /* synthetic */ a7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(a7 a7Var, Context context) {
        super(context);
        this.b = a7Var;
        this.a = new b2.q0();
    }

    @Override // r0.l
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        a7 a7Var = this.b;
        pb pbVar = a7Var.r;
        if (a7Var.x > 0) {
            return;
        }
        float f7 = pbVar.e0;
        float f10 = a7Var.c;
        if (f7 >= f10 || i11 <= 0) {
            return;
        }
        float f11 = f7 + i11;
        iArr[1] = i11;
        if (f11 <= f10) {
            f10 = f11;
        }
        a7Var.setOffset(f10);
        pbVar.e0 = f10;
        o5 currentPeerView = pbVar.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.invalidate();
        }
        eb ebVar = pbVar.v;
        if (ebVar != null) {
            ebVar.invalidate();
        }
    }

    @Override // r0.m
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        a7 a7Var = this.b;
        pb pbVar = a7Var.r;
        if (a7Var.x <= 0 && i13 != 0 && i11 == 0) {
            float f7 = pbVar.e0;
            float f10 = i13 + f7;
            if (f10 <= f7) {
                f7 = f10;
            }
            a7Var.setOffset(f7);
            pbVar.e0 = f7;
            o5 currentPeerView = pbVar.n0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            eb ebVar = pbVar.v;
            if (ebVar != null) {
                ebVar.invalidate();
            }
        }
    }

    @Override // r0.l
    public final void n(int i10, View view) {
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
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
