package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class i71 implements org.telegram.ui.ActionBar.u6 {
    public final /* synthetic */ j71 a;

    public i71(j71 j71Var) {
        this.a = j71Var;
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final boolean a() {
        return org.telegram.ui.ActionBar.y6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final void b(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.y6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.y6.v3;
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final Paint d(String str) {
        return org.telegram.ui.ActionBar.y6.U0(str);
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final int e(int i10) {
        return g(i10);
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final int g(int i10) {
        return this.a.I(i10);
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final int i(int i10) {
        return g(i10);
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final /* synthetic */ void h(int i10, int i11) {
    }
}
