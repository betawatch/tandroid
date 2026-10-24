package ei;

import android.app.Activity;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.r30;
import org.telegram.ui.ue0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class kb extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kb(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var;
        switch (this.a) {
            case 0:
                ((lb) this.b).S1.S();
                break;
            case 1:
                mh.c cVar = (mh.c) this.b;
                mh.a aVar = cVar.I;
                if (aVar != null && (groupCallMessage = cVar.H) != null) {
                    ((r30) aVar).a(groupCallMessage);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.x1 x1Var = (org.telegram.ui.Cells.x1) this.b;
                pf.d.r(x1Var.getContext(), "https://fragment.com/username/" + ((org.telegram.ui.ra) x1Var.M).e.r);
                break;
            case 3:
                ((org.telegram.ui.vb) this.b).finishFragment();
                break;
            case 4:
                ((org.telegram.ui.s1) this.b).run();
                break;
            case 5:
                ((xc) this.b).a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 6:
                al alVar = (al) this.b;
                org.telegram.ui.Wallet.o5.E0(alVar.getContext(), alVar.n, alVar.a);
                break;
            case 7:
                ((ActionBarLayout) ((LaunchActivity) this.b).O()).Q(new PremiumPreviewFragment(0, "gift"));
                break;
            case 8:
                ((ue0) this.b).p(false);
                break;
            case 9:
                org.telegram.ui.Wallet.j9 j9Var = (org.telegram.ui.Wallet.j9) this.b;
                Activity parentActivity = j9Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.o2) j9Var).currentAccount;
                org.telegram.ui.Wallet.o5.E0(parentActivity, i10, j9Var.getResourceProvider());
                break;
            case 10:
                sg.j0 j0Var = ((sg.c0) this.b).c;
                org.telegram.ui.ActionBar.o2 o2Var = j0Var.n;
                long j10 = j0Var.a0;
                g6Var = ((org.telegram.ui.ActionBar.h3) j0Var).resourcesProvider;
                ug.l.m(o2Var, g6Var, j10, null);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        org.telegram.ui.ActionBar.g6 g6Var;
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
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, ((al) this.b).a));
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
                textPaint.setColor(((org.telegram.ui.Wallet.j9) this.b).getThemedColor(org.telegram.ui.ActionBar.k6.Oh));
                textPaint.setUnderlineText(false);
                break;
            case 10:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                int i10 = org.telegram.ui.ActionBar.k6.gc;
                g6Var = ((org.telegram.ui.ActionBar.h3) ((sg.c0) this.b).c).resourcesProvider;
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
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
