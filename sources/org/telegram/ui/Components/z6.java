package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z6 implements org.telegram.ui.ActionBar.i6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z6(Object obj, int i10) {
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
                k8 k8Var = (k8) this.b;
                k8Var.l0.getSearchField().setCursorColor(k8Var.getThemedColor(org.telegram.ui.ActionBar.h6.Oi));
                org.telegram.ui.ActionBar.u0 u0Var = k8Var.b0;
                u0Var.setIconColor(k8Var.getThemedColor(((Integer) u0Var.getTag()).intValue()));
                Drawable background = u0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.h6.i6;
                org.telegram.ui.ActionBar.h6.C1(background, k8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.u0 u0Var2 = k8Var.N;
                u0Var2.setIconColor(k8Var.getThemedColor(org.telegram.ui.ActionBar.h6.Wi));
                org.telegram.ui.ActionBar.h6.C1(u0Var2.getBackground(), k8Var.getThemedColor(i10), true);
                g90 g90Var = k8Var.S;
                g90Var.setBackgroundColor(k8Var.getThemedColor(org.telegram.ui.ActionBar.h6.Ti));
                g90Var.setProgressColor(k8Var.getThemedColor(org.telegram.ui.ActionBar.h6.Vi));
                k8Var.I0();
                int i11 = org.telegram.ui.ActionBar.h6.G8;
                u0Var.B(k8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.h6.E8;
                u0Var2.G(k8Var.getThemedColor(i12), false);
                u0Var2.G(k8Var.getThemedColor(i12), true);
                u0Var2.B(k8Var.getThemedColor(i11));
                break;
            case 1:
                xj xjVar = (xj) this.b;
                ai.u1 u1Var = xjVar.s;
                if (u1Var != null) {
                    int childCount = u1Var.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = u1Var.getChildAt(i13);
                        if (childAt instanceof wj) {
                            ((wj) childAt).b();
                        }
                    }
                }
                pi piVar = xjVar.I;
                if (piVar != null) {
                    piVar.d();
                    break;
                }
                break;
            case 2:
                rl rlVar = (rl) this.b;
                rlVar.r.setIconColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.ui, rlVar.a));
                rlVar.r.B(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, rlVar.a));
                rlVar.r.G(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.F8, rlVar.a), true);
                rlVar.r.G(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, rlVar.a), false);
                if (rlVar.H != null) {
                    if (!org.telegram.ui.ActionBar.h6.I.q() && AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.d6, rlVar.a)) >= 0.721f) {
                        if (rlVar.U) {
                            rlVar.U = false;
                            rlVar.H.setMapStyle(null);
                            break;
                        }
                    } else if (!rlVar.U) {
                        rlVar.U = true;
                        rlVar.H.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
                        break;
                    }
                }
                break;
            case 3:
                wq wqVar = (wq) this.b;
                org.telegram.ui.ActionBar.u0 u0Var3 = wqVar.I;
                u0Var3.setIconColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, wqVar.d0));
                org.telegram.ui.ActionBar.h6.x1(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.I5, wqVar.d0), u0Var3.getBackground());
                u0Var3.G(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, wqVar.d0), false);
                u0Var3.G(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.F8, wqVar.d0), true);
                u0Var3.B(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, wqVar.d0));
                break;
            case 4:
                ((wa0) this.b).Z();
                break;
            case 5:
                ((ue0) this.b).s();
                break;
            case 6:
                ((lh0) this.b).T();
                break;
            case 7:
                NumberTextView numberTextView = ((wo0) this.b).x0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.y8, false));
                    break;
                }
                break;
            case 8:
                ((Runnable) this.b).run();
                break;
            case 9:
                ((qy0) this.b).A0(false);
                break;
            default:
                ((d61) this.b).d();
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
