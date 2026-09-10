package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class yw0 extends ul0 {
    public int c;
    public final /* synthetic */ hx0 d;

    public yw0(hx0 hx0Var) {
        this.d = hx0Var;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
    }

    @Override // s4.h0
    public final int h() {
        hx0 hx0Var = this.d;
        dx0[] dx0VarArr = hx0Var.Y2;
        int length = (dx0VarArr == null ? 0 : dx0VarArr.length) + 1;
        if (length != this.c) {
            bi.nc ncVar = hx0Var.l3;
            if (ncVar != null) {
                ncVar.requestLayout();
            }
            this.c = length;
        }
        return length;
    }

    @Override // s4.h0
    public final int j(int i10) {
        return i10 == 0 ? 0 : 1;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        hx0 hx0Var;
        dx0[] dx0VarArr;
        if (c1Var.f != 1 || (dx0VarArr = (hx0Var = this.d).Y2) == null) {
            return;
        }
        int i11 = i10 - 1;
        dx0 dx0Var = dx0VarArr[i11];
        final cx0 cx0Var = (cx0) c1Var.a;
        boolean z10 = hx0Var.m3 == i11;
        cx0Var.getClass();
        if (!TextUtils.isEmpty(dx0Var.d)) {
            cx0Var.setContentDescription(dx0Var.d);
        } else if (TextUtils.isEmpty(dx0Var.a)) {
            cx0Var.setContentDescription(null);
        } else {
            cx0Var.setContentDescription(dx0Var.a);
        }
        ValueAnimator valueAnimator = cx0Var.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            cx0Var.G = null;
        }
        cx0Var.setImageResource(0);
        cx0Var.a();
        final boolean z12 = cx0Var.H.z1();
        cx0Var.w = false;
        cx0Var.y = 1.0f;
        p5.h(UserConfig.selectedAccount).b(dx0Var.c, new m5() { // from class: org.telegram.ui.Components.ax0
            @Override // org.telegram.ui.Components.m5
            public final void a(TLRPC.Document document) {
                boolean z11 = !z12;
                cx0 cx0Var2 = cx0.this;
                cx0Var2.setOnlyLastFrame(z11);
                cx0Var2.g(24, 24, document);
                cx0Var2.d();
            }
        });
        AndroidUtilities.runOnUIThread(new uq0(cx0Var, 9), 60L);
        cx0Var.l(z10, false);
        cx0Var.setAlpha(hx0Var.o3);
        cx0Var.setScaleX(hx0Var.o3);
        cx0Var.setScaleY(hx0Var.o3);
        cx0Var.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        cx0 cx0Var;
        hx0 hx0Var = this.d;
        if (i10 == 0) {
            bi.nc ncVar = new bi.nc(this, hx0Var.getContext(), 25);
            hx0Var.l3 = ncVar;
            cx0Var = ncVar;
        } else {
            cx0Var = new cx0(hx0Var, hx0Var.getContext());
        }
        return new fl0(cx0Var);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        if (c1Var.f == 1) {
            cx0 cx0Var = (cx0) c1Var.a;
            cx0Var.l(this.d.m3 == c1Var.b() - 1, false);
            cx0Var.j();
        }
    }
}
