package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class a71 implements org.telegram.ui.ActionBar.g6 {
    public final /* synthetic */ b71 a;

    public a71(b71 b71Var) {
        this.a = b71Var;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final boolean a() {
        return org.telegram.ui.ActionBar.k6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final void b(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.k6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.k6.v3;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final Paint d(String str) {
        return org.telegram.ui.ActionBar.k6.U0(str);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final int e(int i10) {
        return g(i10);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final int g(int i10) {
        return this.a.I(i10);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final int i(int i10) {
        return g(i10);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final /* synthetic */ void h(int i10, int i11) {
    }
}
