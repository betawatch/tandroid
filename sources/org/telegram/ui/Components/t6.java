package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t6 implements org.telegram.ui.ActionBar.l6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.l6
    public final /* synthetic */ void a(float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.l6
    public final void b() {
        switch (this.a) {
            case 0:
                c8 c8Var = (c8) this.b;
                c8Var.i0.getSearchField().setCursorColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.k6.Oi));
                org.telegram.ui.ActionBar.w0 w0Var = c8Var.Y;
                w0Var.setIconColor(c8Var.getThemedColor(((Integer) w0Var.getTag()).intValue()));
                Drawable background = w0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.k6.i6;
                org.telegram.ui.ActionBar.k6.B1(background, c8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.w0 w0Var2 = c8Var.K;
                w0Var2.setIconColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.k6.Wi));
                org.telegram.ui.ActionBar.k6.B1(w0Var2.getBackground(), c8Var.getThemedColor(i10), true);
                p80 p80Var = c8Var.P;
                p80Var.setBackgroundColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.k6.Ti));
                p80Var.setProgressColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.k6.Vi));
                c8Var.I0();
                int i11 = org.telegram.ui.ActionBar.k6.G8;
                w0Var.B(c8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.k6.E8;
                w0Var2.G(c8Var.getThemedColor(i12), false);
                w0Var2.G(c8Var.getThemedColor(i12), true);
                w0Var2.B(c8Var.getThemedColor(i11));
                break;
            case 1:
                sj sjVar = (sj) this.b;
                mh.d1 d1Var = sjVar.s;
                if (d1Var != null) {
                    int childCount = d1Var.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = d1Var.getChildAt(i13);
                        if (childAt instanceof rj) {
                            ((rj) childAt).b();
                        }
                    }
                }
                ii iiVar = sjVar.F;
                if (iiVar != null) {
                    iiVar.e();
                    break;
                }
                break;
            case 2:
                cl clVar = (cl) this.b;
                clVar.r.setIconColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.ui, clVar.a));
                clVar.r.B(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G8, clVar.a));
                clVar.r.G(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.F8, clVar.a), true);
                clVar.r.G(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E8, clVar.a), false);
                if (clVar.E != null) {
                    if (!org.telegram.ui.ActionBar.k6.I.q() && AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, clVar.a)) >= 0.721f) {
                        if (clVar.R) {
                            clVar.R = false;
                            clVar.E.setMapStyle(null);
                            break;
                        }
                    } else if (!clVar.R) {
                        clVar.R = true;
                        clVar.E.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
                        break;
                    }
                }
                break;
            case 3:
                mq mqVar = (mq) this.b;
                org.telegram.ui.ActionBar.w0 w0Var3 = mqVar.F;
                w0Var3.setIconColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, mqVar.a0));
                org.telegram.ui.ActionBar.k6.w1(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.I5, mqVar.a0), w0Var3.getBackground());
                w0Var3.G(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E8, mqVar.a0), false);
                w0Var3.G(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.F8, mqVar.a0), true);
                w0Var3.B(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G8, mqVar.a0));
                break;
            case 4:
                ((fa0) this.b).Z();
                break;
            case 5:
                ((fe0) this.b).q();
                break;
            case 6:
                ((xg0) this.b).S();
                break;
            case 7:
                NumberTextView numberTextView = ((eo0) this.b).u0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.y8, false));
                    break;
                }
                break;
            case 8:
                ((Runnable) this.b).run();
                break;
            case 9:
                ((yx0) this.b).z0(false);
                break;
            default:
                ((f51) this.b).d();
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
