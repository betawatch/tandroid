// default package

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class lr2 implements ThreadFactory {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    public /* synthetic */ lr2(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 0:
                Thread thread = new Thread(runnable, str);
                thread.setPriority(10);
                return thread;
            default:
                return new Thread(runnable, str);
        }
    }
}
