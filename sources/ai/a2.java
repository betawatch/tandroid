package ai;

import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a2(int i10, int i11, int i12, long j3, Object obj) {
        this.a = i12;
        this.e = obj;
        this.b = i10;
        this.c = j3;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                d2 d2Var = (d2) this.e;
                HashMap hashMap = d2Var.F;
                int i10 = this.b;
                long j3 = this.c;
                if (i10 == 0) {
                    str = a4.a.p(j3, "");
                } else {
                    str = i10 + "_" + j3 + "_" + this.d;
                }
                Integer num = (Integer) hashMap.get(str);
                if (num != null) {
                    AccountInstance.getInstance(d2Var.e).getConnectionsManager().cancelRequest(num.intValue(), true);
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
