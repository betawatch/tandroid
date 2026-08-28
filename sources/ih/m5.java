package ih;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class m5 extends FrameLayout implements r0.n {
    public final d5.p a;
    public final /* synthetic */ o5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(o5 o5Var, Context context) {
        super(context);
        this.b = o5Var;
        this.a = new d5.p();
    }

    @Override // r0.m
    public final void E(ViewGroup viewGroup, int i9, int i10, int[] iArr, int i11) {
        o5 o5Var = this.b;
        m9 m9Var = o5Var.r;
        if (o5Var.x > 0) {
            return;
        }
        float f10 = m9Var.a0;
        float f11 = o5Var.c;
        if (f10 >= f11 || i10 <= 0) {
            return;
        }
        float f12 = f10 + i10;
        iArr[1] = i10;
        if (f12 <= f11) {
            f11 = f12;
        }
        o5Var.setOffset(f11);
        m9Var.a0 = f11;
        i4 currentPeerView = m9Var.j0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.invalidate();
        }
        b9 b9Var = m9Var.v;
        if (b9Var != null) {
            b9Var.invalidate();
        }
    }

    @Override // r0.n
    public final void i(ViewGroup viewGroup, int i9, int i10, int i11, int i12, int i13, int[] iArr) {
        o5 o5Var = this.b;
        m9 m9Var = o5Var.r;
        if (o5Var.x <= 0 && i12 != 0 && i10 == 0) {
            float f10 = m9Var.a0;
            float f11 = i12 + f10;
            if (f11 <= f10) {
                f10 = f11;
            }
            o5Var.setOffset(f10);
            m9Var.a0 = f10;
            i4 currentPeerView = m9Var.j0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            b9 b9Var = m9Var.v;
            if (b9Var != null) {
                b9Var.invalidate();
            }
        }
    }

    @Override // r0.m
    public final void p(int i9, View view) {
        this.a.a = 0;
    }

    @Override // r0.m
    public final boolean q(View view, View view2, int i9, int i10) {
        return this.b.x <= 0 && i9 == 2;
    }

    @Override // r0.m
    public final void t(View view, View view2, int i9, int i10) {
        this.a.a = i9;
    }

    @Override // r0.m
    public final void c(ViewGroup viewGroup, int i9, int i10, int i11, int i12, int i13) {
    }
}
