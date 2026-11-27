// default package

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class kq7 implements ThreadFactory {
    public final /* synthetic */ byte a;
    public final ThreadFactory b;
    public final Serializable c;

    public kq7(vh0 vh0Var) {
        this.a = (byte) 1;
        this.b = Executors.defaultThreadFactory();
        this.c = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        byte b = this.a;
        byte b2 = 2;
        Serializable serializable = this.c;
        ThreadFactory threadFactory = this.b;
        switch (b) {
            case 0:
                Thread newThread = threadFactory.newThread(new ps9(runnable, b2));
                int andIncrement = ((AtomicInteger) serializable).getAndIncrement();
                StringBuilder sb = new StringBuilder(String.valueOf(andIncrement).length() + 14);
                sb.append("GAC_Executor[");
                sb.append(andIncrement);
                sb.append("]");
                newThread.setName(sb.toString());
                return newThread;
            case 1:
                Thread newThread2 = threadFactory.newThread(runnable);
                newThread2.setName("PlayBillingLibrary-" + ((AtomicInteger) serializable).getAndIncrement());
                return newThread2;
            default:
                Thread newThread3 = threadFactory.newThread(new ps9(runnable, b2));
                newThread3.setName((String) serializable);
                return newThread3;
        }
    }

    public kq7() {
        this.a = (byte) 0;
        this.c = new AtomicInteger();
        this.b = Executors.defaultThreadFactory();
    }

    public kq7(String str) {
        this.a = (byte) 2;
        this.b = Executors.defaultThreadFactory();
        this.c = str;
    }
}
