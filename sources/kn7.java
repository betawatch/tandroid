// default package

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class kn7 implements ThreadFactory {
    public final /* synthetic */ byte a;
    public final ThreadFactory b;
    public final Serializable c;

    public kn7(uh0 uh0Var) {
        this.a = (byte) 1;
        this.b = Executors.defaultThreadFactory();
        this.c = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        byte b = this.a;
        Serializable serializable = this.c;
        ThreadFactory threadFactory = this.b;
        switch (b) {
            case 0:
                Thread newThread = threadFactory.newThread(new xo9(runnable, (byte) 2));
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
                Thread newThread3 = threadFactory.newThread(new xo9(runnable, (byte) 2));
                newThread3.setName((String) serializable);
                return newThread3;
        }
    }

    public kn7() {
        this.a = (byte) 0;
        this.c = new AtomicInteger();
        this.b = Executors.defaultThreadFactory();
    }

    public kn7(String str) {
        this.a = (byte) 2;
        this.b = Executors.defaultThreadFactory();
        this.c = str;
    }
}
