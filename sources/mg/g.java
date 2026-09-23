package mg;

import a4.m;
import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import m1.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.f81;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.LaunchActivity;
import s4.c1;
import s4.p0;
import w7.x5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                return ((g81) this.e).h.size();
        }
    }

    @Override // s4.h0
    public long i(int i10) {
        switch (this.c) {
            case 1:
                return ((d81) ((g81) this.e).h.get(i10)).a;
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
        f81 f81Var;
        switch (this.c) {
            case 0:
                View view = c1Var.a;
                a aVar = (a) ((i) this.e).E.get(i10);
                int i11 = aVar.b;
                r6 r6Var = aVar.f;
                CharSequence charSequence = aVar.a;
                int c10 = j.c(i11);
                if (c10 == 0) {
                    x1 x1Var = (x1) view;
                    x1Var.setTextColor(h6.w0(null, h6.j5, false));
                    x1Var.a(0, charSequence);
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
                e81 e81Var = (e81) c1Var.a;
                g81 g81Var = (g81) this.e;
                d81 d81Var = (d81) g81Var.h.get(i10);
                e81Var.a = d81Var;
                e81Var.setContentDescription(d81Var.b);
                e81Var.setAlpha(1.0f);
                e81Var.requestLayout();
                e81Var.setReordering(g81Var.m0 && (f81Var = g81Var.y) != null && ((ka.c) f81Var).d(i10));
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
                    frameLayout = new x1(context, null);
                } else {
                    h hVar = new h(context);
                    hVar.setWillNotDraw(false);
                    TextPaint textPaint = new TextPaint(1);
                    hVar.h = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                    fo0 fo0Var = new fo0(context);
                    hVar.a = fo0Var;
                    fo0Var.setReportChanges(true);
                    fo0Var.setDelegate(new m(hVar, 26));
                    fo0Var.setImportantForAccessibility(2);
                    hVar.addView(fo0Var, x5.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                    frameLayout = hVar;
                }
                frameLayout.setLayoutParams(new p0(-1, -2));
                return new wk0(frameLayout);
            default:
                return new wk0(new e81((g81) this.e, this.d));
        }
    }

    public g(g81 g81Var, Context context) {
        this.e = g81Var;
        this.d = context;
    }
}
