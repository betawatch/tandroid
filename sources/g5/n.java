package g5;

import java.io.IOException;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class n extends IOException {
    public static final /* synthetic */ int b = 0;
    public final int a;

    public n(int i10) {
        this.a = i10;
    }

    public n(Exception exc, int i10) {
        super(exc);
        this.a = i10;
    }

    public n(String str, int i10) {
        super(str);
        this.a = i10;
    }

    public n(String str, Exception exc, int i10) {
        super(str, exc);
        this.a = i10;
    }
}
