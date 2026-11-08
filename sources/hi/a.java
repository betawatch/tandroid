package hi;

import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ a(j jVar, int i7) {
        this.a = i7;
        this.b = jVar;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new ha.b(1, this.b, (TLRPC.UserFull) obj));
                break;
            case 1:
                j jVar = this.b;
                jVar.a0.commission_permille = ((Integer) obj).intValue();
                jVar.L0();
                break;
            default:
                j jVar2 = this.b;
                jVar2.a0.duration_months = ((Integer) jVar2.c0.get(((Integer) obj).intValue())).intValue();
                jVar2.L0();
                break;
        }
    }
}
