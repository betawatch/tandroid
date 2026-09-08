package fi;

import di.b7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class p2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ k3 b;

    public /* synthetic */ p2(k3 k3Var, int i10) {
        this.a = i10;
        this.b = k3Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b7(25, this.b, tL_error));
                break;
            case 1:
                final int i10 = 1;
                final k3 k3Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: fi.i2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                k3 k3Var2 = k3Var;
                                if (tL_error == null) {
                                    f5 f5Var = k3Var2.v0;
                                    if (f5Var != null) {
                                        f5Var.a(tLObject);
                                        k3Var2.n();
                                        break;
                                    }
                                } else {
                                    k3Var2.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                k3 k3Var3 = k3Var;
                                if (tL_error == null) {
                                    f5 f5Var2 = k3Var3.v0;
                                    if (f5Var2 != null) {
                                        f5Var2.a(tLObject);
                                        k3Var3.n();
                                        break;
                                    }
                                } else {
                                    k3Var3.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                k3 k3Var4 = k3Var;
                                if (tL_error == null) {
                                    f5 f5Var3 = k3Var4.v0;
                                    if (f5Var3 != null) {
                                        f5Var3.a(tLObject);
                                        k3Var4.n();
                                        break;
                                    }
                                } else {
                                    k3Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                k3 k3Var5 = k3Var;
                                if (tL_error == null) {
                                    f5 f5Var4 = k3Var5.v0;
                                    if (f5Var4 != null) {
                                        f5Var4.a(tLObject);
                                        k3Var5.n();
                                        break;
                                    }
                                } else {
                                    k3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                k3 k3Var6 = k3Var;
                                if (tL_error == null) {
                                    f5 f5Var5 = k3Var6.v0;
                                    if (f5Var5 != null) {
                                        f5Var5.a(tLObject);
                                        k3Var6.n();
                                        break;
                                    }
                                } else {
                                    k3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 4;
                final k3 k3Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: fi.i2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                k3 k3Var22 = k3Var2;
                                if (tL_error == null) {
                                    f5 f5Var = k3Var22.v0;
                                    if (f5Var != null) {
                                        f5Var.a(tLObject);
                                        k3Var22.n();
                                        break;
                                    }
                                } else {
                                    k3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                k3 k3Var3 = k3Var2;
                                if (tL_error == null) {
                                    f5 f5Var2 = k3Var3.v0;
                                    if (f5Var2 != null) {
                                        f5Var2.a(tLObject);
                                        k3Var3.n();
                                        break;
                                    }
                                } else {
                                    k3Var3.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                k3 k3Var4 = k3Var2;
                                if (tL_error == null) {
                                    f5 f5Var3 = k3Var4.v0;
                                    if (f5Var3 != null) {
                                        f5Var3.a(tLObject);
                                        k3Var4.n();
                                        break;
                                    }
                                } else {
                                    k3Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                k3 k3Var5 = k3Var2;
                                if (tL_error == null) {
                                    f5 f5Var4 = k3Var5.v0;
                                    if (f5Var4 != null) {
                                        f5Var4.a(tLObject);
                                        k3Var5.n();
                                        break;
                                    }
                                } else {
                                    k3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                k3 k3Var6 = k3Var2;
                                if (tL_error == null) {
                                    f5 f5Var5 = k3Var6.v0;
                                    if (f5Var5 != null) {
                                        f5Var5.a(tLObject);
                                        k3Var6.n();
                                        break;
                                    }
                                } else {
                                    k3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                final int i12 = 0;
                final k3 k3Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: fi.i2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                k3 k3Var22 = k3Var3;
                                if (tL_error == null) {
                                    f5 f5Var = k3Var22.v0;
                                    if (f5Var != null) {
                                        f5Var.a(tLObject);
                                        k3Var22.n();
                                        break;
                                    }
                                } else {
                                    k3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                k3 k3Var32 = k3Var3;
                                if (tL_error == null) {
                                    f5 f5Var2 = k3Var32.v0;
                                    if (f5Var2 != null) {
                                        f5Var2.a(tLObject);
                                        k3Var32.n();
                                        break;
                                    }
                                } else {
                                    k3Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                k3 k3Var4 = k3Var3;
                                if (tL_error == null) {
                                    f5 f5Var3 = k3Var4.v0;
                                    if (f5Var3 != null) {
                                        f5Var3.a(tLObject);
                                        k3Var4.n();
                                        break;
                                    }
                                } else {
                                    k3Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                k3 k3Var5 = k3Var3;
                                if (tL_error == null) {
                                    f5 f5Var4 = k3Var5.v0;
                                    if (f5Var4 != null) {
                                        f5Var4.a(tLObject);
                                        k3Var5.n();
                                        break;
                                    }
                                } else {
                                    k3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                k3 k3Var6 = k3Var3;
                                if (tL_error == null) {
                                    f5 f5Var5 = k3Var6.v0;
                                    if (f5Var5 != null) {
                                        f5Var5.a(tLObject);
                                        k3Var6.n();
                                        break;
                                    }
                                } else {
                                    k3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                final int i13 = 2;
                final k3 k3Var4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: fi.i2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                k3 k3Var22 = k3Var4;
                                if (tL_error == null) {
                                    f5 f5Var = k3Var22.v0;
                                    if (f5Var != null) {
                                        f5Var.a(tLObject);
                                        k3Var22.n();
                                        break;
                                    }
                                } else {
                                    k3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                k3 k3Var32 = k3Var4;
                                if (tL_error == null) {
                                    f5 f5Var2 = k3Var32.v0;
                                    if (f5Var2 != null) {
                                        f5Var2.a(tLObject);
                                        k3Var32.n();
                                        break;
                                    }
                                } else {
                                    k3Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                k3 k3Var42 = k3Var4;
                                if (tL_error == null) {
                                    f5 f5Var3 = k3Var42.v0;
                                    if (f5Var3 != null) {
                                        f5Var3.a(tLObject);
                                        k3Var42.n();
                                        break;
                                    }
                                } else {
                                    k3Var42.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                k3 k3Var5 = k3Var4;
                                if (tL_error == null) {
                                    f5 f5Var4 = k3Var5.v0;
                                    if (f5Var4 != null) {
                                        f5Var4.a(tLObject);
                                        k3Var5.n();
                                        break;
                                    }
                                } else {
                                    k3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                k3 k3Var6 = k3Var4;
                                if (tL_error == null) {
                                    f5 f5Var5 = k3Var6.v0;
                                    if (f5Var5 != null) {
                                        f5Var5.a(tLObject);
                                        k3Var6.n();
                                        break;
                                    }
                                } else {
                                    k3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i14 = 3;
                final k3 k3Var5 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: fi.i2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                k3 k3Var22 = k3Var5;
                                if (tL_error == null) {
                                    f5 f5Var = k3Var22.v0;
                                    if (f5Var != null) {
                                        f5Var.a(tLObject);
                                        k3Var22.n();
                                        break;
                                    }
                                } else {
                                    k3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                k3 k3Var32 = k3Var5;
                                if (tL_error == null) {
                                    f5 f5Var2 = k3Var32.v0;
                                    if (f5Var2 != null) {
                                        f5Var2.a(tLObject);
                                        k3Var32.n();
                                        break;
                                    }
                                } else {
                                    k3Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                k3 k3Var42 = k3Var5;
                                if (tL_error == null) {
                                    f5 f5Var3 = k3Var42.v0;
                                    if (f5Var3 != null) {
                                        f5Var3.a(tLObject);
                                        k3Var42.n();
                                        break;
                                    }
                                } else {
                                    k3Var42.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                k3 k3Var52 = k3Var5;
                                if (tL_error == null) {
                                    f5 f5Var4 = k3Var52.v0;
                                    if (f5Var4 != null) {
                                        f5Var4.a(tLObject);
                                        k3Var52.n();
                                        break;
                                    }
                                } else {
                                    k3Var52.getClass();
                                    break;
                                }
                                break;
                            default:
                                k3 k3Var6 = k3Var5;
                                if (tL_error == null) {
                                    f5 f5Var5 = k3Var6.v0;
                                    if (f5Var5 != null) {
                                        f5Var5.a(tLObject);
                                        k3Var6.n();
                                        break;
                                    }
                                } else {
                                    k3Var6.getClass();
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
