// default package

import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class m06 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r4a b;

    public /* synthetic */ m06(r4a r4aVar, byte b) {
        this.a = b;
        this.b = r4aVar;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        r4a r4aVar = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                String str2 = LaunchActivity.C1;
                if (r4aVar != null && "paid".equals(str)) {
                    r4aVar.run();
                    break;
                }
                break;
            default:
                if (r4aVar != null && "paid".equals(str)) {
                    r4aVar.run();
                    break;
                }
                break;
        }
    }
}
