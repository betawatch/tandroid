package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class x6 implements org.telegram.ui.ActionBar.k6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void a(float f7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void b() {
        switch (this.a) {
            case 0:
                j8 j8Var = (j8) this.b;
                j8Var.l0.getSearchField().setCursorColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Oi));
                org.telegram.ui.ActionBar.w0 w0Var = j8Var.b0;
                w0Var.setIconColor(j8Var.getThemedColor(((Integer) w0Var.getTag()).intValue()));
                Drawable background = w0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.j6.i6;
                org.telegram.ui.ActionBar.j6.B1(background, j8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.w0 w0Var2 = j8Var.N;
                w0Var2.setIconColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Wi));
                org.telegram.ui.ActionBar.j6.B1(w0Var2.getBackground(), j8Var.getThemedColor(i10), true);
                w80 w80Var = j8Var.S;
                w80Var.setBackgroundColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ti));
                w80Var.setProgressColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Vi));
                j8Var.I0();
                int i11 = org.telegram.ui.ActionBar.j6.G8;
                w0Var.B(j8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.j6.E8;
                w0Var2.G(j8Var.getThemedColor(i12), false);
                w0Var2.G(j8Var.getThemedColor(i12), true);
                w0Var2.B(j8Var.getThemedColor(i11));
                break;
            case 1:
                bk bkVar = (bk) this.b;
                bi.y1 y1Var = bkVar.s;
                if (y1Var != null) {
                    int childCount = y1Var.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = y1Var.getChildAt(i13);
                        if (childAt instanceof ak) {
                            ((ak) childAt).b();
                        }
                    }
                }
                ui uiVar = bkVar.I;
                if (uiVar != null) {
                    uiVar.e();
                    break;
                }
                break;
            case 2:
                ll llVar = (ll) this.b;
                llVar.r.setIconColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ui, llVar.a));
                llVar.r.B(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, llVar.a));
                llVar.r.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, llVar.a), true);
                llVar.r.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, llVar.a), false);
                if (llVar.H != null) {
                    if (!org.telegram.ui.ActionBar.j6.I.q() && AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, llVar.a)) >= 0.721f) {
                        if (llVar.U) {
                            llVar.U = false;
                            llVar.H.setMapStyle(null);
                            break;
                        }
                    } else if (!llVar.U) {
                        llVar.U = true;
                        llVar.H.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
                        break;
                    }
                }
                break;
            case 3:
                sq sqVar = (sq) this.b;
                org.telegram.ui.ActionBar.w0 w0Var3 = sqVar.I;
                w0Var3.setIconColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, sqVar.d0));
                org.telegram.ui.ActionBar.j6.w1(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, sqVar.d0), w0Var3.getBackground());
                w0Var3.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, sqVar.d0), false);
                w0Var3.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, sqVar.d0), true);
                w0Var3.B(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, sqVar.d0));
                break;
            case 4:
                ((la0) this.b).Z();
                break;
            case 5:
                ((je0) this.b).q();
                break;
            case 6:
                ((zg0) this.b).S();
                break;
            case 7:
                NumberTextView numberTextView = ((ho0) this.b).x0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y8, false));
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
                ((r51) this.b).d();
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
