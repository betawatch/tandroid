// default package

import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
