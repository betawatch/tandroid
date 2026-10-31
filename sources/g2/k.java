package g2;

import java.io.IOException;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class k extends IOException {
    public final int a;

    public k(int i10) {
        this.a = i10;
    }

    public k(Exception exc, int i10) {
        super(exc);
        this.a = i10;
    }

    public k(String str, int i10) {
        super(str);
        this.a = i10;
    }

    public k(String str, Exception exc, int i10) {
        super(str, exc);
        this.a = i10;
    }
}
