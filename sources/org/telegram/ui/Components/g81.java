package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class g81 extends ql0 {
    public final /* synthetic */ int c = 0;
    public final Context d;
    public final /* synthetic */ FrameLayout e;

    public g81(zf.h hVar, LaunchActivity launchActivity) {
        this.e = hVar;
        this.d = launchActivity;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        switch (this.c) {
            case 0:
                break;
            default:
                if (m1.j.d(3)[l1Var.f] == 1) {
                }
                break;
        }
        return true;
    }

    @Override // f2.o0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((k81) this.e).h.size();
            default:
                return ((zf.h) this.e).B.size();
        }
    }

    @Override // f2.o0
    public long i(int i10) {
        switch (this.c) {
            case 0:
                return ((h81) ((k81) this.e).h.get(i10)).a;
            default:
                return super.i(i10);
        }
    }

    @Override // f2.o0
    public final int j(int i10) {
        switch (this.c) {
            case 0:
                return 0;
            default:
                return m1.j.c(((zf.a) ((zf.h) this.e).B.get(i10)).b);
        }
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        j81 j81Var;
        switch (this.c) {
            case 0:
                i81 i81Var = (i81) l1Var.a;
                k81 k81Var = (k81) this.e;
                h81 h81Var = (h81) k81Var.h.get(i10);
                i81Var.a = h81Var;
                i81Var.setContentDescription(h81Var.b);
                i81Var.setAlpha(1.0f);
                i81Var.requestLayout();
                i81Var.setReordering(k81Var.j0 && (j81Var = k81Var.y) != null && ((tp0) j81Var).j(i10));
                break;
            default:
                View view = l1Var.a;
                zf.a aVar = (zf.a) ((zf.h) this.e).B.get(i10);
                int i11 = aVar.b;
                m6 m6Var = aVar.f;
                CharSequence charSequence = aVar.a;
                int c3 = m1.j.c(i11);
                if (c3 == 0) {
                    org.telegram.ui.ActionBar.z1 z1Var = (org.telegram.ui.ActionBar.z1) view;
                    z1Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
                    z1Var.a(0, charSequence);
                    break;
                } else if (c3 == 1) {
                    org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                    l4Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L6, false));
                    l4Var.setText(charSequence);
                    break;
                } else if (c3 == 2) {
                    zf.g gVar = (zf.g) view;
                    gVar.f = charSequence.toString();
                    gVar.d = ((Float) m6Var.get(null)).floatValue();
                    gVar.b = aVar.d;
                    gVar.c = aVar.e;
                    gVar.e = m6Var;
                    gVar.invalidate();
                    break;
                }
                break;
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        switch (this.c) {
            case 0:
                return new dl0(new i81((k81) this.e, this.d));
            default:
                int c3 = m1.j.c(m1.j.d(3)[i10]);
                Context context = this.d;
                if (c3 == 1) {
                    frameLayout = new org.telegram.ui.Cells.l4(context);
                } else if (c3 != 2) {
                    frameLayout = new org.telegram.ui.ActionBar.z1(context, null);
                } else {
                    zf.g gVar = new zf.g(context);
                    gVar.setWillNotDraw(false);
                    TextPaint textPaint = new TextPaint(1);
                    gVar.h = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                    jo0 jo0Var = new jo0(context);
                    gVar.a = jo0Var;
                    jo0Var.setReportChanges(true);
                    jo0Var.setDelegate(new zz(gVar, 26));
                    jo0Var.setImportantForAccessibility(2);
                    gVar.addView(jo0Var, k7.b6.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                    frameLayout = gVar;
                }
                frameLayout.setLayoutParams(new f2.w0(-1, -2));
                return new dl0(frameLayout);
        }
    }

    public g81(k81 k81Var, Context context) {
        this.e = k81Var;
        this.d = context;
    }
}
