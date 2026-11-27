// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bg1 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ vnb f;

    public /* synthetic */ bg1(Object obj, Context context, int i, long j, vnb vnbVar, byte b) {
        this.a = b;
        this.b = obj;
        this.c = context;
        this.d = i;
        this.e = j;
        this.f = vnbVar;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                final nx0 nx0Var = (nx0) obj2;
                final TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                final byte b2 = 0;
                final Context context = this.c;
                final int i = this.d;
                final long j = this.e;
                final vnb vnbVar = this.f;
                hl.c3(new Runnable() { // from class: cg1
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        nx0 nx0Var2 = nx0Var;
                        TLRPC.UserFull userFull2 = userFull;
                        switch (b3) {
                            case 0:
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    nx0Var2.dismiss();
                                    ng1.J0(context, i, userFull2.starref_program, j, vnbVar, true);
                                    break;
                                }
                                break;
                            default:
                                if (userFull2 != null && userFull2.starref_program != null) {
                                    nx0Var2.dismiss();
                                    ng1.J0(context, i, userFull2.starref_program, j, vnbVar, true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final nx0 nx0Var2 = (nx0) obj2;
                final TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj;
                final byte b3 = 1;
                final Context context2 = this.c;
                final int i2 = this.d;
                final long j2 = this.e;
                final vnb vnbVar2 = this.f;
                hl.c3(new Runnable() { // from class: cg1
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        nx0 nx0Var22 = nx0Var2;
                        TLRPC.UserFull userFull22 = userFull2;
                        switch (b32) {
                            case 0:
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    nx0Var22.dismiss();
                                    ng1.J0(context2, i2, userFull22.starref_program, j2, vnbVar2, true);
                                    break;
                                }
                                break;
                            default:
                                if (userFull22 != null && userFull22.starref_program != null) {
                                    nx0Var22.dismiss();
                                    ng1.J0(context2, i2, userFull22.starref_program, j2, vnbVar2, true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                ((nx0[]) obj2)[0].dismiss();
                ng1.K0(this.c, this.d, (TL_payments.connectedBotStarRef) obj, this.e, this.f);
                break;
        }
    }
}
