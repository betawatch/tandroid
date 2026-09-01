package g5;

import java.io.IOException;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
