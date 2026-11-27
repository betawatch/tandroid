// default package

import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b06 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tg5 b;

    public /* synthetic */ b06(tg5 tg5Var, byte b) {
        this.a = b;
        this.b = tg5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        tg5 tg5Var = this.b;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                try {
                    tg5Var.run();
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 1:
                String str2 = LaunchActivity.C1;
                try {
                    tg5Var.run();
                    break;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            default:
                String str3 = LaunchActivity.C1;
                try {
                    tg5Var.run();
                    break;
                } catch (Exception e3) {
                    cc4.g(e3, true);
                }
        }
    }
}
