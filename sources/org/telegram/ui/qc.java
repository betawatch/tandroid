package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class qc implements org.telegram.ui.ActionBar.h6 {
    public final /* synthetic */ rc a;

    public qc(rc rcVar) {
        this.a = rcVar;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final boolean a() {
        return this.a.J;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final void b(float f10, float f11, int i7, int i10) {
        org.telegram.ui.ActionBar.m6.r(f10, f11, i7, i10);
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.m6.v3;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final Paint d(String str) {
        return str.equals("paintDivider") ? this.a.y0 : org.telegram.ui.ActionBar.m6.V0(str);
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final boolean e() {
        return org.telegram.messenger.iz.H0;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final int f(int i7) {
        return h(i7);
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final Drawable getDrawable(String str) {
        rc rcVar = this.a;
        Drawable drawable = rcVar.x0;
        Drawable drawable2 = rcVar.w0;
        if (str.equals("drawableMsgIn")) {
            return rcVar.s0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return rcVar.t0;
        }
        if (str.equals("drawableMsgOut")) {
            return rcVar.u0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return rcVar.v0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(h(org.telegram.ui.ActionBar.m6.zb), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        }
        if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(h(org.telegram.ui.ActionBar.m6.zb), PorterDuff.Mode.MULTIPLY);
            return drawable;
        }
        org.telegram.ui.ActionBar.h6 h6Var = rcVar.q0;
        return h6Var != null ? h6Var.getDrawable(str) : org.telegram.ui.ActionBar.m6.R0(str);
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final int h(int i7) {
        rc rcVar = this.a;
        int indexOfKey = rcVar.r0.indexOfKey(i7);
        if (indexOfKey >= 0) {
            return rcVar.r0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.h6 h6Var = rcVar.q0;
        return h6Var != null ? h6Var.h(i7) : org.telegram.ui.ActionBar.m6.v0(i7);
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final int j(int i7) {
        return h(i7);
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final /* synthetic */ void i(int i7, int i10) {
    }
}
