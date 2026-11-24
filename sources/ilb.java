// default package

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ilb implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qmb b;

    public /* synthetic */ ilb(qmb qmbVar, byte b) {
        this.a = b;
        this.b = qmbVar;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        qmb qmbVar = this.b;
        switch (b) {
            case 0:
                qmbVar.p1 = ((Float) obj).floatValue();
                qmbVar.z0.invalidate();
                qmbVar.W0();
                break;
            case 1:
                qmbVar.X1 = (TL_stories.TL_premium_boostsStatus) obj;
                qmbVar.W1 = true;
                qmbVar.l1(true);
                qmbVar.V1 = false;
                break;
            default:
                qmbVar.X0((ng1) obj);
                break;
        }
    }
}
