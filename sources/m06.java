// default package

import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
