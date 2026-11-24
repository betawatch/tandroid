// default package

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class h72 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qac b;

    public /* synthetic */ h72(qac qacVar, byte b) {
        this.a = b;
        this.b = qacVar;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        qac qacVar = this.b;
        switch (b) {
            case 0:
                qacVar.a(new sf8((String) obj));
                break;
            case 1:
                osc oscVar = (osc) obj;
                if (oscVar != null) {
                    qacVar.a(oscVar);
                    break;
                }
                break;
            case 2:
                String str = (String) obj;
                w45.m("disconnect session", str);
                qacVar.a(str);
                break;
            case 3:
                int[] iArr = (int[]) obj;
                boolean z = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z = true;
                }
                qacVar.a(Boolean.valueOf(z));
                break;
            case 4:
                qacVar.a((TL_stars.StarGift) obj);
                break;
            default:
                qacVar.a((Boolean) obj);
                break;
        }
    }
}
