package ki;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;
    public final /* synthetic */ org.telegram.ui.ActionBar.u1 c;

    public /* synthetic */ b(k kVar, org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.a = i7;
        this.b = kVar;
        this.c = u1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 1;
                final k kVar = this.b;
                final org.telegram.ui.ActionBar.u1 u1Var = this.c;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: ki.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                k.B0(kVar, u1Var, tLObject, tL_error);
                                break;
                            default:
                                k.C0(kVar, u1Var, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final k kVar2 = this.b;
                final org.telegram.ui.ActionBar.u1 u1Var2 = this.c;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: ki.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                k.B0(kVar2, u1Var2, tLObject, tL_error);
                                break;
                            default:
                                k.C0(kVar2, u1Var2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
