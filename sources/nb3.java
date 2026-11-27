// default package

import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
