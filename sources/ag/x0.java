package ag;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import lh.ib;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.mc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ma;
import org.telegram.ui.q30;
import org.telegram.ui.qb;
import org.telegram.ui.te0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class x0 extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        c6 c6Var;
        GroupCallMessage groupCallMessage;
        switch (this.a) {
            case 0:
                i1 i1Var = ((z0) this.b).c;
                org.telegram.ui.ActionBar.n2 n2Var = i1Var.n;
                long j10 = i1Var.W;
                c6Var = ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider;
                cg.x.m(n2Var, c6Var, j10, null);
                break;
            case 1:
                break;
            case 2:
                ((ib) this.b).O1.T();
                break;
            case 3:
                org.telegram.ui.Cells.w1 w1Var = (org.telegram.ui.Cells.w1) this.b;
                we.e.s(w1Var.getContext(), "https://fragment.com/username/" + ((ma) w1Var.I).e.r);
                break;
            case 4:
                ((qb) this.b).finishFragment();
                break;
            case 5:
                ((org.telegram.ui.u1) this.b).run();
                break;
            case 6:
                ((mc) this.b).a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 7:
                ((ActionBarLayout) ((LaunchActivity) this.b).O()).P(new PremiumPreviewFragment(0, "gift"));
                break;
            case 8:
                ((te0) this.b).q(false);
                break;
            default:
                ug.d dVar = (ug.d) this.b;
                ug.a aVar = dVar.E;
                if (aVar != null && (groupCallMessage = dVar.D) != null) {
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
                c6Var = ((org.telegram.ui.ActionBar.e3) ((z0) this.b).c).resourcesProvider;
                textPaint.setColor(g6.v0(i10, c6Var));
                break;
            case 1:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((y2) this.b).q0;
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
