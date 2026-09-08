package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ad implements org.telegram.ui.ActionBar.f6 {
    public final /* synthetic */ bd a;

    public ad(bd bdVar) {
        this.a = bdVar;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final Paint G(String str) {
        return str.equals("paintDivider") ? this.a.y0 : org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int G0(int i10) {
        bd bdVar = this.a;
        int indexOfKey = bdVar.r0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return bdVar.r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.f6 f6Var = bdVar.q0;
        return f6Var != null ? f6Var.G0(i10) : org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final boolean a() {
        return this.a.J;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final Drawable getDrawable(String str) {
        bd bdVar = this.a;
        Drawable drawable = bdVar.x0;
        Drawable drawable2 = bdVar.w0;
        if (str.equals("drawableMsgIn")) {
            return bdVar.s0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return bdVar.t0;
        }
        if (str.equals("drawableMsgOut")) {
            return bdVar.u0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return bdVar.v0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(G0(org.telegram.ui.ActionBar.j6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        }
        if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(G0(org.telegram.ui.ActionBar.j6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        }
        org.telegram.ui.ActionBar.f6 f6Var = bdVar.q0;
        return f6Var != null ? f6Var.getDrawable(str) : org.telegram.ui.ActionBar.j6.O0(str);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int h0(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int h1(int i10) {
        return G0(i10);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final void l(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final /* synthetic */ boolean o0() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.v3;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final /* synthetic */ void O0(int i10, int i11) {
    }
}
