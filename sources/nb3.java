// default package

import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class nb3 implements pj8 {
    public final /* synthetic */ byte a;

    @Override // pj8
    public final boolean apply(Object obj) {
        switch (this.a) {
            case 0:
                if (((Map.Entry) obj).getKey() != null) {
                    break;
                }
                break;
            case 1:
                if (((String) obj) != null) {
                    break;
                }
                break;
            default:
                qr5 qr5Var = (qr5) obj;
                if (qr5Var.b.equals("com.apple.iTunes") && qr5Var.c.equals("iTunSMPB")) {
                    break;
                }
                break;
        }
        return true;
    }
}
