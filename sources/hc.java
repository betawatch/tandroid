// default package

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class hc implements Executor {
    public final /* synthetic */ byte a;

    public /* synthetic */ hc(byte b) {
        this.a = b;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                gl.c3(runnable);
                break;
            case 1:
                runnable.run();
                break;
        }
    }

    private final void a(Runnable runnable) {
    }
}
