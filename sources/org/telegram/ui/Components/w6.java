package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w6 implements org.telegram.ui.ActionBar.k6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w6(Object obj, int i10) {
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
                h8 h8Var = (h8) this.b;
                h8Var.l0.getSearchField().setCursorColor(h8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Oi));
                org.telegram.ui.ActionBar.w0 w0Var = h8Var.b0;
                w0Var.setIconColor(h8Var.getThemedColor(((Integer) w0Var.getTag()).intValue()));
                Drawable background = w0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.j6.i6;
                org.telegram.ui.ActionBar.j6.B1(background, h8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.w0 w0Var2 = h8Var.N;
                w0Var2.setIconColor(h8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Wi));
                org.telegram.ui.ActionBar.j6.B1(w0Var2.getBackground(), h8Var.getThemedColor(i10), true);
                m80 m80Var = h8Var.S;
                m80Var.setBackgroundColor(h8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ti));
                m80Var.setProgressColor(h8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Vi));
                h8Var.I0();
                int i11 = org.telegram.ui.ActionBar.j6.G8;
                w0Var.B(h8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.j6.E8;
                w0Var2.G(h8Var.getThemedColor(i12), false);
                w0Var2.G(h8Var.getThemedColor(i12), true);
                w0Var2.B(h8Var.getThemedColor(i11));
                break;
            case 1:
                yj yjVar = (yj) this.b;
                ai.w0 w0Var3 = yjVar.s;
                if (w0Var3 != null) {
                    int childCount = w0Var3.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = w0Var3.getChildAt(i13);
                        if (childAt instanceof xj) {
                            ((xj) childAt).b();
                        }
                    }
                }
                ri riVar = yjVar.I;
                if (riVar != null) {
                    riVar.e();
                    break;
                }
                break;
            case 2:
                gl glVar = (gl) this.b;
                glVar.r.setIconColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ui, glVar.a));
                glVar.r.B(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, glVar.a));
                glVar.r.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, glVar.a), true);
                glVar.r.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, glVar.a), false);
                if (glVar.H != null) {
                    if (!org.telegram.ui.ActionBar.j6.I.q() && AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, glVar.a)) >= 0.721f) {
                        if (glVar.U) {
                            glVar.U = false;
                            glVar.H.setMapStyle(null);
                            break;
                        }
                    } else if (!glVar.U) {
                        glVar.U = true;
                        glVar.H.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
                        break;
                    }
                }
                break;
            case 3:
                mq mqVar = (mq) this.b;
                org.telegram.ui.ActionBar.w0 w0Var4 = mqVar.I;
                w0Var4.setIconColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, mqVar.d0));
                org.telegram.ui.ActionBar.j6.w1(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, mqVar.d0), w0Var4.getBackground());
                w0Var4.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, mqVar.d0), false);
                w0Var4.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, mqVar.d0), true);
                w0Var4.B(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, mqVar.d0));
                break;
            case 4:
                ((ba0) this.b).Z();
                break;
            case 5:
                ((ae0) this.b).q();
                break;
            case 6:
                ((qg0) this.b).S();
                break;
            case 7:
                NumberTextView numberTextView = ((zn0) this.b).y0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.y8, false));
                    break;
                }
                break;
            case 8:
                ((Runnable) this.b).run();
                break;
            case 9:
                ((wx0) this.b).z0(false);
                break;
            default:
                ((f51) this.b).d();
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
