package bi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.u10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c7 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m8 b;
    public final /* synthetic */ g51[] c;

    public /* synthetic */ c7(m8 m8Var, g51[] g51VarArr, int i7) {
        this.a = i7;
        this.b = m8Var;
        this.c = g51VarArr;
    }

    @Override // org.telegram.messenger.u10
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        n41 n41Var = (n41) obj;
        switch (this.a) {
            case 0:
                long j3 = ((TL_stars.starGiftAttributePattern) n41Var.H).document.id;
                a8 a8Var = this.b.d;
                HashSet hashSet = a8Var.l;
                if (hashSet.contains(Long.valueOf(j3))) {
                    hashSet.remove(Long.valueOf(j3));
                } else if (hashSet.isEmpty()) {
                    ArrayList arrayList = a8Var.h;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj3 = arrayList.get(i7);
                        i7++;
                        long j10 = ((TL_stars.starGiftAttributePattern) obj3).document.id;
                        if (j10 != j3) {
                            hashSet.add(Long.valueOf(j10));
                        }
                    }
                } else {
                    hashSet.add(Long.valueOf(j3));
                }
                a8Var.m();
                g51 g51Var = this.c[0];
                if (g51Var != null) {
                    g51Var.g3.O(true);
                    break;
                }
                break;
            case 1:
                int i10 = ((TL_stars.starGiftAttributeBackdrop) n41Var.H).backdrop_id;
                a8 a8Var2 = this.b.d;
                HashSet hashSet2 = a8Var2.k;
                if (hashSet2.contains(Integer.valueOf(i10))) {
                    hashSet2.remove(Integer.valueOf(i10));
                } else if (hashSet2.isEmpty()) {
                    ArrayList arrayList2 = a8Var2.g;
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj4 = arrayList2.get(i11);
                        i11++;
                        int i12 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                        if (i12 != i10) {
                            hashSet2.add(Integer.valueOf(i12));
                        }
                    }
                } else {
                    hashSet2.add(Integer.valueOf(i10));
                }
                a8Var2.m();
                g51 g51Var2 = this.c[0];
                if (g51Var2 != null) {
                    g51Var2.g3.O(true);
                    break;
                }
                break;
            default:
                long j11 = ((TL_stars.starGiftAttributeModel) n41Var.H).document.id;
                a8 a8Var3 = this.b.d;
                HashSet hashSet3 = a8Var3.j;
                if (hashSet3.contains(Long.valueOf(j11))) {
                    hashSet3.remove(Long.valueOf(j11));
                } else if (hashSet3.isEmpty()) {
                    ArrayList arrayList3 = a8Var3.f;
                    int size3 = arrayList3.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        Object obj5 = arrayList3.get(i13);
                        i13++;
                        long j12 = ((TL_stars.starGiftAttributeModel) obj5).document.id;
                        if (j12 != j11) {
                            hashSet3.add(Long.valueOf(j12));
                        }
                    }
                } else {
                    hashSet3.add(Long.valueOf(j11));
                }
                a8Var3.m();
                g51 g51Var3 = this.c[0];
                if (g51Var3 != null) {
                    g51Var3.g3.O(true);
                    break;
                }
                break;
        }
    }
}
