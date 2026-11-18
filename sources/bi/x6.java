package bi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.l41;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x6 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8 b;
    public final /* synthetic */ e51[] c;

    public /* synthetic */ x6(h8 h8Var, e51[] e51VarArr, int i7) {
        this.a = i7;
        this.b = h8Var;
        this.c = e51VarArr;
    }

    @Override // org.telegram.messenger.v10
    public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        l41 l41Var = (l41) obj;
        switch (this.a) {
            case 0:
                long j3 = ((TL_stars.starGiftAttributePattern) l41Var.H).document.id;
                v7 v7Var = this.b.d;
                HashSet hashSet = v7Var.l;
                if (hashSet.contains(Long.valueOf(j3))) {
                    hashSet.remove(Long.valueOf(j3));
                } else if (hashSet.isEmpty()) {
                    ArrayList arrayList = v7Var.h;
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
                v7Var.m();
                e51 e51Var = this.c[0];
                if (e51Var != null) {
                    e51Var.g3.O(true);
                    break;
                }
                break;
            case 1:
                int i10 = ((TL_stars.starGiftAttributeBackdrop) l41Var.H).backdrop_id;
                v7 v7Var2 = this.b.d;
                HashSet hashSet2 = v7Var2.k;
                if (hashSet2.contains(Integer.valueOf(i10))) {
                    hashSet2.remove(Integer.valueOf(i10));
                } else if (hashSet2.isEmpty()) {
                    ArrayList arrayList2 = v7Var2.g;
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
                v7Var2.m();
                e51 e51Var2 = this.c[0];
                if (e51Var2 != null) {
                    e51Var2.g3.O(true);
                    break;
                }
                break;
            default:
                long j11 = ((TL_stars.starGiftAttributeModel) l41Var.H).document.id;
                v7 v7Var3 = this.b.d;
                HashSet hashSet3 = v7Var3.j;
                if (hashSet3.contains(Long.valueOf(j11))) {
                    hashSet3.remove(Long.valueOf(j11));
                } else if (hashSet3.isEmpty()) {
                    ArrayList arrayList3 = v7Var3.f;
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
                v7Var3.m();
                e51 e51Var3 = this.c[0];
                if (e51Var3 != null) {
                    e51Var3.g3.O(true);
                    break;
                }
                break;
        }
    }
}
