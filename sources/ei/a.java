package ei;

import ci.b9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                AndroidUtilities.runOnUIThread(new b9(15, this.b, (TLRPC.UserFull) obj));
                break;
            case 1:
                l lVar = this.b;
                lVar.Y.commission_permille = ((Integer) obj).intValue();
                lVar.I0();
                break;
            default:
                l lVar2 = this.b;
                lVar2.Y.duration_months = ((Integer) lVar2.a0.get(((Integer) obj).intValue())).intValue();
                lVar2.I0();
                break;
        }
    }
}
