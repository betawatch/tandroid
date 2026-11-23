package hi;

import android.app.Activity;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.xk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.h20;
import org.telegram.ui.oc0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class cb extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cb(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        int i7;
        switch (this.a) {
            case 0:
                ((db) this.b).S1.S();
                break;
            case 1:
                nh.c cVar = (nh.c) this.b;
                nh.a aVar = cVar.J;
                if (aVar != null && (groupCallMessage = cVar.I) != null) {
                    ((h20) aVar).a(groupCallMessage);
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
                ((org.telegram.ui.Components.kc) this.b).a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 6:
                xk xkVar = (xk) this.b;
                org.telegram.ui.Wallet.o6.N0(xkVar.n, xkVar.getContext(), xkVar.a);
                break;
            case 7:
                ((ActionBarLayout) ((LaunchActivity) this.b).M()).S(new PremiumPreviewFragment(0, "gift"));
                break;
            case 8:
                ((oc0) this.b).p(false);
                break;
            case 9:
                org.telegram.ui.Wallet.ea eaVar = (org.telegram.ui.Wallet.ea) this.b;
                Activity parentActivity = eaVar.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.g2) eaVar).currentAccount;
                org.telegram.ui.Wallet.o6.N0(i7, parentActivity, eaVar.getResourceProvider());
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
                textPaint.setColor(((org.telegram.ui.Wallet.ea) obj).getThemedColor(org.telegram.ui.ActionBar.n6.Fi));
                textPaint.setUnderlineText(false);
                break;
            case 10:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                int i10 = org.telegram.ui.ActionBar.n6.Xc;
                ug.k0 k0Var = ((ug.d0) obj).c;
                int i11 = ug.k0.S2;
                textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(i10, k0Var.J0));
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
