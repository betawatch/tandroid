package mg;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.q20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class s1 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v1 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ s1(v1 v1Var, boolean z10, int i10) {
        this.a = i10;
        this.b = v1Var;
        this.c = z10;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                List list = (List) obj;
                v1 v1Var = this.b;
                ArrayList arrayList = v1Var.Y1;
                if (this.c) {
                    v1Var.Z1.addAll(list);
                }
                if (v1Var.j2 == 1) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    v1Var.n1(true, true);
                    v1Var.j1(true);
                    break;
                }
                break;
            default:
                v1.d1(this.b, this.c, (Pair) obj);
                break;
        }
    }
}
