package d3;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Executor {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i7) {
        this.a = i7;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                org.telegram.messenger.g0.h3(runnable);
                break;
            case 2:
                org.telegram.messenger.g0.h3(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }

    private final void a(Runnable runnable) {
    }
}
