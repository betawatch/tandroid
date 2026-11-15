package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class hj implements org.telegram.ui.ActionBar.e6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hj(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final boolean a() {
        switch (this.a) {
            case 0:
                return org.telegram.ui.ActionBar.j6.I.q();
            case 1:
                return ((jm0) this.b).T;
            default:
                return ((p71) this.b).f.a.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final void b(float f10, float f11, int i7, int i10) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.j6.r(f10, f11, i7, i10);
                break;
            case 1:
                org.telegram.ui.ActionBar.j6.r(f10, f11, i7, i10);
                break;
            default:
                s61 s61Var = ((p71) this.b).f.a;
                if (s61Var == null) {
                    org.telegram.ui.ActionBar.j6.r(f10, f11, i7, i10);
                    break;
                } else {
                    s61Var.b(f10, f11, i7, i10);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final ColorFilter c() {
        switch (this.a) {
        }
        return org.telegram.ui.ActionBar.j6.v3;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final Paint d(String str) {
        switch (this.a) {
            case 0:
                return org.telegram.ui.ActionBar.j6.V0(str);
            case 1:
                return org.telegram.ui.ActionBar.j6.V0(str);
            default:
                return ((p71) this.b).f.a.d(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final boolean e() {
        switch (this.a) {
        }
        return org.telegram.messenger.gz.H0;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int f(int i7) {
        switch (this.a) {
            case 0:
                return h(i7);
            case 1:
                return h(i7);
            default:
                return ((p71) this.b).f.a.h(i7);
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
                return ((p71) this.b).f.a.g();
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final Drawable getDrawable(String str) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                jm0 jm0Var = (jm0) this.b;
                if (!str.equals("drawableMsgIn")) {
                    if (!str.equals("drawableMsgInSelected")) {
                        org.telegram.ui.ActionBar.e6 e6Var = jm0Var.s;
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
                t71 t71Var = ((p71) this.b).f;
                if (!str.equals("drawableMsgOut")) {
                    if (!str.equals("drawableMsgOutSelected")) {
                        if (!str.equals("drawableMsgOutMedia")) {
                            if (!str.equals("drawableMsgOutMediaSelected")) {
                                s61 s61Var = t71Var.a;
                                if (s61Var == null) {
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
        return org.telegram.ui.ActionBar.j6.R0(str);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int h(int i7) {
        switch (this.a) {
            case 0:
                return ((an) this.b).getThemedColor(i7);
            case 1:
                jm0 jm0Var = (jm0) this.b;
                int indexOfKey = jm0Var.w.indexOfKey(i7);
                if (indexOfKey >= 0) {
                    return jm0Var.w.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.e6 e6Var = jm0Var.s;
                return e6Var != null ? e6Var.h(i7) : org.telegram.ui.ActionBar.j6.v0(i7);
            default:
                return ((p71) this.b).f.a.h(i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final /* synthetic */ void i(int i7, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int j(int i7) {
        switch (this.a) {
            case 0:
                return h(i7);
            case 1:
                return h(i7);
            default:
                return ((p71) this.b).f.a.j(i7);
        }
    }

    private final /* synthetic */ void k(int i7, int i10) {
    }

    private final /* synthetic */ void l(int i7, int i10) {
    }

    private final /* synthetic */ void m(int i7, int i10) {
    }
}
