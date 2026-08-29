package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x6 implements org.telegram.ui.ActionBar.h6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final /* synthetic */ void a(float f9) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final void b() {
        switch (this.a) {
            case 0:
                g8 g8Var = (g8) this.b;
                g8Var.h0.getSearchField().setCursorColor(g8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Oi));
                org.telegram.ui.ActionBar.w0 w0Var = g8Var.X;
                w0Var.setIconColor(g8Var.getThemedColor(((Integer) w0Var.getTag()).intValue()));
                Drawable background = w0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.g6.i6;
                org.telegram.ui.ActionBar.g6.B1(background, g8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.w0 w0Var2 = g8Var.J;
                w0Var2.setIconColor(g8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Wi));
                org.telegram.ui.ActionBar.g6.B1(w0Var2.getBackground(), g8Var.getThemedColor(i10), true);
                i80 i80Var = g8Var.O;
                i80Var.setBackgroundColor(g8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ti));
                i80Var.setProgressColor(g8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Vi));
                g8Var.I0();
                int i11 = org.telegram.ui.ActionBar.g6.G8;
                w0Var.B(g8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.g6.E8;
                w0Var2.G(g8Var.getThemedColor(i12), false);
                w0Var2.G(g8Var.getThemedColor(i12), true);
                w0Var2.B(g8Var.getThemedColor(i11));
                break;
            case 1:
                sj sjVar = (sj) this.b;
                jh.e1 e1Var = sjVar.s;
                if (e1Var != null) {
                    int childCount = e1Var.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = e1Var.getChildAt(i13);
                        if (childAt instanceof rj) {
                            ((rj) childAt).b();
                        }
                    }
                }
                ji jiVar = sjVar.E;
                if (jiVar != null) {
                    jiVar.e();
                    break;
                }
                break;
            case 2:
                bl blVar = (bl) this.b;
                blVar.r.setIconColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ui, blVar.a));
                blVar.r.B(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, blVar.a));
                blVar.r.G(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, blVar.a), true);
                blVar.r.G(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, blVar.a), false);
                if (blVar.D != null) {
                    if (!org.telegram.ui.ActionBar.g6.I.q() && AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, blVar.a)) >= 0.721f) {
                        if (blVar.Q) {
                            blVar.Q = false;
                            blVar.D.setMapStyle(null);
                            break;
                        }
                    } else if (!blVar.Q) {
                        blVar.Q = true;
                        blVar.D.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
                        break;
                    }
                }
                break;
            case 3:
                gq gqVar = (gq) this.b;
                org.telegram.ui.ActionBar.w0 w0Var3 = gqVar.E;
                w0Var3.setIconColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, gqVar.W));
                org.telegram.ui.ActionBar.g6.w1(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, gqVar.W), w0Var3.getBackground());
                w0Var3.G(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, gqVar.W), false);
                w0Var3.G(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, gqVar.W), true);
                w0Var3.B(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, gqVar.W));
                break;
            case 4:
                ((y90) this.b).Z();
                break;
            case 5:
                ((vd0) this.b).q();
                break;
            case 6:
                ((lg0) this.b).S();
                break;
            case 7:
                NumberTextView numberTextView = ((tn0) this.b).t0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.y8, false));
                    break;
                }
                break;
            case 8:
                ((Runnable) this.b).run();
                break;
            case 9:
                ((nx0) this.b).z0(false);
                break;
            default:
                ((s41) this.b).d();
                break;
        }
    }

    private final /* synthetic */ void c(float f9) {
    }

    private final /* synthetic */ void d(float f9) {
    }

    private final /* synthetic */ void e(float f9) {
    }

    private final /* synthetic */ void f(float f9) {
    }

    private final /* synthetic */ void g(float f9) {
    }

    private final /* synthetic */ void h(float f9) {
    }

    private final /* synthetic */ void i(float f9) {
    }

    private final /* synthetic */ void j(float f9) {
    }

    private final /* synthetic */ void k(float f9) {
    }

    private final /* synthetic */ void l(float f9) {
    }

    private final /* synthetic */ void m(float f9) {
    }
}
