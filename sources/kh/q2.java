package kh;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.yu0;
import ph.da;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class q2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ q2(FrameLayout frameLayout, boolean z4, int i10, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = z4;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                or0 or0Var = (or0) this.d;
                if (or0Var.e.h() && or0Var.h.getCurrentPosition() != 0) {
                    or0Var.a();
                    break;
                } else {
                    boolean z4 = this.b;
                    int i10 = this.c;
                    if (!z4) {
                        gg.v2.e0(2, BirthdayController.getInstance(i10).getState());
                        break;
                    } else {
                        h2 h2Var = new h2(or0Var.getContext(), i10, or0Var.c, null, null);
                        h2Var.V(BirthdayController.getInstance(i10).isToday(or0Var.c));
                        h2Var.show();
                        break;
                    }
                }
                break;
            default:
                yu0 yu0Var = (yu0) this.d;
                org.telegram.ui.ActionBar.p2 p2Var = yu0Var.s1;
                if (!this.b) {
                    p2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                    da.E(p2Var.getParentActivity(), p2Var.getCurrentAccount()).R(null);
                    break;
                } else {
                    yu0Var.O0(p2Var, yu0Var.g1, this.c);
                    break;
                }
        }
    }
}
