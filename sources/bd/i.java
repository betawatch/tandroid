package bd;

import java.io.IOException;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class i extends Exception {
    public final g a;

    public i(String str) {
        super(str);
        this.a = g.f;
    }

    public final g a() {
        return this.a;
    }

    public i(String str, IOException iOException) {
        super(str, iOException);
        this.a = g.n;
    }
}
