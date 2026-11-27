// default package

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class m62 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pcc b;

    public /* synthetic */ m62(pcc pccVar, byte b) {
        this.a = b;
        this.b = pccVar;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        pcc pccVar = this.b;
        switch (b) {
            case 0:
                pccVar.a(new eh8((String) obj));
                break;
            case 1:
                avc avcVar = (avc) obj;
                if (avcVar != null) {
                    pccVar.a(avcVar);
                    break;
                }
                break;
            case 2:
                String str = (String) obj;
                a55.m("disconnect session", str);
                pccVar.a(str);
                break;
            case 3:
                int[] iArr = (int[]) obj;
                boolean z = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z = true;
                }
                pccVar.a(Boolean.valueOf(z));
                break;
            case 4:
                pccVar.a((TL_stars.StarGift) obj);
                break;
            default:
                pccVar.a((Boolean) obj);
                break;
        }
    }
}
