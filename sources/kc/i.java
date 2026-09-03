package kc;

import java.io.IOException;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class i extends Exception {
    public final g a;

    public i(String str) {
        super(str);
        this.a = g.f;
    }

    public final g a() {
        return this.a;
    }

    public i(String str, IOException iOException) {
        super(str, iOException);
        this.a = g.n;
    }
}
