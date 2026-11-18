package bi;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class r6 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8 b;

    public /* synthetic */ r6(h8 h8Var, int i7) {
        this.a = i7;
        this.b = h8Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r13 != false) goto L22;
     */
    @Override // org.telegram.messenger.x10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        z41 z41Var;
        int i7 = this.a;
        h8 h8Var = this.b;
        switch (i7) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                v7 v7Var = h8Var.d;
                int i10 = v7Var.e;
                HashSet hashSet = v7Var.l;
                ArrayList arrayList = v7Var.h;
                HashSet hashSet2 = v7Var.k;
                ArrayList arrayList2 = v7Var.g;
                HashSet hashSet3 = v7Var.j;
                ArrayList arrayList3 = v7Var.f;
                boolean z10 = false;
                if (i10 <= 12 && !v7Var.f()) {
                    boolean z11 = v7Var.r;
                    boolean z12 = v7Var.s;
                    boolean z13 = v7Var.t;
                    v7Var.j();
                    boolean z14 = (v7Var.g() && !v7Var.r) || (v7Var.h() && !v7Var.s);
                    v7Var.r = z11;
                    v7Var.s = z12;
                    v7Var.t = z13;
                    break;
                }
                h8Var.h0(true, true);
                g7 g7Var = h8Var.f;
                if (g7Var != null && (z41Var = g7Var.g3) != null) {
                    z41Var.O(true);
                    if (booleanValue) {
                        h8Var.f.v0(0);
                    }
                }
                h8Var.l0();
                m7 m7Var = h8Var.F;
                if (m7Var != null) {
                    m7Var.setSorting(v7Var.p);
                }
                if (h8Var.G != null) {
                    int size = arrayList3.size() - hashSet3.size();
                    h8Var.G.setValue((size <= 0 || size == arrayList3.size()) ? gd.M0(2131750007, null) : gd.H(',', "Gift2ResaleFilterModels", size));
                }
                if (h8Var.H != null) {
                    int size2 = arrayList2.size() - hashSet2.size();
                    h8Var.H.setValue((size2 <= 0 || size2 == arrayList2.size()) ? gd.M0(2131750011, null) : gd.H(',', "Gift2ResaleFilterBackdrops", size2));
                }
                if (h8Var.I != null) {
                    int size3 = arrayList.size() - hashSet.size();
                    h8Var.I.setValue((size3 <= 0 || size3 == arrayList.size()) ? gd.M0(2131750003, null) : gd.H(',', "Gift2ResaleFilterSymbols", size3));
                }
                if (h8Var.f != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < h8Var.f.getChildCount()) {
                            if (h8Var.f.getChildAt(i11) instanceof wz) {
                                v7Var.l(false);
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if ((v7Var.y || v7Var.e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
                    z10 = true;
                }
                h8Var.a.a(z10, true);
                break;
            default:
                h8Var.simpleActionBar.setTitleMinSideInset(org.telegram.messenger.g0.L(6.0f) + ((Integer) obj).intValue());
                break;
        }
    }
}
