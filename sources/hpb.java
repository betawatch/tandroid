// default package

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
