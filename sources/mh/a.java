package mh;

import kh.o8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ a(l lVar, int i9) {
        this.a = i9;
        this.b = lVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new o8(3, this.b, (TLRPC.UserFull) obj));
                break;
            case 1:
                l lVar = this.b;
                lVar.U.commission_permille = ((Integer) obj).intValue();
                lVar.H0();
                break;
            default:
                l lVar2 = this.b;
                lVar2.U.duration_months = ((Integer) lVar2.W.get(((Integer) obj).intValue())).intValue();
                lVar2.H0();
                break;
        }
    }
}
