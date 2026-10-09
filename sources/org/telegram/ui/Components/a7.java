package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a7 implements org.telegram.ui.ActionBar.j6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j6
    public final /* synthetic */ void a(float f7) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.j6
    public final void b() {
        switch (this.a) {
            case 0:
                l8 l8Var = (l8) this.b;
                l8Var.l0.getSearchField().setCursorColor(l8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Oi));
                org.telegram.ui.ActionBar.v0 v0Var = l8Var.b0;
                v0Var.setIconColor(l8Var.getThemedColor(((Integer) v0Var.getTag()).intValue()));
                Drawable background = v0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.i6.i6;
                org.telegram.ui.ActionBar.i6.C1(background, l8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.v0 v0Var2 = l8Var.N;
                v0Var2.setIconColor(l8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Wi));
                org.telegram.ui.ActionBar.i6.C1(v0Var2.getBackground(), l8Var.getThemedColor(i10), true);
                o90 o90Var = l8Var.S;
                o90Var.setBackgroundColor(l8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Ti));
                o90Var.setProgressColor(l8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Vi));
                l8Var.I0();
                int i11 = org.telegram.ui.ActionBar.i6.G8;
                v0Var.B(l8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.i6.E8;
                v0Var2.G(l8Var.getThemedColor(i12), false);
                v0Var2.G(l8Var.getThemedColor(i12), true);
                v0Var2.B(l8Var.getThemedColor(i11));
                break;
            case 1:
                ck ckVar = (ck) this.b;
                ai.w0 w0Var = ckVar.s;
                if (w0Var != null) {
                    int childCount = w0Var.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = w0Var.getChildAt(i13);
                        if (childAt instanceof bk) {
                            ((bk) childAt).b();
                        }
                    }
                }
                ui uiVar = ckVar.I;
                if (uiVar != null) {
                    uiVar.e();
                    break;
                }
                break;
            case 2:
                xl xlVar = (xl) this.b;
                xlVar.r.setIconColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.ui, xlVar.a));
                xlVar.r.B(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G8, xlVar.a));
                xlVar.r.G(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.F8, xlVar.a), true);
                xlVar.r.G(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.E8, xlVar.a), false);
                if (xlVar.H != null) {
                    if (!org.telegram.ui.ActionBar.i6.I.q() && AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, xlVar.a)) >= 0.721f) {
                        if (xlVar.U) {
                            xlVar.U = false;
                            xlVar.H.setMapStyle(null);
                            break;
                        }
                    } else if (!xlVar.U) {
                        xlVar.U = true;
                        xlVar.H.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
                        break;
                    }
                }
                break;
            case 3:
                cr crVar = (cr) this.b;
                org.telegram.ui.ActionBar.v0 v0Var3 = crVar.I;
                v0Var3.setIconColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, crVar.d0));
                org.telegram.ui.ActionBar.i6.x1(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.I5, crVar.d0), v0Var3.getBackground());
                v0Var3.G(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.E8, crVar.d0), false);
                v0Var3.G(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.F8, crVar.d0), true);
                v0Var3.B(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G8, crVar.d0));
                break;
            case 4:
                ((db0) this.b).Z();
                break;
            case 5:
                ((bf0) this.b).s();
                break;
            case 6:
                ((sh0) this.b).T();
                break;
            case 7:
                NumberTextView numberTextView = ((dp0) this.b).x0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.y8, false));
                    break;
                }
                break;
            case 8:
                ((Runnable) this.b).run();
                break;
            case 9:
                ((xy0) this.b).A0(false);
                break;
            default:
                ((l61) this.b).d();
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
