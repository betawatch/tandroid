// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class lm implements sm {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vm b;

    public /* synthetic */ lm(vm vmVar, byte b) {
        this.a = b;
        this.b = vmVar;
    }

    @Override // sm
    public final void a(TLRPC.Document document) {
        byte b = this.a;
        vm vmVar = this.b;
        switch (b) {
            case 0:
                vmVar.e = document;
                vmVar.i(false);
                break;
            default:
                vmVar.e = document;
                vmVar.i(false);
                break;
        }
    }
}
