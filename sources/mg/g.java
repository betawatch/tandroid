package mg;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import m1.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.w1;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.u81;
import org.telegram.ui.Components.uo0;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.w81;
import org.telegram.ui.Components.x81;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.LaunchActivity;
import s4.c1;
import s4.p0;
import w7.y5;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class g extends xl0 {
    public final /* synthetic */ int c = 0;
    public final Context d;
    public final /* synthetic */ FrameLayout e;

    public g(i iVar, LaunchActivity launchActivity) {
        this.e = iVar;
        this.d = launchActivity;
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean D(c1 c1Var) {
        switch (this.c) {
            case 0:
                if (j.d(3)[c1Var.f] == 1) {
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
                return ((x81) this.e).h.size();
        }
    }

    @Override // s4.h0
    public long i(int i10) {
        switch (this.c) {
            case 1:
                return ((u81) ((x81) this.e).h.get(i10)).a;
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
    public final void v(c1 c1Var, int i10) {
        w81 w81Var;
        switch (this.c) {
            case 0:
                View view = c1Var.a;
                a aVar = (a) ((i) this.e).E.get(i10);
                int i11 = aVar.b;
                r6 r6Var = aVar.f;
                CharSequence charSequence = aVar.a;
                int c10 = j.c(i11);
                if (c10 == 0) {
                    w1 w1Var = (w1) view;
                    w1Var.setTextColor(h6.w0(null, h6.j5, false));
                    w1Var.a(0, charSequence);
                    break;
                } else if (c10 == 1) {
                    m4 m4Var = (m4) view;
                    m4Var.setTextColor(h6.w0(null, h6.L6, false));
                    m4Var.setText(charSequence);
                    break;
                } else if (c10 == 2) {
                    h hVar = (h) view;
                    hVar.f = charSequence.toString();
                    hVar.d = ((Float) r6Var.get(null)).floatValue();
                    hVar.b = aVar.d;
                    hVar.c = aVar.e;
                    hVar.e = r6Var;
                    hVar.invalidate();
                    break;
                }
                break;
            default:
                v81 v81Var = (v81) c1Var.a;
                x81 x81Var = (x81) this.e;
                u81 u81Var = (u81) x81Var.h.get(i10);
                v81Var.a = u81Var;
                v81Var.setContentDescription(u81Var.b);
                v81Var.setAlpha(1.0f);
                v81Var.requestLayout();
                v81Var.setReordering(x81Var.m0 && (w81Var = x81Var.y) != null && ((l.d) w81Var).G(i10));
                break;
        }
    }

    @Override // s4.h0
    public final c1 x(ViewGroup viewGroup, int i10) {
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
                    uo0 uo0Var = new uo0(context);
                    hVar.a = uo0Var;
                    uo0Var.setReportChanges(true);
                    uo0Var.setDelegate(new ka.c(hVar, 3));
                    uo0Var.setImportantForAccessibility(2);
                    hVar.addView(uo0Var, y5.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                    frameLayout = hVar;
                }
                frameLayout.setLayoutParams(new p0(-1, -2));
                return new il0(frameLayout);
            default:
                return new il0(new v81((x81) this.e, this.d));
        }
    }

    public g(x81 x81Var, Context context) {
        this.e = x81Var;
        this.d = context;
    }
}
