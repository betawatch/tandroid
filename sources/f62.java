// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
