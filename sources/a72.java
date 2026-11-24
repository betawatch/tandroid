// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class a72 implements m52, ee {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qac b;

    public /* synthetic */ a72(qac qacVar, byte b) {
        this.a = b;
        this.b = qacVar;
    }

    @Override // m52
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        this.b.a(new uf8(messageMedia));
    }

    @Override // ee
    public final void r(he heVar, int i) {
        byte b = this.a;
        qac qacVar = this.b;
        switch (b) {
            case 1:
                if (qacVar != null) {
                    qacVar.a(Boolean.FALSE);
                    break;
                }
                break;
            default:
                qacVar.a(heVar.g(i, true, true));
                break;
        }
    }
}
