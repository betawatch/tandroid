package bi;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class q6 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g8 b;

    public /* synthetic */ q6(g8 g8Var, int i7) {
        this.a = i7;
        this.b = g8Var;
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
        g8 g8Var = this.b;
        switch (i7) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                u7 u7Var = g8Var.d;
                int i10 = u7Var.e;
                HashSet hashSet = u7Var.l;
                ArrayList arrayList = u7Var.h;
                HashSet hashSet2 = u7Var.k;
                ArrayList arrayList2 = u7Var.g;
                HashSet hashSet3 = u7Var.j;
                ArrayList arrayList3 = u7Var.f;
                boolean z10 = false;
                if (i10 <= 12 && !u7Var.f()) {
                    boolean z11 = u7Var.r;
                    boolean z12 = u7Var.s;
                    boolean z13 = u7Var.t;
                    u7Var.j();
                    boolean z14 = (u7Var.g() && !u7Var.r) || (u7Var.h() && !u7Var.s);
                    u7Var.r = z11;
                    u7Var.s = z12;
                    u7Var.t = z13;
                    break;
                }
                g8Var.h0(true, true);
                f7 f7Var = g8Var.f;
                if (f7Var != null && (z41Var = f7Var.g3) != null) {
                    z41Var.O(true);
                    if (booleanValue) {
                        g8Var.f.v0(0);
                    }
                }
                g8Var.l0();
                l7 l7Var = g8Var.F;
                if (l7Var != null) {
                    l7Var.setSorting(u7Var.p);
                }
                if (g8Var.G != null) {
                    int size = arrayList3.size() - hashSet3.size();
                    g8Var.G.setValue((size <= 0 || size == arrayList3.size()) ? gd.M0(2131750007, null) : gd.H(',', "Gift2ResaleFilterModels", size));
                }
                if (g8Var.H != null) {
                    int size2 = arrayList2.size() - hashSet2.size();
                    g8Var.H.setValue((size2 <= 0 || size2 == arrayList2.size()) ? gd.M0(2131750011, null) : gd.H(',', "Gift2ResaleFilterBackdrops", size2));
                }
                if (g8Var.I != null) {
                    int size3 = arrayList.size() - hashSet.size();
                    g8Var.I.setValue((size3 <= 0 || size3 == arrayList.size()) ? gd.M0(2131750003, null) : gd.H(',', "Gift2ResaleFilterSymbols", size3));
                }
                if (g8Var.f != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < g8Var.f.getChildCount()) {
                            if (g8Var.f.getChildAt(i11) instanceof wz) {
                                u7Var.l(false);
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if ((u7Var.y || u7Var.e > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
                    z10 = true;
                }
                g8Var.a.a(z10, true);
                break;
            default:
                g8Var.simpleActionBar.setTitleMinSideInset(org.telegram.messenger.g0.L(6.0f) + ((Integer) obj).intValue());
                break;
        }
    }
}
