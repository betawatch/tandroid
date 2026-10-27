package hi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ a(k kVar, int i10) {
        this.a = i10;
        this.b = kVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e2.q0(26, this.b, (TLRPC.UserFull) obj));
                break;
            case 1:
                k kVar = this.b;
                kVar.a0.commission_permille = ((Integer) obj).intValue();
                kVar.H0();
                break;
            default:
                k kVar2 = this.b;
                kVar2.a0.duration_months = ((Integer) kVar2.c0.get(((Integer) obj).intValue())).intValue();
                kVar2.H0();
                break;
        }
    }
}
