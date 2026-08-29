package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u71 extends il0 {
    public final /* synthetic */ int c = 0;
    public final Context d;
    public final /* synthetic */ FrameLayout e;

    public u71(xf.j jVar, LaunchActivity launchActivity) {
        this.e = jVar;
        this.d = launchActivity;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        switch (this.c) {
            case 0:
                break;
            default:
                if (m1.j.c(3)[n1Var.f] == 1) {
                }
                break;
        }
        return true;
    }

    @Override // f2.p0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((y71) this.e).h.size();
            default:
                return ((xf.j) this.e).A.size();
        }
    }

    @Override // f2.p0
    public long i(int i10) {
        switch (this.c) {
            case 0:
                return ((v71) ((y71) this.e).h.get(i10)).a;
            default:
                return super.i(i10);
        }
    }

    @Override // f2.p0
    public final int j(int i10) {
        switch (this.c) {
            case 0:
                return 0;
            default:
                return m1.j.b(((xf.a) ((xf.j) this.e).A.get(i10)).b);
        }
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        x71 x71Var;
        switch (this.c) {
            case 0:
                w71 w71Var = (w71) n1Var.a;
                y71 y71Var = (y71) this.e;
                v71 v71Var = (v71) y71Var.h.get(i10);
                w71Var.a = v71Var;
                w71Var.setContentDescription(v71Var.b);
                w71Var.setAlpha(1.0f);
                w71Var.requestLayout();
                w71Var.setReordering(y71Var.i0 && (x71Var = y71Var.y) != null && ((n) x71Var).f(i10));
                break;
            default:
                View view = n1Var.a;
                xf.a aVar = (xf.a) ((xf.j) this.e).A.get(i10);
                int i11 = aVar.b;
                q6 q6Var = aVar.f;
                CharSequence charSequence = aVar.a;
                int b10 = m1.j.b(i11);
                if (b10 == 0) {
                    org.telegram.ui.ActionBar.y1 y1Var = (org.telegram.ui.ActionBar.y1) view;
                    y1Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false));
                    y1Var.a(0, charSequence);
                    break;
                } else if (b10 == 1) {
                    org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                    k4Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L6, false));
                    k4Var.setText(charSequence);
                    break;
                } else if (b10 == 2) {
                    xf.i iVar = (xf.i) view;
                    iVar.f = charSequence.toString();
                    iVar.d = ((Float) q6Var.get(null)).floatValue();
                    iVar.b = aVar.d;
                    iVar.c = aVar.e;
                    iVar.e = q6Var;
                    iVar.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        switch (this.c) {
            case 0:
                return new vk0(new w71((y71) this.e, this.d));
            default:
                int b10 = m1.j.b(m1.j.c(3)[i10]);
                Context context = this.d;
                if (b10 == 1) {
                    frameLayout = new org.telegram.ui.Cells.k4(context);
                } else if (b10 != 2) {
                    frameLayout = new org.telegram.ui.ActionBar.y1(context, null);
                } else {
                    xf.i iVar = new xf.i(context);
                    iVar.setWillNotDraw(false);
                    TextPaint textPaint = new TextPaint(1);
                    iVar.h = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                    ao0 ao0Var = new ao0(context);
                    iVar.a = ao0Var;
                    ao0Var.setReportChanges(true);
                    ao0Var.setDelegate(new xf.h(iVar));
                    ao0Var.setImportantForAccessibility(2);
                    iVar.addView(ao0Var, i7.f6.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                    frameLayout = iVar;
                }
                frameLayout.setLayoutParams(new f2.x0(-1, -2));
                return new vk0(frameLayout);
        }
    }

    public u71(y71 y71Var, Context context) {
        this.e = y71Var;
        this.d = context;
    }
}
