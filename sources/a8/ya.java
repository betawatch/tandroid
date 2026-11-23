package a8;

import c8.xf;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class ya implements ua.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5.r b;

    public /* synthetic */ ya(o5.r rVar, int i7) {
        this.a = i7;
        this.b = rVar;
    }

    @Override // ua.b
    public final Object get() {
        switch (this.a) {
            case 0:
                return this.b.a("FIREBASE_ML_SDK", new l5.c("json"), cb.e);
            case 1:
                return this.b.a("FIREBASE_ML_SDK", new l5.c("proto"), cb.d);
            case 2:
                return this.b.a("FIREBASE_ML_SDK", new l5.c("json"), xf.e);
            case 3:
                return this.b.a("FIREBASE_ML_SDK", new l5.c("proto"), xf.d);
            case 4:
                return this.b.a("FIREBASE_ML_SDK", new l5.c("json"), y7.h9.e);
            case 5:
                return this.b.a("FIREBASE_ML_SDK", new l5.c("proto"), y7.h9.d);
            case 6:
                return this.b.a("FIREBASE_ML_SDK", new l5.c("json"), z7.qa.e);
            default:
                return this.b.a("FIREBASE_ML_SDK", new l5.c("proto"), z7.qa.d);
        }
    }
}
