package c8;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class wd {
    public static final Exception a(x0.a aVar, String str, Exception exc) {
        if (exc instanceof y0.a) {
            return new y0.a(aVar, str);
        }
        if (exc instanceof y0.b) {
            return new y0.b(aVar, str);
        }
        throw new z0.a();
    }
}
