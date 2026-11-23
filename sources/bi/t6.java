package bi;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.yz;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class t6 implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j8 b;

    public /* synthetic */ t6(j8 j8Var, int i7) {
        this.a = i7;
        this.b = j8Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r13 != false) goto L22;
     */
    @Override // org.telegram.messenger.y10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        c51 c51Var;
        int i7 = this.a;
        j8 j8Var = this.b;
        switch (i7) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                x7 x7Var = j8Var.d;
                int i10 = x7Var.e;
                HashSet hashSet = x7Var.l;
                ArrayList arrayList = x7Var.h;
                HashSet hashSet2 = x7Var.k;
                ArrayList arrayList2 = x7Var.g;
                HashSet hashSet3 = x7Var.j;
                ArrayList arrayList3 = x7Var.f;
                boolean z10 = false;
                if (i10 <= 12 && !x7Var.f()) {
                    boolean z11 = x7Var.r;
                    boolean z12 = x7Var.s;
                    boolean z13 = x7Var.t;
                    x7Var.j();
                    boolean z14 = (x7Var.g() && !x7Var.r) || (x7Var.h() && !x7Var.s);
                    x7Var.r = z11;
                    x7Var.s = z12;
                    x7Var.t = z13;
                    break;
                }
                j8Var.h0(true, true);
                i7 i7Var = j8Var.f;
                if (i7Var != null && (c51Var = i7Var.g3) != null) {
                    c51Var.O(true);
                    if (booleanValue) {
                        j8Var.f.v0(0);
                    }
                }
                j8Var.l0();
                o7 o7Var = j8Var.F;
                if (o7Var != null) {
                    o7Var.setSorting(x7Var.p);
                }
                if (j8Var.G != null) {
                    int size = arrayList3.size() - hashSet3.size();
                    j8Var.G.setValue((size <= 0 || size == arrayList3.size()) ? hd.N0(2131750006, null) : hd.H(',', "Gift2ResaleFilterModels", size));
                }
                if (j8Var.H != null) {
                    int size2 = arrayList2.size() - hashSet2.size();
                    j8Var.H.setValue((size2 <= 0 || size2 == arrayList2.size()) ? hd.N0(2131750010, null) : hd.H(',', "Gift2ResaleFilterBackdrops", size2));
                }
                if (j8Var.I != null) {
                    int size3 = arrayList.size() - hashSet.size();
                    j8Var.I.setValue((size3 <= 0 || size3 == arrayList.size()) ? hd.N0(2131750002, null) : hd.H(',', "Gift2ResaleFilterSymbols", size3));
                }
                if (j8Var.f != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < j8Var.f.getChildCount()) {
                            if (j8Var.f.getChildAt(i11) instanceof yz) {
                                x7Var.l(false);
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if ((x7Var.y || x7Var.e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
                    z10 = true;
                }
                j8Var.a.a(z10, true);
                break;
            default:
                j8Var.simpleActionBar.setTitleMinSideInset(org.telegram.messenger.g0.L(6.0f) + ((Integer) obj).intValue());
                break;
        }
    }
}
