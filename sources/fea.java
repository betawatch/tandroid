// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class fea implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gea b;
    public final /* synthetic */ String c;

    public /* synthetic */ fea(gea geaVar, String str, byte b) {
        this.a = b;
        this.b = geaVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = 1;
        switch (this.a) {
            case 0:
                gea geaVar = this.b;
                String str = this.c;
                geaVar.getClass();
                gl.c3(new fea(geaVar, str, b));
                break;
            default:
                gea geaVar2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                geaVar2.f = null;
                if (!hc2.T(geaVar2.n) && geaVar2.s.g1 != null) {
                    arrayList = new ArrayList(geaVar2.s.g1.participants.participants);
                }
                geaVar2.r = 2;
                if (arrayList != null) {
                    Utilities.g.c(new q3a(geaVar2, str2, arrayList, (byte) 7));
                } else {
                    geaVar2.r = 1;
                }
                geaVar2.e.g(str2, false, false, true, false, hc2.T(geaVar2.n) ? geaVar2.n.id : 0L, false, 2, 1);
                break;
        }
    }
}
