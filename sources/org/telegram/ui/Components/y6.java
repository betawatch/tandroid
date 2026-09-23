package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class y6 implements org.telegram.ui.ActionBar.i6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final /* synthetic */ void a(float f7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final void b() {
        switch (this.a) {
            case 0:
                j8 j8Var = (j8) this.b;
                j8Var.l0.getSearchField().setCursorColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.h6.Oi));
                org.telegram.ui.ActionBar.v0 v0Var = j8Var.b0;
                v0Var.setIconColor(j8Var.getThemedColor(((Integer) v0Var.getTag()).intValue()));
                Drawable background = v0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.h6.i6;
                org.telegram.ui.ActionBar.h6.B1(background, j8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.v0 v0Var2 = j8Var.N;
                v0Var2.setIconColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.h6.Wi));
                org.telegram.ui.ActionBar.h6.B1(v0Var2.getBackground(), j8Var.getThemedColor(i10), true);
                n80 n80Var = j8Var.S;
                n80Var.setBackgroundColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.h6.Ti));
                n80Var.setProgressColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.h6.Vi));
                j8Var.I0();
                int i11 = org.telegram.ui.ActionBar.h6.G8;
                v0Var.B(j8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.h6.E8;
                v0Var2.G(j8Var.getThemedColor(i12), false);
                v0Var2.G(j8Var.getThemedColor(i12), true);
                v0Var2.B(j8Var.getThemedColor(i11));
                break;
            case 1:
                zj zjVar = (zj) this.b;
                ai.w0 w0Var = zjVar.s;
                if (w0Var != null) {
                    int childCount = w0Var.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = w0Var.getChildAt(i13);
                        if (childAt instanceof yj) {
                            ((yj) childAt).b();
                        }
                    }
                }
                si siVar = zjVar.I;
                if (siVar != null) {
                    siVar.e();
                    break;
                }
                break;
            case 2:
                hl hlVar = (hl) this.b;
                hlVar.r.setIconColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.ui, hlVar.a));
                hlVar.r.B(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G8, hlVar.a));
                hlVar.r.G(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.F8, hlVar.a), true);
                hlVar.r.G(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, hlVar.a), false);
                if (hlVar.H != null) {
                    if (!org.telegram.ui.ActionBar.h6.I.q() && AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.d6, hlVar.a)) >= 0.721f) {
                        if (hlVar.U) {
                            hlVar.U = false;
                            hlVar.H.setMapStyle(null);
                            break;
                        }
                    } else if (!hlVar.U) {
                        hlVar.U = true;
                        hlVar.H.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
                        break;
                    }
                }
                break;
            case 3:
                nq nqVar = (nq) this.b;
                org.telegram.ui.ActionBar.v0 v0Var3 = nqVar.I;
                v0Var3.setIconColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, nqVar.d0));
                org.telegram.ui.ActionBar.h6.w1(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.I5, nqVar.d0), v0Var3.getBackground());
                v0Var3.G(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, nqVar.d0), false);
                v0Var3.G(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.F8, nqVar.d0), true);
                v0Var3.B(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G8, nqVar.d0));
                break;
            case 4:
                ((ca0) this.b).Z();
                break;
            case 5:
                ((ae0) this.b).q();
                break;
            case 6:
                ((qg0) this.b).S();
                break;
            case 7:
                NumberTextView numberTextView = ((yn0) this.b).x0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.y8, false));
                    break;
                }
                break;
            case 8:
                ((Runnable) this.b).run();
                break;
            case 9:
                ((ux0) this.b).z0(false);
                break;
            default:
                ((d51) this.b).d();
                break;
        }
    }

    private final /* synthetic */ void c(float f7) {
    }

    private final /* synthetic */ void d(float f7) {
    }

    private final /* synthetic */ void e(float f7) {
    }

    private final /* synthetic */ void f(float f7) {
    }

    private final /* synthetic */ void g(float f7) {
    }

    private final /* synthetic */ void h(float f7) {
    }

    private final /* synthetic */ void i(float f7) {
    }

    private final /* synthetic */ void j(float f7) {
    }

    private final /* synthetic */ void k(float f7) {
    }

    private final /* synthetic */ void l(float f7) {
    }

    private final /* synthetic */ void m(float f7) {
    }
}
