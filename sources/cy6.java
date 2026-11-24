// default package

import android.text.TextUtils;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class cy6 implements ky6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ly6 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cy6(ly6 ly6Var, Object obj, byte b) {
        this.a = b;
        this.b = ly6Var;
        this.c = obj;
    }

    @Override // ky6
    public final void a(sw6 sw6Var) {
        byte b = this.a;
        Object obj = this.c;
        ly6 ly6Var = this.b;
        switch (b) {
            case 0:
                tx6 tx6Var = ly6Var.j;
                tx6Var.t();
                ((un2) obj).e(tx6Var.t);
                break;
            default:
                String str = ((ks6) obj).a;
                if (TextUtils.isEmpty(str)) {
                    ncd.f("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    break;
                } else {
                    tx6 tx6Var2 = ly6Var.j;
                    tx6Var2.t();
                    cf8 cf8Var = tx6Var2.t;
                    if (cf8Var.m0(17)) {
                        bqb y0 = cf8Var.y0();
                        aqb aqbVar = new aqb();
                        for (int i = 0; i < y0.o(); i++) {
                            if (TextUtils.equals(y0.m(i, aqbVar, 0L).b.a, str)) {
                                cf8Var.O(i);
                                break;
                            }
                        }
                        break;
                    } else {
                        ncd.f("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                        break;
                    }
                }
        }
    }
}
