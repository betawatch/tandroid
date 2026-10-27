package hi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ m3 b;

    public /* synthetic */ r2(m3 m3Var, int i10) {
        this.a = i10;
        this.b = m3Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e2.q0(29, this.b, tL_error));
                break;
            case 1:
                final int i10 = 1;
                final m3 m3Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: hi.k2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                m3 m3Var2 = m3Var;
                                if (tL_error == null) {
                                    c5 c5Var = m3Var2.w0;
                                    if (c5Var != null) {
                                        c5Var.a(tLObject);
                                        m3Var2.o();
                                        break;
                                    }
                                } else {
                                    m3Var2.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                m3 m3Var3 = m3Var;
                                if (tL_error == null) {
                                    c5 c5Var2 = m3Var3.w0;
                                    if (c5Var2 != null) {
                                        c5Var2.a(tLObject);
                                        m3Var3.o();
                                        break;
                                    }
                                } else {
                                    m3Var3.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                m3 m3Var4 = m3Var;
                                if (tL_error == null) {
                                    c5 c5Var3 = m3Var4.w0;
                                    if (c5Var3 != null) {
                                        c5Var3.a(tLObject);
                                        m3Var4.o();
                                        break;
                                    }
                                } else {
                                    m3Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                m3 m3Var5 = m3Var;
                                if (tL_error == null) {
                                    c5 c5Var4 = m3Var5.w0;
                                    if (c5Var4 != null) {
                                        c5Var4.a(tLObject);
                                        m3Var5.o();
                                        break;
                                    }
                                } else {
                                    m3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                m3 m3Var6 = m3Var;
                                if (tL_error == null) {
                                    c5 c5Var5 = m3Var6.w0;
                                    if (c5Var5 != null) {
                                        c5Var5.a(tLObject);
                                        m3Var6.o();
                                        break;
                                    }
                                } else {
                                    m3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 4;
                final m3 m3Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: hi.k2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                m3 m3Var22 = m3Var2;
                                if (tL_error == null) {
                                    c5 c5Var = m3Var22.w0;
                                    if (c5Var != null) {
                                        c5Var.a(tLObject);
                                        m3Var22.o();
                                        break;
                                    }
                                } else {
                                    m3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                m3 m3Var3 = m3Var2;
                                if (tL_error == null) {
                                    c5 c5Var2 = m3Var3.w0;
                                    if (c5Var2 != null) {
                                        c5Var2.a(tLObject);
                                        m3Var3.o();
                                        break;
                                    }
                                } else {
                                    m3Var3.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                m3 m3Var4 = m3Var2;
                                if (tL_error == null) {
                                    c5 c5Var3 = m3Var4.w0;
                                    if (c5Var3 != null) {
                                        c5Var3.a(tLObject);
                                        m3Var4.o();
                                        break;
                                    }
                                } else {
                                    m3Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                m3 m3Var5 = m3Var2;
                                if (tL_error == null) {
                                    c5 c5Var4 = m3Var5.w0;
                                    if (c5Var4 != null) {
                                        c5Var4.a(tLObject);
                                        m3Var5.o();
                                        break;
                                    }
                                } else {
                                    m3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                m3 m3Var6 = m3Var2;
                                if (tL_error == null) {
                                    c5 c5Var5 = m3Var6.w0;
                                    if (c5Var5 != null) {
                                        c5Var5.a(tLObject);
                                        m3Var6.o();
                                        break;
                                    }
                                } else {
                                    m3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                final int i12 = 0;
                final m3 m3Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: hi.k2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                m3 m3Var22 = m3Var3;
                                if (tL_error == null) {
                                    c5 c5Var = m3Var22.w0;
                                    if (c5Var != null) {
                                        c5Var.a(tLObject);
                                        m3Var22.o();
                                        break;
                                    }
                                } else {
                                    m3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                m3 m3Var32 = m3Var3;
                                if (tL_error == null) {
                                    c5 c5Var2 = m3Var32.w0;
                                    if (c5Var2 != null) {
                                        c5Var2.a(tLObject);
                                        m3Var32.o();
                                        break;
                                    }
                                } else {
                                    m3Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                m3 m3Var4 = m3Var3;
                                if (tL_error == null) {
                                    c5 c5Var3 = m3Var4.w0;
                                    if (c5Var3 != null) {
                                        c5Var3.a(tLObject);
                                        m3Var4.o();
                                        break;
                                    }
                                } else {
                                    m3Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                m3 m3Var5 = m3Var3;
                                if (tL_error == null) {
                                    c5 c5Var4 = m3Var5.w0;
                                    if (c5Var4 != null) {
                                        c5Var4.a(tLObject);
                                        m3Var5.o();
                                        break;
                                    }
                                } else {
                                    m3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                m3 m3Var6 = m3Var3;
                                if (tL_error == null) {
                                    c5 c5Var5 = m3Var6.w0;
                                    if (c5Var5 != null) {
                                        c5Var5.a(tLObject);
                                        m3Var6.o();
                                        break;
                                    }
                                } else {
                                    m3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                final int i13 = 2;
                final m3 m3Var4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: hi.k2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                m3 m3Var22 = m3Var4;
                                if (tL_error == null) {
                                    c5 c5Var = m3Var22.w0;
                                    if (c5Var != null) {
                                        c5Var.a(tLObject);
                                        m3Var22.o();
                                        break;
                                    }
                                } else {
                                    m3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                m3 m3Var32 = m3Var4;
                                if (tL_error == null) {
                                    c5 c5Var2 = m3Var32.w0;
                                    if (c5Var2 != null) {
                                        c5Var2.a(tLObject);
                                        m3Var32.o();
                                        break;
                                    }
                                } else {
                                    m3Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                m3 m3Var42 = m3Var4;
                                if (tL_error == null) {
                                    c5 c5Var3 = m3Var42.w0;
                                    if (c5Var3 != null) {
                                        c5Var3.a(tLObject);
                                        m3Var42.o();
                                        break;
                                    }
                                } else {
                                    m3Var42.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                m3 m3Var5 = m3Var4;
                                if (tL_error == null) {
                                    c5 c5Var4 = m3Var5.w0;
                                    if (c5Var4 != null) {
                                        c5Var4.a(tLObject);
                                        m3Var5.o();
                                        break;
                                    }
                                } else {
                                    m3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                m3 m3Var6 = m3Var4;
                                if (tL_error == null) {
                                    c5 c5Var5 = m3Var6.w0;
                                    if (c5Var5 != null) {
                                        c5Var5.a(tLObject);
                                        m3Var6.o();
                                        break;
                                    }
                                } else {
                                    m3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i14 = 3;
                final m3 m3Var5 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: hi.k2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                m3 m3Var22 = m3Var5;
                                if (tL_error == null) {
                                    c5 c5Var = m3Var22.w0;
                                    if (c5Var != null) {
                                        c5Var.a(tLObject);
                                        m3Var22.o();
                                        break;
                                    }
                                } else {
                                    m3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                m3 m3Var32 = m3Var5;
                                if (tL_error == null) {
                                    c5 c5Var2 = m3Var32.w0;
                                    if (c5Var2 != null) {
                                        c5Var2.a(tLObject);
                                        m3Var32.o();
                                        break;
                                    }
                                } else {
                                    m3Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                m3 m3Var42 = m3Var5;
                                if (tL_error == null) {
                                    c5 c5Var3 = m3Var42.w0;
                                    if (c5Var3 != null) {
                                        c5Var3.a(tLObject);
                                        m3Var42.o();
                                        break;
                                    }
                                } else {
                                    m3Var42.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                m3 m3Var52 = m3Var5;
                                if (tL_error == null) {
                                    c5 c5Var4 = m3Var52.w0;
                                    if (c5Var4 != null) {
                                        c5Var4.a(tLObject);
                                        m3Var52.o();
                                        break;
                                    }
                                } else {
                                    m3Var52.getClass();
                                    break;
                                }
                                break;
                            default:
                                m3 m3Var6 = m3Var5;
                                if (tL_error == null) {
                                    c5 c5Var5 = m3Var6.w0;
                                    if (c5Var5 != null) {
                                        c5Var5.a(tLObject);
                                        m3Var6.o();
                                        break;
                                    }
                                } else {
                                    m3Var6.getClass();
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
