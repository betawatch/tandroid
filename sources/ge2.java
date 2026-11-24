// default package

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class ge2 implements Executor {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ge2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((co3) obj).c(runnable);
                break;
            case 1:
                ((cdb) obj).e(runnable);
                break;
            case 2:
                ((rx4) obj).post(runnable);
                break;
            case 3:
                g8c.X(((tv6) obj).l, runnable);
                break;
            case 4:
                ((lw6) obj).m0(runnable);
                break;
            case 5:
                ((ox6) obj).R(runnable);
                break;
            case 6:
                ((ao9) obj).b.post(runnable);
                break;
            default:
                ((do3) obj).postRunnable(runnable);
                break;
        }
    }
}
