package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ij implements org.telegram.ui.ActionBar.i6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ij(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final boolean b() {
        switch (this.a) {
            case 0:
                return org.telegram.ui.ActionBar.n6.I.q();
            case 1:
                return ((jm0) this.b).T;
            default:
                return ((r71) this.b).f.a.b();
        }
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final void c(float f10, float f11, int i7, int i10) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.n6.r(f10, f11, i7, i10);
                break;
            case 1:
                org.telegram.ui.ActionBar.n6.r(f10, f11, i7, i10);
                break;
            default:
                u61 u61Var = ((r71) this.b).f.a;
                if (u61Var == null) {
                    org.telegram.ui.ActionBar.n6.r(f10, f11, i7, i10);
                    break;
                } else {
                    u61Var.c(f10, f11, i7, i10);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final ColorFilter d() {
        switch (this.a) {
        }
        return org.telegram.ui.ActionBar.n6.v3;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final Paint e(String str) {
        switch (this.a) {
            case 0:
                return org.telegram.ui.ActionBar.n6.V0(str);
            case 1:
                return org.telegram.ui.ActionBar.n6.V0(str);
            default:
                return ((r71) this.b).f.a.e(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final boolean f() {
        switch (this.a) {
        }
        return org.telegram.messenger.bz.H0;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final int g(int i7) {
        switch (this.a) {
            case 0:
                return i(i7);
            case 1:
                return i(i7);
            default:
                return ((r71) this.b).f.a.i(i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final Drawable getDrawable(String str) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                jm0 jm0Var = (jm0) this.b;
                if (!str.equals("drawableMsgIn")) {
                    if (!str.equals("drawableMsgInSelected")) {
                        org.telegram.ui.ActionBar.i6 i6Var = jm0Var.s;
                        if (i6Var == null) {
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
                                u61 u61Var = v71Var.a;
                                if (u61Var == null) {
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
        return org.telegram.ui.ActionBar.n6.R0(str);
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final boolean h() {
        switch (this.a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return ((r71) this.b).f.a.h();
        }
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final int i(int i7) {
        switch (this.a) {
            case 0:
                return ((bn) this.b).getThemedColor(i7);
            case 1:
                jm0 jm0Var = (jm0) this.b;
                int indexOfKey = jm0Var.w.indexOfKey(i7);
                if (indexOfKey >= 0) {
                    return jm0Var.w.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.i6 i6Var = jm0Var.s;
                return i6Var != null ? i6Var.i(i7) : org.telegram.ui.ActionBar.n6.v0(i7);
            default:
                return ((r71) this.b).f.a.i(i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final /* synthetic */ void j(int i7, int i10) {
        int i11 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final int k(int i7) {
        switch (this.a) {
            case 0:
                return i(i7);
            case 1:
                return i(i7);
            default:
                return ((r71) this.b).f.a.k(i7);
        }
    }

    private final /* synthetic */ void a(int i7, int i10) {
    }

    private final /* synthetic */ void l(int i7, int i10) {
    }

    private final /* synthetic */ void m(int i7, int i10) {
    }
}
