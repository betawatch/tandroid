// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class f30 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h30 b;
    public final /* synthetic */ String c;

    public /* synthetic */ f30(h30 h30Var, String str, byte b) {
        this.a = b;
        this.b = h30Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h30 h30Var = this.b;
                String str = this.c;
                h30Var.f = null;
                gm.c3(new f30(h30Var, str, (byte) 1));
                break;
            default:
                h30 h30Var2 = this.b;
                String str2 = this.c;
                h30Var2.getClass();
                Utilities.g.c(new g30(h30Var2, str2, new ArrayList(h30Var2.n.q2)));
                break;
        }
    }
}
