package eg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ u0(c1 c1Var, int i10) {
        this.a = i10;
        this.b = c1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                c1 c1Var = this.b;
                c1Var.dismiss();
                AndroidUtilities.runOnUIThread(new r0(c1Var, 2), 220L);
                break;
            case 1:
                c1 c1Var2 = this.b;
                c1Var2.m0.b(false);
                s.j(c1Var2.getContext(), (TLRPC.TL_error) obj);
                break;
            case 2:
                c1 c1Var3 = this.b;
                c1Var3.j0 = c1Var3.U.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                c1Var3.a0(true, true);
                c1Var3.Z(true);
                break;
            case 3:
                c1 c1Var4 = this.b;
                c1Var4.dismiss();
                AndroidUtilities.runOnUIThread(new r0(c1Var4, 1), 220L);
                break;
            case 4:
                c1 c1Var5 = this.b;
                c1Var5.m0.b(false);
                s.j(c1Var5.getContext(), (TLRPC.TL_error) obj);
                break;
            case 5:
                c1 c1Var6 = this.b;
                ArrayList arrayList = c1Var6.b0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                c1Var6.a0(true, true);
                break;
            default:
                c1 c1Var7 = this.b;
                c1Var7.m0.b(false);
                s.j(c1Var7.getContext(), (TLRPC.TL_error) obj);
                break;
        }
    }
}
