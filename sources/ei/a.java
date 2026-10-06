package ei;

import ci.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ a(m mVar, int i10) {
        this.a = i10;
        this.b = mVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new x8(15, this.b, (TLRPC.UserFull) obj));
                break;
            case 1:
                m mVar = this.b;
                mVar.Y.commission_permille = ((Integer) obj).intValue();
                mVar.N0();
                break;
            default:
                m mVar2 = this.b;
                mVar2.Y.duration_months = ((Integer) mVar2.a0.get(((Integer) obj).intValue())).intValue();
                mVar2.N0();
                break;
        }
    }
}
