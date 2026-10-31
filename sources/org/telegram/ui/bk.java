package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class bk implements org.telegram.ui.ActionBar.p6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bk(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final boolean a() {
        switch (this.a) {
            case 0:
                return org.telegram.ui.ActionBar.t6.I.q();
            case 1:
                return ((tn0) this.b).S;
            default:
                return ((i91) this.b).f.a.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void b(float f7, float f10, int i10, int i11) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.t6.r(f7, f10, i10, i11);
                break;
            case 1:
                org.telegram.ui.ActionBar.t6.r(f7, f10, i10, i11);
                break;
            default:
                n81 n81Var = ((i91) this.b).f.a;
                if (n81Var == null) {
                    org.telegram.ui.ActionBar.t6.r(f7, f10, i10, i11);
                    break;
                } else {
                    n81Var.b(f7, f10, i10, i11);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final ColorFilter c() {
        switch (this.a) {
        }
        return org.telegram.ui.ActionBar.t6.v3;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final Paint d(String str) {
        switch (this.a) {
            case 0:
                return org.telegram.ui.ActionBar.t6.V0(str);
            case 1:
                return org.telegram.ui.ActionBar.t6.V0(str);
            default:
                return ((i91) this.b).f.a.d(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final boolean e() {
        switch (this.a) {
        }
        return org.telegram.messenger.tz.H0;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final int f(int i10) {
        switch (this.a) {
            case 0:
                return h(i10);
            case 1:
                return h(i10);
            default:
                return ((i91) this.b).f.a.h(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final boolean g() {
        switch (this.a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return ((i91) this.b).f.a.g();
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final Drawable getDrawable(String str) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                tn0 tn0Var = (tn0) this.b;
                if (!str.equals("drawableMsgIn")) {
                    if (!str.equals("drawableMsgInSelected")) {
                        org.telegram.ui.ActionBar.p6 p6Var = tn0Var.s;
                        if (p6Var == null) {
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
                m91 m91Var = ((i91) this.b).f;
                if (!str.equals("drawableMsgOut")) {
                    if (!str.equals("drawableMsgOutSelected")) {
                        if (!str.equals("drawableMsgOutMedia")) {
                            if (!str.equals("drawableMsgOutMediaSelected")) {
                                n81 n81Var = m91Var.a;
                                if (n81Var == null) {
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
        return org.telegram.ui.ActionBar.t6.R0(str);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final int h(int i10) {
        switch (this.a) {
            case 0:
                return ((un) this.b).getThemedColor(i10);
            case 1:
                tn0 tn0Var = (tn0) this.b;
                int indexOfKey = tn0Var.w.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return tn0Var.w.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.p6 p6Var = tn0Var.s;
                return p6Var != null ? p6Var.h(i10) : org.telegram.ui.ActionBar.t6.v0(i10);
            default:
                return ((i91) this.b).f.a.h(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void i(int i10, int i11) {
        int i12 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final int j(int i10) {
        switch (this.a) {
            case 0:
                return h(i10);
            case 1:
                return h(i10);
            default:
                return ((i91) this.b).f.a.j(i10);
        }
    }

    private final /* synthetic */ void k(int i10, int i11) {
    }

    private final /* synthetic */ void l(int i10, int i11) {
    }

    private final /* synthetic */ void m(int i10, int i11) {
    }
}
