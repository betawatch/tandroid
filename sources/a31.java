// default package

import android.app.Activity;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class a31 extends ClickableSpan {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a31(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        int i;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((d31) obj).a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 1:
                te1 te1Var = (te1) obj;
                m01.u(te1Var.getContext(), "https://fragment.com/username/" + ((ue1) te1Var.N).e.r);
                break;
            case 2:
                ((wf1) obj).finishFragment();
                break;
            case 3:
                ((tu0) obj).run();
                break;
            case 4:
                h42 h42Var = (h42) obj;
                uqc.L0(h42Var.n, h42Var.a, h42Var.getContext());
                break;
            case 5:
                v95 v95Var = (v95) obj;
                s95 s95Var = v95Var.J;
                if (s95Var != null && (groupCallMessage = v95Var.I) != null) {
                    ((o75) s95Var).a(groupCallMessage);
                    break;
                }
                break;
            case 6:
                ((ActionBarLayout) ((LaunchActivity) obj).N()).S(new PremiumPreviewFragment(0, "gift"));
                break;
            case 7:
                l46 l46Var = ((d46) obj).c;
                dn0.E0(l46Var.r1, l46Var.J0, l46Var.V1, null);
                break;
            case 8:
                ((cg6) obj).p(false);
                break;
            case 9:
                break;
            case 10:
                ((ibb) obj).S1.S();
                break;
            default:
                euc eucVar = (euc) obj;
                Activity parentActivity = eucVar.getParentActivity();
                i = ((e) eucVar).currentAccount;
                uqc.L0(i, eucVar.getResourceProvider(), parentActivity);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 1:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
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
                textPaint.setColor(aob.v0(aob.Fi, ((h42) obj).a));
                textPaint.setUnderlineText(false);
                break;
            case 5:
                break;
            case 6:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 7:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                int i = aob.Xc;
                l46 l46Var = ((d46) obj).c;
                int i2 = l46.R2;
                textPaint.setColor(aob.v0(i, l46Var.J0));
                break;
            case 8:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 9:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((kl8) obj).p2;
                if (num != null) {
                    textPaint.setColor(num.intValue());
                    break;
                }
                break;
            case 10:
                textPaint.setUnderlineText(false);
                break;
            default:
                textPaint.setColor(((euc) obj).getThemedColor(aob.Fi));
                textPaint.setUnderlineText(false);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(TextPaint textPaint) {
    }
}
