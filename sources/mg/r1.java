package mg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.q20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class r1 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v1 b;

    public /* synthetic */ r1(v1 v1Var, int i10) {
        this.a = i10;
        this.b = v1Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                v1 v1Var = this.b;
                ArrayList arrayList = v1Var.Y1;
                androidx.activity.i iVar = v1Var.n2;
                v1Var.f2 = str;
                int i10 = v1Var.j2;
                if (i10 == 1) {
                    org.telegram.messenger.i0.r(iVar);
                    org.telegram.messenger.i0.h3(iVar, 350L);
                    break;
                } else if (i10 == 2) {
                    if (!TextUtils.isEmpty(str)) {
                        org.telegram.messenger.i0.r(iVar);
                        org.telegram.messenger.i0.h3(iVar, 350L);
                        break;
                    } else {
                        org.telegram.messenger.i0.r(iVar);
                        arrayList.clear();
                        arrayList.addAll(k0.e(v1Var.i2.id));
                        v1Var.m1(false, true);
                        v1Var.j1(true);
                        break;
                    }
                } else if (i10 == 3) {
                    v1Var.m1(false, true);
                    v1Var.j1(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                v1 v1Var2 = this.b;
                ArrayList arrayList2 = v1Var2.Y1;
                if (!TextUtils.isEmpty(v1Var2.f2)) {
                    arrayList2.clear();
                    arrayList2.addAll(list);
                    v1Var2.n1(true, true);
                    v1Var2.j1(true);
                    break;
                }
                break;
        }
    }
}
