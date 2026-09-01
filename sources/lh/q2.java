package lh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import org.telegram.messenger.R;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.m81;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class q2 extends m81 {
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 Q;
    public final /* synthetic */ pr0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(pr0 pr0Var, Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context, null);
        this.R = pr0Var;
        this.Q = p2Var;
    }

    @Override // org.telegram.ui.Components.m81
    public final void h() {
        pr0 pr0Var = this.R;
        l81 l81Var = pr0Var.n;
        if (!pr0Var.b() || l81Var == null) {
            return;
        }
        if (pr0Var.G == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.y3.h(R.string.Gift2NewCollection, new StringBuilder("+ ")));
            oq oqVar = new oq(R.drawable.poll_add_plus, 0);
            oqVar.spaceScaleX = 0.8f;
            spannableStringBuilder.setSpan(oqVar, 0, 1, 33);
            pr0Var.G = spannableStringBuilder;
        }
        l81Var.a(-1, pr0Var.G);
    }

    @Override // org.telegram.ui.Components.m81
    public final boolean i(MotionEvent motionEvent) {
        return !this.R.g();
    }

    @Override // org.telegram.ui.Components.m81
    public final void w(boolean z4) {
        pr0 pr0Var = this.R;
        pr0Var.l();
        org.telegram.ui.ActionBar.p2 p2Var = this.Q;
        if (p2Var instanceof ProfileActivity) {
            ((ProfileActivity) p2Var).R();
        }
        pr0Var.o();
    }

    @Override // org.telegram.ui.Components.m81
    public final void z(int i10) {
        this.R.l();
        org.telegram.ui.ActionBar.p2 p2Var = this.Q;
        if (p2Var instanceof ProfileActivity) {
            ((ProfileActivity) p2Var).R();
        }
    }
}
