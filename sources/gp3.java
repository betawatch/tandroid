// default package

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gp3 implements Executor {
    public static final gp3 b = new gp3(0);
    public static final /* synthetic */ gp3 c = new gp3(1);
    public static final /* synthetic */ gp3 d = new gp3(2);
    public static final /* synthetic */ gp3 e = new gp3(3);
    public final /* synthetic */ byte a;

    public /* synthetic */ gp3(byte b2) {
        this.a = b2;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
