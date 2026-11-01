package g2;

import java.io.IOException;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public class k extends IOException {
    public final int a;

    public k(int i10) {
        this.a = i10;
    }

    public k(Exception exc, int i10) {
        super(exc);
        this.a = i10;
    }

    public k(String str, int i10) {
        super(str);
        this.a = i10;
    }

    public k(String str, Exception exc, int i10) {
        super(str, exc);
        this.a = i10;
    }
}
