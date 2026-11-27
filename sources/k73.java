// default package

import java.io.IOException;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
