package org.telegram.messenger;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class f3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Throwable b;

    public /* synthetic */ f3(int i10, Throwable th2) {
        this.a = i10;
        this.b = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                FileLog.lambda$e$4(this.b);
                break;
            default:
                FileLog.lambda$fatal$5(this.b);
                break;
        }
    }
}
