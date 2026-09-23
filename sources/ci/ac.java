package ci;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.cf0;
import org.telegram.ui.e40;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class ac extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ac(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        org.telegram.ui.ActionBar.d6 d6Var;
        switch (this.a) {
            case 0:
                ((bc) this.b).S1.T();
                break;
            case 1:
                lh.c cVar = (lh.c) this.b;
                lh.a aVar = cVar.I;
                if (aVar != null && (groupCallMessage = cVar.H) != null) {
                    ((e40) aVar).a(groupCallMessage);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.x1 x1Var = (org.telegram.ui.Cells.x1) this.b;
                nf.f.s(x1Var.getContext(), "https://fragment.com/username/" + ((org.telegram.ui.pa) x1Var.M).e.r);
                break;
            case 3:
                ((org.telegram.ui.ub) this.b).finishFragment();
                break;
            case 4:
                ((org.telegram.ui.r1) this.b).run();
                break;
            case 5:
                ((org.telegram.ui.Components.xc) this.b).a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 6:
                ((ActionBarLayout) ((LaunchActivity) this.b).O()).P(new PremiumPreviewFragment(0, "gift"));
                break;
            case 7:
                ((cf0) this.b).q(false);
                break;
            case 8:
                rg.j0 j0Var = ((rg.c0) this.b).c;
                org.telegram.ui.ActionBar.n2 n2Var = j0Var.n;
                long j3 = j0Var.a0;
                d6Var = ((org.telegram.ui.ActionBar.f3) j0Var).resourcesProvider;
                tg.o.m(n2Var, d6Var, j3, null);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        org.telegram.ui.ActionBar.d6 d6Var;
        switch (this.a) {
            case 0:
                textPaint.setUnderlineText(false);
                break;
            case 1:
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
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                int i10 = org.telegram.ui.ActionBar.h6.gc;
                d6Var = ((org.telegram.ui.ActionBar.f3) ((rg.c0) this.b).c).resourcesProvider;
                textPaint.setColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
                break;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((rg.k1) this.b).u0;
                if (num != null) {
                    textPaint.setColor(num.intValue());
                    break;
                }
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(TextPaint textPaint) {
    }
}
