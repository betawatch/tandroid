package a8;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
