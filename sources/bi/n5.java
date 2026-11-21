package bi;

import android.view.View;
import android.widget.FrameLayout;
import hi.sa;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.jt0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ n5(FrameLayout frameLayout, boolean z10, int i7, int i10) {
        this.a = i10;
        this.d = frameLayout;
        this.b = z10;
        this.c = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                gq0 gq0Var = (gq0) this.d;
                if (gq0Var.e.h() && gq0Var.h.getCurrentPosition() != 0) {
                    gq0Var.a();
                    break;
                } else {
                    boolean z10 = this.b;
                    int i7 = this.c;
                    if (!z10) {
                        e2.l1(false, org.telegram.messenger.v1.a(i7).b());
                        break;
                    } else {
                        n3 n3Var = new n3(gq0Var.getContext(), i7, gq0Var.c, null, null);
                        n3Var.g1(org.telegram.messenger.v1.a(i7).c(gq0Var.c));
                        n3Var.show();
                        break;
                    }
                }
                break;
            default:
                jt0 jt0Var = (jt0) this.d;
                org.telegram.ui.ActionBar.g2 g2Var = jt0Var.y1;
                if (!this.b) {
                    g2Var.getMessagesController().h7.edit().putBoolean("story_keep", true).apply();
                    sa.D(g2Var.getParentActivity(), g2Var.getCurrentAccount()).Q(null);
                    break;
                } else {
                    jt0Var.a1(this.c, jt0Var.m1, g2Var);
                    break;
                }
        }
    }
}
