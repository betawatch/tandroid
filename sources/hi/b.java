package hi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 c;

    public /* synthetic */ b(k kVar, org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        this.a = i10;
        this.b = kVar;
        this.c = e2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final k kVar = this.b;
                final org.telegram.ui.ActionBar.e2 e2Var = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: hi.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                k.x0(kVar, e2Var, tLObject, tL_error);
                                break;
                            default:
                                k.y0(kVar, e2Var, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final k kVar2 = this.b;
                final org.telegram.ui.ActionBar.e2 e2Var2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: hi.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                k.x0(kVar2, e2Var2, tLObject, tL_error);
                                break;
                            default:
                                k.y0(kVar2, e2Var2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
