package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class y6 implements org.telegram.ui.ActionBar.j6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y6(Object obj, int i10) {
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
                j8 j8Var = (j8) this.b;
                j8Var.l0.getSearchField().setCursorColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Oi));
                org.telegram.ui.ActionBar.v0 v0Var = j8Var.b0;
                v0Var.setIconColor(j8Var.getThemedColor(((Integer) v0Var.getTag()).intValue()));
                Drawable background = v0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.i6.i6;
                org.telegram.ui.ActionBar.i6.B1(background, j8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.v0 v0Var2 = j8Var.N;
                v0Var2.setIconColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Wi));
                org.telegram.ui.ActionBar.i6.B1(v0Var2.getBackground(), j8Var.getThemedColor(i10), true);
                a90 a90Var = j8Var.S;
                a90Var.setBackgroundColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Ti));
                a90Var.setProgressColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Vi));
                j8Var.I0();
                int i11 = org.telegram.ui.ActionBar.i6.G8;
                v0Var.B(j8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.i6.E8;
                v0Var2.G(j8Var.getThemedColor(i12), false);
                v0Var2.G(j8Var.getThemedColor(i12), true);
                v0Var2.B(j8Var.getThemedColor(i11));
                break;
            case 1:
                bk bkVar = (bk) this.b;
                ai.w0 w0Var = bkVar.s;
                if (w0Var != null) {
                    int childCount = w0Var.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = w0Var.getChildAt(i13);
                        if (childAt instanceof ak) {
                            ((ak) childAt).b();
                        }
                    }
                }
                ti tiVar = bkVar.I;
                if (tiVar != null) {
                    tiVar.e();
                    break;
                }
                break;
            case 2:
                jl jlVar = (jl) this.b;
                jlVar.r.setIconColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.ui, jlVar.a));
                jlVar.r.B(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, jlVar.a));
                jlVar.r.G(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.F8, jlVar.a), true);
                jlVar.r.G(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, jlVar.a), false);
                if (jlVar.H != null) {
                    if (!org.telegram.ui.ActionBar.i6.I.q() && AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d6, jlVar.a)) >= 0.721f) {
                        if (jlVar.U) {
                            jlVar.U = false;
                            jlVar.H.setMapStyle(null);
                            break;
                        }
                    } else if (!jlVar.U) {
                        jlVar.U = true;
                        jlVar.H.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
                        break;
                    }
                }
                break;
            case 3:
                pq pqVar = (pq) this.b;
                org.telegram.ui.ActionBar.v0 v0Var3 = pqVar.I;
                v0Var3.setIconColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, pqVar.d0));
                org.telegram.ui.ActionBar.i6.w1(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.I5, pqVar.d0), v0Var3.getBackground());
                v0Var3.G(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, pqVar.d0), false);
                v0Var3.G(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.F8, pqVar.d0), true);
                v0Var3.B(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, pqVar.d0));
                break;
            case 4:
                ((pa0) this.b).Y();
                break;
            case 5:
                ((me0) this.b).q();
                break;
            case 6:
                ((ch0) this.b).Q();
                break;
            case 7:
                NumberTextView numberTextView = ((qo0) this.b).z0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.y8, false));
                    break;
                }
                break;
            case 8:
                ((Runnable) this.b).run();
                break;
            case 9:
                ((ry0) this.b).z0(false);
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
