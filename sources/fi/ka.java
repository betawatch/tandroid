package fi;

import android.app.Activity;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.hk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.j20;
import org.telegram.ui.sc0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ka extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ka(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        int i7;
        switch (this.a) {
            case 0:
                ((la) this.b).R1.S();
                break;
            case 1:
                nh.c cVar = (nh.c) this.b;
                nh.a aVar = cVar.I;
                if (aVar != null && (groupCallMessage = cVar.H) != null) {
                    ((j20) aVar).a(groupCallMessage);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.b2 b2Var = (org.telegram.ui.Cells.b2) this.b;
                vf.c.t(b2Var.getContext(), "https://fragment.com/username/" + ((org.telegram.ui.ka) b2Var.M).e.r);
                break;
            case 3:
                ((org.telegram.ui.mb) this.b).finishFragment();
                break;
            case 4:
                ((org.telegram.ui.o1) this.b).run();
                break;
            case 5:
                ((gc) this.b).a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 6:
                hk hkVar = (hk) this.b;
                org.telegram.ui.Wallet.z5.J0(hkVar.n, hkVar.getContext(), hkVar.a);
                break;
            case 7:
                ((ActionBarLayout) ((LaunchActivity) this.b).M()).S(new PremiumPreviewFragment(0, "gift"));
                break;
            case 8:
                ((sc0) this.b).p(false);
                break;
            case 9:
                org.telegram.ui.Wallet.o9 o9Var = (org.telegram.ui.Wallet.o9) this.b;
                Activity parentActivity = o9Var.getParentActivity();
                i7 = ((org.telegram.ui.ActionBar.f2) o9Var).currentAccount;
                org.telegram.ui.Wallet.z5.J0(i7, parentActivity, o9Var.getResourceProvider());
                break;
            case 10:
                ug.i0 i0Var = ((ug.b0) this.b).c;
                wg.l.I0(i0Var.r1, i0Var.I0, i0Var.V1, null);
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
                textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, ((hk) obj).a));
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
                textPaint.setColor(((org.telegram.ui.Wallet.o9) obj).getThemedColor(org.telegram.ui.ActionBar.m6.Ci));
                textPaint.setUnderlineText(false);
                break;
            case 10:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                int i10 = org.telegram.ui.ActionBar.m6.Uc;
                ug.i0 i0Var = ((ug.b0) obj).c;
                int i11 = ug.i0.R2;
                textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(i10, i0Var.I0));
                break;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((ug.f1) obj).p2;
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
