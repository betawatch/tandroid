package j2;

import java.io.IOException;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
