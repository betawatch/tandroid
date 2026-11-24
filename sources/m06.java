// default package

import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class m06 implements w18 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a3a b;

    public /* synthetic */ m06(a3a a3aVar, byte b) {
        this.a = b;
        this.b = a3aVar;
    }

    @Override // w18
    public final void c(int i) {
        byte b = this.a;
        a3a a3aVar = this.b;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                if (i == 1) {
                    a3aVar.run();
                    break;
                }
                break;
            default:
                if (i == 1) {
                    a3aVar.run();
                    break;
                }
                break;
        }
    }
}
