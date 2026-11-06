package hi;

import android.content.Context;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d3 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ f6 f;

    public /* synthetic */ d3(Object obj, Context context, int i7, long j3, f6 f6Var, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = context;
        this.d = i7;
        this.e = j3;
        this.f = f6Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                final org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) this.b;
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final int i7 = 0;
                final Context context = this.c;
                final int i10 = this.d;
                final long j3 = this.e;
                final f6 f6Var = this.f;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: hi.e3
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                TLRPC.UserFull userFull2 = userFull;
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    v2Var.dismiss();
                                    q3.J0(context, i10, userFull2.starref_program, j3, f6Var, true);
                                    break;
                                }
                                break;
                            default:
                                TLRPC.UserFull userFull3 = userFull;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    v2Var.dismiss();
                                    q3.J0(context, i10, userFull3.starref_program, j3, f6Var, true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final org.telegram.ui.ActionBar.v2 v2Var2 = (org.telegram.ui.ActionBar.v2) this.b;
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final int i11 = 1;
                final Context context2 = this.c;
                final int i12 = this.d;
                final long j10 = this.e;
                final f6 f6Var2 = this.f;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: hi.e3
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                TLRPC.UserFull userFull22 = userFull2;
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    v2Var2.dismiss();
                                    q3.J0(context2, i12, userFull22.starref_program, j10, f6Var2, true);
                                    break;
                                }
                                break;
                            default:
                                TLRPC.UserFull userFull3 = userFull2;
                                if (userFull3 != null && userFull3.starref_program != null) {
                                    v2Var2.dismiss();
                                    q3.J0(context2, i12, userFull3.starref_program, j10, f6Var2, true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                ((org.telegram.ui.ActionBar.v2[]) this.b)[0].dismiss();
                q3.K0(this.c, this.d, (TL_payments.connectedBotStarRef) obj, this.e, this.f);
                break;
        }
    }
}
