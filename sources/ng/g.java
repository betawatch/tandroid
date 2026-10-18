package ng;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import m1.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.a91;
import org.telegram.ui.Components.b91;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.y81;
import org.telegram.ui.Components.z81;
import org.telegram.ui.LaunchActivity;
import s4.b1;
import s4.o0;
import w7.z5;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class g extends hm0 {
    public final /* synthetic */ int c = 0;
    public final Context d;
    public final /* synthetic */ FrameLayout e;

    public g(i iVar, LaunchActivity launchActivity) {
        this.e = iVar;
        this.d = launchActivity;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(b1 b1Var) {
        switch (this.c) {
            case 0:
                if (j.d(3)[b1Var.f] == 1) {
                }
                break;
        }
        return true;
    }

    @Override // s4.g0
    public final int h() {
        switch (this.c) {
            case 0:
                return ((i) this.e).E.size();
            default:
                return ((b91) this.e).h.size();
        }
    }

    @Override // s4.g0
    public long i(int i10) {
        switch (this.c) {
            case 1:
                return ((y81) ((b91) this.e).h.get(i10)).a;
            default:
                return super.i(i10);
        }
    }

    @Override // s4.g0
    public final int j(int i10) {
        switch (this.c) {
            case 0:
                return j.c(((a) ((i) this.e).E.get(i10)).b);
            default:
                return 0;
        }
    }

    @Override // s4.g0
    public final void v(b1 b1Var, int i10) {
        a91 a91Var;
        switch (this.c) {
            case 0:
                View view = b1Var.a;
                a aVar = (a) ((i) this.e).E.get(i10);
                int i11 = aVar.b;
                s6 s6Var = aVar.f;
                CharSequence charSequence = aVar.a;
                int c10 = j.c(i11);
                if (c10 == 0) {
                    x1 x1Var = (x1) view;
                    x1Var.setTextColor(h6.x0(null, h6.j5, false));
                    x1Var.a(0, charSequence);
                    break;
                } else if (c10 == 1) {
                    l4 l4Var = (l4) view;
                    l4Var.setTextColor(h6.x0(null, h6.L6, false));
                    l4Var.setText(charSequence);
                    break;
                } else if (c10 == 2) {
                    h hVar = (h) view;
                    hVar.f = charSequence.toString();
                    hVar.d = ((Float) s6Var.get(null)).floatValue();
                    hVar.b = aVar.d;
                    hVar.c = aVar.e;
                    hVar.e = s6Var;
                    hVar.invalidate();
                    break;
                }
                break;
            default:
                z81 z81Var = (z81) b1Var.a;
                b91 b91Var = (b91) this.e;
                y81 y81Var = (y81) b91Var.h.get(i10);
                z81Var.a = y81Var;
                z81Var.setContentDescription(y81Var.b);
                z81Var.setAlpha(1.0f);
                z81Var.requestLayout();
                z81Var.setReordering(b91Var.m0 && (a91Var = b91Var.y) != null && ((l2.f) a91Var).q(i10));
                break;
        }
    }

    @Override // s4.g0
    public final b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        switch (this.c) {
            case 0:
                int c10 = j.c(j.d(3)[i10]);
                Context context = this.d;
                if (c10 == 1) {
                    frameLayout = new l4(context);
                } else if (c10 != 2) {
                    frameLayout = new x1(context, null);
                } else {
                    h hVar = new h(context);
                    hVar.setWillNotDraw(false);
                    TextPaint textPaint = new TextPaint(1);
                    hVar.h = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                    cp0 cp0Var = new cp0(context);
                    hVar.a = cp0Var;
                    cp0Var.setReportChanges(true);
                    cp0Var.setDelegate(new l2.f(hVar, 4));
                    cp0Var.setImportantForAccessibility(2);
                    hVar.addView(cp0Var, z5.a(38.0f, 5.0f, 29.0f, 47.0f, 0.0f, -1, 83));
                    frameLayout = hVar;
                }
                frameLayout.setLayoutParams(new o0(-1, -2));
                return new sl0(frameLayout);
            default:
                return new sl0(new z81((b91) this.e, this.d));
        }
    }

    public g(b91 b91Var, Context context) {
        this.e = b91Var;
        this.d = context;
    }
}
