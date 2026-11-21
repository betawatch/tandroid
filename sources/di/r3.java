package di;

import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cx;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                    cx cxVar = new cx(org.telegram.ui.Cells.c0.l(4, "onlySelect", "dialogsType", true));
                    cxVar.E2 = new a3.h(f6Var, M1, cxVar, 6);
                    T.presentFragment(cxVar);
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
