package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s6 implements org.telegram.ui.ActionBar.g6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s6(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final /* synthetic */ void a(float f10) {
        int i9 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final void b() {
        switch (this.a) {
            case 0:
                c8 c8Var = (c8) this.b;
                c8Var.h0.getSearchField().setCursorColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.f6.Oi));
                org.telegram.ui.ActionBar.w0 w0Var = c8Var.X;
                w0Var.setIconColor(c8Var.getThemedColor(((Integer) w0Var.getTag()).intValue()));
                Drawable background = w0Var.getBackground();
                int i9 = org.telegram.ui.ActionBar.f6.i6;
                org.telegram.ui.ActionBar.f6.B1(background, c8Var.getThemedColor(i9), true);
                org.telegram.ui.ActionBar.w0 w0Var2 = c8Var.J;
                w0Var2.setIconColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.f6.Wi));
                org.telegram.ui.ActionBar.f6.B1(w0Var2.getBackground(), c8Var.getThemedColor(i9), true);
                v70 v70Var = c8Var.O;
                v70Var.setBackgroundColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.f6.Ti));
                v70Var.setProgressColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.f6.Vi));
                c8Var.H0();
                int i10 = org.telegram.ui.ActionBar.f6.G8;
                w0Var.B(c8Var.getThemedColor(i10));
                int i11 = org.telegram.ui.ActionBar.f6.E8;
                w0Var2.G(c8Var.getThemedColor(i11), false);
                w0Var2.G(c8Var.getThemedColor(i11), true);
                w0Var2.B(c8Var.getThemedColor(i10));
                break;
            case 1:
                pj pjVar = (pj) this.b;
                gh.f1 f1Var = pjVar.s;
                if (f1Var != null) {
                    int childCount = f1Var.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = f1Var.getChildAt(i12);
                        if (childAt instanceof oj) {
                            ((oj) childAt).b();
                        }
                    }
                }
                gi giVar = pjVar.E;
                if (giVar != null) {
                    giVar.d();
                    break;
                }
                break;
            case 2:
                xk xkVar = (xk) this.b;
                xkVar.r.setIconColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ui, xkVar.a));
                xkVar.r.B(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G8, xkVar.a));
                xkVar.r.G(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.F8, xkVar.a), true);
                xkVar.r.G(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, xkVar.a), false);
                if (xkVar.D != null) {
                    if (!org.telegram.ui.ActionBar.f6.I.q() && AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, xkVar.a)) >= 0.721f) {
                        if (xkVar.Q) {
                            xkVar.Q = false;
                            xkVar.D.setMapStyle(null);
                            break;
                        }
                    } else if (!xkVar.Q) {
                        xkVar.Q = true;
                        xkVar.D.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
                        break;
                    }
                }
                break;
            case 3:
                cq cqVar = (cq) this.b;
                org.telegram.ui.ActionBar.w0 w0Var3 = cqVar.E;
                w0Var3.setIconColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, cqVar.W));
                org.telegram.ui.ActionBar.f6.w1(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.I5, cqVar.W), w0Var3.getBackground());
                w0Var3.G(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, cqVar.W), false);
                w0Var3.G(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.F8, cqVar.W), true);
                w0Var3.B(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G8, cqVar.W));
                break;
            case 4:
                ((k90) this.b).Y();
                break;
            case 5:
                ((hd0) this.b).q();
                break;
            case 6:
                ((ag0) this.b).R();
                break;
            case 7:
                NumberTextView numberTextView = ((hn0) this.b).t0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.y8, false));
                    break;
                }
                break;
            case 8:
                ((Runnable) this.b).run();
                break;
            case 9:
                ((cx0) this.b).y0(false);
                break;
            default:
                ((h41) this.b).d();
                break;
        }
    }

    private final /* synthetic */ void c(float f10) {
    }

    private final /* synthetic */ void d(float f10) {
    }

    private final /* synthetic */ void e(float f10) {
    }

    private final /* synthetic */ void f(float f10) {
    }

    private final /* synthetic */ void g(float f10) {
    }

    private final /* synthetic */ void h(float f10) {
    }

    private final /* synthetic */ void i(float f10) {
    }

    private final /* synthetic */ void j(float f10) {
    }

    private final /* synthetic */ void k(float f10) {
    }

    private final /* synthetic */ void l(float f10) {
    }

    private final /* synthetic */ void m(float f10) {
    }
}
