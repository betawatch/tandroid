package gi;

import android.app.Activity;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.hk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.b20;
import org.telegram.ui.nc0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ka extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ka(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        int i3;
        switch (this.a) {
            case 0:
                ((la) this.b).S1.S();
                break;
            case 1:
                oh.c cVar = (oh.c) this.b;
                oh.a aVar = cVar.J;
                if (aVar != null && (groupCallMessage = cVar.I) != null) {
                    ((b20) aVar).a(groupCallMessage);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.b2 b2Var = (org.telegram.ui.Cells.b2) this.b;
                sf.c.t(b2Var.getContext(), "https://fragment.com/username/" + ((org.telegram.ui.ja) b2Var.N).e.r);
                break;
            case 3:
                ((org.telegram.ui.kb) this.b).finishFragment();
                break;
            case 4:
                ((org.telegram.ui.p1) this.b).run();
                break;
            case 5:
                ((fc) this.b).a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 6:
                hk hkVar = (hk) this.b;
                org.telegram.ui.Wallet.w5.J0(hkVar.n, hkVar.getContext(), hkVar.a);
                break;
            case 7:
                ((ActionBarLayout) ((LaunchActivity) this.b).M()).S(new PremiumPreviewFragment(0, "gift"));
                break;
            case 8:
                ((nc0) this.b).p(false);
                break;
            case 9:
                org.telegram.ui.Wallet.m9 m9Var = (org.telegram.ui.Wallet.m9) this.b;
                Activity parentActivity = m9Var.getParentActivity();
                i3 = ((org.telegram.ui.ActionBar.d2) m9Var).currentAccount;
                org.telegram.ui.Wallet.w5.J0(i3, parentActivity, m9Var.getResourceProvider());
                break;
            case 10:
                vg.i0 i0Var = ((vg.b0) this.b).c;
                xg.n.I0(i0Var.p1, i0Var.J0, i0Var.T1, null);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, ((hk) obj).a));
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
                textPaint.setColor(((org.telegram.ui.Wallet.m9) obj).getThemedColor(org.telegram.ui.ActionBar.k6.Ci));
                textPaint.setUnderlineText(false);
                break;
            case 10:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                int i10 = org.telegram.ui.ActionBar.k6.Uc;
                vg.i0 i0Var = ((vg.b0) obj).c;
                int i11 = vg.i0.P2;
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, i0Var.J0));
                break;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((vg.h1) obj).n2;
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
