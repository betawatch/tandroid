package hg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;

    public /* synthetic */ t0(b1 b1Var, int i10) {
        this.a = i10;
        this.b = b1Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                b1 b1Var = this.b;
                b1Var.dismiss();
                AndroidUtilities.runOnUIThread(new q0(b1Var, 2), 220L);
                break;
            case 1:
                b1 b1Var2 = this.b;
                b1Var2.n0.b(false);
                r.j(b1Var2.getContext(), (TLRPC.TL_error) obj);
                break;
            case 2:
                b1 b1Var3 = this.b;
                b1Var3.k0 = b1Var3.V.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                b1Var3.a0(true, true);
                b1Var3.Z(true);
                break;
            case 3:
                b1 b1Var4 = this.b;
                b1Var4.dismiss();
                AndroidUtilities.runOnUIThread(new q0(b1Var4, 1), 220L);
                break;
            case 4:
                b1 b1Var5 = this.b;
                b1Var5.n0.b(false);
                r.j(b1Var5.getContext(), (TLRPC.TL_error) obj);
                break;
            case 5:
                b1 b1Var6 = this.b;
                ArrayList arrayList = b1Var6.c0;
                arrayList.clear();
                arrayList.addAll((List) obj);
                b1Var6.a0(true, true);
                break;
            default:
                b1 b1Var7 = this.b;
                b1Var7.n0.b(false);
                r.j(b1Var7.getContext(), (TLRPC.TL_error) obj);
                break;
        }
    }
}
