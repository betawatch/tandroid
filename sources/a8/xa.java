package a8;

import c8.xf;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class xa implements ua.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5.q b;

    public /* synthetic */ xa(o5.q qVar, int i7) {
        this.a = i7;
        this.b = qVar;
    }

    @Override // ua.b
    public final Object get() {
        switch (this.a) {
            case 0:
                return this.b.a("FIREBASE_ML_SDK", new l5.c("json"), bb.e);
            case 1:
                return this.b.a("FIREBASE_ML_SDK", new l5.c("proto"), bb.d);
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
