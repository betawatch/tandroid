package j$.time.chrono;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class f extends a implements Serializable {
    public static final f a = new f();

    private f() {
    }

    public static boolean f(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }
}
