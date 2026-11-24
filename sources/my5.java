// default package

import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
