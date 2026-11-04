package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class oc implements org.telegram.ui.ActionBar.e6 {
    public final /* synthetic */ pc a;

    public oc(pc pcVar) {
        this.a = pcVar;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final boolean a() {
        return this.a.K;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final void b(float f10, float f11, int i3, int i10) {
        org.telegram.ui.ActionBar.k6.r(f10, f11, i3, i10);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.k6.v3;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final Paint d(String str) {
        return str.equals("paintDivider") ? this.a.z0 : org.telegram.ui.ActionBar.k6.V0(str);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final boolean e() {
        return org.telegram.messenger.az.H0;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int f(int i3) {
        return h(i3);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final Drawable getDrawable(String str) {
        pc pcVar = this.a;
        Drawable drawable = pcVar.y0;
        Drawable drawable2 = pcVar.x0;
        if (str.equals("drawableMsgIn")) {
            return pcVar.t0;
        }
        if (str.equals("drawableMsgInSelected")) {
            return pcVar.u0;
        }
        if (str.equals("drawableMsgOut")) {
            return pcVar.v0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            return pcVar.w0;
        }
        if (str.equals("drawableMsgOutCheckRead")) {
            drawable2.setColorFilter(h(org.telegram.ui.ActionBar.k6.zb), PorterDuff.Mode.MULTIPLY);
            return drawable2;
        }
        if (str.equals("drawableMsgOutHalfCheck")) {
            drawable.setColorFilter(h(org.telegram.ui.ActionBar.k6.zb), PorterDuff.Mode.MULTIPLY);
            return drawable;
        }
        org.telegram.ui.ActionBar.e6 e6Var = pcVar.r0;
        return e6Var != null ? e6Var.getDrawable(str) : org.telegram.ui.ActionBar.k6.R0(str);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int h(int i3) {
        pc pcVar = this.a;
        int indexOfKey = pcVar.s0.indexOfKey(i3);
        if (indexOfKey >= 0) {
            return pcVar.s0.valueAt(indexOfKey);
        }
        org.telegram.ui.ActionBar.e6 e6Var = pcVar.r0;
        return e6Var != null ? e6Var.h(i3) : org.telegram.ui.ActionBar.k6.v0(i3);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int j(int i3) {
        return h(i3);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final /* synthetic */ void i(int i3, int i10) {
    }
}
