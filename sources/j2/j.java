package j2;

import java.io.IOException;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class j extends IOException {
    public final int a;

    public j(int i7) {
        this.a = i7;
    }

    public j(Exception exc, int i7) {
        super(exc);
        this.a = i7;
    }

    public j(String str, int i7) {
        super(str);
        this.a = i7;
    }

    public j(String str, Exception exc, int i7) {
        super(str, exc);
        this.a = i7;
    }
}
