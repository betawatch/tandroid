package d3;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
