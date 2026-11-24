// default package

import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class jrc implements lac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rrc b;
    public final /* synthetic */ c c;
    public final /* synthetic */ long d;

    public /* synthetic */ jrc(rrc rrcVar, c cVar, long j, byte b) {
        this.a = b;
        this.b = rrcVar;
        this.c = cVar;
        this.d = j;
    }

    @Override // lac
    public final void a(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        final rrc rrcVar = this.b;
        switch (b) {
            case 0:
                final qac qacVar = (qac) obj3;
                final byte b2 = 0;
                this.c.l0(rrcVar.f, rrcVar.h, this.d, (String) obj, ((Boolean) obj2).booleanValue() ? rrcVar.n0() : null, null, rrcVar.n, new qac() { // from class: lrc
                    @Override // qac
                    public final void a(Object obj4) {
                        byte b3 = b2;
                        byte b4 = 4;
                        qac qacVar2 = qacVar;
                        rrc rrcVar2 = rrcVar;
                        String str = (String) obj4;
                        rrcVar2.getClass();
                        switch (b3) {
                            case 0:
                                qacVar2.a(str);
                                if (!c.K(str) && str == null) {
                                    rrcVar2.fragmentView.postDelayed(new frc(rrcVar2, b4), 220L);
                                    break;
                                }
                                break;
                            default:
                                qacVar2.a(str);
                                if (!c.K(str) && str == null) {
                                    rrcVar2.fragmentView.postDelayed(new frc(rrcVar2, b4), 220L);
                                    break;
                                }
                                break;
                        }
                    }
                }, new irc(rrcVar, (byte) 2));
                break;
            default:
                String str = (String) obj;
                final qac qacVar2 = (qac) obj3;
                final byte b3 = 1;
                this.c.l0(rrcVar.f, rrcVar.h, this.d, str, ((Boolean) obj2).booleanValue() ? rrcVar.n0() : null, null, rrcVar.n, new qac() { // from class: lrc
                    @Override // qac
                    public final void a(Object obj4) {
                        byte b32 = b3;
                        byte b4 = 4;
                        qac qacVar22 = qacVar2;
                        rrc rrcVar2 = rrcVar;
                        String str2 = (String) obj4;
                        rrcVar2.getClass();
                        switch (b32) {
                            case 0:
                                qacVar22.a(str2);
                                if (!c.K(str2) && str2 == null) {
                                    rrcVar2.fragmentView.postDelayed(new frc(rrcVar2, b4), 220L);
                                    break;
                                }
                                break;
                            default:
                                qacVar22.a(str2);
                                if (!c.K(str2) && str2 == null) {
                                    rrcVar2.fragmentView.postDelayed(new frc(rrcVar2, b4), 220L);
                                    break;
                                }
                                break;
                        }
                    }
                }, new irc(rrcVar, (byte) 3));
                break;
        }
    }
}
