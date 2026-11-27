// default package

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hpb implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pqb b;

    public /* synthetic */ hpb(pqb pqbVar, byte b) {
        this.a = b;
        this.b = pqbVar;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        pqb pqbVar = this.b;
        switch (b) {
            case 0:
                pqbVar.p1 = ((Float) obj).floatValue();
                pqbVar.z0.invalidate();
                pqbVar.X0();
                break;
            case 1:
                pqbVar.X1 = (TL_stories.TL_premium_boostsStatus) obj;
                pqbVar.W1 = true;
                pqbVar.m1(true);
                pqbVar.V1 = false;
                break;
            default:
                pqbVar.Y0((wg1) obj);
                break;
        }
    }
}
