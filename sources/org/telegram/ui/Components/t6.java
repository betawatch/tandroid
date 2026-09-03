package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t6 implements org.telegram.ui.ActionBar.k6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void a(float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void b() {
        switch (this.a) {
            case 0:
                c8 c8Var = (c8) this.b;
                c8Var.i0.getSearchField().setCursorColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Oi));
                org.telegram.ui.ActionBar.w0 w0Var = c8Var.Y;
                w0Var.setIconColor(c8Var.getThemedColor(((Integer) w0Var.getTag()).intValue()));
                Drawable background = w0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.j6.i6;
                org.telegram.ui.ActionBar.j6.B1(background, c8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.w0 w0Var2 = c8Var.K;
                w0Var2.setIconColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Wi));
                org.telegram.ui.ActionBar.j6.B1(w0Var2.getBackground(), c8Var.getThemedColor(i10), true);
                o80 o80Var = c8Var.P;
                o80Var.setBackgroundColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ti));
                o80Var.setProgressColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Vi));
                c8Var.I0();
                int i11 = org.telegram.ui.ActionBar.j6.G8;
                w0Var.B(c8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.j6.E8;
                w0Var2.G(c8Var.getThemedColor(i12), false);
                w0Var2.G(c8Var.getThemedColor(i12), true);
                w0Var2.B(c8Var.getThemedColor(i11));
                break;
            case 1:
                qj qjVar = (qj) this.b;
                lh.e1 e1Var = qjVar.s;
                if (e1Var != null) {
                    int childCount = e1Var.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = e1Var.getChildAt(i13);
                        if (childAt instanceof pj) {
                            ((pj) childAt).b();
                        }
                    }
                }
                hi hiVar = qjVar.F;
                if (hiVar != null) {
                    hiVar.e();
                    break;
                }
                break;
            case 2:
                al alVar = (al) this.b;
                alVar.r.setIconColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ui, alVar.a));
                alVar.r.B(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, alVar.a));
                alVar.r.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, alVar.a), true);
                alVar.r.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, alVar.a), false);
                if (alVar.E != null) {
                    if (!org.telegram.ui.ActionBar.j6.I.q() && AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, alVar.a)) >= 0.721f) {
                        if (alVar.R) {
                            alVar.R = false;
                            alVar.E.setMapStyle(null);
                            break;
                        }
                    } else if (!alVar.R) {
                        alVar.R = true;
                        alVar.E.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
                        break;
                    }
                }
                break;
            case 3:
                jq jqVar = (jq) this.b;
                org.telegram.ui.ActionBar.w0 w0Var3 = jqVar.F;
                w0Var3.setIconColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, jqVar.a0));
                org.telegram.ui.ActionBar.j6.w1(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, jqVar.a0), w0Var3.getBackground());
                w0Var3.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, jqVar.a0), false);
                w0Var3.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, jqVar.a0), true);
                w0Var3.B(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, jqVar.a0));
                break;
            case 4:
                ((ea0) this.b).Z();
                break;
            case 5:
                ((ee0) this.b).q();
                break;
            case 6:
                ((wg0) this.b).S();
                break;
            case 7:
                NumberTextView numberTextView = ((co0) this.b).u0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y8, false));
                    break;
                }
                break;
            case 8:
                ((Runnable) this.b).run();
                break;
            case 9:
                ((xx0) this.b).z0(false);
                break;
            default:
                ((e51) this.b).d();
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
