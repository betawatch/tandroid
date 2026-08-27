package hh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class g3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ i5 b;

    public /* synthetic */ g3(i5 i5Var, int i10) {
        this.a = i10;
        this.b = i5Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final i5 i5Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: hh.x1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                i5.a0(i5Var, tLObject, tL_error);
                                break;
                            default:
                                i5.y0(i5Var, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final i5 i5Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: hh.x1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                i5.a0(i5Var2, tLObject, tL_error);
                                break;
                            default:
                                i5.y0(i5Var2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
