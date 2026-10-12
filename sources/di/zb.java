package di;

import android.app.Activity;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.dl;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.l40;
import org.telegram.ui.mf0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                pf.d.s(y1Var.getContext(), "https://fragment.com/username/" + ((org.telegram.ui.ua) y1Var.M).e.r);
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
                dl dlVar = (dl) this.b;
                org.telegram.ui.Wallet.z4.u0(dlVar.getContext(), dlVar.n, dlVar.a);
                break;
            case 7:
                ((ActionBarLayout) ((LaunchActivity) this.b).O()).P(new PremiumPreviewFragment(0, "gift"));
                break;
            case 8:
                ((mf0) this.b).q(false);
                break;
            case 9:
                org.telegram.ui.Wallet.i8 i8Var = (org.telegram.ui.Wallet.i8) this.b;
                Activity parentActivity = i8Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.m2) i8Var).currentAccount;
                org.telegram.ui.Wallet.z4.u0(parentActivity, i10, i8Var.getResourceProvider());
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
                textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, ((dl) this.b).a));
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
                textPaint.setColor(((org.telegram.ui.Wallet.i8) this.b).getThemedColor(org.telegram.ui.ActionBar.g6.Oh));
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
