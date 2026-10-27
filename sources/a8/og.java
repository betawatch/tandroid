package a8;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class og implements ra.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ m5.r b;

    public /* synthetic */ og(m5.r rVar, int i10) {
        this.a = i10;
        this.b = rVar;
    }

    @Override // ra.b
    public final Object get() {
        switch (this.a) {
            case 0:
                return this.b.a("FIREBASE_ML_SDK", new j5.c("json"), sg.e);
            case 1:
                return this.b.a("FIREBASE_ML_SDK", new j5.c("proto"), sg.d);
            case 2:
                return this.b.a("FIREBASE_ML_SDK", new j5.c("json"), w7.g9.e);
            case 3:
                return this.b.a("FIREBASE_ML_SDK", new j5.c("proto"), w7.g9.d);
            case 4:
                return this.b.a("FIREBASE_ML_SDK", new j5.c("json"), x7.qa.e);
            case 5:
                return this.b.a("FIREBASE_ML_SDK", new j5.c("proto"), x7.qa.d);
            case 6:
                return this.b.a("FIREBASE_ML_SDK", new j5.c("json"), y7.fa.e);
            default:
                return this.b.a("FIREBASE_ML_SDK", new j5.c("proto"), y7.fa.d);
        }
    }
}
