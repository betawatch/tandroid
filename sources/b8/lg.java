package b8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class lg implements ta.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ n5.q b;

    public /* synthetic */ lg(n5.q qVar, int i3) {
        this.a = i3;
        this.b = qVar;
    }

    @Override // ta.b
    public final Object get() {
        switch (this.a) {
            case 0:
                return this.b.a("FIREBASE_ML_SDK", new k5.c("json"), pg.e);
            case 1:
                return this.b.a("FIREBASE_ML_SDK", new k5.c("proto"), pg.d);
            case 2:
                return this.b.a("FIREBASE_ML_SDK", new k5.c("json"), x7.e9.e);
            case 3:
                return this.b.a("FIREBASE_ML_SDK", new k5.c("proto"), x7.e9.d);
            case 4:
                return this.b.a("FIREBASE_ML_SDK", new k5.c("json"), y7.qa.e);
            case 5:
                return this.b.a("FIREBASE_ML_SDK", new k5.c("proto"), y7.qa.d);
            case 6:
                return this.b.a("FIREBASE_ML_SDK", new k5.c("json"), z7.ga.e);
            default:
                return this.b.a("FIREBASE_ML_SDK", new k5.c("proto"), z7.ga.d);
        }
    }
}
