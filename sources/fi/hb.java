package fi;

import android.app.Activity;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.re0;
import org.telegram.ui.t30;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class hb extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hb(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        int i10;
        org.telegram.ui.ActionBar.u6 u6Var;
        switch (this.a) {
            case 0:
                ((ib) this.b).S1.S();
                break;
            case 1:
                nh.c cVar = (nh.c) this.b;
                nh.a aVar = cVar.I;
                if (aVar != null && (groupCallMessage = cVar.H) != null) {
                    ((t30) aVar).a(groupCallMessage);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.w1 w1Var = (org.telegram.ui.Cells.w1) this.b;
                qf.d.r(w1Var.getContext(), "https://fragment.com/username/" + ((org.telegram.ui.sa) w1Var.M).e.r);
                break;
            case 3:
                ((org.telegram.ui.wb) this.b).finishFragment();
                break;
            case 4:
                ((org.telegram.ui.q1) this.b).run();
                break;
            case 5:
                ((wc) this.b).a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 6:
                al alVar = (al) this.b;
                org.telegram.ui.Wallet.m5.F0(alVar.getContext(), alVar.n, alVar.a);
                break;
            case 7:
                ((ActionBarLayout) ((LaunchActivity) this.b).O()).R(new PremiumPreviewFragment(0, "gift"));
                break;
            case 8:
                ((re0) this.b).p(false);
                break;
            case 9:
                org.telegram.ui.Wallet.i9 i9Var = (org.telegram.ui.Wallet.i9) this.b;
                Activity parentActivity = i9Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.r2) i9Var).currentAccount;
                org.telegram.ui.Wallet.m5.F0(parentActivity, i10, i9Var.getResourceProvider());
                break;
            case 10:
                tg.j0 j0Var = ((tg.c0) this.b).c;
                org.telegram.ui.ActionBar.r2 r2Var = j0Var.n;
                long j10 = j0Var.a0;
                u6Var = ((org.telegram.ui.ActionBar.k3) j0Var).resourcesProvider;
                vg.n.m(r2Var, u6Var, j10, null);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        org.telegram.ui.ActionBar.u6 u6Var;
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
                textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, ((al) this.b).a));
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
                textPaint.setColor(((org.telegram.ui.Wallet.i9) this.b).getThemedColor(org.telegram.ui.ActionBar.y6.Oh));
                textPaint.setUnderlineText(false);
                break;
            case 10:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                int i10 = org.telegram.ui.ActionBar.y6.gc;
                u6Var = ((org.telegram.ui.ActionBar.k3) ((tg.c0) this.b).c).resourcesProvider;
                textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
                break;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((tg.m1) this.b).u0;
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
