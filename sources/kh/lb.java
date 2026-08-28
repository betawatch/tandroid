package kh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.n30;
import org.telegram.ui.qe0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class lb extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lb(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        org.telegram.ui.ActionBar.b6 b6Var;
        switch (this.a) {
            case 0:
                ((mb) this.b).O1.T();
                break;
            case 1:
                org.telegram.ui.Cells.x1 x1Var = (org.telegram.ui.Cells.x1) this.b;
                ve.e.s(x1Var.getContext(), "https://fragment.com/username/" + ((org.telegram.ui.la) x1Var.I).e.r);
                break;
            case 2:
                ((org.telegram.ui.pb) this.b).finishFragment();
                break;
            case 3:
                ((org.telegram.ui.t1) this.b).run();
                break;
            case 4:
                ((org.telegram.ui.Components.oc) this.b).a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 5:
                ((ActionBarLayout) ((LaunchActivity) this.b).O()).P(new PremiumPreviewFragment(0, "gift"));
                break;
            case 6:
                ((qe0) this.b).q(false);
                break;
            case 7:
                tg.d dVar = (tg.d) this.b;
                tg.a aVar = dVar.E;
                if (aVar != null && (groupCallMessage = dVar.D) != null) {
                    ((n30) aVar).a(groupCallMessage);
                    break;
                }
                break;
            case 8:
                zf.j0 j0Var = ((zf.c0) this.b).c;
                org.telegram.ui.ActionBar.o2 o2Var = j0Var.n;
                long j10 = j0Var.W;
                b6Var = ((org.telegram.ui.ActionBar.f3) j0Var).resourcesProvider;
                bg.a0.m(o2Var, b6Var, j10, null);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        org.telegram.ui.ActionBar.b6 b6Var;
        switch (this.a) {
            case 0:
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
                break;
            case 8:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                int i9 = org.telegram.ui.ActionBar.f6.gc;
                b6Var = ((org.telegram.ui.ActionBar.f3) ((zf.c0) this.b).c).resourcesProvider;
                textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
                break;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((zf.k1) this.b).q0;
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
