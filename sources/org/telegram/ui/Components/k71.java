package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class k71 extends yk0 {
    public final /* synthetic */ int c = 0;
    public final Context d;
    public final /* synthetic */ FrameLayout e;

    public k71(vf.i iVar, LaunchActivity launchActivity) {
        this.e = iVar;
        this.d = launchActivity;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        switch (this.c) {
            case 0:
                break;
            default:
                if (m1.j.c(3)[o1Var.f] == 1) {
                }
                break;
        }
        return true;
    }

    @Override // f2.q0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((o71) this.e).h.size();
            default:
                return ((vf.i) this.e).A.size();
        }
    }

    @Override // f2.q0
    public long i(int i10) {
        switch (this.c) {
            case 0:
                return ((l71) ((o71) this.e).h.get(i10)).a;
            default:
                return super.i(i10);
        }
    }

    @Override // f2.q0
    public final int j(int i10) {
        switch (this.c) {
            case 0:
                return 0;
            default:
                return m1.j.b(((vf.a) ((vf.i) this.e).A.get(i10)).b);
        }
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        n71 n71Var;
        switch (this.c) {
            case 0:
                m71 m71Var = (m71) o1Var.a;
                o71 o71Var = (o71) this.e;
                l71 l71Var = (l71) o71Var.h.get(i10);
                m71Var.a = l71Var;
                m71Var.setContentDescription(l71Var.b);
                m71Var.setAlpha(1.0f);
                m71Var.requestLayout();
                m71Var.setReordering(o71Var.i0 && (n71Var = o71Var.y) != null && ((m5.o) n71Var).q(i10));
                break;
            default:
                View view = o1Var.a;
                vf.a aVar = (vf.a) ((vf.i) this.e).A.get(i10);
                int i11 = aVar.b;
                l6 l6Var = aVar.f;
                CharSequence charSequence = aVar.a;
                int b10 = m1.j.b(i11);
                if (b10 == 0) {
                    org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) view;
                    x1Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false));
                    x1Var.a(0, charSequence);
                    break;
                } else if (b10 == 1) {
                    org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
                    j4Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L6, false));
                    j4Var.setText(charSequence);
                    break;
                } else if (b10 == 2) {
                    vf.h hVar = (vf.h) view;
                    hVar.f = charSequence.toString();
                    hVar.d = ((Float) l6Var.get(null)).floatValue();
                    hVar.b = aVar.d;
                    hVar.c = aVar.e;
                    hVar.e = l6Var;
                    hVar.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        switch (this.c) {
            case 0:
                return new lk0(new m71((o71) this.e, this.d));
            default:
                int b10 = m1.j.b(m1.j.c(3)[i10]);
                Context context = this.d;
                if (b10 == 1) {
                    frameLayout = new org.telegram.ui.Cells.j4(context);
                } else if (b10 != 2) {
                    frameLayout = new org.telegram.ui.ActionBar.x1(context, null);
                } else {
                    vf.h hVar = new vf.h(context);
                    hVar.setWillNotDraw(false);
                    TextPaint textPaint = new TextPaint(1);
                    hVar.h = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                    qn0 qn0Var = new qn0(context);
                    hVar.a = qn0Var;
                    qn0Var.setReportChanges(true);
                    qn0Var.setDelegate(new n2.b0(hVar, 24));
                    qn0Var.setImportantForAccessibility(2);
                    hVar.addView(qn0Var, h7.z5.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                    frameLayout = hVar;
                }
                frameLayout.setLayoutParams(new f2.y0(-1, -2));
                return new lk0(frameLayout);
        }
    }

    public k71(o71 o71Var, Context context) {
        this.e = o71Var;
        this.d = context;
    }
}
