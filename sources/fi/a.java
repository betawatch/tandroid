package fi;

import di.b7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                AndroidUtilities.runOnUIThread(new b7(23, this.b, (TLRPC.UserFull) obj));
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
