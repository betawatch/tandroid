// default package

import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hpc implements k8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qpc b;
    public final /* synthetic */ c c;
    public final /* synthetic */ long d;

    public /* synthetic */ hpc(qpc qpcVar, c cVar, long j, byte b) {
        this.a = b;
        this.b = qpcVar;
        this.c = cVar;
        this.d = j;
    }

    @Override // k8c
    public final void a(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        final qpc qpcVar = this.b;
        switch (b) {
            case 0:
                final p8c p8cVar = (p8c) obj3;
                final byte b2 = 0;
                this.c.l0(qpcVar.f, qpcVar.h, this.d, (String) obj, ((Boolean) obj2).booleanValue() ? qpcVar.m0() : null, null, qpcVar.n, new p8c() { // from class: jpc
                    @Override // p8c
                    public final void a(Object obj4) {
                        byte b3 = b2;
                        byte b4 = 4;
                        p8c p8cVar2 = p8cVar;
                        qpc qpcVar2 = qpcVar;
                        String str = (String) obj4;
                        qpcVar2.getClass();
                        switch (b3) {
                            case 0:
                                p8cVar2.a(str);
                                if (!c.K(str) && str == null) {
                                    qpcVar2.fragmentView.postDelayed(new dpc(qpcVar2, b4), 220L);
                                    break;
                                }
                                break;
                            default:
                                p8cVar2.a(str);
                                if (!c.K(str) && str == null) {
                                    qpcVar2.fragmentView.postDelayed(new dpc(qpcVar2, b4), 220L);
                                    break;
                                }
                                break;
                        }
                    }
                }, new gpc(qpcVar, (byte) 2));
                break;
            default:
                String str = (String) obj;
                final p8c p8cVar2 = (p8c) obj3;
                final byte b3 = 1;
                this.c.l0(qpcVar.f, qpcVar.h, this.d, str, ((Boolean) obj2).booleanValue() ? qpcVar.m0() : null, null, qpcVar.n, new p8c() { // from class: jpc
                    @Override // p8c
                    public final void a(Object obj4) {
                        byte b32 = b3;
                        byte b4 = 4;
                        p8c p8cVar22 = p8cVar2;
                        qpc qpcVar2 = qpcVar;
                        String str2 = (String) obj4;
                        qpcVar2.getClass();
                        switch (b32) {
                            case 0:
                                p8cVar22.a(str2);
                                if (!c.K(str2) && str2 == null) {
                                    qpcVar2.fragmentView.postDelayed(new dpc(qpcVar2, b4), 220L);
                                    break;
                                }
                                break;
                            default:
                                p8cVar22.a(str2);
                                if (!c.K(str2) && str2 == null) {
                                    qpcVar2.fragmentView.postDelayed(new dpc(qpcVar2, b4), 220L);
                                    break;
                                }
                                break;
                        }
                    }
                }, new gpc(qpcVar, (byte) 3));
                break;
        }
    }
}
