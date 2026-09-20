package mg;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import m1.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.u81;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.w81;
import org.telegram.ui.LaunchActivity;
import s4.c1;
import s4.p0;
import w7.y5;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class g extends ul0 {
    public final /* synthetic */ int c = 0;
    public final Context d;
    public final /* synthetic */ FrameLayout e;

    public g(i iVar, LaunchActivity launchActivity) {
        this.e = iVar;
        this.d = launchActivity;
    }

    @Override // org.telegram.ui.Components.ul0
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
                return ((w81) this.e).h.size();
        }
    }

    @Override // s4.h0
    public long i(int i10) {
        switch (this.c) {
            case 1:
                return ((t81) ((w81) this.e).h.get(i10)).a;
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
        v81 v81Var;
        switch (this.c) {
            case 0:
                View view = c1Var.a;
                a aVar = (a) ((i) this.e).E.get(i10);
                int i11 = aVar.b;
                q6 q6Var = aVar.f;
                CharSequence charSequence = aVar.a;
                int c10 = j.c(i11);
                if (c10 == 0) {
                    x1 x1Var = (x1) view;
                    x1Var.setTextColor(j6.w0(null, j6.j5, false));
                    x1Var.a(0, charSequence);
                    break;
                } else if (c10 == 1) {
                    n4 n4Var = (n4) view;
                    n4Var.setTextColor(j6.w0(null, j6.L6, false));
                    n4Var.setText(charSequence);
                    break;
                } else if (c10 == 2) {
                    h hVar = (h) view;
                    hVar.f = charSequence.toString();
                    hVar.d = ((Float) q6Var.get(null)).floatValue();
                    hVar.b = aVar.d;
                    hVar.c = aVar.e;
                    hVar.e = q6Var;
                    hVar.invalidate();
                    break;
                }
                break;
            default:
                u81 u81Var = (u81) c1Var.a;
                w81 w81Var = (w81) this.e;
                t81 t81Var = (t81) w81Var.h.get(i10);
                u81Var.a = t81Var;
                u81Var.setContentDescription(t81Var.b);
                u81Var.setAlpha(1.0f);
                u81Var.requestLayout();
                u81Var.setReordering(w81Var.m0 && (v81Var = w81Var.y) != null && ((l.d) v81Var).H(i10));
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
                    frameLayout = new n4(context);
                } else if (c10 != 2) {
                    frameLayout = new x1(context, null);
                } else {
                    h hVar = new h(context);
                    hVar.setWillNotDraw(false);
                    TextPaint textPaint = new TextPaint(1);
                    hVar.h = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                    so0 so0Var = new so0(context);
                    hVar.a = so0Var;
                    so0Var.setReportChanges(true);
                    so0Var.setDelegate(new ka.c(hVar, 3));
                    so0Var.setImportantForAccessibility(2);
                    hVar.addView(so0Var, y5.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                    frameLayout = hVar;
                }
                frameLayout.setLayoutParams(new p0(-1, -2));
                return new fl0(frameLayout);
            default:
                return new fl0(new u81((w81) this.e, this.d));
        }
    }

    public g(w81 w81Var, Context context) {
        this.e = w81Var;
        this.d = context;
    }
}
