package j7;

import k7.oa;
import n7.ag;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class e9 implements ba.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ y2.o b;

    public /* synthetic */ e9(y2.o oVar, int i10) {
        this.a = i10;
        this.b = oVar;
    }

    @Override // ba.b
    public final Object get() {
        switch (this.a) {
            case 0:
                return this.b.a("FIREBASE_ML_SDK", new v2.c("json"), h9.e);
            case 1:
                return this.b.a("FIREBASE_ML_SDK", new v2.c("proto"), h9.d);
            case 2:
                return this.b.a("FIREBASE_ML_SDK", new v2.c("json"), oa.e);
            case 3:
                return this.b.a("FIREBASE_ML_SDK", new v2.c("proto"), oa.d);
            case 4:
                return this.b.a("FIREBASE_ML_SDK", new v2.c("json"), l7.oa.e);
            case 5:
                return this.b.a("FIREBASE_ML_SDK", new v2.c("proto"), l7.oa.d);
            case 6:
                return this.b.a("FIREBASE_ML_SDK", new v2.c("json"), ag.e);
            default:
                return this.b.a("FIREBASE_ML_SDK", new v2.c("proto"), ag.d);
        }
    }
}
