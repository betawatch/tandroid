// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class da4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Throwable b;

    public /* synthetic */ da4(Throwable th, byte b) {
        this.a = b;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = 0;
        Throwable th = this.b;
        switch (b) {
            case 0:
                try {
                    fa4.j().a.write(fa4.j().b.format(System.currentTimeMillis()) + " E/tmessages: " + th + "\n");
                    StackTraceElement[] stackTrace = th.getStackTrace();
                    for (int i2 = 0; i2 < stackTrace.length; i2++) {
                        fa4.j().a.write(fa4.j().b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace[i2] + "\n");
                    }
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        fa4.j().a.write(fa4.j().b.format(System.currentTimeMillis()) + " E/tmessages: Caused by " + cause + "\n");
                        StackTraceElement[] stackTrace2 = cause.getStackTrace();
                        while (i < stackTrace2.length) {
                            fa4.j().a.write(fa4.j().b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace2[i] + "\n");
                            i++;
                        }
                    }
                    fa4.j().a.flush();
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            default:
                try {
                    fa4.j().a.write(fa4.j().b.format(System.currentTimeMillis()) + " FATAL/tmessages: " + th + "\n");
                    StackTraceElement[] stackTrace3 = th.getStackTrace();
                    for (int i3 = 0; i3 < stackTrace3.length; i3++) {
                        fa4.j().a.write(fa4.j().b.format(System.currentTimeMillis()) + " FATAL/tmessages: \tat " + stackTrace3[i3] + "\n");
                    }
                    Throwable cause2 = th.getCause();
                    if (cause2 != null) {
                        fa4.j().a.write(fa4.j().b.format(System.currentTimeMillis()) + " E/tmessages: Caused by " + cause2 + "\n");
                        StackTraceElement[] stackTrace4 = cause2.getStackTrace();
                        while (i < stackTrace4.length) {
                            fa4.j().a.write(fa4.j().b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace4[i] + "\n");
                            i++;
                        }
                    }
                    fa4.j().a.flush();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                boolean z = w01.a;
                break;
        }
    }
}
