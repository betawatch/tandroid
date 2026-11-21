package hi;

import android.app.Activity;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.zk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.i20;
import org.telegram.ui.pc0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class ha extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ha(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        int i7;
        switch (this.a) {
            case 0:
                ((ia) this.b).S1.S();
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
                zk zkVar = (zk) this.b;
                org.telegram.ui.Wallet.n6.N0(zkVar.n, zkVar.getContext(), zkVar.a);
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
                i7 = ((org.telegram.ui.ActionBar.g2) daVar).currentAccount;
                org.telegram.ui.Wallet.n6.N0(i7, parentActivity, daVar.getResourceProvider());
                break;
            case 10:
                ug.k0 k0Var = ((ug.d0) this.b).c;
                wg.l.J0(k0Var.s1, k0Var.J0, k0Var.W1, null);
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
                textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, ((zk) obj).a));
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
                textPaint.setColor(((org.telegram.ui.Wallet.da) obj).getThemedColor(org.telegram.ui.ActionBar.m6.Fi));
                textPaint.setUnderlineText(false);
                break;
            case 10:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                int i10 = org.telegram.ui.ActionBar.m6.Xc;
                ug.k0 k0Var = ((ug.d0) obj).c;
                int i11 = ug.k0.S2;
                textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(i10, k0Var.J0));
                break;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((ug.h1) obj).q2;
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
