// default package

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class ic implements Executor {
    public final /* synthetic */ byte a;

    public /* synthetic */ ic(byte b) {
        this.a = b;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                hl.c3(runnable);
                break;
            case 1:
                runnable.run();
                break;
        }
    }

    private final void a(Runnable runnable) {
    }
}
