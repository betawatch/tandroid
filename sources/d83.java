// default package

import java.io.IOException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class d83 extends IOException {
    public final int a;

    public d83(int i) {
        this.a = i;
    }

    public d83(Exception exc, int i) {
        super(exc);
        this.a = i;
    }

    public d83(String str, int i) {
        super(str);
        this.a = i;
    }

    public d83(String str, Exception exc, int i) {
        super(str, exc);
        this.a = i;
    }
}
