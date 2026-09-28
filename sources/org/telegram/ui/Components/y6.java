package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
                org.telegram.ui.ActionBar.u0 u0Var = j8Var.b0;
                u0Var.setIconColor(j8Var.getThemedColor(((Integer) u0Var.getTag()).intValue()));
                Drawable background = u0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.h6.i6;
                org.telegram.ui.ActionBar.h6.B1(background, j8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.u0 u0Var2 = j8Var.N;
                u0Var2.setIconColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.h6.Wi));
                org.telegram.ui.ActionBar.h6.B1(u0Var2.getBackground(), j8Var.getThemedColor(i10), true);
                z80 z80Var = j8Var.S;
                z80Var.setBackgroundColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.h6.Ti));
                z80Var.setProgressColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.h6.Vi));
                j8Var.I0();
                int i11 = org.telegram.ui.ActionBar.h6.G8;
                u0Var.B(j8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.h6.E8;
                u0Var2.G(j8Var.getThemedColor(i12), false);
                u0Var2.G(j8Var.getThemedColor(i12), true);
                u0Var2.B(j8Var.getThemedColor(i11));
                break;
            case 1:
                ak akVar = (ak) this.b;
                ai.w0 w0Var = akVar.s;
                if (w0Var != null) {
                    int childCount = w0Var.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = w0Var.getChildAt(i13);
                        if (childAt instanceof zj) {
                            ((zj) childAt).b();
                        }
                    }
                }
                si siVar = akVar.I;
                if (siVar != null) {
                    siVar.e();
                    break;
                }
                break;
            case 2:
                il ilVar = (il) this.b;
                ilVar.r.setIconColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.ui, ilVar.a));
                ilVar.r.B(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G8, ilVar.a));
                ilVar.r.G(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.F8, ilVar.a), true);
                ilVar.r.G(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, ilVar.a), false);
                if (ilVar.H != null) {
                    if (!org.telegram.ui.ActionBar.h6.I.q() && AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.d6, ilVar.a)) >= 0.721f) {
                        if (ilVar.U) {
                            ilVar.U = false;
                            ilVar.H.setMapStyle(null);
                            break;
                        }
                    } else if (!ilVar.U) {
                        ilVar.U = true;
                        ilVar.H.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
                        break;
                    }
                }
                break;
            case 3:
                oq oqVar = (oq) this.b;
                org.telegram.ui.ActionBar.u0 u0Var3 = oqVar.I;
                u0Var3.setIconColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, oqVar.d0));
                org.telegram.ui.ActionBar.h6.w1(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.I5, oqVar.d0), u0Var3.getBackground());
                u0Var3.G(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, oqVar.d0), false);
                u0Var3.G(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.F8, oqVar.d0), true);
                u0Var3.B(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G8, oqVar.d0));
                break;
            case 4:
                ((pa0) this.b).Z();
                break;
            case 5:
                ((me0) this.b).q();
                break;
            case 6:
                ((ch0) this.b).S();
                break;
            case 7:
                NumberTextView numberTextView = ((no0) this.b).x0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.y8, false));
                    break;
                }
                break;
            case 8:
                ((Runnable) this.b).run();
                break;
            case 9:
                ((hy0) this.b).z0(false);
                break;
            default:
                ((t51) this.b).d();
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
