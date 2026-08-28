package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i71 extends vk0 {
    public final /* synthetic */ int c = 0;
    public final Context d;
    public final /* synthetic */ FrameLayout e;

    public i71(uf.h hVar, LaunchActivity launchActivity) {
        this.e = hVar;
        this.d = launchActivity;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        switch (this.c) {
            case 0:
                break;
            default:
                if (m1.j.c(3)[q1Var.f] == 1) {
                }
                break;
        }
        return true;
    }

    @Override // f2.r0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((m71) this.e).h.size();
            default:
                return ((uf.h) this.e).A.size();
        }
    }

    @Override // f2.r0
    public long i(int i9) {
        switch (this.c) {
            case 0:
                return ((j71) ((m71) this.e).h.get(i9)).a;
            default:
                return super.i(i9);
        }
    }

    @Override // f2.r0
    public final int j(int i9) {
        switch (this.c) {
            case 0:
                return 0;
            default:
                return m1.j.b(((uf.a) ((uf.h) this.e).A.get(i9)).b);
        }
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        l71 l71Var;
        switch (this.c) {
            case 0:
                k71 k71Var = (k71) q1Var.a;
                m71 m71Var = (m71) this.e;
                j71 j71Var = (j71) m71Var.h.get(i9);
                k71Var.a = j71Var;
                k71Var.setContentDescription(j71Var.b);
                k71Var.setAlpha(1.0f);
                k71Var.requestLayout();
                k71Var.setReordering(m71Var.i0 && (l71Var = m71Var.y) != null && ((n2.p) l71Var).o(i9));
                break;
            default:
                View view = q1Var.a;
                uf.a aVar = (uf.a) ((uf.h) this.e).A.get(i9);
                int i10 = aVar.b;
                l6 l6Var = aVar.f;
                CharSequence charSequence = aVar.a;
                int b10 = m1.j.b(i10);
                if (b10 == 0) {
                    org.telegram.ui.ActionBar.y1 y1Var = (org.telegram.ui.ActionBar.y1) view;
                    y1Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false));
                    y1Var.a(0, charSequence);
                    break;
                } else if (b10 == 1) {
                    org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                    m4Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L6, false));
                    m4Var.setText(charSequence);
                    break;
                } else if (b10 == 2) {
                    uf.g gVar = (uf.g) view;
                    gVar.f = charSequence.toString();
                    gVar.d = ((Float) l6Var.get(null)).floatValue();
                    gVar.b = aVar.d;
                    gVar.c = aVar.e;
                    gVar.e = l6Var;
                    gVar.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        FrameLayout frameLayout;
        switch (this.c) {
            case 0:
                return new ik0(new k71((m71) this.e, this.d));
            default:
                int b10 = m1.j.b(m1.j.c(3)[i9]);
                Context context = this.d;
                if (b10 == 1) {
                    frameLayout = new org.telegram.ui.Cells.m4(context);
                } else if (b10 != 2) {
                    frameLayout = new org.telegram.ui.ActionBar.y1(context, null);
                } else {
                    uf.g gVar = new uf.g(context);
                    gVar.setWillNotDraw(false);
                    TextPaint textPaint = new TextPaint(1);
                    gVar.h = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                    pn0 pn0Var = new pn0(context);
                    gVar.a = pn0Var;
                    pn0Var.setReportChanges(true);
                    pn0Var.setDelegate(new n5.a0(gVar, 18));
                    pn0Var.setImportantForAccessibility(2);
                    gVar.addView(pn0Var, g7.e6.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                    frameLayout = gVar;
                }
                frameLayout.setLayoutParams(new f2.a1(-1, -2));
                return new ik0(frameLayout);
        }
    }

    public i71(m71 m71Var, Context context) {
        this.e = m71Var;
        this.d = context;
    }
}
