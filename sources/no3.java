// default package

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
