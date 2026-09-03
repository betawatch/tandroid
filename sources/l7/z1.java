package l7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class z1 implements u9.d {
    public static final z1 a = new z1();
    public static final u9.c b = new u9.c("errorCode", w.c.h(l.d.o(h0.class, new e0(1))));
    public static final u9.c c = new u9.c("isColdCall", w.c.h(l.d.o(h0.class, new e0(2))));
    public static final u9.c d = new u9.c("imageInfo", w.c.h(l.d.o(h0.class, new e0(3))));
    public static final u9.c e = new u9.c("detectorOptions", w.c.h(l.d.o(h0.class, new e0(4))));

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        x0 x0Var = (x0) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(b, x0Var.a);
        eVar.e(c, x0Var.b);
        eVar.e(d, null);
        eVar.e(e, x0Var.c);
    }
}
