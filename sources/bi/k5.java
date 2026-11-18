package bi;

import android.view.View;
import android.widget.FrameLayout;
import hi.ta;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.gt0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ k5(FrameLayout frameLayout, boolean z10, int i7, int i10) {
        this.a = i10;
        this.d = frameLayout;
        this.b = z10;
        this.c = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                eq0 eq0Var = (eq0) this.d;
                if (eq0Var.e.h() && eq0Var.h.getCurrentPosition() != 0) {
                    eq0Var.a();
                    break;
                } else {
                    boolean z10 = this.b;
                    int i7 = this.c;
                    if (!z10) {
                        a2.l1(false, org.telegram.messenger.v1.a(i7).b());
                        break;
                    } else {
                        j3 j3Var = new j3(eq0Var.getContext(), i7, eq0Var.c, null, null);
                        j3Var.g1(org.telegram.messenger.v1.a(i7).c(eq0Var.c));
                        j3Var.show();
                        break;
                    }
                }
                break;
            default:
                gt0 gt0Var = (gt0) this.d;
                org.telegram.ui.ActionBar.h2 h2Var = gt0Var.y1;
                if (!this.b) {
                    h2Var.getMessagesController().h7.edit().putBoolean("story_keep", true).apply();
                    ta.D(h2Var.getParentActivity(), h2Var.getCurrentAccount()).Q(null);
                    break;
                } else {
                    gt0Var.a1(this.c, gt0Var.m1, h2Var);
                    break;
                }
        }
    }
}
