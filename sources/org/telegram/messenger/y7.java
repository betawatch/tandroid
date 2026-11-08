package org.telegram.messenger;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class y7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Throwable b;

    public /* synthetic */ y7(int i7, Throwable th2) {
        this.a = i7;
        this.b = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 0;
        Throwable th2 = this.b;
        switch (i7) {
            case 0:
                try {
                    a8.j().a.write(a8.j().b.format(System.currentTimeMillis()) + " E/tmessages: " + th2 + "\n");
                    StackTraceElement[] stackTrace = th2.getStackTrace();
                    for (int i11 = 0; i11 < stackTrace.length; i11++) {
                        a8.j().a.write(a8.j().b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace[i11] + "\n");
                    }
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        a8.j().a.write(a8.j().b.format(System.currentTimeMillis()) + " E/tmessages: Caused by " + cause + "\n");
                        StackTraceElement[] stackTrace2 = cause.getStackTrace();
                        while (i10 < stackTrace2.length) {
                            a8.j().a.write(a8.j().b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace2[i10] + "\n");
                            i10++;
                        }
                    }
                    a8.j().a.flush();
                    break;
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            default:
                try {
                    a8.j().a.write(a8.j().b.format(System.currentTimeMillis()) + " FATAL/tmessages: " + th2 + "\n");
                    StackTraceElement[] stackTrace3 = th2.getStackTrace();
                    for (int i12 = 0; i12 < stackTrace3.length; i12++) {
                        a8.j().a.write(a8.j().b.format(System.currentTimeMillis()) + " FATAL/tmessages: \tat " + stackTrace3[i12] + "\n");
                    }
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        a8.j().a.write(a8.j().b.format(System.currentTimeMillis()) + " E/tmessages: Caused by " + cause2 + "\n");
                        StackTraceElement[] stackTrace4 = cause2.getStackTrace();
                        while (i10 < stackTrace4.length) {
                            a8.j().a.write(a8.j().b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace4[i10] + "\n");
                            i10++;
                        }
                    }
                    a8.j().a.flush();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                boolean z9 = r2.a;
                break;
        }
    }
}
