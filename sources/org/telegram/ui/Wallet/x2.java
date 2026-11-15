package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public class x2 extends org.telegram.ui.Components.ja implements org.telegram.ui.ActionBar.z5 {
    public p41 T1;
    public final ViewGroup U1;
    public final Paint V1;
    public float W1;

    public x2(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, true, false, e6Var);
        this.V1 = new Paint();
        this.v1 = 0.1f;
        this.U1 = viewGroup;
        uj0 uj0Var = this.o1;
        int i7 = this.u0;
        uj0Var.setPadding(i7, 0, i7, 0);
        updateColors();
        this.T1.O(false);
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void E0(int i7) {
        super.E0(i7);
        org.telegram.messenger.g0.t3(this, 0, false, null);
    }

    @Override // org.telegram.ui.Components.ja
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(uj0Var, getContext(), this.a, 0, true, new d(this, 5), this.J0);
        this.T1 = p41Var;
        return p41Var;
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        return null;
    }

    @Override // org.telegram.ui.Components.ja
    public void T0(float f10) {
        this.W1 = f10;
        if (this.F != null) {
            this.F.setTranslationY(Math.max((this.b.getY() + f10) + this.t0, this.F.getHeight() + (org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.m)) - this.F.getBottom());
        }
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void Z(Canvas canvas) {
        org.telegram.ui.ActionBar.k2 k2Var = this.c;
        float height = k2Var.getHeight();
        float max = Math.max(height - org.telegram.messenger.g0.n, this.b.getY() + this.W1 + this.t0);
        if (max >= height) {
            return;
        }
        boolean z10 = this.b.getWidth() < k2Var.getWidth();
        canvas.drawRect(z10 ? this.b.getX() + this.u0 : 0.0f, max, z10 ? (this.b.getX() + this.b.getWidth()) - this.u0 : k2Var.getWidth(), height, this.V1);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.a7));
    }

    public int d1() {
        return org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.a7, this.J0);
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public void show() {
        if (getWindow() != null) {
            org.telegram.messenger.g0.S(getWindow());
        }
        super.show();
        int d12 = d1();
        E0(d12);
        org.telegram.messenger.g0.n3(this, org.telegram.messenger.g0.B(d12) > 0.721f);
        if (getWindow() != null) {
            getWindow().getDecorView().requestApplyInsets();
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int d12 = d1();
        this.V1.setColor(d12);
        v0(d12);
        P(d12);
        ViewGroup viewGroup = this.U1;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }
}
