// default package

import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class my5 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y0a b;

    public /* synthetic */ my5(y0a y0aVar, byte b) {
        this.a = b;
        this.b = y0aVar;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        y0a y0aVar = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                String str2 = LaunchActivity.C1;
                if (y0aVar != null && "paid".equals(str)) {
                    y0aVar.run();
                    break;
                }
                break;
            default:
                if (y0aVar != null && "paid".equals(str)) {
                    y0aVar.run();
                    break;
                }
                break;
        }
    }
}
