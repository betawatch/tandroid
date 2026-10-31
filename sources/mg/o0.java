package mg;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;

    public /* synthetic */ o0(w0 w0Var, int i10) {
        this.a = i10;
        this.b = w0Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                w0 w0Var = this.b;
                w0Var.dismiss();
                org.telegram.messenger.i0.h3(new l0(w0Var, 2), 220L);
                break;
            case 1:
                w0 w0Var2 = this.b;
                w0Var2.i2.b(false);
                p.j(w0Var2.getContext(), (TLRPC.TL_error) obj);
                break;
            case 2:
                w0 w0Var3 = this.b;
                w0Var3.f2 = w0Var3.Q1.indexOf(Integer.valueOf(((TLRPC.TL_premiumGiftCodeOption) obj).users));
                w0Var3.k1(true, true);
                w0Var3.j1(true);
                break;
            case 3:
                w0 w0Var4 = this.b;
                w0Var4.dismiss();
                org.telegram.messenger.i0.h3(new l0(w0Var4, 1), 220L);
                break;
            case 4:
                w0 w0Var5 = this.b;
                w0Var5.i2.b(false);
                p.j(w0Var5.getContext(), (TLRPC.TL_error) obj);
                break;
            case 5:
                w0 w0Var6 = this.b;
                ArrayList arrayList = w0Var6.X1;
                arrayList.clear();
                arrayList.addAll((List) obj);
                w0Var6.k1(true, true);
                break;
            default:
                w0 w0Var7 = this.b;
                w0Var7.i2.b(false);
                p.j(w0Var7.getContext(), (TLRPC.TL_error) obj);
                break;
        }
    }
}
