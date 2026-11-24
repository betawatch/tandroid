// default package

import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ay5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kz5 b;

    public /* synthetic */ ay5(kz5 kz5Var, byte b) {
        this.a = b;
        this.b = kz5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        kz5 kz5Var = this.b;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                try {
                    kz5Var.run();
                    break;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 1:
                String str2 = LaunchActivity.C1;
                try {
                    kz5Var.run();
                    break;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
            default:
                String str3 = LaunchActivity.C1;
                try {
                    kz5Var.run();
                    break;
                } catch (Exception e3) {
                    fa4.g(e3, true);
                }
        }
    }
}
