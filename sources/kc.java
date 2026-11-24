// default package

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class kc implements Executor {
    public final /* synthetic */ byte a;

    public /* synthetic */ kc(byte b) {
        this.a = b;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                gm.c3(runnable);
                break;
            case 1:
                runnable.run();
                break;
        }
    }

    private final void a(Runnable runnable) {
    }
}
