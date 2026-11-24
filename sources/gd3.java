// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class gd3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ id3 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ l69 d;

    public /* synthetic */ gd3(id3 id3Var, Runnable runnable, l69 l69Var, byte b) {
        this.a = b;
        this.b = id3Var;
        this.c = runnable;
        this.d = l69Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        final l69 l69Var = this.d;
        final Runnable runnable = this.c;
        id3 id3Var = this.b;
        switch (b) {
            case 0:
                final byte b2 = 0;
                id3Var.a.execute(new Runnable() { // from class: ed3
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        l69 l69Var2 = l69Var;
                        Runnable runnable2 = runnable;
                        switch (b3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((kd3) l69Var2.b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((kd3) l69Var2.b).l(e2);
                                    return;
                                }
                            default:
                                kd3 kd3Var = (kd3) l69Var2.b;
                                try {
                                    runnable2.run();
                                    kd3Var.k(null);
                                    return;
                                } catch (Exception e3) {
                                    kd3Var.l(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                final byte b3 = 2;
                id3Var.a.execute(new Runnable() { // from class: ed3
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        l69 l69Var2 = l69Var;
                        Runnable runnable2 = runnable;
                        switch (b32) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((kd3) l69Var2.b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((kd3) l69Var2.b).l(e2);
                                    return;
                                }
                            default:
                                kd3 kd3Var = (kd3) l69Var2.b;
                                try {
                                    runnable2.run();
                                    kd3Var.k(null);
                                    return;
                                } catch (Exception e3) {
                                    kd3Var.l(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                final byte b4 = 1;
                id3Var.a.execute(new Runnable() { // from class: ed3
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b4;
                        l69 l69Var2 = l69Var;
                        Runnable runnable2 = runnable;
                        switch (b32) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((kd3) l69Var2.b).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((kd3) l69Var2.b).l(e2);
                                    return;
                                }
                            default:
                                kd3 kd3Var = (kd3) l69Var2.b;
                                try {
                                    runnable2.run();
                                    kd3Var.k(null);
                                    return;
                                } catch (Exception e3) {
                                    kd3Var.l(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
