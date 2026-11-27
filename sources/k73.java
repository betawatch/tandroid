// default package

import java.io.IOException;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class k73 extends IOException {
    public final int a;

    public k73(int i) {
        this.a = i;
    }

    public k73(Exception exc, int i) {
        super(exc);
        this.a = i;
    }

    public k73(String str, int i) {
        super(str);
        this.a = i;
    }

    public k73(String str, Exception exc, int i) {
        super(str, exc);
        this.a = i;
    }
}
