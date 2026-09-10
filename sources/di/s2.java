package di;

import bi.af;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class s2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ n3 b;

    public /* synthetic */ s2(n3 n3Var, int i10) {
        this.a = i10;
        this.b = n3Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new af(11, this.b, tL_error));
                break;
            case 1:
                final int i10 = 1;
                final n3 n3Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: di.l2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                n3 n3Var2 = n3Var;
                                if (tL_error == null) {
                                    j5 j5Var = n3Var2.v0;
                                    if (j5Var != null) {
                                        j5Var.a(tLObject);
                                        n3Var2.n();
                                        break;
                                    }
                                } else {
                                    n3Var2.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                n3 n3Var3 = n3Var;
                                if (tL_error == null) {
                                    j5 j5Var2 = n3Var3.v0;
                                    if (j5Var2 != null) {
                                        j5Var2.a(tLObject);
                                        n3Var3.n();
                                        break;
                                    }
                                } else {
                                    n3Var3.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                n3 n3Var4 = n3Var;
                                if (tL_error == null) {
                                    j5 j5Var3 = n3Var4.v0;
                                    if (j5Var3 != null) {
                                        j5Var3.a(tLObject);
                                        n3Var4.n();
                                        break;
                                    }
                                } else {
                                    n3Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                n3 n3Var5 = n3Var;
                                if (tL_error == null) {
                                    j5 j5Var4 = n3Var5.v0;
                                    if (j5Var4 != null) {
                                        j5Var4.a(tLObject);
                                        n3Var5.n();
                                        break;
                                    }
                                } else {
                                    n3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                n3 n3Var6 = n3Var;
                                if (tL_error == null) {
                                    j5 j5Var5 = n3Var6.v0;
                                    if (j5Var5 != null) {
                                        j5Var5.a(tLObject);
                                        n3Var6.n();
                                        break;
                                    }
                                } else {
                                    n3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 4;
                final n3 n3Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: di.l2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                n3 n3Var22 = n3Var2;
                                if (tL_error == null) {
                                    j5 j5Var = n3Var22.v0;
                                    if (j5Var != null) {
                                        j5Var.a(tLObject);
                                        n3Var22.n();
                                        break;
                                    }
                                } else {
                                    n3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                n3 n3Var3 = n3Var2;
                                if (tL_error == null) {
                                    j5 j5Var2 = n3Var3.v0;
                                    if (j5Var2 != null) {
                                        j5Var2.a(tLObject);
                                        n3Var3.n();
                                        break;
                                    }
                                } else {
                                    n3Var3.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                n3 n3Var4 = n3Var2;
                                if (tL_error == null) {
                                    j5 j5Var3 = n3Var4.v0;
                                    if (j5Var3 != null) {
                                        j5Var3.a(tLObject);
                                        n3Var4.n();
                                        break;
                                    }
                                } else {
                                    n3Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                n3 n3Var5 = n3Var2;
                                if (tL_error == null) {
                                    j5 j5Var4 = n3Var5.v0;
                                    if (j5Var4 != null) {
                                        j5Var4.a(tLObject);
                                        n3Var5.n();
                                        break;
                                    }
                                } else {
                                    n3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                n3 n3Var6 = n3Var2;
                                if (tL_error == null) {
                                    j5 j5Var5 = n3Var6.v0;
                                    if (j5Var5 != null) {
                                        j5Var5.a(tLObject);
                                        n3Var6.n();
                                        break;
                                    }
                                } else {
                                    n3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                final int i12 = 0;
                final n3 n3Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: di.l2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                n3 n3Var22 = n3Var3;
                                if (tL_error == null) {
                                    j5 j5Var = n3Var22.v0;
                                    if (j5Var != null) {
                                        j5Var.a(tLObject);
                                        n3Var22.n();
                                        break;
                                    }
                                } else {
                                    n3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                n3 n3Var32 = n3Var3;
                                if (tL_error == null) {
                                    j5 j5Var2 = n3Var32.v0;
                                    if (j5Var2 != null) {
                                        j5Var2.a(tLObject);
                                        n3Var32.n();
                                        break;
                                    }
                                } else {
                                    n3Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                n3 n3Var4 = n3Var3;
                                if (tL_error == null) {
                                    j5 j5Var3 = n3Var4.v0;
                                    if (j5Var3 != null) {
                                        j5Var3.a(tLObject);
                                        n3Var4.n();
                                        break;
                                    }
                                } else {
                                    n3Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                n3 n3Var5 = n3Var3;
                                if (tL_error == null) {
                                    j5 j5Var4 = n3Var5.v0;
                                    if (j5Var4 != null) {
                                        j5Var4.a(tLObject);
                                        n3Var5.n();
                                        break;
                                    }
                                } else {
                                    n3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                n3 n3Var6 = n3Var3;
                                if (tL_error == null) {
                                    j5 j5Var5 = n3Var6.v0;
                                    if (j5Var5 != null) {
                                        j5Var5.a(tLObject);
                                        n3Var6.n();
                                        break;
                                    }
                                } else {
                                    n3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                final int i13 = 2;
                final n3 n3Var4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: di.l2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                n3 n3Var22 = n3Var4;
                                if (tL_error == null) {
                                    j5 j5Var = n3Var22.v0;
                                    if (j5Var != null) {
                                        j5Var.a(tLObject);
                                        n3Var22.n();
                                        break;
                                    }
                                } else {
                                    n3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                n3 n3Var32 = n3Var4;
                                if (tL_error == null) {
                                    j5 j5Var2 = n3Var32.v0;
                                    if (j5Var2 != null) {
                                        j5Var2.a(tLObject);
                                        n3Var32.n();
                                        break;
                                    }
                                } else {
                                    n3Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                n3 n3Var42 = n3Var4;
                                if (tL_error == null) {
                                    j5 j5Var3 = n3Var42.v0;
                                    if (j5Var3 != null) {
                                        j5Var3.a(tLObject);
                                        n3Var42.n();
                                        break;
                                    }
                                } else {
                                    n3Var42.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                n3 n3Var5 = n3Var4;
                                if (tL_error == null) {
                                    j5 j5Var4 = n3Var5.v0;
                                    if (j5Var4 != null) {
                                        j5Var4.a(tLObject);
                                        n3Var5.n();
                                        break;
                                    }
                                } else {
                                    n3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                n3 n3Var6 = n3Var4;
                                if (tL_error == null) {
                                    j5 j5Var5 = n3Var6.v0;
                                    if (j5Var5 != null) {
                                        j5Var5.a(tLObject);
                                        n3Var6.n();
                                        break;
                                    }
                                } else {
                                    n3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i14 = 3;
                final n3 n3Var5 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: di.l2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                n3 n3Var22 = n3Var5;
                                if (tL_error == null) {
                                    j5 j5Var = n3Var22.v0;
                                    if (j5Var != null) {
                                        j5Var.a(tLObject);
                                        n3Var22.n();
                                        break;
                                    }
                                } else {
                                    n3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                n3 n3Var32 = n3Var5;
                                if (tL_error == null) {
                                    j5 j5Var2 = n3Var32.v0;
                                    if (j5Var2 != null) {
                                        j5Var2.a(tLObject);
                                        n3Var32.n();
                                        break;
                                    }
                                } else {
                                    n3Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                n3 n3Var42 = n3Var5;
                                if (tL_error == null) {
                                    j5 j5Var3 = n3Var42.v0;
                                    if (j5Var3 != null) {
                                        j5Var3.a(tLObject);
                                        n3Var42.n();
                                        break;
                                    }
                                } else {
                                    n3Var42.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                n3 n3Var52 = n3Var5;
                                if (tL_error == null) {
                                    j5 j5Var4 = n3Var52.v0;
                                    if (j5Var4 != null) {
                                        j5Var4.a(tLObject);
                                        n3Var52.n();
                                        break;
                                    }
                                } else {
                                    n3Var52.getClass();
                                    break;
                                }
                                break;
                            default:
                                n3 n3Var6 = n3Var5;
                                if (tL_error == null) {
                                    j5 j5Var5 = n3Var6.v0;
                                    if (j5Var5 != null) {
                                        j5Var5.a(tLObject);
                                        n3Var6.n();
                                        break;
                                    }
                                } else {
                                    n3Var6.getClass();
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
