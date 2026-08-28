package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vv0 extends vk0 {
    public int c;
    public final /* synthetic */ ew0 d;

    public vv0(ew0 ew0Var) {
        this.d = ew0Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f == 1;
    }

    @Override // f2.r0
    public final int h() {
        ew0 ew0Var = this.d;
        aw0[] aw0VarArr = ew0Var.U2;
        int length = (aw0VarArr == null ? 0 : aw0VarArr.length) + 1;
        if (length != this.c) {
            fh.l2 l2Var = ew0Var.h3;
            if (l2Var != null) {
                l2Var.requestLayout();
            }
            this.c = length;
        }
        return length;
    }

    @Override // f2.r0
    public final int j(int i9) {
        return i9 == 0 ? 0 : 1;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        ew0 ew0Var;
        aw0[] aw0VarArr;
        if (q1Var.f != 1 || (aw0VarArr = (ew0Var = this.d).U2) == null) {
            return;
        }
        int i10 = i9 - 1;
        aw0 aw0Var = aw0VarArr[i10];
        final zv0 zv0Var = (zv0) q1Var.a;
        boolean z10 = ew0Var.i3 == i10;
        zv0Var.getClass();
        if (!TextUtils.isEmpty(aw0Var.d)) {
            zv0Var.setContentDescription(aw0Var.d);
        } else if (TextUtils.isEmpty(aw0Var.a)) {
            zv0Var.setContentDescription(null);
        } else {
            zv0Var.setContentDescription(aw0Var.a);
        }
        ValueAnimator valueAnimator = zv0Var.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            zv0Var.C = null;
        }
        zv0Var.setImageResource(0);
        zv0Var.a();
        final boolean A1 = zv0Var.D.A1();
        zv0Var.w = false;
        zv0Var.y = 1.0f;
        k5.h(UserConfig.selectedAccount).b(aw0Var.c, new h5() { // from class: org.telegram.ui.Components.xv0
            @Override // org.telegram.ui.Components.h5
            public final void a(TLRPC.Document document) {
                boolean z11 = !A1;
                zv0 zv0Var2 = zv0.this;
                zv0Var2.setOnlyLastFrame(z11);
                zv0Var2.g(24, 24, document);
                zv0Var2.d();
            }
        });
        AndroidUtilities.runOnUIThread(new tp0(zv0Var, 9), 60L);
        zv0Var.l(z10, false);
        zv0Var.setAlpha(ew0Var.k3);
        zv0Var.setScaleX(ew0Var.k3);
        zv0Var.setScaleY(ew0Var.k3);
        zv0Var.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        zv0 zv0Var;
        ew0 ew0Var = this.d;
        if (i9 == 0) {
            fh.l2 l2Var = new fh.l2(this, ew0Var.getContext(), 24);
            ew0Var.h3 = l2Var;
            zv0Var = l2Var;
        } else {
            zv0Var = new zv0(ew0Var, ew0Var.getContext());
        }
        return new ik0(zv0Var);
    }

    @Override // f2.r0
    public final void y(f2.q1 q1Var) {
        if (q1Var.f == 1) {
            zv0 zv0Var = (zv0) q1Var.a;
            zv0Var.l(this.d.i3 == q1Var.b() - 1, false);
            zv0Var.j();
        }
    }
}
