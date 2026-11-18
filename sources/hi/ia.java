package hi;

import android.app.Activity;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.xk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.i20;
import org.telegram.ui.pc0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class ia extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ia(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        int i7;
        switch (this.a) {
            case 0:
                ((ja) this.b).S1.S();
                break;
            case 1:
                nh.c cVar = (nh.c) this.b;
                nh.a aVar = cVar.J;
                if (aVar != null && (groupCallMessage = cVar.I) != null) {
                    ((i20) aVar).a(groupCallMessage);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.b;
                vf.c.t(c2Var.getContext(), "https://fragment.com/username/" + ((org.telegram.ui.ka) c2Var.N).e.r);
                break;
            case 3:
                ((org.telegram.ui.lb) this.b).finishFragment();
                break;
            case 4:
                ((org.telegram.ui.o1) this.b).run();
                break;
            case 5:
                ((lc) this.b).a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 6:
                xk xkVar = (xk) this.b;
                org.telegram.ui.Wallet.n6.N0(xkVar.n, xkVar.getContext(), xkVar.a);
                break;
            case 7:
                ((ActionBarLayout) ((LaunchActivity) this.b).M()).S(new PremiumPreviewFragment(0, "gift"));
                break;
            case 8:
                ((pc0) this.b).p(false);
                break;
            case 9:
                org.telegram.ui.Wallet.da daVar = (org.telegram.ui.Wallet.da) this.b;
                Activity parentActivity = daVar.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.h2) daVar).currentAccount;
                org.telegram.ui.Wallet.n6.N0(i7, parentActivity, daVar.getResourceProvider());
                break;
            case 10:
                ug.l0 l0Var = ((ug.e0) this.b).c;
                wg.l.J0(l0Var.s1, l0Var.J0, l0Var.W1, null);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, ((xk) obj).a));
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
                textPaint.setColor(((org.telegram.ui.Wallet.da) obj).getThemedColor(org.telegram.ui.ActionBar.n6.Fi));
                textPaint.setUnderlineText(false);
                break;
            case 10:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                int i10 = org.telegram.ui.ActionBar.n6.Xc;
                ug.l0 l0Var = ((ug.e0) obj).c;
                int i11 = ug.l0.S2;
                textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(i10, l0Var.J0));
                break;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((ug.i1) obj).q2;
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
