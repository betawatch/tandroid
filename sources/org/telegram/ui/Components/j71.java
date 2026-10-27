package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class j71 implements org.telegram.ui.ActionBar.u6 {
    public final /* synthetic */ k71 a;

    public j71(k71 k71Var) {
        this.a = k71Var;
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
