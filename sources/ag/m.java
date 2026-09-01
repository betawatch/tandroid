package ag;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import f2.m1;
import f2.x0;
import k7.c6;
import oh.h4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.k81;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.lo0;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class m extends sl0 {
    public final /* synthetic */ int c = 0;
    public final Context d;
    public final /* synthetic */ FrameLayout e;

    public m(o oVar, LaunchActivity launchActivity) {
        this.e = oVar;
        this.d = launchActivity;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(m1 m1Var) {
        switch (this.c) {
            case 0:
                if (m1.j.d(3)[m1Var.f] == 1) {
                }
                break;
        }
        return true;
    }

    @Override // f2.p0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((o) this.e).B.size();
            default:
                return ((l81) this.e).h.size();
        }
    }

    @Override // f2.p0
    public long i(int i10) {
        switch (this.c) {
            case 1:
                return ((i81) ((l81) this.e).h.get(i10)).a;
            default:
                return super.i(i10);
        }
    }

    @Override // f2.p0
    public final int j(int i10) {
        switch (this.c) {
            case 0:
                return m1.j.c(((a) ((o) this.e).B.get(i10)).b);
            default:
                return 0;
        }
    }

    @Override // f2.p0
    public final void v(m1 m1Var, int i10) {
        k81 k81Var;
        switch (this.c) {
            case 0:
                View view = m1Var.a;
                a aVar = (a) ((o) this.e).B.get(i10);
                int i11 = aVar.b;
                m6 m6Var = aVar.f;
                CharSequence charSequence = aVar.a;
                int c3 = m1.j.c(i11);
                if (c3 == 0) {
                    z1 z1Var = (z1) view;
                    z1Var.setTextColor(k6.w0(null, k6.j5, false));
                    z1Var.a(0, charSequence);
                    break;
                } else if (c3 == 1) {
                    m4 m4Var = (m4) view;
                    m4Var.setTextColor(k6.w0(null, k6.L6, false));
                    m4Var.setText(charSequence);
                    break;
                } else if (c3 == 2) {
                    n nVar = (n) view;
                    nVar.f = charSequence.toString();
                    nVar.d = ((Float) m6Var.get(null)).floatValue();
                    nVar.b = aVar.d;
                    nVar.c = aVar.e;
                    nVar.e = m6Var;
                    nVar.invalidate();
                    break;
                }
                break;
            default:
                j81 j81Var = (j81) m1Var.a;
                l81 l81Var = (l81) this.e;
                i81 i81Var = (i81) l81Var.h.get(i10);
                j81Var.a = i81Var;
                j81Var.setContentDescription(i81Var.b);
                j81Var.setAlpha(1.0f);
                j81Var.requestLayout();
                j81Var.setReordering(l81Var.j0 && (k81Var = l81Var.y) != null && ((h4) k81Var).Q(i10));
                break;
        }
    }

    @Override // f2.p0
    public final m1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        switch (this.c) {
            case 0:
                int c3 = m1.j.c(m1.j.d(3)[i10]);
                Context context = this.d;
                if (c3 == 1) {
                    frameLayout = new m4(context);
                } else if (c3 != 2) {
                    frameLayout = new z1(context, null);
                } else {
                    n nVar = new n(context);
                    nVar.setWillNotDraw(false);
                    TextPaint textPaint = new TextPaint(1);
                    nVar.h = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                    lo0 lo0Var = new lo0(context);
                    nVar.a = lo0Var;
                    lo0Var.setReportChanges(true);
                    lo0Var.setDelegate(new ja.c(nVar));
                    lo0Var.setImportantForAccessibility(2);
                    nVar.addView(lo0Var, c6.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                    frameLayout = nVar;
                }
                frameLayout.setLayoutParams(new x0(-1, -2));
                return new fl0(frameLayout);
            default:
                return new fl0(new j81((l81) this.e, this.d));
        }
    }

    public m(l81 l81Var, Context context) {
        this.e = l81Var;
        this.d = context;
    }
}
