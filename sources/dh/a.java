package dh;

import android.app.Activity;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kg.j0;
import kg.q0;
import kg.v1;
import mg.v;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.b2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.kk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.b6;
import org.telegram.ui.Wallet.r9;
import org.telegram.ui.f30;
import org.telegram.ui.na;
import org.telegram.ui.p1;
import org.telegram.ui.sb;
import org.telegram.ui.wd0;
import vh.e8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        int i10;
        switch (this.a) {
            case 0:
                d dVar = (d) this.b;
                b bVar = dVar.I;
                if (bVar != null && (groupCallMessage = dVar.H) != null) {
                    ((f30) bVar).a(groupCallMessage);
                    break;
                }
                break;
            case 1:
                q0 q0Var = ((j0) this.b).c;
                v.I0(q0Var.o1, q0Var.I0, q0Var.S1, null);
                break;
            case 2:
                break;
            case 3:
                b2 b2Var = (b2) this.b;
                gf.f.r(b2Var.getContext(), "https://fragment.com/username/" + ((na) b2Var.M).e.r);
                break;
            case 4:
                ((sb) this.b).finishFragment();
                break;
            case 5:
                ((p1) this.b).run();
                break;
            case 6:
                ((cc) this.b).a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 7:
                kk kkVar = (kk) this.b;
                b6.I0(kkVar.n, kkVar.getContext(), kkVar.a);
                break;
            case 8:
                ((ActionBarLayout) ((LaunchActivity) this.b).M()).R(new PremiumPreviewFragment(0, "gift"));
                break;
            case 9:
                ((wd0) this.b).p(false);
                break;
            case 10:
                r9 r9Var = (r9) this.b;
                Activity parentActivity = r9Var.getParentActivity();
                i10 = ((k2) r9Var).currentAccount;
                b6.I0(i10, parentActivity, r9Var.getResourceProvider());
                break;
            default:
                ((e8) this.b).R1.S();
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                break;
            case 1:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                int i11 = t6.Uc;
                q0 q0Var = ((j0) obj).c;
                int i12 = q0.O2;
                textPaint.setColor(t6.w0(i11, q0Var.I0));
                break;
            case 2:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((v1) obj).m2;
                if (num != null) {
                    textPaint.setColor(num.intValue());
                    break;
                }
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
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 7:
                textPaint.setColor(t6.w0(t6.Ci, ((kk) obj).a));
                textPaint.setUnderlineText(false);
                break;
            case 8:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 9:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 10:
                textPaint.setColor(((r9) obj).getThemedColor(t6.Ci));
                textPaint.setUnderlineText(false);
                break;
            default:
                textPaint.setUnderlineText(false);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(TextPaint textPaint) {
    }
}
