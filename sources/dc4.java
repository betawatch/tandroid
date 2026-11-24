// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class dc4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Throwable b;

    public /* synthetic */ dc4(Throwable th, byte b) {
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
                    fc4.j().a.write(fc4.j().b.format(System.currentTimeMillis()) + " E/tmessages: " + th + "\n");
                    StackTraceElement[] stackTrace = th.getStackTrace();
                    for (int i2 = 0; i2 < stackTrace.length; i2++) {
                        fc4.j().a.write(fc4.j().b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace[i2] + "\n");
                    }
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        fc4.j().a.write(fc4.j().b.format(System.currentTimeMillis()) + " E/tmessages: Caused by " + cause + "\n");
                        StackTraceElement[] stackTrace2 = cause.getStackTrace();
                        while (i < stackTrace2.length) {
                            fc4.j().a.write(fc4.j().b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace2[i] + "\n");
                            i++;
                        }
                    }
                    fc4.j().a.flush();
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            default:
                try {
                    fc4.j().a.write(fc4.j().b.format(System.currentTimeMillis()) + " FATAL/tmessages: " + th + "\n");
                    StackTraceElement[] stackTrace3 = th.getStackTrace();
                    for (int i3 = 0; i3 < stackTrace3.length; i3++) {
                        fc4.j().a.write(fc4.j().b.format(System.currentTimeMillis()) + " FATAL/tmessages: \tat " + stackTrace3[i3] + "\n");
                    }
                    Throwable cause2 = th.getCause();
                    if (cause2 != null) {
                        fc4.j().a.write(fc4.j().b.format(System.currentTimeMillis()) + " E/tmessages: Caused by " + cause2 + "\n");
                        StackTraceElement[] stackTrace4 = cause2.getStackTrace();
                        while (i < stackTrace4.length) {
                            fc4.j().a.write(fc4.j().b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace4[i] + "\n");
                            i++;
                        }
                    }
                    fc4.j().a.flush();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                boolean z = e21.a;
                break;
        }
    }
}
