package bi;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.vz;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class w6 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m8 b;

    public /* synthetic */ w6(m8 m8Var, int i7) {
        this.a = i7;
        this.b = m8Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r13 != false) goto L22;
     */
    @Override // org.telegram.messenger.w10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        b51 b51Var;
        int i7 = this.a;
        m8 m8Var = this.b;
        switch (i7) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                a8 a8Var = m8Var.d;
                int i10 = a8Var.e;
                HashSet hashSet = a8Var.l;
                ArrayList arrayList = a8Var.h;
                HashSet hashSet2 = a8Var.k;
                ArrayList arrayList2 = a8Var.g;
                HashSet hashSet3 = a8Var.j;
                ArrayList arrayList3 = a8Var.f;
                boolean z10 = false;
                if (i10 <= 12 && !a8Var.f()) {
                    boolean z11 = a8Var.r;
                    boolean z12 = a8Var.s;
                    boolean z13 = a8Var.t;
                    a8Var.j();
                    boolean z14 = (a8Var.g() && !a8Var.r) || (a8Var.h() && !a8Var.s);
                    a8Var.r = z11;
                    a8Var.s = z12;
                    a8Var.t = z13;
                    break;
                }
                m8Var.h0(true, true);
                l7 l7Var = m8Var.f;
                if (l7Var != null && (b51Var = l7Var.g3) != null) {
                    b51Var.O(true);
                    if (booleanValue) {
                        m8Var.f.v0(0);
                    }
                }
                m8Var.l0();
                r7 r7Var = m8Var.F;
                if (r7Var != null) {
                    r7Var.setSorting(a8Var.p);
                }
                if (m8Var.G != null) {
                    int size = arrayList3.size() - hashSet3.size();
                    m8Var.G.setValue((size <= 0 || size == arrayList3.size()) ? gd.N0(2131750006, null) : gd.H(',', "Gift2ResaleFilterModels", size));
                }
                if (m8Var.H != null) {
                    int size2 = arrayList2.size() - hashSet2.size();
                    m8Var.H.setValue((size2 <= 0 || size2 == arrayList2.size()) ? gd.N0(2131750010, null) : gd.H(',', "Gift2ResaleFilterBackdrops", size2));
                }
                if (m8Var.I != null) {
                    int size3 = arrayList.size() - hashSet.size();
                    m8Var.I.setValue((size3 <= 0 || size3 == arrayList.size()) ? gd.N0(2131750002, null) : gd.H(',', "Gift2ResaleFilterSymbols", size3));
                }
                if (m8Var.f != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < m8Var.f.getChildCount()) {
                            if (m8Var.f.getChildAt(i11) instanceof vz) {
                                a8Var.l(false);
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if ((a8Var.y || a8Var.e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
                    z10 = true;
                }
                m8Var.a.a(z10, true);
                break;
            default:
                m8Var.simpleActionBar.setTitleMinSideInset(org.telegram.messenger.g0.L(6.0f) + ((Integer) obj).intValue());
                break;
        }
    }
}
