package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class ij implements org.telegram.ui.ActionBar.h6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ij(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final boolean d() {
        switch (this.a) {
            case 0:
                return org.telegram.ui.ActionBar.m6.I.q();
            case 1:
                return ((lm0) this.b).T;
            default:
                return ((t71) this.b).f.a.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final void e(float f10, float f11, int i7, int i10) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.m6.r(f10, f11, i7, i10);
                break;
            case 1:
                org.telegram.ui.ActionBar.m6.r(f10, f11, i7, i10);
                break;
            default:
                w61 w61Var = ((t71) this.b).f.a;
                if (w61Var == null) {
                    org.telegram.ui.ActionBar.m6.r(f10, f11, i7, i10);
                    break;
                } else {
                    w61Var.e(f10, f11, i7, i10);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final ColorFilter f() {
        switch (this.a) {
        }
        return org.telegram.ui.ActionBar.m6.v3;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final Paint g(String str) {
        switch (this.a) {
            case 0:
                return org.telegram.ui.ActionBar.m6.V0(str);
            case 1:
                return org.telegram.ui.ActionBar.m6.V0(str);
            default:
                return ((t71) this.b).f.a.g(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final Drawable getDrawable(String str) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                lm0 lm0Var = (lm0) this.b;
                if (!str.equals("drawableMsgIn")) {
                    if (!str.equals("drawableMsgInSelected")) {
                        org.telegram.ui.ActionBar.h6 h6Var = lm0Var.s;
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
                                w61 w61Var = x71Var.a;
                                if (w61Var == null) {
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
    public final boolean h() {
        switch (this.a) {
        }
        return org.telegram.messenger.cz.H0;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final int i(int i7) {
        switch (this.a) {
            case 0:
                return k(i7);
            case 1:
                return k(i7);
            default:
                return ((t71) this.b).f.a.k(i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final boolean j() {
        switch (this.a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return ((t71) this.b).f.a.j();
        }
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final int k(int i7) {
        switch (this.a) {
            case 0:
                return ((bn) this.b).getThemedColor(i7);
            case 1:
                lm0 lm0Var = (lm0) this.b;
                int indexOfKey = lm0Var.w.indexOfKey(i7);
                if (indexOfKey >= 0) {
                    return lm0Var.w.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.h6 h6Var = lm0Var.s;
                return h6Var != null ? h6Var.k(i7) : org.telegram.ui.ActionBar.m6.v0(i7);
            default:
                return ((t71) this.b).f.a.k(i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final /* synthetic */ void l(int i7, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final int m(int i7) {
        switch (this.a) {
            case 0:
                return k(i7);
            case 1:
                return k(i7);
            default:
                return ((t71) this.b).f.a.m(i7);
        }
    }

    private final /* synthetic */ void a(int i7, int i10) {
    }

    private final /* synthetic */ void b(int i7, int i10) {
    }

    private final /* synthetic */ void c(int i7, int i10) {
    }
}
