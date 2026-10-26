package g2;

import java.io.IOException;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class j extends IOException {
    public final int a;

    public j(int i10) {
        this.a = i10;
    }

    public j(Exception exc, int i10) {
        super(exc);
        this.a = i10;
    }

    public j(String str, int i10) {
        super(str);
        this.a = i10;
    }

    public j(String str, Exception exc, int i10) {
        super(str, exc);
        this.a = i10;
    }
}
