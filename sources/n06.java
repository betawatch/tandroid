// default package

import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class n06 implements z28 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r4a b;

    public /* synthetic */ n06(r4a r4aVar, byte b) {
        this.a = b;
        this.b = r4aVar;
    }

    @Override // z28
    public final void c(int i) {
        byte b = this.a;
        r4a r4aVar = this.b;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                if (i == 1) {
                    r4aVar.run();
                    break;
                }
                break;
            default:
                if (i == 1) {
                    r4aVar.run();
                    break;
                }
                break;
        }
    }
}
