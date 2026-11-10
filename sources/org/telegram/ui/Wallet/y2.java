package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public class y2 extends org.telegram.ui.Components.ma implements org.telegram.ui.ActionBar.c6 {
    public m41 S1;
    public final ViewGroup T1;
    public final Paint U1;
    public float V1;

    public y2(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, true, false, h6Var);
        this.U1 = new Paint();
        this.u1 = 0.1f;
        this.T1 = viewGroup;
        pj0 pj0Var = this.n1;
        int i7 = this.t0;
        pj0Var.setPadding(i7, 0, i7, 0);
        updateColors();
        this.S1.O(false);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void E0(int i7) {
        super.E0(i7);
        org.telegram.messenger.g0.u3(this, 0, false, null);
    }

    @Override // org.telegram.ui.Components.ma
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(pj0Var, getContext(), this.a, 0, true, new d(this, 5), this.I0);
        this.S1 = m41Var;
        return m41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return null;
    }

    @Override // org.telegram.ui.Components.ma
    public void T0(float f10) {
        this.V1 = f10;
        if (this.E != null) {
            this.E.setTranslationY(Math.max((this.b.getY() + f10) + this.s0, this.E.getHeight() + (org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.m)) - this.E.getBottom());
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void Z(Canvas canvas) {
        org.telegram.ui.ActionBar.m2 m2Var = this.c;
        float height = m2Var.getHeight();
        float max = Math.max(height - org.telegram.messenger.g0.n, this.b.getY() + this.V1 + this.s0);
        if (max >= height) {
            return;
        }
        boolean z9 = this.b.getWidth() < m2Var.getWidth();
        canvas.drawRect(z9 ? this.b.getX() + this.t0 : 0.0f, max, z9 ? (this.b.getX() + this.b.getWidth()) - this.t0 : m2Var.getWidth(), height, this.U1);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.a7));
    }

    public int d1() {
        return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.a7, this.I0);
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
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

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        int d12 = d1();
        this.U1.setColor(d12);
        v0(d12);
        O(d12);
        ViewGroup viewGroup = this.T1;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }
}
