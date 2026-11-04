package ii;

import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ a(k kVar, int i3) {
        this.a = i3;
        this.b = kVar;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new e(0, this.b, (TLRPC.UserFull) obj));
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
