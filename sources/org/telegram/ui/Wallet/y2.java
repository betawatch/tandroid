package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class y2 extends org.telegram.ui.Components.ma implements org.telegram.ui.ActionBar.z5 {
    public f41 Q1;
    public final ViewGroup R1;
    public final Paint S1;
    public float T1;

    public y2(Context context, ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, true, false, e6Var);
        this.S1 = new Paint();
        this.s1 = 0.1f;
        this.R1 = viewGroup;
        tj0 tj0Var = this.l1;
        int i3 = this.u0;
        tj0Var.setPadding(i3, 0, i3, 0);
        updateColors();
        this.Q1.O(false);
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void E0(int i3) {
        super.E0(i3);
        org.telegram.messenger.g0.u3(this, 0, false, null);
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        f41 f41Var = new f41(tj0Var, getContext(), this.a, 0, true, new d(this, 5), this.J0);
        this.Q1 = f41Var;
        return f41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return null;
    }

    @Override // org.telegram.ui.Components.ma
    public void T0(float f10) {
        this.T1 = f10;
        if (this.F != null) {
            this.F.setTranslationY(Math.max((this.b.getY() + f10) + this.t0, this.F.getHeight() + (org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.m)) - this.F.getBottom());
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void Z(Canvas canvas) {
        org.telegram.ui.ActionBar.j2 j2Var = this.c;
        float height = j2Var.getHeight();
        float max = Math.max(height - org.telegram.messenger.g0.n, this.b.getY() + this.T1 + this.t0);
        if (max >= height) {
            return;
        }
        boolean z10 = this.b.getWidth() < j2Var.getWidth();
        canvas.drawRect(z10 ? this.b.getX() + this.u0 : 0.0f, max, z10 ? (this.b.getX() + this.b.getWidth()) - this.u0 : j2Var.getWidth(), height, this.S1);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.a7));
    }

    public int d1() {
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.a7, this.J0);
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog
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
        this.S1.setColor(d12);
        v0(d12);
        O(d12);
        ViewGroup viewGroup = this.R1;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }
}
