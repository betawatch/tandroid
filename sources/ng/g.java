package ng;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import m1.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.w1;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.i91;
import org.telegram.ui.Components.j91;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.u6;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.LaunchActivity;
import s4.b1;
import s4.o0;
import w7.a6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class g extends lm0 {
    public final /* synthetic */ int c = 0;
    public final Context d;
    public final /* synthetic */ FrameLayout e;

    public g(i iVar, LaunchActivity launchActivity) {
        this.e = iVar;
        this.d = launchActivity;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(b1 b1Var) {
        switch (this.c) {
            case 0:
                if (j.d(3)[b1Var.f] == 1) {
                }
                break;
        }
        return true;
    }

    @Override // s4.g0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((i) this.e).E.size();
            default:
                return ((j91) this.e).h.size();
        }
    }

    @Override // s4.g0
    public long i(int i10) {
        switch (this.c) {
            case 1:
                return ((g91) ((j91) this.e).h.get(i10)).a;
            default:
                return super.i(i10);
        }
    }

    @Override // s4.g0
    public final int j(int i10) {
        switch (this.c) {
            case 0:
                return j.c(((a) ((i) this.e).E.get(i10)).b);
            default:
                return 0;
        }
    }

    @Override // s4.g0
    public final void v(b1 b1Var, int i10) {
        i91 i91Var;
        switch (this.c) {
            case 0:
                View view = b1Var.a;
                a aVar = (a) ((i) this.e).E.get(i10);
                int i11 = aVar.b;
                u6 u6Var = aVar.f;
                CharSequence charSequence = aVar.a;
                int c10 = j.c(i11);
                if (c10 == 0) {
                    w1 w1Var = (w1) view;
                    w1Var.setTextColor(g6.x0(null, g6.j5, false));
                    w1Var.a(0, charSequence);
                    break;
                } else if (c10 == 1) {
                    m4 m4Var = (m4) view;
                    m4Var.setTextColor(g6.x0(null, g6.L6, false));
                    m4Var.setText(charSequence);
                    break;
                } else if (c10 == 2) {
                    h hVar = (h) view;
                    hVar.f = charSequence.toString();
                    hVar.d = ((Float) u6Var.get(null)).floatValue();
                    hVar.b = aVar.d;
                    hVar.c = aVar.e;
                    hVar.e = u6Var;
                    hVar.invalidate();
                    break;
                }
                break;
            default:
                h91 h91Var = (h91) b1Var.a;
                j91 j91Var = (j91) this.e;
                g91 g91Var = (g91) j91Var.h.get(i10);
                h91Var.a = g91Var;
                h91Var.setContentDescription(g91Var.b);
                h91Var.setAlpha(1.0f);
                h91Var.requestLayout();
                h91Var.setReordering(j91Var.m0 && (i91Var = j91Var.y) != null && ((l2.f) i91Var).e(i10));
                break;
        }
    }

    @Override // s4.g0
    public final b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        switch (this.c) {
            case 0:
                int c10 = j.c(j.d(3)[i10]);
                Context context = this.d;
                if (c10 == 1) {
                    frameLayout = new m4(context);
                } else if (c10 != 2) {
                    frameLayout = new w1(context, null);
                } else {
                    h hVar = new h(context);
                    hVar.setWillNotDraw(false);
                    TextPaint textPaint = new TextPaint(1);
                    hVar.h = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                    gp0 gp0Var = new gp0(context);
                    hVar.a = gp0Var;
                    gp0Var.setReportChanges(true);
                    gp0Var.setDelegate(new l2.f(hVar, 4));
                    gp0Var.setImportantForAccessibility(2);
                    hVar.addView(gp0Var, a6.a(38.0f, 5.0f, 29.0f, 47.0f, 0.0f, -1, 83));
                    frameLayout = hVar;
                }
                frameLayout.setLayoutParams(new o0(-1, -2));
                return new wl0(frameLayout);
            default:
                return new wl0(new h91((j91) this.e, this.d));
        }
    }

    public g(j91 j91Var, Context context) {
        this.e = j91Var;
        this.d = context;
    }
}
