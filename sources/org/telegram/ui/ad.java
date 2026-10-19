package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ad implements org.telegram.ui.ActionBar.d6 {
    public final /* synthetic */ bd a;

    public ad(bd bdVar) {
        this.a = bdVar;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final int G(int i10) {
        return w(i10);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final boolean a() {
        return this.a.J;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final void d(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.d6
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
            drawable2.setColorFilter(w(org.telegram.ui.ActionBar.h6.La), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        }
        if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(w(org.telegram.ui.ActionBar.h6.La), PorterDuff.Mode.MULTIPLY);
            return drawable;
        }
        org.telegram.ui.ActionBar.d6 d6Var = bdVar.q0;
        return d6Var != null ? d6Var.getDrawable(str) : org.telegram.ui.ActionBar.h6.P0(str);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final ColorFilter j() {
        return org.telegram.ui.ActionBar.h6.v3;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final Paint n(String str) {
        return str.equals("paintDivider") ? this.a.y0 : org.telegram.ui.ActionBar.h6.T0(str);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final int r(int i10) {
        return w(i10);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final /* synthetic */ boolean s() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final int w(int i10) {
        bd bdVar = this.a;
        int indexOfKey = bdVar.r0.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return bdVar.r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.d6 d6Var = bdVar.q0;
        return d6Var != null ? d6Var.w(i10) : org.telegram.ui.ActionBar.h6.x0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public final /* synthetic */ void B(int i10, int i11) {
    }
}
