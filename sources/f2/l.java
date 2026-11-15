package f2;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class l extends Exception {
    public l(j jVar) {
        this("Unhandled input format:", jVar);
    }

    public l(String str, j jVar) {
        super(str + " " + jVar);
    }
}
