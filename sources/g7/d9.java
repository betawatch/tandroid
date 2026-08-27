package g7;

import h7.oa;
import i7.na;
import k7.zf;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class d9 implements y9.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ w2.o b;

    public /* synthetic */ d9(w2.o oVar, int i10) {
        this.a = i10;
        this.b = oVar;
    }

    @Override // y9.b
    public final Object get() {
        switch (this.a) {
            case 0:
                return this.b.a("FIREBASE_ML_SDK", new t2.c("json"), g9.e);
            case 1:
                return this.b.a("FIREBASE_ML_SDK", new t2.c("proto"), g9.d);
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
