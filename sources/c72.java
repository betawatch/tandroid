// default package

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class c72 implements t22 {
    public final /* synthetic */ x02 a;
    public final /* synthetic */ e72 b;

    public c72(e72 e72Var, x02 x02Var) {
        this.b = e72Var;
        this.a = x02Var;
    }

    @Override // t22
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, long j2) {
        ye9 ye9Var = this.b.r;
        if (!arrayList.isEmpty()) {
            ye9Var.X1((String) arrayList.get(0));
        } else if (!arrayList3.isEmpty()) {
            k27 k27Var = (k27) arrayList3.get(0);
            ye9Var.getClass();
            if (k27Var != null && k27Var.F0() != null) {
                TLRPC.Document F0 = k27Var.F0();
                TLRPC.Message message = k27Var.k;
                ye9Var.Y1(F0, message != null ? message.attachPath : null);
            }
        }
        this.a.a(true);
    }

    @Override // t22
    public final void z() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.b.b.Z1.startActivityForResult(intent, 21);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // t22
    public final void S() {
    }

    @Override // t22
    public final void m(ArrayList arrayList, boolean z, int i, long j) {
    }
}
