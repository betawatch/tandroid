package ki;

import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ a(k kVar, int i7) {
        this.a = i7;
        this.b = kVar;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new kg.t1(3, this.b, (TLRPC.UserFull) obj));
                break;
            case 1:
                k kVar = this.b;
                kVar.b0.commission_permille = ((Integer) obj).intValue();
                kVar.L0();
                break;
            default:
                k kVar2 = this.b;
                kVar2.b0.duration_months = ((Integer) kVar2.d0.get(((Integer) obj).intValue())).intValue();
                kVar2.L0();
                break;
        }
    }
}
