package m6;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Executor {
    public static final /* synthetic */ d b = new d(0);
    public static final /* synthetic */ d c = new d(1);
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i7) {
        this.a = i7;
    }

    @Override // java.util.concurrent.Executor
    public final /* synthetic */ void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
