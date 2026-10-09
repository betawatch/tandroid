package mg;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import m.f3;
import m1.j;
import m2.t;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Components.m91;
import org.telegram.ui.Components.n91;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.t6;
import org.telegram.ui.LaunchActivity;
import s4.d1;
import s4.q0;
import w7.x5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class g extends pm0 {
    public final /* synthetic */ int c = 0;
    public final Context d;
    public final /* synthetic */ FrameLayout e;

    public g(i iVar, LaunchActivity launchActivity) {
        this.e = iVar;
        this.d = launchActivity;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(d1 d1Var) {
        switch (this.c) {
            case 0:
                if (j.d(3)[d1Var.f] == 1) {
                }
                break;
        }
        return true;
    }

    @Override // s4.i0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((i) this.e).E.size();
            default:
                return ((n91) this.e).h.size();
        }
    }

    @Override // s4.i0
    public long i(int i10) {
        switch (this.c) {
            case 1:
                return ((k91) ((n91) this.e).h.get(i10)).a;
            default:
                return super.i(i10);
        }
    }

    @Override // s4.i0
    public final int j(int i10) {
        switch (this.c) {
            case 0:
                return j.c(((a) ((i) this.e).E.get(i10)).b);
            default:
                return 0;
        }
    }

    @Override // s4.i0
    public final void v(d1 d1Var, int i10) {
        m91 m91Var;
        switch (this.c) {
            case 0:
                View view = d1Var.a;
                a aVar = (a) ((i) this.e).E.get(i10);
                int i11 = aVar.b;
                t6 t6Var = aVar.f;
                CharSequence charSequence = aVar.a;
                int c10 = j.c(i11);
                if (c10 == 0) {
                    x1 x1Var = (x1) view;
                    x1Var.setTextColor(i6.x0(null, i6.j5, false));
                    x1Var.a(0, charSequence);
                    break;
                } else if (c10 == 1) {
                    m4 m4Var = (m4) view;
                    m4Var.setTextColor(i6.x0(null, i6.L6, false));
                    m4Var.setText(charSequence);
                    break;
                } else if (c10 == 2) {
                    h hVar = (h) view;
                    hVar.f = charSequence.toString();
                    hVar.d = ((Float) t6Var.get(null)).floatValue();
                    hVar.b = aVar.d;
                    hVar.c = aVar.e;
                    hVar.e = t6Var;
                    hVar.invalidate();
                    break;
                }
                break;
            default:
                l91 l91Var = (l91) d1Var.a;
                n91 n91Var = (n91) this.e;
                k91 k91Var = (k91) n91Var.h.get(i10);
                l91Var.a = k91Var;
                l91Var.setContentDescription(k91Var.b);
                l91Var.setAlpha(1.0f);
                l91Var.requestLayout();
                l91Var.setReordering(n91Var.m0 && (m91Var = n91Var.y) != null && ((t) m91Var).A(i10));
                break;
        }
    }

    @Override // s4.i0
    public final d1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        switch (this.c) {
            case 0:
                int c10 = j.c(j.d(3)[i10]);
                Context context = this.d;
                if (c10 == 1) {
                    frameLayout = new m4(context);
                } else if (c10 != 2) {
                    frameLayout = new x1(context, null);
                } else {
                    h hVar = new h(context);
                    hVar.setWillNotDraw(false);
                    TextPaint textPaint = new TextPaint(1);
                    hVar.h = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                    kp0 kp0Var = new kp0(context);
                    hVar.a = kp0Var;
                    kp0Var.setReportChanges(true);
                    kp0Var.setDelegate(new f3(hVar, 1));
                    kp0Var.setImportantForAccessibility(2);
                    hVar.addView(kp0Var, x5.a(38.0f, 5.0f, 29.0f, 47.0f, 0.0f, -1, 83));
                    frameLayout = hVar;
                }
                frameLayout.setLayoutParams(new q0(-1, -2));
                return new am0(frameLayout);
            default:
                return new am0(new l91((n91) this.e, this.d));
        }
    }

    public g(n91 n91Var, Context context) {
        this.e = n91Var;
        this.d = context;
    }
}
