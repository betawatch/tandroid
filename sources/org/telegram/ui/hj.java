package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class hj implements org.telegram.ui.ActionBar.f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hj(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final boolean a() {
        switch (this.a) {
            case 0:
                return org.telegram.ui.ActionBar.k6.I.q();
            case 1:
                return ((hm0) this.b).S;
            default:
                return ((r71) this.b).f.a.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final void b(float f10, float f11, int i7, int i10) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.k6.r(f10, f11, i7, i10);
                break;
            case 1:
                org.telegram.ui.ActionBar.k6.r(f10, f11, i7, i10);
                break;
            default:
                w61 w61Var = ((r71) this.b).f.a;
                if (w61Var == null) {
                    org.telegram.ui.ActionBar.k6.r(f10, f11, i7, i10);
                    break;
                } else {
                    w61Var.b(f10, f11, i7, i10);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final ColorFilter c() {
        switch (this.a) {
        }
        return org.telegram.ui.ActionBar.k6.v3;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final Paint d(String str) {
        switch (this.a) {
            case 0:
                return org.telegram.ui.ActionBar.k6.V0(str);
            case 1:
                return org.telegram.ui.ActionBar.k6.V0(str);
            default:
                return ((r71) this.b).f.a.d(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final boolean e() {
        switch (this.a) {
        }
        return org.telegram.messenger.iz.H0;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int f(int i7) {
        switch (this.a) {
            case 0:
                return h(i7);
            case 1:
                return h(i7);
            default:
                return ((r71) this.b).f.a.h(i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final boolean g() {
        switch (this.a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return ((r71) this.b).f.a.g();
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final Drawable getDrawable(String str) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                hm0 hm0Var = (hm0) this.b;
                if (!str.equals("drawableMsgIn")) {
                    if (!str.equals("drawableMsgInSelected")) {
                        org.telegram.ui.ActionBar.f6 f6Var = hm0Var.s;
                        if (f6Var == null) {
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
                v71 v71Var = ((r71) this.b).f;
                if (!str.equals("drawableMsgOut")) {
                    if (!str.equals("drawableMsgOutSelected")) {
                        if (!str.equals("drawableMsgOutMedia")) {
                            if (!str.equals("drawableMsgOutMediaSelected")) {
                                w61 w61Var = v71Var.a;
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
        return org.telegram.ui.ActionBar.k6.R0(str);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int h(int i7) {
        switch (this.a) {
            case 0:
                return ((an) this.b).getThemedColor(i7);
            case 1:
                hm0 hm0Var = (hm0) this.b;
                int indexOfKey = hm0Var.w.indexOfKey(i7);
                if (indexOfKey >= 0) {
                    return hm0Var.w.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.f6 f6Var = hm0Var.s;
                return f6Var != null ? f6Var.h(i7) : org.telegram.ui.ActionBar.k6.v0(i7);
            default:
                return ((r71) this.b).f.a.h(i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final /* synthetic */ void i(int i7, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int j(int i7) {
        switch (this.a) {
            case 0:
                return h(i7);
            case 1:
                return h(i7);
            default:
                return ((r71) this.b).f.a.j(i7);
        }
    }

    private final /* synthetic */ void k(int i7, int i10) {
    }

    private final /* synthetic */ void l(int i7, int i10) {
    }

    private final /* synthetic */ void m(int i7, int i10) {
    }
}
