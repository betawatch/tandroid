// default package

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ds2 implements ThreadFactory {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    public /* synthetic */ ds2(String str, byte b) {
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
