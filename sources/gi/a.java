package gi;

import ei.p6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                lVar.a0.commission_permille = ((Integer) obj).intValue();
                lVar.J0();
                break;
            default:
                l lVar2 = this.b;
                lVar2.a0.duration_months = ((Integer) lVar2.c0.get(((Integer) obj).intValue())).intValue();
                lVar2.J0();
                break;
        }
    }
}
