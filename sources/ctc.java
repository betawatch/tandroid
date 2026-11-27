// default package

import java.util.ArrayList;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ctc implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gtc b;
    public final /* synthetic */ l01 c;
    public final /* synthetic */ c d;

    public /* synthetic */ ctc(gtc gtcVar, l01 l01Var, c cVar, byte b) {
        this.a = b;
        this.b = gtcVar;
        this.c = l01Var;
        this.d = cVar;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        c cVar = this.d;
        l01 l01Var = this.c;
        gtc gtcVar = this.b;
        switch (b) {
            case 0:
                c35 c35Var = (c35) obj;
                String str = (String) obj2;
                l01Var.c(false);
                if (c35Var != null) {
                    ntc ntcVar = new ntc();
                    ntcVar.h = true;
                    ArrayList arrayList = ntcVar.a;
                    arrayList.clear();
                    if (!c35Var.d()) {
                        arrayList.addAll(c35Var.f());
                    }
                    ntcVar.Z();
                    ntcVar.f = new vlc(gtcVar, cVar, (byte) 22);
                    gtcVar.presentFragment(ntcVar);
                    break;
                } else {
                    d31.b0(gtcVar).f0(str != null ? str : "NULL_ERROR", false);
                    break;
                }
            default:
                z25 z25Var = (z25) obj;
                String str2 = (String) obj2;
                l01Var.c(false);
                if (z25Var != null) {
                    if (!gtcVar.f) {
                        gtcVar.e.add(z25Var);
                        ntc ntcVar2 = new ntc();
                        c35 c35Var2 = z25Var.b;
                        ArrayList arrayList2 = ntcVar2.a;
                        arrayList2.clear();
                        if (!c35Var2.d()) {
                            arrayList2.addAll(c35Var2.f());
                        }
                        ntcVar2.Z();
                        ntcVar2.f = new b6c(gtcVar, cVar, z25Var, (byte) 28);
                        gtcVar.presentFragment(ntcVar2);
                        break;
                    } else {
                        z25Var.close();
                        break;
                    }
                } else {
                    d31.b0(gtcVar).f0(str2 != null ? str2 : "NULL_ERROR", false);
                    break;
                }
        }
    }
}
