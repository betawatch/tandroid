package di;

import bi.af;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                AndroidUtilities.runOnUIThread(new af(9, this.b, (TLRPC.UserFull) obj));
                break;
            case 1:
                m mVar = this.b;
                mVar.Y.commission_permille = ((Integer) obj).intValue();
                mVar.I0();
                break;
            default:
                m mVar2 = this.b;
                mVar2.Y.duration_months = ((Integer) mVar2.a0.get(((Integer) obj).intValue())).intValue();
                mVar2.I0();
                break;
        }
    }
}
