package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 c;

    public /* synthetic */ b(m mVar, org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.a = i10;
        this.b = mVar;
        this.c = d2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final m mVar = this.b;
                final org.telegram.ui.ActionBar.d2 d2Var = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: di.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                m.y0(mVar, d2Var, tLObject, tL_error);
                                break;
                            default:
                                m.z0(mVar, d2Var, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final m mVar2 = this.b;
                final org.telegram.ui.ActionBar.d2 d2Var2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: di.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                m.y0(mVar2, d2Var2, tLObject, tL_error);
                                break;
                            default:
                                m.z0(mVar2, d2Var2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
