package j2;

import java.io.IOException;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
