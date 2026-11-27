// default package

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class no3 implements Executor {
    public static final no3 b = new no3(0);
    public static final /* synthetic */ no3 c = new no3(1);
    public static final /* synthetic */ no3 d = new no3(2);
    public static final /* synthetic */ no3 e = new no3(3);
    public final /* synthetic */ byte a;

    public /* synthetic */ no3(byte b2) {
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
