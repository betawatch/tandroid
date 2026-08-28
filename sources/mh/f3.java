package mh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.b6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ b6 f;

    public /* synthetic */ f3(Object obj, Context context, int i9, long j10, b6 b6Var, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = context;
        this.d = i9;
        this.e = j10;
        this.f = b6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                final org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.b;
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final int i9 = 0;
                final Context context = this.c;
                final int i10 = this.d;
                final long j10 = this.e;
                final b6 b6Var = this.f;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: mh.g3
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    f3Var.dismiss();
                                    u3.F0(context, i10, userFull2.starref_program, j10, b6Var, true);
                                    break;
                                }
                                break;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    f3Var.dismiss();
                                    u3.F0(context, i10, userFull3.starref_program, j10, b6Var, true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.b;
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final int i11 = 1;
                final Context context2 = this.c;
                final int i12 = this.d;
                final long j11 = this.e;
                final b6 b6Var2 = this.f;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: mh.g3
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                TLRPC.UserFull userFull22 = userFull2;
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    f3Var2.dismiss();
                                    u3.F0(context2, i12, userFull22.starref_program, j11, b6Var2, true);
                                    break;
                                }
                                break;
                            default:
                                TLRPC.UserFull userFull3 = userFull2;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    f3Var2.dismiss();
                                    u3.F0(context2, i12, userFull3.starref_program, j11, b6Var2, true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                ((org.telegram.ui.ActionBar.f3[]) this.b)[0].dismiss();
                u3.G0(this.c, this.d, (TL_payments.connectedBotStarRef) obj, this.e, this.f);
                break;
        }
    }
}
