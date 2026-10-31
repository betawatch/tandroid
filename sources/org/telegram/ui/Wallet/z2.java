package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class z2 extends org.telegram.ui.Components.ha implements org.telegram.ui.ActionBar.k6 {
    public p51 P1;
    public final ViewGroup Q1;
    public final Paint R1;
    public float S1;

    public z2(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, null, true, false, p6Var);
        this.R1 = new Paint();
        this.r1 = 0.1f;
        this.Q1 = viewGroup;
        tk0 tk0Var = this.k1;
        int i10 = this.t0;
        tk0Var.setPadding(i10, 0, i10, 0);
        updateColors();
        this.P1.O(false);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void E0(int i10) {
        super.E0(i10);
        org.telegram.messenger.i0.t3(this, 0, false, null);
    }

    @Override // org.telegram.ui.Components.ha
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(tk0Var, getContext(), this.a, 0, true, new d(this, 5), this.I0);
        this.P1 = p51Var;
        return p51Var;
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        return null;
    }

    @Override // org.telegram.ui.Components.ha
    public void T0(float f7) {
        this.S1 = f7;
        if (this.E != null) {
            this.E.setTranslationY(Math.max((this.b.getY() + f7) + this.s0, this.E.getHeight() + (org.telegram.messenger.i0.L(56.0f) + org.telegram.messenger.i0.m)) - this.E.getBottom());
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void Z(Canvas canvas) {
        org.telegram.ui.ActionBar.p2 p2Var = this.c;
        float height = p2Var.getHeight();
        float max = Math.max(height - org.telegram.messenger.i0.n, this.b.getY() + this.S1 + this.s0);
        if (max >= height) {
            return;
        }
        boolean z10 = this.b.getWidth() < p2Var.getWidth();
        canvas.drawRect(z10 ? this.b.getX() + this.t0 : 0.0f, max, z10 ? (this.b.getX() + this.b.getWidth()) - this.t0 : p2Var.getWidth(), height, this.R1);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.a7));
    }

    public int d1() {
        return org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, this.I0);
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public void show() {
        if (getWindow() != null) {
            org.telegram.messenger.i0.S(getWindow());
        }
        super.show();
        int d12 = d1();
        E0(d12);
        org.telegram.messenger.i0.m3(this, org.telegram.messenger.i0.B(d12) > 0.721f);
        if (getWindow() != null) {
            getWindow().getDecorView().requestApplyInsets();
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int d12 = d1();
        this.R1.setColor(d12);
        v0(d12);
        P(d12);
        ViewGroup viewGroup = this.Q1;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }
}
