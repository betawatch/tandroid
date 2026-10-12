package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class b7 implements org.telegram.ui.ActionBar.h6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final /* synthetic */ void a(float f7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final void b() {
        switch (this.a) {
            case 0:
                m8 m8Var = (m8) this.b;
                m8Var.l0.getSearchField().setCursorColor(m8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Oi));
                org.telegram.ui.ActionBar.u0 u0Var = m8Var.b0;
                u0Var.setIconColor(m8Var.getThemedColor(((Integer) u0Var.getTag()).intValue()));
                Drawable background = u0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.g6.i6;
                org.telegram.ui.ActionBar.g6.C1(background, m8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.u0 u0Var2 = m8Var.N;
                u0Var2.setIconColor(m8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Wi));
                org.telegram.ui.ActionBar.g6.C1(u0Var2.getBackground(), m8Var.getThemedColor(i10), true);
                n90 n90Var = m8Var.S;
                n90Var.setBackgroundColor(m8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ti));
                n90Var.setProgressColor(m8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Vi));
                m8Var.I0();
                int i11 = org.telegram.ui.ActionBar.g6.G8;
                u0Var.B(m8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.g6.E8;
                u0Var2.G(m8Var.getThemedColor(i12), false);
                u0Var2.G(m8Var.getThemedColor(i12), true);
                u0Var2.B(m8Var.getThemedColor(i11));
                break;
            case 1:
                zj zjVar = (zj) this.b;
                bi.o0 o0Var = zjVar.s;
                if (o0Var != null) {
                    int childCount = o0Var.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = o0Var.getChildAt(i13);
                        if (childAt instanceof yj) {
                            ((yj) childAt).b();
                        }
                    }
                }
                ri riVar = zjVar.I;
                if (riVar != null) {
                    riVar.d();
                    break;
                }
                break;
            case 2:
                ul ulVar = (ul) this.b;
                ulVar.r.setIconColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.ui, ulVar.a));
                ulVar.r.B(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G8, ulVar.a));
                ulVar.r.G(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.F8, ulVar.a), true);
                ulVar.r.G(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, ulVar.a), false);
                if (ulVar.H != null) {
                    if (!org.telegram.ui.ActionBar.g6.I.q() && AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, ulVar.a)) >= 0.721f) {
                        if (ulVar.U) {
                            ulVar.U = false;
                            ulVar.H.setMapStyle(null);
                            break;
                        }
                    } else if (!ulVar.U) {
                        ulVar.U = true;
                        ulVar.H.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
                        break;
                    }
                }
                break;
            case 3:
                zq zqVar = (zq) this.b;
                org.telegram.ui.ActionBar.u0 u0Var3 = zqVar.I;
                u0Var3.setIconColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, zqVar.d0));
                org.telegram.ui.ActionBar.g6.x1(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.I5, zqVar.d0), u0Var3.getBackground());
                u0Var3.G(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, zqVar.d0), false);
                u0Var3.G(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.F8, zqVar.d0), true);
                u0Var3.B(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G8, zqVar.d0));
                break;
            case 4:
                ((cb0) this.b).Z();
                break;
            case 5:
                ((ze0) this.b).s();
                break;
            case 6:
                ((qh0) this.b).T();
                break;
            case 7:
                NumberTextView numberTextView = ((zo0) this.b).x0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.y8, false));
                    break;
                }
                break;
            case 8:
                ((Runnable) this.b).run();
                break;
            case 9:
                ((ty0) this.b).A0(false);
                break;
            default:
                ((h61) this.b).d();
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
