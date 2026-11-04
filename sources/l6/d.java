package l6;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Executor {
    public static final /* synthetic */ d b = new d(0);
    public static final /* synthetic */ d c = new d(1);
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i3) {
        this.a = i3;
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
