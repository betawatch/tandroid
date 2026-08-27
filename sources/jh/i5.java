package jh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class i5 extends FrameLayout implements r0.n {
    public final d5.p a;
    public final /* synthetic */ k5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(k5 k5Var, Context context) {
        super(context);
        this.b = k5Var;
        this.a = new d5.p();
    }

    @Override // r0.m
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        k5 k5Var = this.b;
        i9 i9Var = k5Var.r;
        if (k5Var.x > 0) {
            return;
        }
        float f10 = i9Var.a0;
        float f11 = k5Var.c;
        if (f10 >= f11 || i11 <= 0) {
            return;
        }
        float f12 = f10 + i11;
        iArr[1] = i11;
        if (f12 <= f11) {
            f11 = f12;
        }
        k5Var.setOffset(f11);
        i9Var.a0 = f11;
        e4 currentPeerView = i9Var.j0.getCurrentPeerView();
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
        k5 k5Var = this.b;
        i9 i9Var = k5Var.r;
        if (k5Var.x <= 0 && i13 != 0 && i11 == 0) {
            float f10 = i9Var.a0;
            float f11 = i13 + f10;
            if (f11 <= f10) {
                f10 = f11;
            }
            k5Var.setOffset(f10);
            i9Var.a0 = f10;
            e4 currentPeerView = i9Var.j0.getCurrentPeerView();
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
    public final void p(int i10, View view) {
        this.a.a = 0;
    }

    @Override // r0.m
    public final boolean q(View view, View view2, int i10, int i11) {
        return this.b.x <= 0 && i10 == 2;
    }

    @Override // r0.m
    public final void t(View view, View view2, int i10, int i11) {
        this.a.a = i10;
    }

    @Override // r0.m
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
