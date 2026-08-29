package cg;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import nh.wa;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ka;
import org.telegram.ui.ob;
import org.telegram.ui.pe0;
import org.telegram.ui.q30;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class l0 extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        c6 c6Var;
        GroupCallMessage groupCallMessage;
        switch (this.a) {
            case 0:
                v0 v0Var = ((n0) this.b).c;
                org.telegram.ui.ActionBar.o2 o2Var = v0Var.n;
                long j10 = v0Var.W;
                c6Var = ((f3) v0Var).resourcesProvider;
                eg.y.m(o2Var, c6Var, j10, null);
                break;
            case 1:
                break;
            case 2:
                ((wa) this.b).O1.T();
                break;
            case 3:
                org.telegram.ui.Cells.w1 w1Var = (org.telegram.ui.Cells.w1) this.b;
                ye.d.s(w1Var.getContext(), "https://fragment.com/username/" + ((ka) w1Var.I).e.r);
                break;
            case 4:
                ((ob) this.b).finishFragment();
                break;
            case 5:
                ((org.telegram.ui.u1) this.b).run();
                break;
            case 6:
                ((tc) this.b).a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 7:
                ((ActionBarLayout) ((LaunchActivity) this.b).O()).P(new PremiumPreviewFragment(0, "gift"));
                break;
            case 8:
                ((pe0) this.b).q(false);
                break;
            default:
                wg.c cVar = (wg.c) this.b;
                wg.a aVar = cVar.E;
                if (aVar != null && (groupCallMessage = cVar.D) != null) {
                    ((q30) aVar).a(groupCallMessage);
                    break;
                }
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        c6 c6Var;
        switch (this.a) {
            case 0:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                int i10 = g6.gc;
                c6Var = ((f3) ((n0) this.b).c).resourcesProvider;
                textPaint.setColor(g6.v0(i10, c6Var));
                break;
            case 1:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((f2) this.b).q0;
                if (num != null) {
                    textPaint.setColor(num.intValue());
                    break;
                }
                break;
            case 2:
                textPaint.setUnderlineText(false);
                break;
            case 3:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 4:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 5:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 6:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 7:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 8:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(TextPaint textPaint) {
    }
}
