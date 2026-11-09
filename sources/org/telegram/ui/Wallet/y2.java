package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qj0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public class y2 extends na implements org.telegram.ui.ActionBar.b6 {
    public m41 P1;
    public final ViewGroup Q1;
    public final Paint R1;
    public float S1;

    public y2(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, true, false, g6Var);
        this.R1 = new Paint();
        this.r1 = 0.1f;
        this.Q1 = viewGroup;
        qj0 qj0Var = this.k1;
        int i7 = this.t0;
        qj0Var.setPadding(i7, 0, i7, 0);
        updateColors();
        this.P1.O(false);
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void E0(int i7) {
        super.E0(i7);
        org.telegram.messenger.g0.u3(this, 0, false, null);
    }

    @Override // org.telegram.ui.Components.na
    public final pj0 L0(qj0 qj0Var) {
        m41 m41Var = new m41(qj0Var, getContext(), this.a, 0, true, new d(this, 5), this.I0);
        this.P1 = m41Var;
        return m41Var;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        return null;
    }

    @Override // org.telegram.ui.Components.na
    public void T0(float f10) {
        this.S1 = f10;
        if (this.E != null) {
            this.E.setTranslationY(Math.max((this.b.getY() + f10) + this.s0, this.E.getHeight() + (org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.m)) - this.E.getBottom());
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void Z(Canvas canvas) {
        org.telegram.ui.ActionBar.l2 l2Var = this.c;
        float height = l2Var.getHeight();
        float max = Math.max(height - org.telegram.messenger.g0.n, this.b.getY() + this.S1 + this.s0);
        if (max >= height) {
            return;
        }
        boolean z9 = this.b.getWidth() < l2Var.getWidth();
        canvas.drawRect(z9 ? this.b.getX() + this.t0 : 0.0f, max, z9 ? (this.b.getX() + this.b.getWidth()) - this.t0 : l2Var.getWidth(), height, this.R1);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.a7));
    }

    public int d1() {
        return org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.a7, this.I0);
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int d12 = d1();
        this.R1.setColor(d12);
        v0(d12);
        O(d12);
        ViewGroup viewGroup = this.Q1;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }
}
