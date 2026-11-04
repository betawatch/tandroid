package oc;

import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.Wallet.w0;
import org.telegram.ui.Wallet.x0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends a0 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, u uVar, int i3, int i10) {
        super(str, uVar, i3);
        this.b = i10;
    }

    @Override // oc.a0
    public final void a() {
        switch (this.b) {
            case 0:
                u uVar = this.a;
                try {
                    uVar.b();
                    break;
                } catch (v e10) {
                    b4.n nVar = uVar.d;
                    nVar.d(e10);
                    ArrayList arrayList = (ArrayList) nVar.q();
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        w0 w0Var = (w0) obj;
                        try {
                            try {
                                u uVar2 = (u) nVar.b;
                                g0.h3(new zo0(w0Var.c, uVar2, w0Var.a, "connect error: " + x0.a(e10), 19));
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            w0Var.getClass();
                        }
                    }
                    return;
                }
            default:
                this.a.d();
                break;
        }
    }
}
