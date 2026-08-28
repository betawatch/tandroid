package bg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ h1 b;

    public /* synthetic */ z0(h1 h1Var, int i9) {
        this.a = i9;
        this.b = h1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                h1 h1Var = this.b;
                h1Var.dismiss();
                AndroidUtilities.runOnUIThread(new v0(h1Var, 2), 220L);
                break;
            case 1:
                h1 h1Var2 = this.b;
                h1Var2.m0.b(false);
                u.j(h1Var2.getContext(), (TLRPC.TL_error) obj);
                break;
            case 2:
                h1 h1Var3 = this.b;
                h1Var3.j0 = h1Var3.U.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                h1Var3.Z(true, true);
                h1Var3.Y(true);
                break;
            case 3:
                h1 h1Var4 = this.b;
                h1Var4.dismiss();
                AndroidUtilities.runOnUIThread(new v0(h1Var4, 1), 220L);
                break;
            case 4:
                h1 h1Var5 = this.b;
                h1Var5.m0.b(false);
                u.j(h1Var5.getContext(), (TLRPC.TL_error) obj);
                break;
            case 5:
                h1 h1Var6 = this.b;
                ArrayList arrayList = h1Var6.b0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                h1Var6.Z(true, true);
                break;
            default:
                h1 h1Var7 = this.b;
                h1Var7.m0.b(false);
                u.j(h1Var7.getContext(), (TLRPC.TL_error) obj);
                break;
        }
    }
}
