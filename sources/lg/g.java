package lg;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import m1.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.r81;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.u81;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.LaunchActivity;
import s4.c1;
import s4.p0;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                return ((u81) this.e).h.size();
        }
    }

    @Override // s4.h0
    public long i(int i10) {
        switch (this.c) {
            case 1:
                return ((r81) ((u81) this.e).h.get(i10)).a;
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
        t81 t81Var;
        switch (this.c) {
            case 0:
                View view = c1Var.a;
                a aVar = (a) ((i) this.e).E.get(i10);
                int i11 = aVar.b;
                q6 q6Var = aVar.f;
                CharSequence charSequence = aVar.a;
                int c10 = j.c(i11);
                if (c10 == 0) {
                    z1 z1Var = (z1) view;
                    z1Var.setTextColor(j6.w0(null, j6.j5, false));
                    z1Var.a(0, charSequence);
                    break;
                } else if (c10 == 1) {
                    m4 m4Var = (m4) view;
                    m4Var.setTextColor(j6.w0(null, j6.L6, false));
                    m4Var.setText(charSequence);
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
                s81 s81Var = (s81) c1Var.a;
                u81 u81Var = (u81) this.e;
                r81 r81Var = (r81) u81Var.h.get(i10);
                s81Var.a = r81Var;
                s81Var.setContentDescription(r81Var.b);
                s81Var.setAlpha(1.0f);
                s81Var.requestLayout();
                s81Var.setReordering(u81Var.m0 && (t81Var = u81Var.y) != null && ((l2.h) t81Var).j(i10));
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
                    frameLayout = new z1(context, null);
                } else {
                    h hVar = new h(context);
                    hVar.setWillNotDraw(false);
                    TextPaint textPaint = new TextPaint(1);
                    hVar.h = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                    oo0 oo0Var = new oo0(context);
                    hVar.a = oo0Var;
                    oo0Var.setReportChanges(true);
                    oo0Var.setDelegate(new l2.h(hVar, 1));
                    oo0Var.setImportantForAccessibility(2);
                    hVar.addView(oo0Var, a6.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                    frameLayout = hVar;
                }
                frameLayout.setLayoutParams(new p0(-1, -2));
                return new fl0(frameLayout);
            default:
                return new fl0(new s81((u81) this.e, this.d));
        }
    }

    public g(u81 u81Var, Context context) {
        this.e = u81Var;
        this.d = context;
    }
}
