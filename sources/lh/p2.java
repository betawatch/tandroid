package lh;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.BirthdayController;
import org.telegram.ui.Components.pr0;
import org.telegram.ui.Components.zu0;
import qh.ca;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class p2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ p2(FrameLayout frameLayout, boolean z4, int i10, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = z4;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                pr0 pr0Var = (pr0) this.d;
                if (pr0Var.e.h() && pr0Var.h.getCurrentPosition() != 0) {
                    pr0Var.a();
                    break;
                } else {
                    boolean z4 = this.b;
                    int i10 = this.c;
                    if (!z4) {
                        hg.v2.e0(2, BirthdayController.getInstance(i10).getState());
                        break;
                    } else {
                        g2 g2Var = new g2(pr0Var.getContext(), i10, pr0Var.c, null, null);
                        g2Var.V(BirthdayController.getInstance(i10).isToday(pr0Var.c));
                        g2Var.show();
                        break;
                    }
                }
                break;
            default:
                zu0 zu0Var = (zu0) this.d;
                org.telegram.ui.ActionBar.p2 p2Var = zu0Var.s1;
                if (!this.b) {
                    p2Var.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                    ca.E(p2Var.getParentActivity(), p2Var.getCurrentAccount()).R(null);
                    break;
                } else {
                    zu0Var.O0(p2Var, zu0Var.g1, this.c);
                    break;
                }
        }
    }
}
