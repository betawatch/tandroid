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
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.mp0;
import org.telegram.ui.Components.r91;
import org.telegram.ui.Components.s91;
import org.telegram.ui.Components.t91;
import org.telegram.ui.Components.u6;
import org.telegram.ui.Components.u91;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.LaunchActivity;
import s4.e1;
import s4.q0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class g extends mm0 {
    public final /* synthetic */ int c = 0;
    public final Context d;
    public final /* synthetic */ FrameLayout e;

    public g(i iVar, LaunchActivity launchActivity) {
        this.e = iVar;
        this.d = launchActivity;
    }

    @Override // org.telegram.ui.Components.mm0
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
                return ((u91) this.e).h.size();
        }
    }

    @Override // s4.h0
    public long i(int i10) {
        switch (this.c) {
            case 1:
                return ((r91) ((u91) this.e).h.get(i10)).a;
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
        t91 t91Var;
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
                s91 s91Var = (s91) e1Var.a;
                u91 u91Var = (u91) this.e;
                r91 r91Var = (r91) u91Var.h.get(i10);
                s91Var.a = r91Var;
                s91Var.setContentDescription(r91Var.b);
                s91Var.setAlpha(1.0f);
                s91Var.requestLayout();
                s91Var.setReordering(u91Var.m0 && (t91Var = u91Var.y) != null && ((jg.i) t91Var).b0(i10));
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
                    mp0 mp0Var = new mp0(context);
                    hVar.a = mp0Var;
                    mp0Var.setReportChanges(true);
                    mp0Var.setDelegate(new h5(hVar));
                    mp0Var.setImportantForAccessibility(2);
                    hVar.addView(mp0Var, kb1.h(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                    frameLayout = hVar;
                }
                frameLayout.setLayoutParams(new q0(-1, -2));
                return new wl0(frameLayout);
            default:
                return new wl0(new s91((u91) this.e, this.d));
        }
    }

    public g(u91 u91Var, Context context) {
        this.e = u91Var;
        this.d = context;
    }
}
