package ih;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.y71;
import org.telegram.ui.Components.z71;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class r2 extends z71 {
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 P;
    public final /* synthetic */ gr0 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(gr0 gr0Var, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, null);
        this.Q = gr0Var;
        this.P = o2Var;
    }

    @Override // org.telegram.ui.Components.z71
    public final void h() {
        gr0 gr0Var = this.Q;
        y71 y71Var = gr0Var.n;
        if (!gr0Var.b() || y71Var == null) {
            return;
        }
        if (gr0Var.F == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.x3.i(R.string.Gift2NewCollection, new StringBuilder("+ ")));
            iq iqVar = new iq(R.drawable.poll_add_plus, 0);
            iqVar.spaceScaleX = 0.8f;
            spannableStringBuilder.setSpan(iqVar, 0, 1, 33);
            gr0Var.F = spannableStringBuilder;
        }
        y71Var.a(-1, gr0Var.F);
    }

    @Override // org.telegram.ui.Components.z71
    public final boolean i(MotionEvent motionEvent) {
        return !this.Q.g();
    }

    @Override // org.telegram.ui.Components.z71
    public final void w(boolean z10) {
        gr0 gr0Var = this.Q;
        gr0Var.l();
        org.telegram.ui.ActionBar.o2 o2Var = this.P;
        if (o2Var instanceof ProfileActivity) {
            ((ProfileActivity) o2Var).R();
        }
        gr0Var.o();
    }

    @Override // org.telegram.ui.Components.z71
    public final void z(int i10) {
        this.Q.l();
        org.telegram.ui.ActionBar.o2 o2Var = this.P;
        if (o2Var instanceof ProfileActivity) {
            ((ProfileActivity) o2Var).R();
        }
    }
}
