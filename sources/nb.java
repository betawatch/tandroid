// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nb implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bc b;

    public /* synthetic */ nb(bc bcVar, byte b) {
        this.a = b;
        this.b = bcVar;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        bc bcVar = this.b;
        switch (b) {
            case 0:
                gl.d3(new ee2(bcVar, (TLRPC.UserFull) obj, (byte) 22));
                break;
            case 1:
                bcVar.b0.commission_permille = ((Integer) obj).intValue();
                bcVar.K0();
                break;
            default:
                bcVar.b0.duration_months = ((Integer) bcVar.d0.get(((Integer) obj).intValue())).intValue();
                bcVar.K0();
                break;
        }
    }
}
