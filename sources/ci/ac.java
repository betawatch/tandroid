package ci;

import android.app.Activity;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.gl;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.f40;
import org.telegram.ui.gf0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        switch (this.a) {
            case 0:
                ((bc) this.b).S1.S();
                break;
            case 1:
                lh.c cVar = (lh.c) this.b;
                lh.a aVar = cVar.I;
                if (aVar != null && (groupCallMessage = cVar.H) != null) {
                    ((f40) aVar).a(groupCallMessage);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) this.b;
                of.f.s(y1Var.getContext(), "https://fragment.com/username/" + ((org.telegram.ui.qa) y1Var.M).e.r);
                break;
            case 3:
                ((org.telegram.ui.vb) this.b).finishFragment();
                break;
            case 4:
                ((org.telegram.ui.r1) this.b).run();
                break;
            case 5:
                ((org.telegram.ui.Components.ad) this.b).a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 6:
                gl glVar = (gl) this.b;
                org.telegram.ui.Wallet.a5.u0(glVar.getContext(), glVar.n, glVar.a);
                break;
            case 7:
                ((ActionBarLayout) ((LaunchActivity) this.b).O()).P(new PremiumPreviewFragment(0, "gift"));
                break;
            case 8:
                ((gf0) this.b).q(false);
                break;
            case 9:
                org.telegram.ui.Wallet.j8 j8Var = (org.telegram.ui.Wallet.j8) this.b;
                Activity parentActivity = j8Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) j8Var).currentAccount;
                org.telegram.ui.Wallet.a5.u0(parentActivity, i10, j8Var.getResourceProvider());
                break;
            case 10:
                rg.j0 j0Var = ((rg.c0) this.b).c;
                org.telegram.ui.ActionBar.n2 n2Var = j0Var.n;
                long j3 = j0Var.a0;
                e6Var = ((org.telegram.ui.ActionBar.f3) j0Var).resourcesProvider;
                tg.m.o(n2Var, e6Var, j3, null);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        org.telegram.ui.ActionBar.e6 e6Var;
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
                textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, ((gl) this.b).a));
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
            case 9:
                textPaint.setColor(((org.telegram.ui.Wallet.j8) this.b).getThemedColor(org.telegram.ui.ActionBar.i6.Oh));
                textPaint.setUnderlineText(false);
                break;
            case 10:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                int i10 = org.telegram.ui.ActionBar.i6.gc;
                e6Var = ((org.telegram.ui.ActionBar.f3) ((rg.c0) this.b).c).resourcesProvider;
                textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
                break;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((rg.l1) this.b).u0;
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
