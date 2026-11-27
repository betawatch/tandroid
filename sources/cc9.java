// default package

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class cc9 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nd9 b;

    public /* synthetic */ cc9(nd9 nd9Var, byte b) {
        this.a = b;
        this.b = nd9Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (r14.Z().size() <= 1) goto L27;
     */
    @Override // pcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        l9c l9cVar;
        byte b = this.a;
        nd9 nd9Var = this.b;
        switch (b) {
            case 0:
                nd9Var.h0((Integer) obj);
                break;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ed9 ed9Var = nd9Var.e;
                int i = ed9Var.f;
                ArrayList arrayList = ed9Var.b;
                HashSet hashSet = ed9Var.m;
                ArrayList arrayList2 = ed9Var.i;
                HashSet hashSet2 = ed9Var.l;
                ArrayList arrayList3 = ed9Var.h;
                HashSet hashSet3 = ed9Var.k;
                ArrayList arrayList4 = ed9Var.g;
                boolean z = false;
                if (i <= 12 && !ed9Var.f()) {
                    boolean z2 = ed9Var.s;
                    boolean z3 = ed9Var.t;
                    boolean z4 = ed9Var.u;
                    ed9Var.j();
                    boolean z5 = (ed9Var.g() && !ed9Var.s) || (ed9Var.h() && !ed9Var.t);
                    ed9Var.s = z2;
                    ed9Var.t = z3;
                    ed9Var.u = z4;
                    if (!z5) {
                        if (arrayList.size() <= 1) {
                            break;
                        }
                    }
                }
                nd9Var.m0(true, true);
                d34 d34Var = nd9Var.h;
                if (d34Var != null && (l9cVar = d34Var.g3) != null) {
                    l9cVar.O(true);
                    if (booleanValue) {
                        nd9Var.h.x0(0);
                    }
                }
                nd9Var.u0();
                wc9 wc9Var = nd9Var.H;
                if (wc9Var != null) {
                    wc9Var.setSorting(ed9Var.q);
                }
                nd9Var.r0();
                wc9 wc9Var2 = nd9Var.I;
                if (wc9Var2 != null && (wc9Var2.getParent() instanceof View)) {
                    ((View) nd9Var.I.getParent()).setVisibility(arrayList.size() > 1 ? 8 : 0);
                }
                if (nd9Var.I != null) {
                    int size = arrayList4.size() - hashSet3.size();
                    nd9Var.I.setValue((size <= 0 || size == arrayList4.size()) ? ob6.M0(2131749971, null) : ob6.H(',', "Gift2ResaleFilterModels", size));
                }
                if (nd9Var.M != null) {
                    int size2 = arrayList3.size() - hashSet2.size();
                    nd9Var.M.setValue((size2 <= 0 || size2 == arrayList3.size()) ? ob6.M0(2131749979, null) : ob6.H(',', "Gift2ResaleFilterBackdrops", size2));
                }
                if (nd9Var.N != null) {
                    int size3 = arrayList2.size() - hashSet.size();
                    nd9Var.N.setValue((size3 <= 0 || size3 == arrayList2.size()) ? ob6.M0(2131749967, null) : ob6.H(',', "Gift2ResaleFilterSymbols", size3));
                }
                if (nd9Var.h != null && nd9Var.a0()) {
                    ed9Var.o(false);
                }
                if ((ed9Var.z || ed9Var.f > 0) && (!hashSet3.isEmpty() || !hashSet2.isEmpty() || !hashSet.isEmpty())) {
                    z = true;
                }
                nd9Var.a.a(z, true);
                break;
            default:
                nd9Var.presentFragment((e) obj);
                break;
        }
    }
}
