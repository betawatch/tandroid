package cg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;

    public /* synthetic */ v0(d1 d1Var, int i10) {
        this.a = i10;
        this.b = d1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                d1 d1Var = this.b;
                d1Var.dismiss();
                AndroidUtilities.runOnUIThread(new r0(d1Var, 2), 220L);
                break;
            case 1:
                d1 d1Var2 = this.b;
                d1Var2.m0.b(false);
                r.j(d1Var2.getContext(), (TLRPC.TL_error) obj);
                break;
            case 2:
                d1 d1Var3 = this.b;
                d1Var3.j0 = d1Var3.U.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                d1Var3.a0(true, true);
                d1Var3.Z(true);
                break;
            case 3:
                d1 d1Var4 = this.b;
                d1Var4.dismiss();
                AndroidUtilities.runOnUIThread(new r0(d1Var4, 1), 220L);
                break;
            case 4:
                d1 d1Var5 = this.b;
                d1Var5.m0.b(false);
                r.j(d1Var5.getContext(), (TLRPC.TL_error) obj);
                break;
            case 5:
                d1 d1Var6 = this.b;
                ArrayList arrayList = d1Var6.b0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                d1Var6.a0(true, true);
                break;
            default:
                d1 d1Var7 = this.b;
                d1Var7.m0.b(false);
                r.j(d1Var7.getContext(), (TLRPC.TL_error) obj);
                break;
        }
    }
}
