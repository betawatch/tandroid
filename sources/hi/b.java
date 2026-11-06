package hi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;
    public final /* synthetic */ org.telegram.ui.ActionBar.u1 c;

    public /* synthetic */ b(j jVar, org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.a = i7;
        this.b = jVar;
        this.c = u1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 1;
                final j jVar = this.b;
                final org.telegram.ui.ActionBar.u1 u1Var = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: hi.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                j.B0(jVar, u1Var, tLObject, tL_error);
                                break;
                            default:
                                j.C0(jVar, u1Var, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final j jVar2 = this.b;
                final org.telegram.ui.ActionBar.u1 u1Var2 = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: hi.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                j.B0(jVar2, u1Var2, tLObject, tL_error);
                                break;
                            default:
                                j.C0(jVar2, u1Var2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
