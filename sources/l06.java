// default package

import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class l06 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a3a b;

    public /* synthetic */ l06(a3a a3aVar, byte b) {
        this.a = b;
        this.b = a3aVar;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        a3a a3aVar = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                String str2 = LaunchActivity.C1;
                if (a3aVar != null && "paid".equals(str)) {
                    a3aVar.run();
                    break;
                }
                break;
            default:
                if (a3aVar != null && "paid".equals(str)) {
                    a3aVar.run();
                    break;
                }
                break;
        }
    }
}
