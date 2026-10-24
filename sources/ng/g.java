package ng;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import m1.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.w1;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.hp0;
import org.telegram.ui.Components.i91;
import org.telegram.ui.Components.j91;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.LaunchActivity;
import s4.b1;
import s4.o0;
import w7.z5;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                return ((k91) this.e).h.size();
        }
    }

    @Override // s4.g0
    public long i(int i10) {
        switch (this.c) {
            case 1:
                return ((h91) ((k91) this.e).h.get(i10)).a;
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
        j91 j91Var;
        switch (this.c) {
            case 0:
                View view = b1Var.a;
                a aVar = (a) ((i) this.e).E.get(i10);
                int i11 = aVar.b;
                s6 s6Var = aVar.f;
                CharSequence charSequence = aVar.a;
                int c10 = j.c(i11);
                if (c10 == 0) {
                    w1 w1Var = (w1) view;
                    w1Var.setTextColor(k6.x0(null, k6.j5, false));
                    w1Var.a(0, charSequence);
                    break;
                } else if (c10 == 1) {
                    l4 l4Var = (l4) view;
                    l4Var.setTextColor(k6.x0(null, k6.L6, false));
                    l4Var.setText(charSequence);
                    break;
                } else if (c10 == 2) {
                    h hVar = (h) view;
                    hVar.f = charSequence.toString();
                    hVar.d = ((Float) s6Var.get(null)).floatValue();
                    hVar.b = aVar.d;
                    hVar.c = aVar.e;
                    hVar.e = s6Var;
                    hVar.invalidate();
                    break;
                }
                break;
            default:
                i91 i91Var = (i91) b1Var.a;
                k91 k91Var = (k91) this.e;
                h91 h91Var = (h91) k91Var.h.get(i10);
                i91Var.a = h91Var;
                i91Var.setContentDescription(h91Var.b);
                i91Var.setAlpha(1.0f);
                i91Var.requestLayout();
                i91Var.setReordering(k91Var.m0 && (j91Var = k91Var.y) != null && ((l2.f) j91Var).l(i10));
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
                    frameLayout = new l4(context);
                } else if (c10 != 2) {
                    frameLayout = new w1(context, null);
                } else {
                    h hVar = new h(context);
                    hVar.setWillNotDraw(false);
                    TextPaint textPaint = new TextPaint(1);
                    hVar.h = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                    hp0 hp0Var = new hp0(context);
                    hVar.a = hp0Var;
                    hp0Var.setReportChanges(true);
                    hp0Var.setDelegate(new l2.f(hVar, 5));
                    hp0Var.setImportantForAccessibility(2);
                    hVar.addView(hp0Var, z5.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                    frameLayout = hVar;
                }
                frameLayout.setLayoutParams(new o0(-1, -2));
                return new wl0(frameLayout);
            default:
                return new wl0(new i91((k91) this.e, this.d));
        }
    }

    public g(k91 k91Var, Context context) {
        this.e = k91Var;
        this.d = context;
    }
}
