package j2;

import java.io.IOException;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
