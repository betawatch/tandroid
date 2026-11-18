package ki;

import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ a(k kVar, int i7) {
        this.a = i7;
        this.b = kVar;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new kg.h0(6, this.b, (TLRPC.UserFull) obj));
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
