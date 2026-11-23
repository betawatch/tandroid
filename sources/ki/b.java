package ki;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;
    public final /* synthetic */ org.telegram.ui.ActionBar.t1 c;

    public /* synthetic */ b(j jVar, org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.a = i7;
        this.b = jVar;
        this.c = t1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 1;
                final j jVar = this.b;
                final org.telegram.ui.ActionBar.t1 t1Var = this.c;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: ki.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                j.B0(jVar, t1Var, tLObject, tL_error);
                                break;
                            default:
                                j.C0(jVar, t1Var, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final j jVar2 = this.b;
                final org.telegram.ui.ActionBar.t1 t1Var2 = this.c;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: ki.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                j.B0(jVar2, t1Var2, tLObject, tL_error);
                                break;
                            default:
                                j.C0(jVar2, t1Var2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
