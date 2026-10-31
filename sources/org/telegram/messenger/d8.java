package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class d8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Throwable b;

    public /* synthetic */ d8(int i10, Throwable th2) {
        this.a = i10;
        this.b = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = 0;
        Throwable th2 = this.b;
        switch (i10) {
            case 0:
                try {
                    f8.j().a.write(f8.j().b.format(System.currentTimeMillis()) + " E/tmessages: " + th2 + "\n");
                    StackTraceElement[] stackTrace = th2.getStackTrace();
                    for (int i12 = 0; i12 < stackTrace.length; i12++) {
                        f8.j().a.write(f8.j().b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace[i12] + "\n");
                    }
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        f8.j().a.write(f8.j().b.format(System.currentTimeMillis()) + " E/tmessages: Caused by " + cause + "\n");
                        StackTraceElement[] stackTrace2 = cause.getStackTrace();
                        while (i11 < stackTrace2.length) {
                            f8.j().a.write(f8.j().b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace2[i11] + "\n");
                            i11++;
                        }
                    }
                    f8.j().a.flush();
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            default:
                try {
                    f8.j().a.write(f8.j().b.format(System.currentTimeMillis()) + " FATAL/tmessages: " + th2 + "\n");
                    StackTraceElement[] stackTrace3 = th2.getStackTrace();
                    for (int i13 = 0; i13 < stackTrace3.length; i13++) {
                        f8.j().a.write(f8.j().b.format(System.currentTimeMillis()) + " FATAL/tmessages: \tat " + stackTrace3[i13] + "\n");
                    }
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        f8.j().a.write(f8.j().b.format(System.currentTimeMillis()) + " E/tmessages: Caused by " + cause2 + "\n");
                        StackTraceElement[] stackTrace4 = cause2.getStackTrace();
                        while (i11 < stackTrace4.length) {
                            f8.j().a.write(f8.j().b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace4[i11] + "\n");
                            i11++;
                        }
                    }
                    f8.j().a.flush();
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
                boolean z10 = v2.a;
                break;
        }
    }
}
