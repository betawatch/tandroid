package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;

    public /* synthetic */ v4(k7 k7Var, int i10) {
        this.a = i10;
        this.b = k7Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final k7 k7Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ai.k2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                k7.h1(k7Var, tLObject, tL_error);
                                break;
                            default:
                                k7.z0(k7Var, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final k7 k7Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: ai.k2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                k7.h1(k7Var2, tLObject, tL_error);
                                break;
                            default:
                                k7.z0(k7Var2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
