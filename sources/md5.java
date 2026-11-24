// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class md5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ od5 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ md5(od5 od5Var, String str, int i, byte b) {
        this.a = b;
        this.b = od5Var;
        this.c = str;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = null;
        switch (this.a) {
            case 0:
                od5 od5Var = this.b;
                String str = this.c;
                int i = this.d;
                if (od5Var.e != null) {
                    od5Var.e = null;
                    gm.c3(new md5(od5Var, str, i, (byte) 1));
                    break;
                }
                break;
            default:
                od5 od5Var2 = this.b;
                String str2 = this.c;
                int i2 = this.d;
                od5Var2.e = null;
                if (!sd2.T(od5Var2.x.P1) && od5Var2.x.Q1 != null) {
                    arrayList = new ArrayList(od5Var2.x.Q1.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.g.c(new up6((Object) od5Var2, (Object) str2, i2, (Object) arrayList2, (byte) 27));
                } else {
                    od5Var2.h = false;
                }
                od5Var2.d.g(str2, sd2.w(3, od5Var2.x.P1), false, true, false, sd2.T(od5Var2.x.P1) ? od5Var2.x.P1.id : 0L, false, 2, i2);
                break;
        }
    }
}
