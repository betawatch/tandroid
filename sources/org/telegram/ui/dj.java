package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class dj implements org.telegram.ui.ActionBar.e6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dj(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final boolean a() {
        switch (this.a) {
            case 0:
                return org.telegram.ui.ActionBar.k6.I.q();
            case 1:
                return ((cm0) this.b).T;
            default:
                return ((h71) this.b).f.a.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final void b(float f10, float f11, int i3, int i10) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.k6.r(f10, f11, i3, i10);
                break;
            case 1:
                org.telegram.ui.ActionBar.k6.r(f10, f11, i3, i10);
                break;
            default:
                l61 l61Var = ((h71) this.b).f.a;
                if (l61Var == null) {
                    org.telegram.ui.ActionBar.k6.r(f10, f11, i3, i10);
                    break;
                } else {
                    l61Var.b(f10, f11, i3, i10);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final ColorFilter c() {
        switch (this.a) {
        }
        return org.telegram.ui.ActionBar.k6.v3;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final Paint d(String str) {
        switch (this.a) {
            case 0:
                return org.telegram.ui.ActionBar.k6.V0(str);
            case 1:
                return org.telegram.ui.ActionBar.k6.V0(str);
            default:
                return ((h71) this.b).f.a.d(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final boolean e() {
        switch (this.a) {
        }
        return org.telegram.messenger.az.H0;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int f(int i3) {
        switch (this.a) {
            case 0:
                return h(i3);
            case 1:
                return h(i3);
            default:
                return ((h71) this.b).f.a.h(i3);
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final boolean g() {
        switch (this.a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return ((h71) this.b).f.a.g();
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final Drawable getDrawable(String str) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                cm0 cm0Var = (cm0) this.b;
                if (!str.equals("drawableMsgIn")) {
                    if (!str.equals("drawableMsgInSelected")) {
                        org.telegram.ui.ActionBar.e6 e6Var = cm0Var.s;
                        if (e6Var == null) {
                            break;
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            default:
                l71 l71Var = ((h71) this.b).f;
                if (!str.equals("drawableMsgOut")) {
                    if (!str.equals("drawableMsgOutSelected")) {
                        if (!str.equals("drawableMsgOutMedia")) {
                            if (!str.equals("drawableMsgOutMediaSelected")) {
                                l61 l61Var = l71Var.a;
                                if (l61Var == null) {
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
        }
        return org.telegram.ui.ActionBar.k6.R0(str);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int h(int i3) {
        switch (this.a) {
            case 0:
                return ((wm) this.b).getThemedColor(i3);
            case 1:
                cm0 cm0Var = (cm0) this.b;
                int indexOfKey = cm0Var.w.indexOfKey(i3);
                if (indexOfKey >= 0) {
                    return cm0Var.w.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.e6 e6Var = cm0Var.s;
                return e6Var != null ? e6Var.h(i3) : org.telegram.ui.ActionBar.k6.v0(i3);
            default:
                return ((h71) this.b).f.a.h(i3);
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final /* synthetic */ void i(int i3, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int j(int i3) {
        switch (this.a) {
            case 0:
                return h(i3);
            case 1:
                return h(i3);
            default:
                return ((h71) this.b).f.a.j(i3);
        }
    }

    private final /* synthetic */ void k(int i3, int i10) {
    }

    private final /* synthetic */ void l(int i3, int i10) {
    }

    private final /* synthetic */ void m(int i3, int i10) {
    }
}
