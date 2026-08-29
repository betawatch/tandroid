package ih;

import android.view.View;
import android.widget.FrameLayout;
import nh.gb;
import org.telegram.messenger.BirthdayController;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.qu0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class q2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ q2(FrameLayout frameLayout, boolean z10, int i10, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = z10;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                gr0 gr0Var = (gr0) this.d;
                if (gr0Var.e.h() && gr0Var.h.getCurrentPosition() != 0) {
                    gr0Var.a();
                    break;
                } else {
                    boolean z10 = this.b;
                    int i10 = this.c;
                    if (!z10) {
                        eg.w2.e0(2, BirthdayController.getInstance(i10).getState());
                        break;
                    } else {
                        h2 h2Var = new h2(gr0Var.getContext(), i10, gr0Var.c, null, null);
                        h2Var.V(BirthdayController.getInstance(i10).isToday(gr0Var.c));
                        h2Var.show();
                        break;
                    }
                }
                break;
            default:
                qu0 qu0Var = (qu0) this.d;
                org.telegram.ui.ActionBar.o2 o2Var = qu0Var.r1;
                if (!this.b) {
                    o2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                    gb.E(o2Var.getParentActivity(), o2Var.getCurrentAccount()).R(null);
                    break;
                } else {
                    qu0Var.O0(o2Var, qu0Var.f1, this.c);
                    break;
                }
        }
    }
}
