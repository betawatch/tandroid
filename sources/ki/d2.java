package ki;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class d2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ t2 b;

    public /* synthetic */ d2(t2 t2Var, int i7) {
        this.a = i7;
        this.b = t2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new kg.h0(8, this.b, tL_error));
                break;
            case 1:
                final int i7 = 1;
                final t2 t2Var = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: ki.a2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                t2 t2Var2 = t2Var;
                                if (tL_error == null) {
                                    f4 f4Var = t2Var2.x0;
                                    if (f4Var != null) {
                                        f4Var.a(tLObject);
                                        t2Var2.s();
                                        break;
                                    }
                                } else {
                                    t2Var2.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                t2 t2Var3 = t2Var;
                                if (tL_error == null) {
                                    f4 f4Var2 = t2Var3.x0;
                                    if (f4Var2 != null) {
                                        f4Var2.a(tLObject);
                                        t2Var3.s();
                                        break;
                                    }
                                } else {
                                    t2Var3.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                t2 t2Var4 = t2Var;
                                if (tL_error == null) {
                                    f4 f4Var3 = t2Var4.x0;
                                    if (f4Var3 != null) {
                                        f4Var3.a(tLObject);
                                        t2Var4.s();
                                        break;
                                    }
                                } else {
                                    t2Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                t2 t2Var5 = t2Var;
                                if (tL_error == null) {
                                    f4 f4Var4 = t2Var5.x0;
                                    if (f4Var4 != null) {
                                        f4Var4.a(tLObject);
                                        t2Var5.s();
                                        break;
                                    }
                                } else {
                                    t2Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                t2 t2Var6 = t2Var;
                                if (tL_error == null) {
                                    f4 f4Var5 = t2Var6.x0;
                                    if (f4Var5 != null) {
                                        f4Var5.a(tLObject);
                                        t2Var6.s();
                                        break;
                                    }
                                } else {
                                    t2Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i10 = 4;
                final t2 t2Var2 = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: ki.a2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                t2 t2Var22 = t2Var2;
                                if (tL_error == null) {
                                    f4 f4Var = t2Var22.x0;
                                    if (f4Var != null) {
                                        f4Var.a(tLObject);
                                        t2Var22.s();
                                        break;
                                    }
                                } else {
                                    t2Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                t2 t2Var3 = t2Var2;
                                if (tL_error == null) {
                                    f4 f4Var2 = t2Var3.x0;
                                    if (f4Var2 != null) {
                                        f4Var2.a(tLObject);
                                        t2Var3.s();
                                        break;
                                    }
                                } else {
                                    t2Var3.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                t2 t2Var4 = t2Var2;
                                if (tL_error == null) {
                                    f4 f4Var3 = t2Var4.x0;
                                    if (f4Var3 != null) {
                                        f4Var3.a(tLObject);
                                        t2Var4.s();
                                        break;
                                    }
                                } else {
                                    t2Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                t2 t2Var5 = t2Var2;
                                if (tL_error == null) {
                                    f4 f4Var4 = t2Var5.x0;
                                    if (f4Var4 != null) {
                                        f4Var4.a(tLObject);
                                        t2Var5.s();
                                        break;
                                    }
                                } else {
                                    t2Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                t2 t2Var6 = t2Var2;
                                if (tL_error == null) {
                                    f4 f4Var5 = t2Var6.x0;
                                    if (f4Var5 != null) {
                                        f4Var5.a(tLObject);
                                        t2Var6.s();
                                        break;
                                    }
                                } else {
                                    t2Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                final int i11 = 0;
                final t2 t2Var3 = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: ki.a2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                t2 t2Var22 = t2Var3;
                                if (tL_error == null) {
                                    f4 f4Var = t2Var22.x0;
                                    if (f4Var != null) {
                                        f4Var.a(tLObject);
                                        t2Var22.s();
                                        break;
                                    }
                                } else {
                                    t2Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                t2 t2Var32 = t2Var3;
                                if (tL_error == null) {
                                    f4 f4Var2 = t2Var32.x0;
                                    if (f4Var2 != null) {
                                        f4Var2.a(tLObject);
                                        t2Var32.s();
                                        break;
                                    }
                                } else {
                                    t2Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                t2 t2Var4 = t2Var3;
                                if (tL_error == null) {
                                    f4 f4Var3 = t2Var4.x0;
                                    if (f4Var3 != null) {
                                        f4Var3.a(tLObject);
                                        t2Var4.s();
                                        break;
                                    }
                                } else {
                                    t2Var4.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                t2 t2Var5 = t2Var3;
                                if (tL_error == null) {
                                    f4 f4Var4 = t2Var5.x0;
                                    if (f4Var4 != null) {
                                        f4Var4.a(tLObject);
                                        t2Var5.s();
                                        break;
                                    }
                                } else {
                                    t2Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                t2 t2Var6 = t2Var3;
                                if (tL_error == null) {
                                    f4 f4Var5 = t2Var6.x0;
                                    if (f4Var5 != null) {
                                        f4Var5.a(tLObject);
                                        t2Var6.s();
                                        break;
                                    }
                                } else {
                                    t2Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                final int i12 = 2;
                final t2 t2Var4 = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: ki.a2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                t2 t2Var22 = t2Var4;
                                if (tL_error == null) {
                                    f4 f4Var = t2Var22.x0;
                                    if (f4Var != null) {
                                        f4Var.a(tLObject);
                                        t2Var22.s();
                                        break;
                                    }
                                } else {
                                    t2Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                t2 t2Var32 = t2Var4;
                                if (tL_error == null) {
                                    f4 f4Var2 = t2Var32.x0;
                                    if (f4Var2 != null) {
                                        f4Var2.a(tLObject);
                                        t2Var32.s();
                                        break;
                                    }
                                } else {
                                    t2Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                t2 t2Var42 = t2Var4;
                                if (tL_error == null) {
                                    f4 f4Var3 = t2Var42.x0;
                                    if (f4Var3 != null) {
                                        f4Var3.a(tLObject);
                                        t2Var42.s();
                                        break;
                                    }
                                } else {
                                    t2Var42.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                t2 t2Var5 = t2Var4;
                                if (tL_error == null) {
                                    f4 f4Var4 = t2Var5.x0;
                                    if (f4Var4 != null) {
                                        f4Var4.a(tLObject);
                                        t2Var5.s();
                                        break;
                                    }
                                } else {
                                    t2Var5.getClass();
                                    break;
                                }
                                break;
                            default:
                                t2 t2Var6 = t2Var4;
                                if (tL_error == null) {
                                    f4 f4Var5 = t2Var6.x0;
                                    if (f4Var5 != null) {
                                        f4Var5.a(tLObject);
                                        t2Var6.s();
                                        break;
                                    }
                                } else {
                                    t2Var6.getClass();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i13 = 3;
                final t2 t2Var5 = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: ki.a2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                t2 t2Var22 = t2Var5;
                                if (tL_error == null) {
                                    f4 f4Var = t2Var22.x0;
                                    if (f4Var != null) {
                                        f4Var.a(tLObject);
                                        t2Var22.s();
                                        break;
                                    }
                                } else {
                                    t2Var22.getClass();
                                    break;
                                }
                                break;
                            case 1:
                                t2 t2Var32 = t2Var5;
                                if (tL_error == null) {
                                    f4 f4Var2 = t2Var32.x0;
                                    if (f4Var2 != null) {
                                        f4Var2.a(tLObject);
                                        t2Var32.s();
                                        break;
                                    }
                                } else {
                                    t2Var32.getClass();
                                    break;
                                }
                                break;
                            case 2:
                                t2 t2Var42 = t2Var5;
                                if (tL_error == null) {
                                    f4 f4Var3 = t2Var42.x0;
                                    if (f4Var3 != null) {
                                        f4Var3.a(tLObject);
                                        t2Var42.s();
                                        break;
                                    }
                                } else {
                                    t2Var42.getClass();
                                    break;
                                }
                                break;
                            case 3:
                                t2 t2Var52 = t2Var5;
                                if (tL_error == null) {
                                    f4 f4Var4 = t2Var52.x0;
                                    if (f4Var4 != null) {
                                        f4Var4.a(tLObject);
                                        t2Var52.s();
                                        break;
                                    }
                                } else {
                                    t2Var52.getClass();
                                    break;
                                }
                                break;
                            default:
                                t2 t2Var6 = t2Var5;
                                if (tL_error == null) {
                                    f4 f4Var5 = t2Var6.x0;
                                    if (f4Var5 != null) {
                                        f4Var5.a(tLObject);
                                        t2Var6.s();
                                        break;
                                    }
                                } else {
                                    t2Var6.getClass();
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
