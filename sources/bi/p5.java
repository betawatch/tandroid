package bi;

import android.view.View;
import android.widget.FrameLayout;
import hi.nb;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.it0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class p5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ p5(FrameLayout frameLayout, boolean z10, int i7, int i10) {
        this.a = i10;
        this.d = frameLayout;
        this.b = z10;
        this.c = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                fq0 fq0Var = (fq0) this.d;
                if (fq0Var.e.h() && fq0Var.h.getCurrentPosition() != 0) {
                    fq0Var.a();
                    break;
                } else {
                    boolean z10 = this.b;
                    int i7 = this.c;
                    if (!z10) {
                        f2.l1(false, org.telegram.messenger.v1.a(i7).b());
                        break;
                    } else {
                        p3 p3Var = new p3(fq0Var.getContext(), i7, fq0Var.c, null, null);
                        p3Var.g1(org.telegram.messenger.v1.a(i7).c(fq0Var.c));
                        p3Var.show();
                        break;
                    }
                }
                break;
            default:
                it0 it0Var = (it0) this.d;
                org.telegram.ui.ActionBar.g2 g2Var = it0Var.y1;
                if (!this.b) {
                    g2Var.getMessagesController().h7.edit().putBoolean("story_keep", true).apply();
                    nb.D(g2Var.getParentActivity(), g2Var.getCurrentAccount()).Q(null);
                    break;
                } else {
                    it0Var.a1(this.c, it0Var.m1, g2Var);
                    break;
                }
        }
    }
}
