package fg;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.af0;
import org.telegram.ui.d40;
import org.telegram.ui.oa;
import org.telegram.ui.sb;
import qh.q9;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        g6 g6Var;
        GroupCallMessage groupCallMessage;
        switch (this.a) {
            case 0:
                v0 v0Var = ((n0) this.b).c;
                org.telegram.ui.ActionBar.p2 p2Var = v0Var.n;
                long j10 = v0Var.X;
                g6Var = ((h3) v0Var).resourcesProvider;
                hg.x.m(p2Var, g6Var, j10, null);
                break;
            case 1:
                break;
            case 2:
                org.telegram.ui.Cells.x1 x1Var = (org.telegram.ui.Cells.x1) this.b;
                af.g.s(x1Var.getContext(), "https://fragment.com/username/" + ((oa) x1Var.J).e.r);
                break;
            case 3:
                ((sb) this.b).finishFragment();
                break;
            case 4:
                ((org.telegram.ui.s1) this.b).run();
                break;
            case 5:
                ((qc) this.b).a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 6:
                ((ActionBarLayout) ((LaunchActivity) this.b).O()).P(new PremiumPreviewFragment(0, "gift"));
                break;
            case 7:
                ((af0) this.b).q(false);
                break;
            case 8:
                ((q9) this.b).P1.T();
                break;
            default:
                zg.c cVar = (zg.c) this.b;
                zg.a aVar = cVar.F;
                if (aVar != null && (groupCallMessage = cVar.E) != null) {
                    ((d40) aVar).a(groupCallMessage);
                    break;
                }
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        g6 g6Var;
        switch (this.a) {
            case 0:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                int i10 = k6.gc;
                g6Var = ((h3) ((n0) this.b).c).resourcesProvider;
                textPaint.setColor(k6.v0(i10, g6Var));
                break;
            case 1:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((d2) this.b).r0;
                if (num != null) {
                    textPaint.setColor(num.intValue());
                    break;
                }
                break;
            case 2:
                super.updateDrawState(textPaint);
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
                textPaint.setUnderlineText(false);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(TextPaint textPaint) {
    }
}
