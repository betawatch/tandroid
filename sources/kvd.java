// default package

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class kvd {
    public static final kvd b;
    public static final kvd c;
    public final CancellationException a;

    static {
        if (a7f.d) {
            c = null;
            b = null;
        } else {
            c = new kvd(null);
            b = new kvd(null);
        }
    }

    public kvd(CancellationException cancellationException) {
        this.a = cancellationException;
    }
}
