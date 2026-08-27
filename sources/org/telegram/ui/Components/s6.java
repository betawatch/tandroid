package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s6 implements org.telegram.ui.ActionBar.h6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final /* synthetic */ void a(float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final void b() {
        switch (this.a) {
            case 0:
                b8 b8Var = (b8) this.b;
                b8Var.h0.getSearchField().setCursorColor(b8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Oi));
                org.telegram.ui.ActionBar.v0 v0Var = b8Var.X;
                v0Var.setIconColor(b8Var.getThemedColor(((Integer) v0Var.getTag()).intValue()));
                Drawable background = v0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.g6.i6;
                org.telegram.ui.ActionBar.g6.B1(background, b8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.v0 v0Var2 = b8Var.J;
                v0Var2.setIconColor(b8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Wi));
                org.telegram.ui.ActionBar.g6.B1(v0Var2.getBackground(), b8Var.getThemedColor(i10), true);
                z70 z70Var = b8Var.O;
                z70Var.setBackgroundColor(b8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ti));
                z70Var.setProgressColor(b8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Vi));
                b8Var.I0();
                int i11 = org.telegram.ui.ActionBar.g6.G8;
                v0Var.B(b8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.g6.E8;
                v0Var2.G(b8Var.getThemedColor(i12), false);
                v0Var2.G(b8Var.getThemedColor(i12), true);
                v0Var2.B(b8Var.getThemedColor(i11));
                break;
            case 1:
                lj ljVar = (lj) this.b;
                hh.f1 f1Var = ljVar.s;
                if (f1Var != null) {
                    int childCount = f1Var.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = f1Var.getChildAt(i13);
                        if (childAt instanceof kj) {
                            ((kj) childAt).b();
                        }
                    }
                }
                ci ciVar = ljVar.E;
                if (ciVar != null) {
                    ciVar.d();
                    break;
                }
                break;
            case 2:
                tk tkVar = (tk) this.b;
                tkVar.r.setIconColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ui, tkVar.a));
                tkVar.r.B(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, tkVar.a));
                tkVar.r.G(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, tkVar.a), true);
                tkVar.r.G(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, tkVar.a), false);
                if (tkVar.D != null) {
                    if (!org.telegram.ui.ActionBar.g6.I.q() && AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, tkVar.a)) >= 0.721f) {
                        if (tkVar.Q) {
                            tkVar.Q = false;
                            tkVar.D.setMapStyle(null);
                            break;
                        }
                    } else if (!tkVar.Q) {
                        tkVar.Q = true;
                        tkVar.D.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
                        break;
                    }
                }
                break;
            case 3:
                aq aqVar = (aq) this.b;
                org.telegram.ui.ActionBar.v0 v0Var3 = aqVar.E;
                v0Var3.setIconColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, aqVar.W));
                org.telegram.ui.ActionBar.g6.w1(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, aqVar.W), v0Var3.getBackground());
                v0Var3.G(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, aqVar.W), false);
                v0Var3.G(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, aqVar.W), true);
                v0Var3.B(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, aqVar.W));
                break;
            case 4:
                ((o90) this.b).Z();
                break;
            case 5:
                ((md0) this.b).r();
                break;
            case 6:
                ((cg0) this.b).S();
                break;
            case 7:
                NumberTextView numberTextView = ((jn0) this.b).t0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.y8, false));
                    break;
                }
                break;
            case 8:
                ((Runnable) this.b).run();
                break;
            case 9:
                ((ex0) this.b).z0(false);
                break;
            default:
                ((j41) this.b).d();
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
