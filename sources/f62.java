// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class f62 implements r42, fd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pcc b;

    public /* synthetic */ f62(pcc pccVar, byte b) {
        this.a = b;
        this.b = pccVar;
    }

    @Override // r42
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        this.b.a(new gh8(messageMedia));
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        pcc pccVar = this.b;
        switch (b) {
            case 1:
                if (pccVar != null) {
                    pccVar.a(Boolean.FALSE);
                    break;
                }
                break;
            default:
                pccVar.a(idVar.g(i, true, true));
                break;
        }
    }
}
