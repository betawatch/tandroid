package mg;

import a4.m;
import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import m1.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.y1;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.LaunchActivity;
import s4.c1;
import s4.p0;
import w7.x5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class g extends ll0 {
    public final /* synthetic */ int c = 0;
    public final Context d;
    public final /* synthetic */ FrameLayout e;

    public g(i iVar, LaunchActivity launchActivity) {
        this.e = iVar;
        this.d = launchActivity;
    }

    @Override // org.telegram.ui.Components.ll0
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
                return ((i81) this.e).h.size();
        }
    }

    @Override // s4.h0
    public long i(int i10) {
        switch (this.c) {
            case 1:
                return ((f81) ((i81) this.e).h.get(i10)).a;
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
        h81 h81Var;
        switch (this.c) {
            case 0:
                View view = c1Var.a;
                a aVar = (a) ((i) this.e).E.get(i10);
                int i11 = aVar.b;
                p6 p6Var = aVar.f;
                CharSequence charSequence = aVar.a;
                int c10 = j.c(i11);
                if (c10 == 0) {
                    y1 y1Var = (y1) view;
                    y1Var.setTextColor(j6.w0(null, j6.j5, false));
                    y1Var.a(0, charSequence);
                    break;
                } else if (c10 == 1) {
                    l4 l4Var = (l4) view;
                    l4Var.setTextColor(j6.w0(null, j6.L6, false));
                    l4Var.setText(charSequence);
                    break;
                } else if (c10 == 2) {
                    h hVar = (h) view;
                    hVar.f = charSequence.toString();
                    hVar.d = ((Float) p6Var.get(null)).floatValue();
                    hVar.b = aVar.d;
                    hVar.c = aVar.e;
                    hVar.e = p6Var;
                    hVar.invalidate();
                    break;
                }
                break;
            default:
                g81 g81Var = (g81) c1Var.a;
                i81 i81Var = (i81) this.e;
                f81 f81Var = (f81) i81Var.h.get(i10);
                g81Var.a = f81Var;
                g81Var.setContentDescription(f81Var.b);
                g81Var.setAlpha(1.0f);
                g81Var.requestLayout();
                g81Var.setReordering(i81Var.m0 && (h81Var = i81Var.y) != null && ((ka.c) h81Var).d(i10));
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
                    frameLayout = new l4(context);
                } else if (c10 != 2) {
                    frameLayout = new y1(context, null);
                } else {
                    h hVar = new h(context);
                    hVar.setWillNotDraw(false);
                    TextPaint textPaint = new TextPaint(1);
                    hVar.h = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                    go0 go0Var = new go0(context);
                    hVar.a = go0Var;
                    go0Var.setReportChanges(true);
                    go0Var.setDelegate(new m(hVar, 26));
                    go0Var.setImportantForAccessibility(2);
                    hVar.addView(go0Var, x5.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                    frameLayout = hVar;
                }
                frameLayout.setLayoutParams(new p0(-1, -2));
                return new wk0(frameLayout);
            default:
                return new wk0(new g81((i81) this.e, this.d));
        }
    }

    public g(i81 i81Var, Context context) {
        this.e = i81Var;
        this.d = context;
    }
}
