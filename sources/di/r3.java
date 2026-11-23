package di;

import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bx;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class r3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ r3(f6 f6Var, int i7) {
        this.a = i7;
        this.b = f6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f6 f6Var = this.b;
                f6Var.dismiss();
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                TL_stars.TL_starGiftUnique M1 = f6Var.M1();
                if (T != null && M1 != null) {
                    bx bxVar = new bx(org.telegram.ui.Cells.c0.l(4, "onlySelect", "dialogsType", true));
                    bxVar.E2 = new a3.h(f6Var, M1, bxVar, 6);
                    T.presentFragment(bxVar);
                    break;
                }
                break;
            case 1:
                this.b.j2();
                break;
            default:
                this.b.onBackPressed();
                break;
        }
    }
}
