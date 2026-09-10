package bi;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.hf0;
import org.telegram.ui.i40;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class pd extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pd(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        org.telegram.ui.ActionBar.f6 f6Var;
        switch (this.a) {
            case 0:
                ((qd) this.b).S1.T();
                break;
            case 1:
                kh.c cVar = (kh.c) this.b;
                kh.a aVar = cVar.I;
                if (aVar != null && (groupCallMessage = cVar.H) != null) {
                    ((i40) aVar).a(groupCallMessage);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.x1 x1Var = (org.telegram.ui.Cells.x1) this.b;
                nf.f.s(x1Var.getContext(), "https://fragment.com/username/" + ((org.telegram.ui.qa) x1Var.M).e.r);
                break;
            case 3:
                ((org.telegram.ui.wb) this.b).finishFragment();
                break;
            case 4:
                ((org.telegram.ui.s1) this.b).run();
                break;
            case 5:
                ((org.telegram.ui.Components.wc) this.b).a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 6:
                ((ActionBarLayout) ((LaunchActivity) this.b).O()).P(new PremiumPreviewFragment(0, "gift"));
                break;
            case 7:
                ((hf0) this.b).q(false);
                break;
            case 8:
                qg.k0 k0Var = ((qg.d0) this.b).c;
                org.telegram.ui.ActionBar.p2 p2Var = k0Var.n;
                long j3 = k0Var.a0;
                f6Var = ((org.telegram.ui.ActionBar.h3) k0Var).resourcesProvider;
                sg.m.m(p2Var, f6Var, j3, null);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        org.telegram.ui.ActionBar.f6 f6Var;
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
                int i10 = org.telegram.ui.ActionBar.j6.gc;
                f6Var = ((org.telegram.ui.ActionBar.h3) ((qg.d0) this.b).c).resourcesProvider;
                textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
                break;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((qg.m1) this.b).u0;
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
