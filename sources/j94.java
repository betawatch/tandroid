// default package

import java.util.Random;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class j94 extends ThreadLocal {
    public final /* synthetic */ byte a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                return new Random();
            case 1:
                cj5 cj5Var = new cj5();
                cj5Var.a = new byte[TLObject.FLAG_12];
                return cj5Var;
            case 2:
                return Long.valueOf(System.currentTimeMillis() - 1000);
            case 3:
                return Boolean.FALSE;
            default:
                return 0L;
        }
    }
}
