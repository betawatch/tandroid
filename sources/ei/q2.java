package ei;

import ci.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class q2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ l3 b;

    public /* synthetic */ q2(l3 l3Var, int i10) {
        this.a = i10;
        this.b = l3Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new x8(17, this.b, tL_error));
                break;
            case 1:
                final int i10 = 1;
                final l3 l3Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ei.j2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                l3 l3Var2 = l3Var;
                                if (tL_error == null) {
                                    f5 f5Var = l3Var2.v0;
                                    if (f5Var != null) {
                                        f5Var.a(tLObject);
                                        l3Var2.n();
                                        break;
                                    }
                                } else {
                                    l3Var2.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                l3 l3Var3 = l3Var;
                                if (tL_error == null) {
                                    f5 f5Var2 = l3Var3.v0;
                                    if (f5Var2 != null) {
                                        f5Var2.a(tLObject);
                                        l3Var3.n();
                                        break;
                                    }
                                } else {
                                    l3Var3.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                l3 l3Var4 = l3Var;
                                if (tL_error == null) {
                                    f5 f5Var3 = l3Var4.v0;
                                    if (f5Var3 != null) {
                                        f5Var3.a(tLObject);
                                        l3Var4.n();
                                        break;
                                    }
                                } else {
                                    l3Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                l3 l3Var5 = l3Var;
                                if (tL_error == null) {
                                    f5 f5Var4 = l3Var5.v0;
                                    if (f5Var4 != null) {
                                        f5Var4.a(tLObject);
                                        l3Var5.n();
                                        break;
                                    }
                                } else {
                                    l3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                l3 l3Var6 = l3Var;
                                if (tL_error == null) {
                                    f5 f5Var5 = l3Var6.v0;
                                    if (f5Var5 != null) {
                                        f5Var5.a(tLObject);
                                        l3Var6.n();
                                        break;
                                    }
                                } else {
                                    l3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 4;
                final l3 l3Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ei.j2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                l3 l3Var22 = l3Var2;
                                if (tL_error == null) {
                                    f5 f5Var = l3Var22.v0;
                                    if (f5Var != null) {
                                        f5Var.a(tLObject);
                                        l3Var22.n();
                                        break;
                                    }
                                } else {
                                    l3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                l3 l3Var3 = l3Var2;
                                if (tL_error == null) {
                                    f5 f5Var2 = l3Var3.v0;
                                    if (f5Var2 != null) {
                                        f5Var2.a(tLObject);
                                        l3Var3.n();
                                        break;
                                    }
                                } else {
                                    l3Var3.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                l3 l3Var4 = l3Var2;
                                if (tL_error == null) {
                                    f5 f5Var3 = l3Var4.v0;
                                    if (f5Var3 != null) {
                                        f5Var3.a(tLObject);
                                        l3Var4.n();
                                        break;
                                    }
                                } else {
                                    l3Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                l3 l3Var5 = l3Var2;
                                if (tL_error == null) {
                                    f5 f5Var4 = l3Var5.v0;
                                    if (f5Var4 != null) {
                                        f5Var4.a(tLObject);
                                        l3Var5.n();
                                        break;
                                    }
                                } else {
                                    l3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                l3 l3Var6 = l3Var2;
                                if (tL_error == null) {
                                    f5 f5Var5 = l3Var6.v0;
                                    if (f5Var5 != null) {
                                        f5Var5.a(tLObject);
                                        l3Var6.n();
                                        break;
                                    }
                                } else {
                                    l3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                final int i12 = 0;
                final l3 l3Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ei.j2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                l3 l3Var22 = l3Var3;
                                if (tL_error == null) {
                                    f5 f5Var = l3Var22.v0;
                                    if (f5Var != null) {
                                        f5Var.a(tLObject);
                                        l3Var22.n();
                                        break;
                                    }
                                } else {
                                    l3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                l3 l3Var32 = l3Var3;
                                if (tL_error == null) {
                                    f5 f5Var2 = l3Var32.v0;
                                    if (f5Var2 != null) {
                                        f5Var2.a(tLObject);
                                        l3Var32.n();
                                        break;
                                    }
                                } else {
                                    l3Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                l3 l3Var4 = l3Var3;
                                if (tL_error == null) {
                                    f5 f5Var3 = l3Var4.v0;
                                    if (f5Var3 != null) {
                                        f5Var3.a(tLObject);
                                        l3Var4.n();
                                        break;
                                    }
                                } else {
                                    l3Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                l3 l3Var5 = l3Var3;
                                if (tL_error == null) {
                                    f5 f5Var4 = l3Var5.v0;
                                    if (f5Var4 != null) {
                                        f5Var4.a(tLObject);
                                        l3Var5.n();
                                        break;
                                    }
                                } else {
                                    l3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                l3 l3Var6 = l3Var3;
                                if (tL_error == null) {
                                    f5 f5Var5 = l3Var6.v0;
                                    if (f5Var5 != null) {
                                        f5Var5.a(tLObject);
                                        l3Var6.n();
                                        break;
                                    }
                                } else {
                                    l3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                final int i13 = 2;
                final l3 l3Var4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ei.j2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                l3 l3Var22 = l3Var4;
                                if (tL_error == null) {
                                    f5 f5Var = l3Var22.v0;
                                    if (f5Var != null) {
                                        f5Var.a(tLObject);
                                        l3Var22.n();
                                        break;
                                    }
                                } else {
                                    l3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                l3 l3Var32 = l3Var4;
                                if (tL_error == null) {
                                    f5 f5Var2 = l3Var32.v0;
                                    if (f5Var2 != null) {
                                        f5Var2.a(tLObject);
                                        l3Var32.n();
                                        break;
                                    }
                                } else {
                                    l3Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                l3 l3Var42 = l3Var4;
                                if (tL_error == null) {
                                    f5 f5Var3 = l3Var42.v0;
                                    if (f5Var3 != null) {
                                        f5Var3.a(tLObject);
                                        l3Var42.n();
                                        break;
                                    }
                                } else {
                                    l3Var42.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                l3 l3Var5 = l3Var4;
                                if (tL_error == null) {
                                    f5 f5Var4 = l3Var5.v0;
                                    if (f5Var4 != null) {
                                        f5Var4.a(tLObject);
                                        l3Var5.n();
                                        break;
                                    }
                                } else {
                                    l3Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                l3 l3Var6 = l3Var4;
                                if (tL_error == null) {
                                    f5 f5Var5 = l3Var6.v0;
                                    if (f5Var5 != null) {
                                        f5Var5.a(tLObject);
                                        l3Var6.n();
                                        break;
                                    }
                                } else {
                                    l3Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i14 = 3;
                final l3 l3Var5 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ei.j2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                l3 l3Var22 = l3Var5;
                                if (tL_error == null) {
                                    f5 f5Var = l3Var22.v0;
                                    if (f5Var != null) {
                                        f5Var.a(tLObject);
                                        l3Var22.n();
                                        break;
                                    }
                                } else {
                                    l3Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                l3 l3Var32 = l3Var5;
                                if (tL_error == null) {
                                    f5 f5Var2 = l3Var32.v0;
                                    if (f5Var2 != null) {
                                        f5Var2.a(tLObject);
                                        l3Var32.n();
                                        break;
                                    }
                                } else {
                                    l3Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                l3 l3Var42 = l3Var5;
                                if (tL_error == null) {
                                    f5 f5Var3 = l3Var42.v0;
                                    if (f5Var3 != null) {
                                        f5Var3.a(tLObject);
                                        l3Var42.n();
                                        break;
                                    }
                                } else {
                                    l3Var42.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                l3 l3Var52 = l3Var5;
                                if (tL_error == null) {
                                    f5 f5Var4 = l3Var52.v0;
                                    if (f5Var4 != null) {
                                        f5Var4.a(tLObject);
                                        l3Var52.n();
                                        break;
                                    }
                                } else {
                                    l3Var52.getClass();
                                    break;
                                }
                                break;
                            default:
                                l3 l3Var6 = l3Var5;
                                if (tL_error == null) {
                                    f5 f5Var5 = l3Var6.v0;
                                    if (f5Var5 != null) {
                                        f5Var5.a(tLObject);
                                        l3Var6.n();
                                        break;
                                    }
                                } else {
                                    l3Var6.getClass();
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
