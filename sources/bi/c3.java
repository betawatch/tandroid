package bi;

import android.view.View;
import android.widget.FrameLayout;
import hi.sa;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.ys0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class c3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ c3(FrameLayout frameLayout, boolean z10, int i7, int i10) {
        this.a = i10;
        this.d = frameLayout;
        this.b = z10;
        this.c = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                wp0 wp0Var = (wp0) this.d;
                if (wp0Var.e.h() && wp0Var.h.getCurrentPosition() != 0) {
                    wp0Var.a();
                    break;
                } else {
                    boolean z10 = this.b;
                    int i7 = this.c;
                    if (!z10) {
                        wg.c1.l1(2, org.telegram.messenger.v1.a(i7).b());
                        break;
                    } else {
                        s2 s2Var = new s2(wp0Var.getContext(), i7, wp0Var.c, null, null);
                        s2Var.e1(org.telegram.messenger.v1.a(i7).c(wp0Var.c));
                        s2Var.show();
                        break;
                    }
                }
                break;
            default:
                ys0 ys0Var = (ys0) this.d;
                org.telegram.ui.ActionBar.e2 e2Var = ys0Var.y1;
                if (!this.b) {
                    e2Var.getMessagesController().f7.edit().putBoolean("story_keep", true).apply();
                    sa.D(e2Var.getParentActivity(), e2Var.getCurrentAccount()).Q(null);
                    break;
                } else {
                    ys0Var.a1(e2Var, ys0Var.m1, this.c);
                    break;
                }
        }
    }
}
