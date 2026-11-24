// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class gb2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hb2 b;
    public final /* synthetic */ String c;

    public /* synthetic */ gb2(hb2 hb2Var, String str, byte b) {
        this.a = b;
        this.b = hb2Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hb2 hb2Var = this.b;
                String str = this.c;
                hb2Var.getClass();
                gm.c3(new gb2(hb2Var, str, (byte) 1));
                break;
            default:
                hb2 hb2Var2 = this.b;
                String str2 = this.c;
                hb2Var2.f = null;
                Utilities.g.c(new co1((byte) 16, hb2Var2, new ArrayList(hb2Var2.h.w), str2));
                break;
        }
    }
}
