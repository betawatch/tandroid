// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class ac4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Throwable b;

    public /* synthetic */ ac4(Throwable th, byte b) {
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
                    cc4.j().a.write(cc4.j().b.format(System.currentTimeMillis()) + " E/tmessages: " + th + "\n");
                    StackTraceElement[] stackTrace = th.getStackTrace();
                    for (int i2 = 0; i2 < stackTrace.length; i2++) {
                        cc4.j().a.write(cc4.j().b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace[i2] + "\n");
                    }
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        cc4.j().a.write(cc4.j().b.format(System.currentTimeMillis()) + " E/tmessages: Caused by " + cause + "\n");
                        StackTraceElement[] stackTrace2 = cause.getStackTrace();
                        while (i < stackTrace2.length) {
                            cc4.j().a.write(cc4.j().b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace2[i] + "\n");
                            i++;
                        }
                    }
                    cc4.j().a.flush();
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            default:
                try {
                    cc4.j().a.write(cc4.j().b.format(System.currentTimeMillis()) + " FATAL/tmessages: " + th + "\n");
                    StackTraceElement[] stackTrace3 = th.getStackTrace();
                    for (int i3 = 0; i3 < stackTrace3.length; i3++) {
                        cc4.j().a.write(cc4.j().b.format(System.currentTimeMillis()) + " FATAL/tmessages: \tat " + stackTrace3[i3] + "\n");
                    }
                    Throwable cause2 = th.getCause();
                    if (cause2 != null) {
                        cc4.j().a.write(cc4.j().b.format(System.currentTimeMillis()) + " E/tmessages: Caused by " + cause2 + "\n");
                        StackTraceElement[] stackTrace4 = cause2.getStackTrace();
                        while (i < stackTrace4.length) {
                            cc4.j().a.write(cc4.j().b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace4[i] + "\n");
                            i++;
                        }
                    }
                    cc4.j().a.flush();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                boolean z = f11.a;
                break;
        }
    }
}
