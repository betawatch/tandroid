// default package

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class dc3 implements ThreadFactory {
    public final /* synthetic */ byte a;
    public final Object b;

    public dc3() {
        this.a = (byte) 0;
        this.b = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) obj).getAndIncrement());
                return thread;
            case 1:
                Thread newThread = Executors.defaultThreadFactory().newThread(new v44(runnable, (byte) 0));
                newThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) obj).getAndIncrement());
                return newThread;
            default:
                return ((ThreadFactory) obj).newThread(new xo9(runnable, (byte) 4));
        }
    }

    public /* synthetic */ dc3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
