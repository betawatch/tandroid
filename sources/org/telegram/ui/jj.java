package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class jj implements org.telegram.ui.ActionBar.h6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jj(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final boolean a() {
        switch (this.a) {
            case 0:
                return org.telegram.ui.ActionBar.m6.I.q();
            case 1:
                return ((km0) this.b).S;
            default:
                return ((t71) this.b).f.a.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final void b(float f10, float f11, int i7, int i10) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.m6.r(f10, f11, i7, i10);
                break;
            case 1:
                org.telegram.ui.ActionBar.m6.r(f10, f11, i7, i10);
                break;
            default:
                y61 y61Var = ((t71) this.b).f.a;
                if (y61Var == null) {
                    org.telegram.ui.ActionBar.m6.r(f10, f11, i7, i10);
                    break;
                } else {
                    y61Var.b(f10, f11, i7, i10);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final ColorFilter c() {
        switch (this.a) {
        }
        return org.telegram.ui.ActionBar.m6.v3;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final Paint d(String str) {
        switch (this.a) {
            case 0:
                return org.telegram.ui.ActionBar.m6.V0(str);
            case 1:
                return org.telegram.ui.ActionBar.m6.V0(str);
            default:
                return ((t71) this.b).f.a.d(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final boolean e() {
        switch (this.a) {
        }
        return org.telegram.messenger.iz.H0;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final int f(int i7) {
        switch (this.a) {
            case 0:
                return h(i7);
            case 1:
                return h(i7);
            default:
                return ((t71) this.b).f.a.h(i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final boolean g() {
        switch (this.a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return ((t71) this.b).f.a.g();
        }
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final Drawable getDrawable(String str) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                km0 km0Var = (km0) this.b;
                if (!str.equals("drawableMsgIn")) {
                    if (!str.equals("drawableMsgInSelected")) {
                        org.telegram.ui.ActionBar.h6 h6Var = km0Var.s;
                        if (h6Var == null) {
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
                x71 x71Var = ((t71) this.b).f;
                if (!str.equals("drawableMsgOut")) {
                    if (!str.equals("drawableMsgOutSelected")) {
                        if (!str.equals("drawableMsgOutMedia")) {
                            if (!str.equals("drawableMsgOutMediaSelected")) {
                                y61 y61Var = x71Var.a;
                                if (y61Var == null) {
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
        return org.telegram.ui.ActionBar.m6.R0(str);
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final int h(int i7) {
        switch (this.a) {
            case 0:
                return ((cn) this.b).getThemedColor(i7);
            case 1:
                km0 km0Var = (km0) this.b;
                int indexOfKey = km0Var.w.indexOfKey(i7);
                if (indexOfKey >= 0) {
                    return km0Var.w.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.h6 h6Var = km0Var.s;
                return h6Var != null ? h6Var.h(i7) : org.telegram.ui.ActionBar.m6.v0(i7);
            default:
                return ((t71) this.b).f.a.h(i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final /* synthetic */ void i(int i7, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final int j(int i7) {
        switch (this.a) {
            case 0:
                return h(i7);
            case 1:
                return h(i7);
            default:
                return ((t71) this.b).f.a.j(i7);
        }
    }

    private final /* synthetic */ void k(int i7, int i10) {
    }

    private final /* synthetic */ void l(int i7, int i10) {
    }

    private final /* synthetic */ void m(int i7, int i10) {
    }
}
