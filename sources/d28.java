// default package

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class d28 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TL_stars.TL_starGiftUnique b;
    public final /* synthetic */ long c;
    public final /* synthetic */ jm7 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d28(jm7 jm7Var, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, Object obj2, byte b) {
        this.a = b;
        this.d = jm7Var;
        this.e = obj;
        this.b = tL_starGiftUnique;
        this.c = j;
        this.f = obj2;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        jm7 jm7Var = this.d;
        switch (b) {
            case 0:
                ((d38) jm7Var).H0((boolean[]) obj4, this.b, this.c, (a28) obj3, (yra) obj, (k11) obj2);
                break;
            default:
                wsa wsaVar = (wsa) jm7Var;
                fw4 fw4Var = (fw4) obj3;
                ((k11) obj4).b();
                if (((Boolean) obj).booleanValue()) {
                    ira iraVar = wsaVar.M2;
                    if (iraVar != null) {
                        iraVar.a(this.b, this.c, fw4Var != null);
                    }
                    if (fw4Var != null) {
                        gm.c3(new yv4(fw4Var, (byte) 3));
                        wsaVar.O0 = true;
                    }
                    wsaVar.dismiss();
                    break;
                }
                break;
        }
    }
}
