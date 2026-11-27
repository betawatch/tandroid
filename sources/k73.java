// default package

import java.io.IOException;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
