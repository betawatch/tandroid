package f7;

import g7.oa;
import h7.na;
import j7.zf;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class e9 implements x9.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ w2.o b;

    public /* synthetic */ e9(w2.o oVar, int i9) {
        this.a = i9;
        this.b = oVar;
    }

    @Override // x9.b
    public final Object get() {
        switch (this.a) {
            case 0:
                return this.b.a("FIREBASE_ML_SDK", new t2.c("json"), h9.e);
            case 1:
                return this.b.a("FIREBASE_ML_SDK", new t2.c("proto"), h9.d);
            case 2:
                return this.b.a("FIREBASE_ML_SDK", new t2.c("json"), oa.e);
            case 3:
                return this.b.a("FIREBASE_ML_SDK", new t2.c("proto"), oa.d);
            case 4:
                return this.b.a("FIREBASE_ML_SDK", new t2.c("json"), na.e);
            case 5:
                return this.b.a("FIREBASE_ML_SDK", new t2.c("proto"), na.d);
            case 6:
                return this.b.a("FIREBASE_ML_SDK", new t2.c("json"), zf.e);
            default:
                return this.b.a("FIREBASE_ML_SDK", new t2.c("proto"), zf.d);
        }
    }
}
