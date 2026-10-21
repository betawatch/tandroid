package ci;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class a6 extends FrameLayout implements r0.m {
    public final b2.u0 a;
    public final /* synthetic */ c6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(c6 c6Var, Context context) {
        super(context);
        this.b = c6Var;
        this.a = new b2.u0();
    }

    @Override // r0.l
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        c6 c6Var = this.b;
        aa aaVar = c6Var.r;
        if (c6Var.x > 0) {
            return;
        }
        float f7 = aaVar.e0;
        float f10 = c6Var.c;
        if (f7 >= f10 || i11 <= 0) {
            return;
        }
        float f11 = f7 + i11;
        iArr[1] = i11;
        if (f11 <= f10) {
            f10 = f11;
        }
        c6Var.setOffset(f10);
        aaVar.e0 = f10;
        q4 currentPeerView = aaVar.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.invalidate();
        }
        p9 p9Var = aaVar.v;
        if (p9Var != null) {
            p9Var.invalidate();
        }
    }

    @Override // r0.m
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c6 c6Var = this.b;
        aa aaVar = c6Var.r;
        if (c6Var.x <= 0 && i13 != 0 && i11 == 0) {
            float f7 = aaVar.e0;
            float f10 = i13 + f7;
            if (f10 <= f7) {
                f7 = f10;
            }
            c6Var.setOffset(f7);
            aaVar.e0 = f7;
            q4 currentPeerView = aaVar.n0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            p9 p9Var = aaVar.v;
            if (p9Var != null) {
                p9Var.invalidate();
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
