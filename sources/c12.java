// default package

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class c12 implements j98 {
    public boolean a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ n12 d;

    public c12(n12 n12Var, HashMap hashMap, ArrayList arrayList) {
        this.d = n12Var;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override // j98
    public final void C(int i, boolean z, boolean z2) {
        if (z) {
            return;
        }
        HashMap hashMap = this.b;
        if (hashMap.isEmpty() || this.a) {
            return;
        }
        this.a = true;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.c;
            if (i2 >= arrayList2.size()) {
                ((zu1) this.d.Z1).v6(i, arrayList, z2);
                return;
            }
            Object obj = hashMap.get(arrayList2.get(i2));
            q7a q7aVar = new q7a();
            arrayList.add(q7aVar);
            ro6 ro6Var = (ro6) obj;
            String str = ro6Var.h;
            if (str != null) {
                q7aVar.c = str;
            } else {
                q7aVar.l = ro6Var;
            }
            q7aVar.e = ro6Var.c;
            q7aVar.k = ro6Var.s;
            CharSequence charSequence = ro6Var.I;
            q7aVar.d = charSequence != null ? charSequence.toString() : null;
            q7aVar.i = ro6Var.n;
            q7aVar.j = ro6Var.r;
            q7aVar.h = ro6Var.x;
            TLRPC.BotInlineResult botInlineResult = ro6Var.N;
            if (botInlineResult != null && ro6Var.H) {
                q7aVar.m = botInlineResult;
                q7aVar.n = ro6Var.O;
            }
            System.currentTimeMillis();
            i2++;
        }
    }

    @Override // j98
    public final boolean f() {
        return true;
    }

    @Override // j98
    public final void h() {
    }

    @Override // j98
    public final void y() {
    }

    @Override // j98
    public final void l(Editable editable) {
    }
}
