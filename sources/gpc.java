// default package

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class gpc implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qpc b;

    public /* synthetic */ gpc(qpc qpcVar, byte b) {
        this.a = b;
        this.b = qpcVar;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        qpc qpcVar = this.b;
        switch (b) {
            case 0:
                qpcVar.q0((String) obj);
                break;
            case 1:
                qpcVar.r0 = (TL_wallet.walletTransaction) obj;
                break;
            case 2:
                qpcVar.r0 = (TL_wallet.walletTransaction) obj;
                break;
            default:
                qpcVar.r0 = (TL_wallet.walletTransaction) obj;
                break;
        }
    }
}
