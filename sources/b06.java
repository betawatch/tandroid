// default package

import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
