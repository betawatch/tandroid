// default package

import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class dp1 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dp1(Object obj, long j, long j2, Long l, byte b) {
        this.a = b;
        this.e = obj;
        this.b = j;
        this.c = j2;
        this.d = l;
    }

    @Override // qac
    public final void a(Object obj) {
        int i;
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                ((yv1) obj2).S9(this.b, this.c, this.d, (Boolean) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                i = ((d) ((nr1) obj2).b).currentAccount;
                boolean z = false;
                jva v = jva.v(i, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z = true;
                }
                v.g0(this.b, this.c, z, true);
                break;
        }
    }
}
