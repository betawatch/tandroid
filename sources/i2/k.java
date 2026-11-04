package i2;

import java.io.IOException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class k extends IOException {
    public final int a;

    public k(int i3) {
        this.a = i3;
    }

    public k(Exception exc, int i3) {
        super(exc);
        this.a = i3;
    }

    public k(String str, int i3) {
        super(str);
        this.a = i3;
    }

    public k(String str, Exception exc, int i3) {
        super(str, exc);
        this.a = i3;
    }
}
