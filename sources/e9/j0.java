package e9;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class j0 {
    public final Object a;
    public final Object b;
    public final Object c;

    public j0(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.a;
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.b);
        sb2.append(" and ");
        sb2.append(obj);
        sb2.append("=");
        sb2.append(this.c);
        return new IllegalArgumentException(sb2.toString());
    }
}
