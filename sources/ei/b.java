package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;
    public final /* synthetic */ org.telegram.ui.ActionBar.a2 c;

    public /* synthetic */ b(l lVar, org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.a = i10;
        this.b = lVar;
        this.c = a2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final l lVar = this.b;
                final org.telegram.ui.ActionBar.a2 a2Var = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ei.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                l.y0(lVar, a2Var, tLObject, tL_error);
                                break;
                            default:
                                l.z0(lVar, a2Var, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final l lVar2 = this.b;
                final org.telegram.ui.ActionBar.a2 a2Var2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ei.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                l.y0(lVar2, a2Var2, tLObject, tL_error);
                                break;
                            default:
                                l.z0(lVar2, a2Var2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
