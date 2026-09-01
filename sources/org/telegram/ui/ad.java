package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ad implements org.telegram.ui.ActionBar.g6 {
    public final /* synthetic */ bd a;

    public ad(bd bdVar) {
        this.a = bdVar;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final int B0(int i10) {
        bd bdVar = this.a;
        int indexOfKey = bdVar.o0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return bdVar.o0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.g6 g6Var = bdVar.n0;
        return g6Var != null ? g6Var.B0(i10) : org.telegram.ui.ActionBar.k6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final Paint F(String str) {
        return str.equals("paintDivider") ? this.a.v0 : org.telegram.ui.ActionBar.k6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final int Z0(int i10) {
        return B0(i10);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final boolean a() {
        return this.a.G;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final int e0(int i10) {
        return B0(i10);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final Drawable getDrawable(String str) {
        bd bdVar = this.a;
        Drawable drawable = bdVar.u0;
        Drawable drawable2 = bdVar.t0;
        if (str.equals("drawableMsgIn")) {
            return bdVar.p0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return bdVar.q0;
        }
        if (str.equals("drawableMsgOut")) {
            return bdVar.r0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return bdVar.s0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(B0(org.telegram.ui.ActionBar.k6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        }
        if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(B0(org.telegram.ui.ActionBar.k6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        }
        org.telegram.ui.ActionBar.g6 g6Var = bdVar.n0;
        return g6Var != null ? g6Var.getDrawable(str) : org.telegram.ui.ActionBar.k6.O0(str);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final void l(float f10, float f11, int i10, int i11) {
        org.telegram.ui.ActionBar.k6.q(f10, f11, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final /* synthetic */ boolean o0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final ColorFilter w() {
        return org.telegram.ui.ActionBar.k6.v3;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final /* synthetic */ void J0(int i10, int i11) {
    }
}
