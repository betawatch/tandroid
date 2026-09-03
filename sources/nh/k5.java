package nh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class k5 extends FrameLayout implements r0.n {
    public final c5.e a;
    public final /* synthetic */ m5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(m5 m5Var, Context context) {
        super(context);
        this.b = m5Var;
        this.a = new c5.e();
    }

    @Override // r0.m
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        m5 m5Var = this.b;
        i9 i9Var = m5Var.r;
        if (m5Var.x > 0) {
            return;
        }
        float f10 = i9Var.b0;
        float f11 = m5Var.c;
        if (f10 >= f11 || i11 <= 0) {
            return;
        }
        float f12 = f10 + i11;
        iArr[1] = i11;
        if (f12 <= f11) {
            f11 = f12;
        }
        m5Var.setOffset(f11);
        i9Var.b0 = f11;
        d4 currentPeerView = i9Var.k0.getCurrentPeerView();
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
        m5 m5Var = this.b;
        i9 i9Var = m5Var.r;
        if (m5Var.x <= 0 && i13 != 0 && i11 == 0) {
            float f10 = i9Var.b0;
            float f11 = i13 + f10;
            if (f11 <= f10) {
                f10 = f11;
            }
            m5Var.setOffset(f10);
            i9Var.b0 = f10;
            d4 currentPeerView = i9Var.k0.getCurrentPeerView();
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
