// default package

import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ny5 implements tz7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y0a b;

    public /* synthetic */ ny5(y0a y0aVar, byte b) {
        this.a = b;
        this.b = y0aVar;
    }

    @Override // tz7
    public final void c(int i) {
        byte b = this.a;
        y0a y0aVar = this.b;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                if (i == 1) {
                    y0aVar.run();
                    break;
                }
                break;
            default:
                if (i == 1) {
                    y0aVar.run();
                    break;
                }
                break;
        }
    }
}
