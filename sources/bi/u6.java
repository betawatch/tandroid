package bi;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.yz;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u6 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;

    public /* synthetic */ u6(k8 k8Var, int i7) {
        this.a = i7;
        this.b = k8Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r13 != false) goto L22;
     */
    @Override // org.telegram.messenger.x10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        c51 c51Var;
        int i7 = this.a;
        k8 k8Var = this.b;
        switch (i7) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                y7 y7Var = k8Var.d;
                int i10 = y7Var.e;
                HashSet hashSet = y7Var.l;
                ArrayList arrayList = y7Var.h;
                HashSet hashSet2 = y7Var.k;
                ArrayList arrayList2 = y7Var.g;
                HashSet hashSet3 = y7Var.j;
                ArrayList arrayList3 = y7Var.f;
                boolean z10 = false;
                if (i10 <= 12 && !y7Var.f()) {
                    boolean z11 = y7Var.r;
                    boolean z12 = y7Var.s;
                    boolean z13 = y7Var.t;
                    y7Var.j();
                    boolean z14 = (y7Var.g() && !y7Var.r) || (y7Var.h() && !y7Var.s);
                    y7Var.r = z11;
                    y7Var.s = z12;
                    y7Var.t = z13;
                    break;
                }
                k8Var.h0(true, true);
                j7 j7Var = k8Var.f;
                if (j7Var != null && (c51Var = j7Var.g3) != null) {
                    c51Var.O(true);
                    if (booleanValue) {
                        k8Var.f.v0(0);
                    }
                }
                k8Var.l0();
                p7 p7Var = k8Var.F;
                if (p7Var != null) {
                    p7Var.setSorting(y7Var.p);
                }
                if (k8Var.G != null) {
                    int size = arrayList3.size() - hashSet3.size();
                    k8Var.G.setValue((size <= 0 || size == arrayList3.size()) ? gd.N0(2131750006, null) : gd.H(',', "Gift2ResaleFilterModels", size));
                }
                if (k8Var.H != null) {
                    int size2 = arrayList2.size() - hashSet2.size();
                    k8Var.H.setValue((size2 <= 0 || size2 == arrayList2.size()) ? gd.N0(2131750010, null) : gd.H(',', "Gift2ResaleFilterBackdrops", size2));
                }
                if (k8Var.I != null) {
                    int size3 = arrayList.size() - hashSet.size();
                    k8Var.I.setValue((size3 <= 0 || size3 == arrayList.size()) ? gd.N0(2131750002, null) : gd.H(',', "Gift2ResaleFilterSymbols", size3));
                }
                if (k8Var.f != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < k8Var.f.getChildCount()) {
                            if (k8Var.f.getChildAt(i11) instanceof yz) {
                                y7Var.l(false);
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if ((y7Var.y || y7Var.e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
                    z10 = true;
                }
                k8Var.a.a(z10, true);
                break;
            default:
                k8Var.simpleActionBar.setTitleMinSideInset(org.telegram.messenger.g0.L(6.0f) + ((Integer) obj).intValue());
                break;
        }
    }
}
