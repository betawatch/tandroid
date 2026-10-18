package gi;

import ei.p6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ a(l lVar, int i10) {
        this.a = i10;
        this.b = lVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p6(14, this.b, (TLRPC.UserFull) obj));
                break;
            case 1:
                l lVar = this.b;
                lVar.Y.commission_permille = ((Integer) obj).intValue();
                lVar.J0();
                break;
            default:
                l lVar2 = this.b;
                lVar2.Y.duration_months = ((Integer) lVar2.a0.get(((Integer) obj).intValue())).intValue();
                lVar2.J0();
                break;
        }
    }
}
