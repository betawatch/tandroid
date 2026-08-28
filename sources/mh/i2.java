package mh;

import kh.o8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c3 b;

    public /* synthetic */ i2(c3 c3Var, int i9) {
        this.a = i9;
        this.b = c3Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new o8(5, this.b, tL_error));
                break;
            case 1:
                final int i9 = 1;
                final c3 c3Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: mh.c2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                c3 c3Var2 = c3Var;
                                if (tL_error == null) {
                                    s4 s4Var = c3Var2.r0;
                                    if (s4Var != null) {
                                        s4Var.a(tLObject);
                                        c3Var2.n();
                                        break;
                                    }
                                } else {
                                    c3Var2.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                c3 c3Var3 = c3Var;
                                if (tL_error == null) {
                                    s4 s4Var2 = c3Var3.r0;
                                    if (s4Var2 != null) {
                                        s4Var2.a(tLObject);
                                        c3Var3.n();
                                        break;
                                    }
                                } else {
                                    c3Var3.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                c3 c3Var4 = c3Var;
                                if (tL_error == null) {
                                    s4 s4Var3 = c3Var4.r0;
                                    if (s4Var3 != null) {
                                        s4Var3.a(tLObject);
                                        c3Var4.n();
                                        break;
                                    }
                                } else {
                                    c3Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                c3 c3Var5 = c3Var;
                                if (tL_error == null) {
                                    s4 s4Var4 = c3Var5.r0;
                                    if (s4Var4 != null) {
                                        s4Var4.a(tLObject);
                                        c3Var5.n();
                                        break;
                                    }
                                } else {
                                    c3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                c3 c3Var6 = c3Var;
                                if (tL_error == null) {
                                    s4 s4Var5 = c3Var6.r0;
                                    if (s4Var5 != null) {
                                        s4Var5.a(tLObject);
                                        c3Var6.n();
                                        break;
                                    }
                                } else {
                                    c3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i10 = 4;
                final c3 c3Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: mh.c2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                c3 c3Var22 = c3Var2;
                                if (tL_error == null) {
                                    s4 s4Var = c3Var22.r0;
                                    if (s4Var != null) {
                                        s4Var.a(tLObject);
                                        c3Var22.n();
                                        break;
                                    }
                                } else {
                                    c3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                c3 c3Var3 = c3Var2;
                                if (tL_error == null) {
                                    s4 s4Var2 = c3Var3.r0;
                                    if (s4Var2 != null) {
                                        s4Var2.a(tLObject);
                                        c3Var3.n();
                                        break;
                                    }
                                } else {
                                    c3Var3.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                c3 c3Var4 = c3Var2;
                                if (tL_error == null) {
                                    s4 s4Var3 = c3Var4.r0;
                                    if (s4Var3 != null) {
                                        s4Var3.a(tLObject);
                                        c3Var4.n();
                                        break;
                                    }
                                } else {
                                    c3Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                c3 c3Var5 = c3Var2;
                                if (tL_error == null) {
                                    s4 s4Var4 = c3Var5.r0;
                                    if (s4Var4 != null) {
                                        s4Var4.a(tLObject);
                                        c3Var5.n();
                                        break;
                                    }
                                } else {
                                    c3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                c3 c3Var6 = c3Var2;
                                if (tL_error == null) {
                                    s4 s4Var5 = c3Var6.r0;
                                    if (s4Var5 != null) {
                                        s4Var5.a(tLObject);
                                        c3Var6.n();
                                        break;
                                    }
                                } else {
                                    c3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                final int i11 = 0;
                final c3 c3Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: mh.c2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                c3 c3Var22 = c3Var3;
                                if (tL_error == null) {
                                    s4 s4Var = c3Var22.r0;
                                    if (s4Var != null) {
                                        s4Var.a(tLObject);
                                        c3Var22.n();
                                        break;
                                    }
                                } else {
                                    c3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                c3 c3Var32 = c3Var3;
                                if (tL_error == null) {
                                    s4 s4Var2 = c3Var32.r0;
                                    if (s4Var2 != null) {
                                        s4Var2.a(tLObject);
                                        c3Var32.n();
                                        break;
                                    }
                                } else {
                                    c3Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                c3 c3Var4 = c3Var3;
                                if (tL_error == null) {
                                    s4 s4Var3 = c3Var4.r0;
                                    if (s4Var3 != null) {
                                        s4Var3.a(tLObject);
                                        c3Var4.n();
                                        break;
                                    }
                                } else {
                                    c3Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                c3 c3Var5 = c3Var3;
                                if (tL_error == null) {
                                    s4 s4Var4 = c3Var5.r0;
                                    if (s4Var4 != null) {
                                        s4Var4.a(tLObject);
                                        c3Var5.n();
                                        break;
                                    }
                                } else {
                                    c3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                c3 c3Var6 = c3Var3;
                                if (tL_error == null) {
                                    s4 s4Var5 = c3Var6.r0;
                                    if (s4Var5 != null) {
                                        s4Var5.a(tLObject);
                                        c3Var6.n();
                                        break;
                                    }
                                } else {
                                    c3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                final int i12 = 2;
                final c3 c3Var4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: mh.c2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                c3 c3Var22 = c3Var4;
                                if (tL_error == null) {
                                    s4 s4Var = c3Var22.r0;
                                    if (s4Var != null) {
                                        s4Var.a(tLObject);
                                        c3Var22.n();
                                        break;
                                    }
                                } else {
                                    c3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                c3 c3Var32 = c3Var4;
                                if (tL_error == null) {
                                    s4 s4Var2 = c3Var32.r0;
                                    if (s4Var2 != null) {
                                        s4Var2.a(tLObject);
                                        c3Var32.n();
                                        break;
                                    }
                                } else {
                                    c3Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                c3 c3Var42 = c3Var4;
                                if (tL_error == null) {
                                    s4 s4Var3 = c3Var42.r0;
                                    if (s4Var3 != null) {
                                        s4Var3.a(tLObject);
                                        c3Var42.n();
                                        break;
                                    }
                                } else {
                                    c3Var42.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                c3 c3Var5 = c3Var4;
                                if (tL_error == null) {
                                    s4 s4Var4 = c3Var5.r0;
                                    if (s4Var4 != null) {
                                        s4Var4.a(tLObject);
                                        c3Var5.n();
                                        break;
                                    }
                                } else {
                                    c3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                c3 c3Var6 = c3Var4;
                                if (tL_error == null) {
                                    s4 s4Var5 = c3Var6.r0;
                                    if (s4Var5 != null) {
                                        s4Var5.a(tLObject);
                                        c3Var6.n();
                                        break;
                                    }
                                } else {
                                    c3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i13 = 3;
                final c3 c3Var5 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: mh.c2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                c3 c3Var22 = c3Var5;
                                if (tL_error == null) {
                                    s4 s4Var = c3Var22.r0;
                                    if (s4Var != null) {
                                        s4Var.a(tLObject);
                                        c3Var22.n();
                                        break;
                                    }
                                } else {
                                    c3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                c3 c3Var32 = c3Var5;
                                if (tL_error == null) {
                                    s4 s4Var2 = c3Var32.r0;
                                    if (s4Var2 != null) {
                                        s4Var2.a(tLObject);
                                        c3Var32.n();
                                        break;
                                    }
                                } else {
                                    c3Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                c3 c3Var42 = c3Var5;
                                if (tL_error == null) {
                                    s4 s4Var3 = c3Var42.r0;
                                    if (s4Var3 != null) {
                                        s4Var3.a(tLObject);
                                        c3Var42.n();
                                        break;
                                    }
                                } else {
                                    c3Var42.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                c3 c3Var52 = c3Var5;
                                if (tL_error == null) {
                                    s4 s4Var4 = c3Var52.r0;
                                    if (s4Var4 != null) {
                                        s4Var4.a(tLObject);
                                        c3Var52.n();
                                        break;
                                    }
                                } else {
                                    c3Var52.getClass();
                                    break;
                                }
                                break;
                            default:
                                c3 c3Var6 = c3Var5;
                                if (tL_error == null) {
                                    s4 s4Var5 = c3Var6.r0;
                                    if (s4Var5 != null) {
                                        s4Var5.a(tLObject);
                                        c3Var6.n();
                                        break;
                                    }
                                } else {
                                    c3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
