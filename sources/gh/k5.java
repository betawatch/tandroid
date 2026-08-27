package gh;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class k5 implements Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5 b;
    public final /* synthetic */ b70 c;

    public /* synthetic */ k5(w5 w5Var, b70 b70Var, int i10) {
        this.a = i10;
        this.b = w5Var;
        this.c = b70Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        n41 n41Var = (n41) obj;
        switch (this.a) {
            case 0:
                long j10 = ((TL_stars.starGiftAttributeModel) n41Var.G).document.id;
                i5 i5Var = this.b.c;
                HashSet hashSet = i5Var.j;
                HashSet hashSet2 = i5Var.j;
                if (hashSet.contains(Long.valueOf(j10))) {
                    hashSet2.remove(Long.valueOf(j10));
                } else if (hashSet2.isEmpty()) {
                    ArrayList arrayList = i5Var.f;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj6 = arrayList.get(i10);
                        i10++;
                        long j11 = ((TL_stars.starGiftAttributeModel) obj6).document.id;
                        if (j11 != j10) {
                            hashSet2.add(Long.valueOf(j11));
                        }
                    }
                } else {
                    hashSet2.add(Long.valueOf(j10));
                }
                i5Var.h();
                this.c.u();
                break;
            case 1:
                int i11 = ((TL_stars.starGiftAttributeBackdrop) n41Var.G).backdrop_id;
                i5 i5Var2 = this.b.c;
                HashSet hashSet3 = i5Var2.k;
                HashSet hashSet4 = i5Var2.k;
                if (hashSet3.contains(Integer.valueOf(i11))) {
                    hashSet4.remove(Integer.valueOf(i11));
                } else if (hashSet4.isEmpty()) {
                    ArrayList arrayList2 = i5Var2.g;
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj7 = arrayList2.get(i12);
                        i12++;
                        int i13 = ((TL_stars.starGiftAttributeBackdrop) obj7).backdrop_id;
                        if (i13 != i11) {
                            hashSet4.add(Integer.valueOf(i13));
                        }
                    }
                } else {
                    hashSet4.add(Integer.valueOf(i11));
                }
                i5Var2.h();
                this.c.u();
                break;
            default:
                long j12 = ((TL_stars.starGiftAttributePattern) n41Var.G).document.id;
                i5 i5Var3 = this.b.c;
                HashSet hashSet5 = i5Var3.l;
                HashSet hashSet6 = i5Var3.l;
                if (hashSet5.contains(Long.valueOf(j12))) {
                    hashSet6.remove(Long.valueOf(j12));
                } else if (hashSet6.isEmpty()) {
                    ArrayList arrayList3 = i5Var3.h;
                    int size3 = arrayList3.size();
                    int i14 = 0;
                    while (i14 < size3) {
                        Object obj8 = arrayList3.get(i14);
                        i14++;
                        long j13 = ((TL_stars.starGiftAttributePattern) obj8).document.id;
                        if (j13 != j12) {
                            hashSet6.add(Long.valueOf(j13));
                        }
                    }
                } else {
                    hashSet6.add(Long.valueOf(j12));
                }
                i5Var3.h();
                this.c.u();
                break;
        }
    }
}
