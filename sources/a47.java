// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class a47 implements sm {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a47(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // sm
    public final void a(TLRPC.Document document) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                gm.c3(new lj6(obj, (Object) document, (byte) 21));
                break;
            case 1:
                gm.c3(new jx8((tx8) obj, document));
                break;
            default:
                gm.c3(new uva((s1b) obj, document, (byte) 4));
                break;
        }
    }
}
