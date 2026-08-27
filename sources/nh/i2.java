package nh;

import lh.k7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ b3 b;

    public /* synthetic */ i2(b3 b3Var, int i10) {
        this.a = i10;
        this.b = b3Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k7(11, this.b, tL_error));
                break;
            case 1:
                final int i10 = 1;
                final b3 b3Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: nh.c2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                b3 b3Var2 = b3Var;
                                if (tL_error == null) {
                                    q4 q4Var = b3Var2.r0;
                                    if (q4Var != null) {
                                        q4Var.a(tLObject);
                                        b3Var2.n();
                                        break;
                                    }
                                } else {
                                    b3Var2.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                b3 b3Var3 = b3Var;
                                if (tL_error == null) {
                                    q4 q4Var2 = b3Var3.r0;
                                    if (q4Var2 != null) {
                                        q4Var2.a(tLObject);
                                        b3Var3.n();
                                        break;
                                    }
                                } else {
                                    b3Var3.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                b3 b3Var4 = b3Var;
                                if (tL_error == null) {
                                    q4 q4Var3 = b3Var4.r0;
                                    if (q4Var3 != null) {
                                        q4Var3.a(tLObject);
                                        b3Var4.n();
                                        break;
                                    }
                                } else {
                                    b3Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                b3 b3Var5 = b3Var;
                                if (tL_error == null) {
                                    q4 q4Var4 = b3Var5.r0;
                                    if (q4Var4 != null) {
                                        q4Var4.a(tLObject);
                                        b3Var5.n();
                                        break;
                                    }
                                } else {
                                    b3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                b3 b3Var6 = b3Var;
                                if (tL_error == null) {
                                    q4 q4Var5 = b3Var6.r0;
                                    if (q4Var5 != null) {
                                        q4Var5.a(tLObject);
                                        b3Var6.n();
                                        break;
                                    }
                                } else {
                                    b3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 4;
                final b3 b3Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: nh.c2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                b3 b3Var22 = b3Var2;
                                if (tL_error == null) {
                                    q4 q4Var = b3Var22.r0;
                                    if (q4Var != null) {
                                        q4Var.a(tLObject);
                                        b3Var22.n();
                                        break;
                                    }
                                } else {
                                    b3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                b3 b3Var3 = b3Var2;
                                if (tL_error == null) {
                                    q4 q4Var2 = b3Var3.r0;
                                    if (q4Var2 != null) {
                                        q4Var2.a(tLObject);
                                        b3Var3.n();
                                        break;
                                    }
                                } else {
                                    b3Var3.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                b3 b3Var4 = b3Var2;
                                if (tL_error == null) {
                                    q4 q4Var3 = b3Var4.r0;
                                    if (q4Var3 != null) {
                                        q4Var3.a(tLObject);
                                        b3Var4.n();
                                        break;
                                    }
                                } else {
                                    b3Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                b3 b3Var5 = b3Var2;
                                if (tL_error == null) {
                                    q4 q4Var4 = b3Var5.r0;
                                    if (q4Var4 != null) {
                                        q4Var4.a(tLObject);
                                        b3Var5.n();
                                        break;
                                    }
                                } else {
                                    b3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                b3 b3Var6 = b3Var2;
                                if (tL_error == null) {
                                    q4 q4Var5 = b3Var6.r0;
                                    if (q4Var5 != null) {
                                        q4Var5.a(tLObject);
                                        b3Var6.n();
                                        break;
                                    }
                                } else {
                                    b3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                final int i12 = 0;
                final b3 b3Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: nh.c2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                b3 b3Var22 = b3Var3;
                                if (tL_error == null) {
                                    q4 q4Var = b3Var22.r0;
                                    if (q4Var != null) {
                                        q4Var.a(tLObject);
                                        b3Var22.n();
                                        break;
                                    }
                                } else {
                                    b3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                b3 b3Var32 = b3Var3;
                                if (tL_error == null) {
                                    q4 q4Var2 = b3Var32.r0;
                                    if (q4Var2 != null) {
                                        q4Var2.a(tLObject);
                                        b3Var32.n();
                                        break;
                                    }
                                } else {
                                    b3Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                b3 b3Var4 = b3Var3;
                                if (tL_error == null) {
                                    q4 q4Var3 = b3Var4.r0;
                                    if (q4Var3 != null) {
                                        q4Var3.a(tLObject);
                                        b3Var4.n();
                                        break;
                                    }
                                } else {
                                    b3Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                b3 b3Var5 = b3Var3;
                                if (tL_error == null) {
                                    q4 q4Var4 = b3Var5.r0;
                                    if (q4Var4 != null) {
                                        q4Var4.a(tLObject);
                                        b3Var5.n();
                                        break;
                                    }
                                } else {
                                    b3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                b3 b3Var6 = b3Var3;
                                if (tL_error == null) {
                                    q4 q4Var5 = b3Var6.r0;
                                    if (q4Var5 != null) {
                                        q4Var5.a(tLObject);
                                        b3Var6.n();
                                        break;
                                    }
                                } else {
                                    b3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                final int i13 = 2;
                final b3 b3Var4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: nh.c2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                b3 b3Var22 = b3Var4;
                                if (tL_error == null) {
                                    q4 q4Var = b3Var22.r0;
                                    if (q4Var != null) {
                                        q4Var.a(tLObject);
                                        b3Var22.n();
                                        break;
                                    }
                                } else {
                                    b3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                b3 b3Var32 = b3Var4;
                                if (tL_error == null) {
                                    q4 q4Var2 = b3Var32.r0;
                                    if (q4Var2 != null) {
                                        q4Var2.a(tLObject);
                                        b3Var32.n();
                                        break;
                                    }
                                } else {
                                    b3Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                b3 b3Var42 = b3Var4;
                                if (tL_error == null) {
                                    q4 q4Var3 = b3Var42.r0;
                                    if (q4Var3 != null) {
                                        q4Var3.a(tLObject);
                                        b3Var42.n();
                                        break;
                                    }
                                } else {
                                    b3Var42.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                b3 b3Var5 = b3Var4;
                                if (tL_error == null) {
                                    q4 q4Var4 = b3Var5.r0;
                                    if (q4Var4 != null) {
                                        q4Var4.a(tLObject);
                                        b3Var5.n();
                                        break;
                                    }
                                } else {
                                    b3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                b3 b3Var6 = b3Var4;
                                if (tL_error == null) {
                                    q4 q4Var5 = b3Var6.r0;
                                    if (q4Var5 != null) {
                                        q4Var5.a(tLObject);
                                        b3Var6.n();
                                        break;
                                    }
                                } else {
                                    b3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i14 = 3;
                final b3 b3Var5 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: nh.c2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                b3 b3Var22 = b3Var5;
                                if (tL_error == null) {
                                    q4 q4Var = b3Var22.r0;
                                    if (q4Var != null) {
                                        q4Var.a(tLObject);
                                        b3Var22.n();
                                        break;
                                    }
                                } else {
                                    b3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                b3 b3Var32 = b3Var5;
                                if (tL_error == null) {
                                    q4 q4Var2 = b3Var32.r0;
                                    if (q4Var2 != null) {
                                        q4Var2.a(tLObject);
                                        b3Var32.n();
                                        break;
                                    }
                                } else {
                                    b3Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                b3 b3Var42 = b3Var5;
                                if (tL_error == null) {
                                    q4 q4Var3 = b3Var42.r0;
                                    if (q4Var3 != null) {
                                        q4Var3.a(tLObject);
                                        b3Var42.n();
                                        break;
                                    }
                                } else {
                                    b3Var42.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                b3 b3Var52 = b3Var5;
                                if (tL_error == null) {
                                    q4 q4Var4 = b3Var52.r0;
                                    if (q4Var4 != null) {
                                        q4Var4.a(tLObject);
                                        b3Var52.n();
                                        break;
                                    }
                                } else {
                                    b3Var52.getClass();
                                    break;
                                }
                                break;
                            default:
                                b3 b3Var6 = b3Var5;
                                if (tL_error == null) {
                                    q4 q4Var5 = b3Var6.r0;
                                    if (q4Var5 != null) {
                                        q4Var5.a(tLObject);
                                        b3Var6.n();
                                        break;
                                    }
                                } else {
                                    b3Var6.getClass();
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
