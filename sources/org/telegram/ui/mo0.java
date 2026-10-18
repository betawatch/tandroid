package org.telegram.ui;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class mo0 implements org.telegram.ui.ActionBar.d6, r0.n, org.telegram.ui.Components.b81, org.telegram.ui.Components.sq0, org.telegram.ui.Components.bp0, org.telegram.ui.Components.ro0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mo0(Object obj, int i10) {
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
                sv0 sv0Var = (sv0) this.b;
                i0.b g10 = k1Var.a.g(519);
                sv0Var.r = g10;
                sv0Var.d.setPadding(g10.a, g10.b, g10.c, g10.d);
                sv0Var.c.requestLayout();
                break;
            default:
                ad1 ad1Var = (ad1) this.b;
                i0.b g11 = k1Var.a.g(519);
                ad1Var.n = g11;
                ad1Var.c.setPadding(g11.a, g11.b, g11.c, g11.d);
                ad1Var.b.requestLayout();
                break;
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.sq0
    public void H() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int I(int i10) {
        switch (this.a) {
            case 0:
                return u(i10);
            default:
                return ((ic1) this.b).f.a.I(i10);
        }
    }

    @Override // org.telegram.ui.Components.bp0
    public void L(float f7, boolean z10) {
        switch (this.a) {
            case 4:
                ThemeActivity.Y(((ma1) this.b).d, Math.round((r5.b * f7) + 0), false);
                break;
            default:
                xa1 xa1Var = (xa1) this.b;
                ThemeActivity.k0(xa1Var.h, Math.round(((xa1Var.d - r1) * f7) + xa1Var.c));
                break;
        }
    }

    @Override // org.telegram.ui.Components.bp0
    public int Y() {
        switch (this.a) {
            case 4:
                return ((ma1) this.b).b;
            default:
                xa1 xa1Var = (xa1) this.b;
                return xa1Var.d - xa1Var.c;
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public boolean a() {
        switch (this.a) {
            case 0:
                return ((kp0) this.b).S;
            default:
                return ((ic1) this.b).f.a.a();
        }
    }

    @Override // org.telegram.ui.Components.b81
    public void b(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        r31 r31Var = secretMediaViewer.y;
        if (r31Var != null) {
            long p5 = r31Var.p();
            if (p5 != -9223372036854775807L) {
                secretMediaViewer.y.L((long) (f7 * p5), false);
            }
            secretMediaViewer.y.C();
        }
    }

    @Override // org.telegram.ui.Components.b81
    public void c(float f7) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        r31 r31Var = secretMediaViewer.y;
        if (r31Var != null) {
            r31Var.B();
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
                mb1 mb1Var = ((ic1) this.b).f.a;
                if (mb1Var == null) {
                    org.telegram.ui.ActionBar.h6.q(f7, f10, i10, i11);
                    break;
                } else {
                    mb1Var.d(f7, f10, i10, i11);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.Components.ro0
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((pe1) this.b).t0.movePreviewFragment(f7);
        }
    }

    @Override // org.telegram.ui.Components.ro0
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        te1 te1Var = ((pe1) this.b).t0;
        HashSet hashSet = te1.n1;
        te1Var.M0(r2Var);
    }

    @Override // org.telegram.ui.Components.ro0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            ((pe1) this.b).t0.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.sq0
    public void g0() {
        ((StickersActivity) this.b).j0();
    }

    @Override // org.telegram.ui.Components.bp0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 4:
                return String.valueOf(Math.round((((ma1) this.b).a.getProgress() * r0.b) + 0));
            default:
                xa1 xa1Var = (xa1) this.b;
                return String.valueOf(Math.round((xa1Var.b.getProgress() * (xa1Var.d - r1)) + xa1Var.c));
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public Drawable getDrawable(String str) {
        switch (this.a) {
            case 0:
                kp0 kp0Var = (kp0) this.b;
                if (!str.equals("drawableMsgIn")) {
                    if (!str.equals("drawableMsgInSelected")) {
                        org.telegram.ui.ActionBar.d6 d6Var = kp0Var.s;
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
                mc1 mc1Var = ((ic1) this.b).f;
                if (!str.equals("drawableMsgOut")) {
                    if (!str.equals("drawableMsgOutSelected")) {
                        if (!str.equals("drawableMsgOutMedia")) {
                            if (!str.equals("drawableMsgOutMediaSelected")) {
                                mb1 mb1Var = mc1Var.a;
                                if (mb1Var == null) {
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
                return ((ic1) this.b).f.a.n(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int r(int i10) {
        switch (this.a) {
            case 0:
                return u(i10);
            default:
                return ((ic1) this.b).f.a.u(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public boolean s() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return ((ic1) this.b).f.a.s();
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int u(int i10) {
        switch (this.a) {
            case 0:
                kp0 kp0Var = (kp0) this.b;
                int indexOfKey = kp0Var.v.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return kp0Var.v.valueAt(indexOfKey);
                }
                org.telegram.ui.ActionBar.d6 d6Var = kp0Var.s;
                return d6Var != null ? d6Var.u(i10) : org.telegram.ui.ActionBar.h6.x0(null, i10, false);
            default:
                return ((ic1) this.b).f.a.u(i10);
        }
    }

    @Override // org.telegram.ui.Components.bp0
    public void v() {
        int i10 = this.a;
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
