package h7;

import i7.oa;
import l7.zf;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class c9 implements z9.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ y2.o b;

    public /* synthetic */ c9(y2.o oVar, int i10) {
        this.a = i10;
        this.b = oVar;
    }

    @Override // z9.b
    public final Object get() {
        switch (this.a) {
            case 0:
                return this.b.a("FIREBASE_ML_SDK", new v2.c("json"), f9.e);
            case 1:
                return this.b.a("FIREBASE_ML_SDK", new v2.c("proto"), f9.d);
            case 2:
                return this.b.a("FIREBASE_ML_SDK", new v2.c("json"), oa.e);
            case 3:
                return this.b.a("FIREBASE_ML_SDK", new v2.c("proto"), oa.d);
            case 4:
                return this.b.a("FIREBASE_ML_SDK", new v2.c("json"), j7.oa.e);
            case 5:
                return this.b.a("FIREBASE_ML_SDK", new v2.c("proto"), j7.oa.d);
            case 6:
                return this.b.a("FIREBASE_ML_SDK", new v2.c("json"), zf.e);
            default:
                return this.b.a("FIREBASE_ML_SDK", new v2.c("proto"), zf.d);
        }
    }
}
