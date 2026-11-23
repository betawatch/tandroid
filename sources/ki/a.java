package ki;

import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ a(j jVar, int i7) {
        this.a = i7;
        this.b = jVar;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new ji.i(8, this.b, (TLRPC.UserFull) obj));
                break;
            case 1:
                j jVar = this.b;
                jVar.b0.commission_permille = ((Integer) obj).intValue();
                jVar.L0();
                break;
            default:
                j jVar2 = this.b;
                jVar2.b0.duration_months = ((Integer) jVar2.d0.get(((Integer) obj).intValue())).intValue();
                jVar2.L0();
                break;
        }
    }
}
