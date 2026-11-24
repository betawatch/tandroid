// default package

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class mjd {
    public static final mjd d = new mjd();
    public final Runnable a;
    public final Executor b;
    public mjd c;

    public mjd() {
        this.a = null;
        this.b = null;
    }

    public mjd(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
