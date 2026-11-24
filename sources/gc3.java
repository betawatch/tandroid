// default package

import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class gc3 implements di8 {
    public final /* synthetic */ byte a;

    @Override // di8
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
                nr5 nr5Var = (nr5) obj;
                if (nr5Var.b.equals("com.apple.iTunes") && nr5Var.c.equals("iTunSMPB")) {
                    break;
                }
                break;
        }
        return true;
    }
}
