package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;
    public final /* synthetic */ org.telegram.ui.ActionBar.b2 c;

    public /* synthetic */ b(k kVar, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.a = i10;
        this.b = kVar;
        this.c = b2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final k kVar = this.b;
                final org.telegram.ui.ActionBar.b2 b2Var = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: nh.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                k.y0(kVar, b2Var, tLObject, tL_error);
                                break;
                            default:
                                k.z0(kVar, b2Var, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final k kVar2 = this.b;
                final org.telegram.ui.ActionBar.b2 b2Var2 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: nh.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                k.y0(kVar2, b2Var2, tLObject, tL_error);
                                break;
                            default:
                                k.z0(kVar2, b2Var2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
