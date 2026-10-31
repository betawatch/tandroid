package lc;

import java.util.ArrayList;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Wallet.y0;
import org.telegram.ui.Wallet.z0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b extends b0 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, v vVar, int i10, int i11) {
        super(str, vVar, i10);
        this.b = i11;
    }

    @Override // lc.b0
    public final void a() {
        switch (this.b) {
            case 0:
                v vVar = this.a;
                try {
                    vVar.b();
                    break;
                } catch (w e) {
                    ac.a aVar = vVar.d;
                    aVar.d(e);
                    ArrayList arrayList = (ArrayList) aVar.o();
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        y0 y0Var = (y0) obj;
                        try {
                            try {
                                v vVar2 = (v) aVar.b;
                                i0.g3(new c11(y0Var.c, vVar2, y0Var.a, "connect error: " + z0.a(e), 13));
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            y0Var.getClass();
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
