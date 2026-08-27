package gh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import org.telegram.messenger.R;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class x2 extends p71 {
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 P;
    public final /* synthetic */ wq0 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(wq0 wq0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context, null);
        this.Q = wq0Var;
        this.P = n2Var;
    }

    @Override // org.telegram.ui.Components.p71
    public final void h() {
        wq0 wq0Var = this.Q;
        o71 o71Var = wq0Var.n;
        if (!wq0Var.b() || o71Var == null) {
            return;
        }
        if (wq0Var.F == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.y1.i(R.string.Gift2NewCollection, new StringBuilder("+ ")));
            cq cqVar = new cq(R.drawable.poll_add_plus, 0);
            cqVar.spaceScaleX = 0.8f;
            spannableStringBuilder.setSpan(cqVar, 0, 1, 33);
            wq0Var.F = spannableStringBuilder;
        }
        o71Var.a(-1, wq0Var.F);
    }

    @Override // org.telegram.ui.Components.p71
    public final boolean i(MotionEvent motionEvent) {
        return !this.Q.g();
    }

    @Override // org.telegram.ui.Components.p71
    public final void w(boolean z10) {
        wq0 wq0Var = this.Q;
        wq0Var.l();
        org.telegram.ui.ActionBar.n2 n2Var = this.P;
        if (n2Var instanceof ProfileActivity) {
            ((ProfileActivity) n2Var).R();
        }
        wq0Var.o();
    }

    @Override // org.telegram.ui.Components.p71
    public final void z(int i10) {
        this.Q.l();
        org.telegram.ui.ActionBar.n2 n2Var = this.P;
        if (n2Var instanceof ProfileActivity) {
            ((ProfileActivity) n2Var).R();
        }
    }
}
