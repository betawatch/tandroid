package ii;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;
    public final /* synthetic */ org.telegram.ui.ActionBar.s1 c;

    public /* synthetic */ b(k kVar, org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        this.a = i3;
        this.b = kVar;
        this.c = s1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i3 = 1;
                final k kVar = this.b;
                final org.telegram.ui.ActionBar.s1 s1Var = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: ii.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                k.B0(kVar, s1Var, tLObject, tL_error);
                                break;
                            default:
                                k.C0(kVar, s1Var, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final k kVar2 = this.b;
                final org.telegram.ui.ActionBar.s1 s1Var2 = this.c;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: ii.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                k.B0(kVar2, s1Var2, tLObject, tL_error);
                                break;
                            default:
                                k.C0(kVar2, s1Var2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
