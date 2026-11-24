// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class fga implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gga b;
    public final /* synthetic */ String c;

    public /* synthetic */ fga(gga ggaVar, String str, byte b) {
        this.a = b;
        this.b = ggaVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = 1;
        switch (this.a) {
            case 0:
                gga ggaVar = this.b;
                String str = this.c;
                ggaVar.getClass();
                gm.c3(new fga(ggaVar, str, b));
                break;
            default:
                gga ggaVar2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                ggaVar2.f = null;
                if (!sd2.T(ggaVar2.n) && ggaVar2.s.g1 != null) {
                    arrayList = new ArrayList(ggaVar2.s.g1.participants.participants);
                }
                ggaVar2.r = 2;
                if (arrayList != null) {
                    Utilities.g.c(new hw9(ggaVar2, str2, arrayList, (byte) 10));
                } else {
                    ggaVar2.r = 1;
                }
                ggaVar2.e.g(str2, false, false, true, false, sd2.T(ggaVar2.n) ? ggaVar2.n.id : 0L, false, 2, 1);
                break;
        }
    }
}
