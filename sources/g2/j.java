package g2;

import java.io.IOException;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
