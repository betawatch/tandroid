package gi;

import ei.p6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ d3 b;

    public /* synthetic */ j2(d3 d3Var, int i10) {
        this.a = i10;
        this.b = d3Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p6(16, this.b, tL_error));
                break;
            case 1:
                final int i10 = 1;
                final d3 d3Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: gi.c2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                d3 d3Var2 = d3Var;
                                if (tL_error == null) {
                                    t4 t4Var = d3Var2.w0;
                                    if (t4Var != null) {
                                        t4Var.a(tLObject);
                                        d3Var2.o();
                                        break;
                                    }
                                } else {
                                    d3Var2.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                d3 d3Var3 = d3Var;
                                if (tL_error == null) {
                                    t4 t4Var2 = d3Var3.w0;
                                    if (t4Var2 != null) {
                                        t4Var2.a(tLObject);
                                        d3Var3.o();
                                        break;
                                    }
                                } else {
                                    d3Var3.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                d3 d3Var4 = d3Var;
                                if (tL_error == null) {
                                    t4 t4Var3 = d3Var4.w0;
                                    if (t4Var3 != null) {
                                        t4Var3.a(tLObject);
                                        d3Var4.o();
                                        break;
                                    }
                                } else {
                                    d3Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                d3 d3Var5 = d3Var;
                                if (tL_error == null) {
                                    t4 t4Var4 = d3Var5.w0;
                                    if (t4Var4 != null) {
                                        t4Var4.a(tLObject);
                                        d3Var5.o();
                                        break;
                                    }
                                } else {
                                    d3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                d3 d3Var6 = d3Var;
                                if (tL_error == null) {
                                    t4 t4Var5 = d3Var6.w0;
                                    if (t4Var5 != null) {
                                        t4Var5.a(tLObject);
                                        d3Var6.o();
                                        break;
                                    }
                                } else {
                                    d3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 4;
                final d3 d3Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: gi.c2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                d3 d3Var22 = d3Var2;
                                if (tL_error == null) {
                                    t4 t4Var = d3Var22.w0;
                                    if (t4Var != null) {
                                        t4Var.a(tLObject);
                                        d3Var22.o();
                                        break;
                                    }
                                } else {
                                    d3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                d3 d3Var3 = d3Var2;
                                if (tL_error == null) {
                                    t4 t4Var2 = d3Var3.w0;
                                    if (t4Var2 != null) {
                                        t4Var2.a(tLObject);
                                        d3Var3.o();
                                        break;
                                    }
                                } else {
                                    d3Var3.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                d3 d3Var4 = d3Var2;
                                if (tL_error == null) {
                                    t4 t4Var3 = d3Var4.w0;
                                    if (t4Var3 != null) {
                                        t4Var3.a(tLObject);
                                        d3Var4.o();
                                        break;
                                    }
                                } else {
                                    d3Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                d3 d3Var5 = d3Var2;
                                if (tL_error == null) {
                                    t4 t4Var4 = d3Var5.w0;
                                    if (t4Var4 != null) {
                                        t4Var4.a(tLObject);
                                        d3Var5.o();
                                        break;
                                    }
                                } else {
                                    d3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                d3 d3Var6 = d3Var2;
                                if (tL_error == null) {
                                    t4 t4Var5 = d3Var6.w0;
                                    if (t4Var5 != null) {
                                        t4Var5.a(tLObject);
                                        d3Var6.o();
                                        break;
                                    }
                                } else {
                                    d3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                final int i12 = 0;
                final d3 d3Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: gi.c2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                d3 d3Var22 = d3Var3;
                                if (tL_error == null) {
                                    t4 t4Var = d3Var22.w0;
                                    if (t4Var != null) {
                                        t4Var.a(tLObject);
                                        d3Var22.o();
                                        break;
                                    }
                                } else {
                                    d3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                d3 d3Var32 = d3Var3;
                                if (tL_error == null) {
                                    t4 t4Var2 = d3Var32.w0;
                                    if (t4Var2 != null) {
                                        t4Var2.a(tLObject);
                                        d3Var32.o();
                                        break;
                                    }
                                } else {
                                    d3Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                d3 d3Var4 = d3Var3;
                                if (tL_error == null) {
                                    t4 t4Var3 = d3Var4.w0;
                                    if (t4Var3 != null) {
                                        t4Var3.a(tLObject);
                                        d3Var4.o();
                                        break;
                                    }
                                } else {
                                    d3Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                d3 d3Var5 = d3Var3;
                                if (tL_error == null) {
                                    t4 t4Var4 = d3Var5.w0;
                                    if (t4Var4 != null) {
                                        t4Var4.a(tLObject);
                                        d3Var5.o();
                                        break;
                                    }
                                } else {
                                    d3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                d3 d3Var6 = d3Var3;
                                if (tL_error == null) {
                                    t4 t4Var5 = d3Var6.w0;
                                    if (t4Var5 != null) {
                                        t4Var5.a(tLObject);
                                        d3Var6.o();
                                        break;
                                    }
                                } else {
                                    d3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                final int i13 = 2;
                final d3 d3Var4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: gi.c2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                d3 d3Var22 = d3Var4;
                                if (tL_error == null) {
                                    t4 t4Var = d3Var22.w0;
                                    if (t4Var != null) {
                                        t4Var.a(tLObject);
                                        d3Var22.o();
                                        break;
                                    }
                                } else {
                                    d3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                d3 d3Var32 = d3Var4;
                                if (tL_error == null) {
                                    t4 t4Var2 = d3Var32.w0;
                                    if (t4Var2 != null) {
                                        t4Var2.a(tLObject);
                                        d3Var32.o();
                                        break;
                                    }
                                } else {
                                    d3Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                d3 d3Var42 = d3Var4;
                                if (tL_error == null) {
                                    t4 t4Var3 = d3Var42.w0;
                                    if (t4Var3 != null) {
                                        t4Var3.a(tLObject);
                                        d3Var42.o();
                                        break;
                                    }
                                } else {
                                    d3Var42.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                d3 d3Var5 = d3Var4;
                                if (tL_error == null) {
                                    t4 t4Var4 = d3Var5.w0;
                                    if (t4Var4 != null) {
                                        t4Var4.a(tLObject);
                                        d3Var5.o();
                                        break;
                                    }
                                } else {
                                    d3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                d3 d3Var6 = d3Var4;
                                if (tL_error == null) {
                                    t4 t4Var5 = d3Var6.w0;
                                    if (t4Var5 != null) {
                                        t4Var5.a(tLObject);
                                        d3Var6.o();
                                        break;
                                    }
                                } else {
                                    d3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i14 = 3;
                final d3 d3Var5 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: gi.c2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                d3 d3Var22 = d3Var5;
                                if (tL_error == null) {
                                    t4 t4Var = d3Var22.w0;
                                    if (t4Var != null) {
                                        t4Var.a(tLObject);
                                        d3Var22.o();
                                        break;
                                    }
                                } else {
                                    d3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                d3 d3Var32 = d3Var5;
                                if (tL_error == null) {
                                    t4 t4Var2 = d3Var32.w0;
                                    if (t4Var2 != null) {
                                        t4Var2.a(tLObject);
                                        d3Var32.o();
                                        break;
                                    }
                                } else {
                                    d3Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                d3 d3Var42 = d3Var5;
                                if (tL_error == null) {
                                    t4 t4Var3 = d3Var42.w0;
                                    if (t4Var3 != null) {
                                        t4Var3.a(tLObject);
                                        d3Var42.o();
                                        break;
                                    }
                                } else {
                                    d3Var42.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                d3 d3Var52 = d3Var5;
                                if (tL_error == null) {
                                    t4 t4Var4 = d3Var52.w0;
                                    if (t4Var4 != null) {
                                        t4Var4.a(tLObject);
                                        d3Var52.o();
                                        break;
                                    }
                                } else {
                                    d3Var52.getClass();
                                    break;
                                }
                                break;
                            default:
                                d3 d3Var6 = d3Var5;
                                if (tL_error == null) {
                                    t4 t4Var5 = d3Var6.w0;
                                    if (t4Var5 != null) {
                                        t4Var5.a(tLObject);
                                        d3Var6.o();
                                        break;
                                    }
                                } else {
                                    d3Var6.getClass();
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
