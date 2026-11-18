package a8;

import c8.xf;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ya implements ua.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5.q b;

    public /* synthetic */ ya(o5.q qVar, int i7) {
        this.a = i7;
        this.b = qVar;
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
                return this.b.a("FIREBASE_ML_SDK", new l5.c("json"), y7.g9.e);
            case 5:
                return this.b.a("FIREBASE_ML_SDK", new l5.c("proto"), y7.g9.d);
            case 6:
                return this.b.a("FIREBASE_ML_SDK", new l5.c("json"), z7.qa.e);
            default:
                return this.b.a("FIREBASE_ML_SDK", new l5.c("proto"), z7.qa.d);
        }
    }
}
