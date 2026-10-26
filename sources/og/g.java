package og;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import li.h5;
import m1.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.y1;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.q4;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.q91;
import org.telegram.ui.Components.r91;
import org.telegram.ui.Components.s91;
import org.telegram.ui.Components.t91;
import org.telegram.ui.Components.u6;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.LaunchActivity;
import s4.e1;
import s4.q0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
    public final boolean D(e1 e1Var) {
        switch (this.c) {
            case 0:
                if (j.d(3)[e1Var.f] == 1) {
                }
                break;
        }
        return true;
    }

    @Override // s4.h0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((i) this.e).E.size();
            default:
                return ((t91) this.e).h.size();
        }
    }

    @Override // s4.h0
    public long i(int i10) {
        switch (this.c) {
            case 1:
                return ((q91) ((t91) this.e).h.get(i10)).a;
            default:
                return super.i(i10);
        }
    }

    @Override // s4.h0
    public final int j(int i10) {
        switch (this.c) {
            case 0:
                return j.c(((a) ((i) this.e).E.get(i10)).b);
            default:
                return 0;
        }
    }

    @Override // s4.h0
    public final void v(e1 e1Var, int i10) {
        s91 s91Var;
        switch (this.c) {
            case 0:
                View view = e1Var.a;
                a aVar = (a) ((i) this.e).E.get(i10);
                int i11 = aVar.b;
                u6 u6Var = aVar.f;
                CharSequence charSequence = aVar.a;
                int c10 = j.c(i11);
                if (c10 == 0) {
                    y1 y1Var = (y1) view;
                    y1Var.setTextColor(y6.x0(null, y6.j5, false));
                    y1Var.a(0, charSequence);
                    break;
                } else if (c10 == 1) {
                    q4 q4Var = (q4) view;
                    q4Var.setTextColor(y6.x0(null, y6.L6, false));
                    q4Var.setText(charSequence);
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
                r91 r91Var = (r91) e1Var.a;
                t91 t91Var = (t91) this.e;
                q91 q91Var = (q91) t91Var.h.get(i10);
                r91Var.a = q91Var;
                r91Var.setContentDescription(q91Var.b);
                r91Var.setAlpha(1.0f);
                r91Var.requestLayout();
                r91Var.setReordering(t91Var.m0 && (s91Var = t91Var.y) != null && ((jg.i) s91Var).b0(i10));
                break;
        }
    }

    @Override // s4.h0
    public final e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        switch (this.c) {
            case 0:
                int c10 = j.c(j.d(3)[i10]);
                Context context = this.d;
                if (c10 == 1) {
                    frameLayout = new q4(context);
                } else if (c10 != 2) {
                    frameLayout = new y1(context, null);
                } else {
                    h hVar = new h(context);
                    hVar.setWillNotDraw(false);
                    TextPaint textPaint = new TextPaint(1);
                    hVar.h = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                    lp0 lp0Var = new lp0(context);
                    hVar.a = lp0Var;
                    lp0Var.setReportChanges(true);
                    lp0Var.setDelegate(new h5(hVar));
                    lp0Var.setImportantForAccessibility(2);
                    hVar.addView(lp0Var, gb1.h(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                    frameLayout = hVar;
                }
                frameLayout.setLayoutParams(new q0(-1, -2));
                return new vl0(frameLayout);
            default:
                return new vl0(new r91((t91) this.e, this.d));
        }
    }

    public g(t91 t91Var, Context context) {
        this.e = t91Var;
        this.d = context;
    }
}
