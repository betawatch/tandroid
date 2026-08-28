package ih;

import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c1(int i9, int i10, int i11, long j10, Object obj) {
        this.a = i11;
        this.e = obj;
        this.b = i9;
        this.c = j10;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                f1 f1Var = (f1) this.e;
                HashMap hashMap = f1Var.B;
                int i9 = this.b;
                long j10 = this.c;
                if (i9 == 0) {
                    str = aa.d.m(j10, "");
                } else {
                    str = i9 + "_" + j10 + "_" + this.d;
                }
                Integer num = (Integer) hashMap.get(str);
                if (num != null) {
                    AccountInstance.getInstance(f1Var.e).getConnectionsManager().cancelRequest(num.intValue(), true);
                    hashMap.remove(str);
                    break;
                }
                break;
            default:
                ((VoIPService) this.e).lambda$createGroupInstance$76(this.b, this.c, this.d);
                break;
        }
    }
}
