package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w6 implements org.telegram.ui.ActionBar.j6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w6(Object obj, int i10) {
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
                h8 h8Var = (h8) this.b;
                h8Var.l0.getSearchField().setCursorColor(h8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Oi));
                org.telegram.ui.ActionBar.v0 v0Var = h8Var.b0;
                v0Var.setIconColor(h8Var.getThemedColor(((Integer) v0Var.getTag()).intValue()));
                Drawable background = v0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.i6.i6;
                org.telegram.ui.ActionBar.i6.B1(background, h8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.v0 v0Var2 = h8Var.N;
                v0Var2.setIconColor(h8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Wi));
                org.telegram.ui.ActionBar.i6.B1(v0Var2.getBackground(), h8Var.getThemedColor(i10), true);
                m80 m80Var = h8Var.S;
                m80Var.setBackgroundColor(h8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Ti));
                m80Var.setProgressColor(h8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Vi));
                h8Var.I0();
                int i11 = org.telegram.ui.ActionBar.i6.G8;
                v0Var.B(h8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.i6.E8;
                v0Var2.G(h8Var.getThemedColor(i12), false);
                v0Var2.G(h8Var.getThemedColor(i12), true);
                v0Var2.B(h8Var.getThemedColor(i11));
                break;
            case 1:
                yj yjVar = (yj) this.b;
                ai.w0 w0Var = yjVar.s;
                if (w0Var != null) {
                    int childCount = w0Var.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = w0Var.getChildAt(i13);
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
                glVar.r.setIconColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.ui, glVar.a));
                glVar.r.B(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, glVar.a));
                glVar.r.G(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.F8, glVar.a), true);
                glVar.r.G(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, glVar.a), false);
                if (glVar.H != null) {
                    if (!org.telegram.ui.ActionBar.i6.I.q() && AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d6, glVar.a)) >= 0.721f) {
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
                org.telegram.ui.ActionBar.v0 v0Var3 = mqVar.I;
                v0Var3.setIconColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, mqVar.d0));
                org.telegram.ui.ActionBar.i6.w1(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.I5, mqVar.d0), v0Var3.getBackground());
                v0Var3.G(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, mqVar.d0), false);
                v0Var3.G(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.F8, mqVar.d0), true);
                v0Var3.B(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, mqVar.d0));
                break;
            case 4:
                ((ba0) this.b).Z();
                break;
            case 5:
                ((ae0) this.b).q();
                break;
            case 6:
                ((pg0) this.b).S();
                break;
            case 7:
                NumberTextView numberTextView = ((yn0) this.b).x0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.y8, false));
                    break;
                }
                break;
            case 8:
                ((Runnable) this.b).run();
                break;
            case 9:
                ((vx0) this.b).z0(false);
                break;
            default:
                ((e51) this.b).d();
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
