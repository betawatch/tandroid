package mg;

import android.content.DialogInterface;
import org.telegram.messenger.at;
import org.telegram.messenger.e20;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;

    public /* synthetic */ l0(w0 w0Var, int i10) {
        this.a = i10;
        this.b = w0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        final int i11 = 1;
        final int i12 = 0;
        final w0 w0Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.messenger.i0.v1(w0Var.k1);
                break;
            case 1:
                at.f(e20.s0).k(at.V2, w0Var.T1, Boolean.TRUE);
                break;
            case 2:
                at.f(e20.s0).k(at.V2, w0Var.T1, Boolean.FALSE);
                break;
            case 3:
                kg.v1 v1Var = new kg.v1(w0Var.o1, w0Var.a, null, w0Var.I0);
                v1Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: mg.p0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (i11) {
                            case 0:
                                og.s sVar = w0Var.Y1.r;
                                if (sVar != null) {
                                    sVar.setPaused(false);
                                    break;
                                }
                                break;
                            default:
                                og.s sVar2 = w0Var.Y1.r;
                                if (sVar2 != null) {
                                    sVar2.setPaused(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                v1Var.setOnShowListener(new DialogInterface.OnShowListener() { // from class: mg.r0
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        switch (i11) {
                            case 0:
                                og.s sVar = w0Var.Y1.r;
                                if (sVar != null) {
                                    sVar.setPaused(true);
                                    break;
                                }
                                break;
                            default:
                                og.s sVar2 = w0Var.Y1.r;
                                if (sVar2 != null) {
                                    sVar2.setPaused(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                v1Var.show();
                break;
            default:
                kg.v1 v1Var2 = new kg.v1(w0Var.o1, w0Var.a, null, w0Var.I0);
                v1Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: mg.p0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        switch (i12) {
                            case 0:
                                og.s sVar = w0Var.Y1.r;
                                if (sVar != null) {
                                    sVar.setPaused(false);
                                    break;
                                }
                                break;
                            default:
                                og.s sVar2 = w0Var.Y1.r;
                                if (sVar2 != null) {
                                    sVar2.setPaused(false);
                                    break;
                                }
                                break;
                        }
                    }
                });
                v1Var2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: mg.r0
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        switch (i12) {
                            case 0:
                                og.s sVar = w0Var.Y1.r;
                                if (sVar != null) {
                                    sVar.setPaused(true);
                                    break;
                                }
                                break;
                            default:
                                og.s sVar2 = w0Var.Y1.r;
                                if (sVar2 != null) {
                                    sVar2.setPaused(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                v1Var2.show();
                break;
        }
    }
}
