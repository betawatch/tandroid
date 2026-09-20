package ei;

import ci.b9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
