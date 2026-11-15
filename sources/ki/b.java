package ki;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;
    public final /* synthetic */ org.telegram.ui.ActionBar.t1 c;

    public /* synthetic */ b(k kVar, org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.a = i7;
        this.b = kVar;
        this.c = t1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 1;
                final k kVar = this.b;
                final org.telegram.ui.ActionBar.t1 t1Var = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: ki.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                k.B0(kVar, t1Var, tLObject, tL_error);
                                break;
                            default:
                                k.C0(kVar, t1Var, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final k kVar2 = this.b;
                final org.telegram.ui.ActionBar.t1 t1Var2 = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: ki.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                k.B0(kVar2, t1Var2, tLObject, tL_error);
                                break;
                            default:
                                k.C0(kVar2, t1Var2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
