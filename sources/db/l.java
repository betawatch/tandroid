package db;

import d2.t1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l {
    public final ta.b a;

    public l(ta.b transportFactoryProvider) {
        kotlin.jvm.internal.j.e(transportFactoryProvider, "transportFactoryProvider");
        this.a = transportFactoryProvider;
    }

    public final void a(o0 o0Var) {
        ((n5.q) ((k5.f) this.a.get())).a("FIREBASE_APPQUALITY_SESSION", new k5.c("json"), new t1(this)).a(k5.a.a(o0Var), new l2.d(27));
    }
}
