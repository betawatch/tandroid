package kc;

import java.io.IOException;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class j extends Exception {
    public final h a;

    public j(String str) {
        super(str);
        this.a = h.f;
    }

    public final h a() {
        return this.a;
    }

    public j(String str, IOException iOException) {
        super(str, iOException);
        this.a = h.n;
    }
}
