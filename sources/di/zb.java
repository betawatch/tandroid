package di;

import android.app.Activity;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.cl;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.l40;
import org.telegram.ui.lf0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class zb extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zb(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var;
        switch (this.a) {
            case 0:
                ((ac) this.b).S1.S();
                break;
            case 1:
                mh.c cVar = (mh.c) this.b;
                mh.a aVar = cVar.I;
                if (aVar != null && (groupCallMessage = cVar.H) != null) {
                    ((l40) aVar).a(groupCallMessage);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) this.b;
                pf.d.r(y1Var.getContext(), "https://fragment.com/username/" + ((org.telegram.ui.ua) y1Var.M).e.r);
                break;
            case 3:
                ((org.telegram.ui.ac) this.b).finishFragment();
                break;
            case 4:
                ((org.telegram.ui.t1) this.b).run();
                break;
            case 5:
                ((org.telegram.ui.Components.zc) this.b).a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 6:
                cl clVar = (cl) this.b;
                org.telegram.ui.Wallet.a5.u0(clVar.getContext(), clVar.n, clVar.a);
                break;
            case 7:
                ((ActionBarLayout) ((LaunchActivity) this.b).O()).P(new PremiumPreviewFragment(0, "gift"));
                break;
            case 8:
                ((lf0) this.b).q(false);
                break;
            case 9:
                org.telegram.ui.Wallet.j8 j8Var = (org.telegram.ui.Wallet.j8) this.b;
                Activity parentActivity = j8Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.m2) j8Var).currentAccount;
                org.telegram.ui.Wallet.a5.u0(parentActivity, i10, j8Var.getResourceProvider());
                break;
            case 10:
                sg.j0 j0Var = ((sg.c0) this.b).c;
                org.telegram.ui.ActionBar.m2 m2Var = j0Var.n;
                long j10 = j0Var.a0;
                c6Var = ((org.telegram.ui.ActionBar.e3) j0Var).resourcesProvider;
                ug.n.n(m2Var, c6Var, j10, null);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        org.telegram.ui.ActionBar.c6 c6Var;
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
                textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, ((cl) this.b).a));
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
                textPaint.setColor(((org.telegram.ui.Wallet.j8) this.b).getThemedColor(org.telegram.ui.ActionBar.g6.Oh));
                textPaint.setUnderlineText(false);
                break;
            case 10:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                int i10 = org.telegram.ui.ActionBar.g6.gc;
                c6Var = ((org.telegram.ui.ActionBar.e3) ((sg.c0) this.b).c).resourcesProvider;
                textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
                break;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((sg.m1) this.b).u0;
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
