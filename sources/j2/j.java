package j2;

import java.io.IOException;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
