package ii;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3 b;

    public /* synthetic */ h2(a3 a3Var, int i3) {
        this.a = i3;
        this.b = a3Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new e(2, this.b, tL_error));
                break;
            case 1:
                final int i3 = 1;
                final a3 a3Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: ii.e2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                a3 a3Var2 = a3Var;
                                if (tL_error == null) {
                                    q4 q4Var = a3Var2.x0;
                                    if (q4Var != null) {
                                        q4Var.a(tLObject);
                                        a3Var2.s();
                                        break;
                                    }
                                } else {
                                    a3Var2.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                a3 a3Var3 = a3Var;
                                if (tL_error == null) {
                                    q4 q4Var2 = a3Var3.x0;
                                    if (q4Var2 != null) {
                                        q4Var2.a(tLObject);
                                        a3Var3.s();
                                        break;
                                    }
                                } else {
                                    a3Var3.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                a3 a3Var4 = a3Var;
                                if (tL_error == null) {
                                    q4 q4Var3 = a3Var4.x0;
                                    if (q4Var3 != null) {
                                        q4Var3.a(tLObject);
                                        a3Var4.s();
                                        break;
                                    }
                                } else {
                                    a3Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                a3 a3Var5 = a3Var;
                                if (tL_error == null) {
                                    q4 q4Var4 = a3Var5.x0;
                                    if (q4Var4 != null) {
                                        q4Var4.a(tLObject);
                                        a3Var5.s();
                                        break;
                                    }
                                } else {
                                    a3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                a3 a3Var6 = a3Var;
                                if (tL_error == null) {
                                    q4 q4Var5 = a3Var6.x0;
                                    if (q4Var5 != null) {
                                        q4Var5.a(tLObject);
                                        a3Var6.s();
                                        break;
                                    }
                                } else {
                                    a3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i10 = 4;
                final a3 a3Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: ii.e2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                a3 a3Var22 = a3Var2;
                                if (tL_error == null) {
                                    q4 q4Var = a3Var22.x0;
                                    if (q4Var != null) {
                                        q4Var.a(tLObject);
                                        a3Var22.s();
                                        break;
                                    }
                                } else {
                                    a3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                a3 a3Var3 = a3Var2;
                                if (tL_error == null) {
                                    q4 q4Var2 = a3Var3.x0;
                                    if (q4Var2 != null) {
                                        q4Var2.a(tLObject);
                                        a3Var3.s();
                                        break;
                                    }
                                } else {
                                    a3Var3.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                a3 a3Var4 = a3Var2;
                                if (tL_error == null) {
                                    q4 q4Var3 = a3Var4.x0;
                                    if (q4Var3 != null) {
                                        q4Var3.a(tLObject);
                                        a3Var4.s();
                                        break;
                                    }
                                } else {
                                    a3Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                a3 a3Var5 = a3Var2;
                                if (tL_error == null) {
                                    q4 q4Var4 = a3Var5.x0;
                                    if (q4Var4 != null) {
                                        q4Var4.a(tLObject);
                                        a3Var5.s();
                                        break;
                                    }
                                } else {
                                    a3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                a3 a3Var6 = a3Var2;
                                if (tL_error == null) {
                                    q4 q4Var5 = a3Var6.x0;
                                    if (q4Var5 != null) {
                                        q4Var5.a(tLObject);
                                        a3Var6.s();
                                        break;
                                    }
                                } else {
                                    a3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                final int i11 = 0;
                final a3 a3Var3 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: ii.e2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                a3 a3Var22 = a3Var3;
                                if (tL_error == null) {
                                    q4 q4Var = a3Var22.x0;
                                    if (q4Var != null) {
                                        q4Var.a(tLObject);
                                        a3Var22.s();
                                        break;
                                    }
                                } else {
                                    a3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                a3 a3Var32 = a3Var3;
                                if (tL_error == null) {
                                    q4 q4Var2 = a3Var32.x0;
                                    if (q4Var2 != null) {
                                        q4Var2.a(tLObject);
                                        a3Var32.s();
                                        break;
                                    }
                                } else {
                                    a3Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                a3 a3Var4 = a3Var3;
                                if (tL_error == null) {
                                    q4 q4Var3 = a3Var4.x0;
                                    if (q4Var3 != null) {
                                        q4Var3.a(tLObject);
                                        a3Var4.s();
                                        break;
                                    }
                                } else {
                                    a3Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                a3 a3Var5 = a3Var3;
                                if (tL_error == null) {
                                    q4 q4Var4 = a3Var5.x0;
                                    if (q4Var4 != null) {
                                        q4Var4.a(tLObject);
                                        a3Var5.s();
                                        break;
                                    }
                                } else {
                                    a3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                a3 a3Var6 = a3Var3;
                                if (tL_error == null) {
                                    q4 q4Var5 = a3Var6.x0;
                                    if (q4Var5 != null) {
                                        q4Var5.a(tLObject);
                                        a3Var6.s();
                                        break;
                                    }
                                } else {
                                    a3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                final int i12 = 2;
                final a3 a3Var4 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: ii.e2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                a3 a3Var22 = a3Var4;
                                if (tL_error == null) {
                                    q4 q4Var = a3Var22.x0;
                                    if (q4Var != null) {
                                        q4Var.a(tLObject);
                                        a3Var22.s();
                                        break;
                                    }
                                } else {
                                    a3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                a3 a3Var32 = a3Var4;
                                if (tL_error == null) {
                                    q4 q4Var2 = a3Var32.x0;
                                    if (q4Var2 != null) {
                                        q4Var2.a(tLObject);
                                        a3Var32.s();
                                        break;
                                    }
                                } else {
                                    a3Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                a3 a3Var42 = a3Var4;
                                if (tL_error == null) {
                                    q4 q4Var3 = a3Var42.x0;
                                    if (q4Var3 != null) {
                                        q4Var3.a(tLObject);
                                        a3Var42.s();
                                        break;
                                    }
                                } else {
                                    a3Var42.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                a3 a3Var5 = a3Var4;
                                if (tL_error == null) {
                                    q4 q4Var4 = a3Var5.x0;
                                    if (q4Var4 != null) {
                                        q4Var4.a(tLObject);
                                        a3Var5.s();
                                        break;
                                    }
                                } else {
                                    a3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                a3 a3Var6 = a3Var4;
                                if (tL_error == null) {
                                    q4 q4Var5 = a3Var6.x0;
                                    if (q4Var5 != null) {
                                        q4Var5.a(tLObject);
                                        a3Var6.s();
                                        break;
                                    }
                                } else {
                                    a3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i13 = 3;
                final a3 a3Var5 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: ii.e2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                a3 a3Var22 = a3Var5;
                                if (tL_error == null) {
                                    q4 q4Var = a3Var22.x0;
                                    if (q4Var != null) {
                                        q4Var.a(tLObject);
                                        a3Var22.s();
                                        break;
                                    }
                                } else {
                                    a3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                a3 a3Var32 = a3Var5;
                                if (tL_error == null) {
                                    q4 q4Var2 = a3Var32.x0;
                                    if (q4Var2 != null) {
                                        q4Var2.a(tLObject);
                                        a3Var32.s();
                                        break;
                                    }
                                } else {
                                    a3Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                a3 a3Var42 = a3Var5;
                                if (tL_error == null) {
                                    q4 q4Var3 = a3Var42.x0;
                                    if (q4Var3 != null) {
                                        q4Var3.a(tLObject);
                                        a3Var42.s();
                                        break;
                                    }
                                } else {
                                    a3Var42.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                a3 a3Var52 = a3Var5;
                                if (tL_error == null) {
                                    q4 q4Var4 = a3Var52.x0;
                                    if (q4Var4 != null) {
                                        q4Var4.a(tLObject);
                                        a3Var52.s();
                                        break;
                                    }
                                } else {
                                    a3Var52.getClass();
                                    break;
                                }
                                break;
                            default:
                                a3 a3Var6 = a3Var5;
                                if (tL_error == null) {
                                    q4 q4Var5 = a3Var6.x0;
                                    if (q4Var5 != null) {
                                        q4Var5.a(tLObject);
                                        a3Var6.s();
                                        break;
                                    }
                                } else {
                                    a3Var6.getClass();
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
