package g2;

import java.io.IOException;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public class j extends IOException {
    public static final /* synthetic */ int b = 0;
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
