package androidx.emoji2.text;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ a(String str, int i10) {
        this.a = i10;
        this.b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread thread = new Thread(runnable, this.b);
                thread.setPriority(10);
                return thread;
            default:
                return new Thread(runnable, this.b);
        }
    }
}
