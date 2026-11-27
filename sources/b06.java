// default package

import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
