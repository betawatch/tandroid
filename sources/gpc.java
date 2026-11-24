// default package

import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
