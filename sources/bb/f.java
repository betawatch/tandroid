package bb;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class f implements ka.d {
    public static final f a = new f();
    public static final ka.c b = ka.c.c("processName");
    public static final ka.c c = ka.c.c("pid");
    public static final ka.c d = ka.c.c("importance");
    public static final ka.c e = ka.c.c("defaultProcess");

    @Override // ka.a
    public final void a(Object obj, Object obj2) {
        q qVar = (q) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(b, qVar.a);
        eVar.e(c, qVar.b);
        eVar.e(d, qVar.c);
        eVar.d(e, qVar.d);
    }
}
