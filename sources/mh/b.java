package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2 c;

    public /* synthetic */ b(l lVar, org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        this.a = i9;
        this.b = lVar;
        this.c = c2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i9 = 1;
                final l lVar = this.b;
                final org.telegram.ui.ActionBar.c2 c2Var = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: mh.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                l.x0(lVar, c2Var, tLObject, tL_error);
                                break;
                            default:
                                l.y0(lVar, c2Var, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final l lVar2 = this.b;
                final org.telegram.ui.ActionBar.c2 c2Var2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: mh.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                l.x0(lVar2, c2Var2, tLObject, tL_error);
                                break;
                            default:
                                l.y0(lVar2, c2Var2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
