package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ko0 implements org.telegram.ui.ActionBar.d6, r0.n, org.telegram.ui.Components.c81, org.telegram.ui.Components.tq0, org.telegram.ui.Components.bp0, org.telegram.ui.Components.ro0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ko0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public /* synthetic */ void B(int i10, int i11) {
        int i12 = this.a;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        switch (this.a) {
            case 1:
                qv0 qv0Var = (qv0) this.b;
                i0.b g10 = k1Var.a.g(519);
                qv0Var.r = g10;
                qv0Var.d.setPadding(g10.a, g10.b, g10.c, g10.d);
                qv0Var.c.requestLayout();
                break;
            default:
                yc1 yc1Var = (yc1) this.b;
                i0.b g11 = k1Var.a.g(519);
                yc1Var.n = g11;
                yc1Var.c.setPadding(g11.a, g11.b, g11.c, g11.d);
                yc1Var.b.requestLayout();
                break;
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int G(int i10) {
        switch (this.a) {
            case 0:
                return w(i10);
            default:
                return ((gc1) this.b).f.a.G(i10);
        }
    }

    @Override // org.telegram.ui.Components.tq0
    public void H() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.Components.bp0
    public void L(float f7, boolean z10) {
        switch (this.a) {
            case 4:
                ThemeActivity.Y(((ka1) this.b).d, Math.round((r5.b * f7) + 0), false);
                break;
            default:
                va1 va1Var = (va1) this.b;
                ThemeActivity.k0(va1Var.h, Math.round(((va1Var.d - r1) * f7) + va1Var.c));
                break;
        }
    }

    @Override // org.telegram.ui.Components.bp0
    public int Y() {
        switch (this.a) {
            case 4:
                return ((ka1) this.b).b;
            default:
                va1 va1Var = (va1) this.b;
                return va1Var.d - va1Var.c;
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public boolean a() {
        switch (this.a) {
            case 0:
                return ((ip0) this.b).S;
            default:
                return ((gc1) this.b).f.a.a();
        }
    }

    @Override // org.telegram.ui.Components.c81
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        p31 p31Var = secretMediaViewer.y;
        if (p31Var != null) {
            long p5 = p31Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.y.L((long) (f7 * p5), false);
            }
            secretMediaViewer.y.C();
        }
    }

    @Override // org.telegram.ui.Components.c81
    public void c(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        p31 p31Var = secretMediaViewer.y;
        if (p31Var != null) {
            p31Var.B();
            long p5 = secretMediaViewer.y.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.y.L((long) (f7 * p5), false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public void d(float f7, float f10, int i10, int i11) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
                break;
            default:
                kb1 kb1Var = ((gc1) this.b).f.a;
                if (kb1Var == null) {
                    org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
                    break;
                } else {
                    kb1Var.d(f7, f10, i10, i11);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.Components.ro0
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((ne1) this.b).t0.movePreviewFragment(f7);
        }
    }

    @Override // org.telegram.ui.Components.ro0
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        re1 re1Var = ((ne1) this.b).t0;
        HashSet hashSet = re1.n1;
        re1Var.M0(r2Var);
    }

    @Override // org.telegram.ui.Components.ro0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((ne1) this.b).t0.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.tq0
    public void g0() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.Components.bp0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 4:
                return String.valueOf(Math.round((((ka1) this.b).a.getProgress() * r0.b) + 0));
            default:
                va1 va1Var = (va1) this.b;
                return String.valueOf(Math.round((va1Var.b.getProgress() * (va1Var.d - r1)) + va1Var.c));
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public Drawable getDrawable(String str) {
        switch (this.a) {
            case 0:
                ip0 ip0Var = (ip0) this.b;
                if (!str.equals("drawableMsgIn")) {
                    if (!str.equals("drawableMsgInSelected")) {
                        org.telegram.ui.ActionBar.d6 d6Var = ip0Var.s;
                        if (d6Var == null) {
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
                kc1 kc1Var = ((gc1) this.b).f;
                if (!str.equals("drawableMsgOut")) {
                    if (!str.equals("drawableMsgOutSelected")) {
                        if (!str.equals("drawableMsgOutMedia")) {
                            if (!str.equals("drawableMsgOutMediaSelected")) {
                                kb1 kb1Var = kc1Var.a;
                                if (kb1Var == null) {
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
        return org.telegram.ui.ActionBar.h6.P0(str);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public ColorFilter j() {
        switch (this.a) {
        }
        return org.telegram.ui.ActionBar.h6.v3;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public Paint n(String str) {
        switch (this.a) {
            case 0:
                return org.telegram.ui.ActionBar.h6.T0(str);
            default:
                return ((gc1) this.b).f.a.n(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int r(int i10) {
        switch (this.a) {
            case 0:
                return w(i10);
            default:
                return ((gc1) this.b).f.a.w(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public boolean s() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return ((gc1) this.b).f.a.s();
        }
    }

    @Override // org.telegram.ui.Components.bp0
    public void v() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int w(int i10) {
        switch (this.a) {
            case 0:
                ip0 ip0Var = (ip0) this.b;
                int indexOfKey = ip0Var.v.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return ip0Var.v.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.d6 d6Var = ip0Var.s;
                return d6Var != null ? d6Var.w(i10) : org.telegram.ui.ActionBar.h6.x0(null, i10, false);
            default:
                return ((gc1) this.b).f.a.w(i10);
        }
    }

    private final void g() {
    }

    private final void h() {
    }

    private final /* synthetic */ void i(int i10, int i11) {
    }

    private final /* synthetic */ void k(int i10, int i11) {
    }
}
