package fh;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class r5 implements Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e6 b;
    public final /* synthetic */ x60 c;

    public /* synthetic */ r5(e6 e6Var, x60 x60Var, int i9) {
        this.a = i9;
        this.b = e6Var;
        this.c = x60Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        l41 l41Var = (l41) obj;
        switch (this.a) {
            case 0:
                long j10 = ((TL_stars.starGiftAttributeModel) l41Var.G).document.id;
                p5 p5Var = this.b.c;
                HashSet hashSet = p5Var.j;
                HashSet hashSet2 = p5Var.j;
                if (hashSet.contains(Long.valueOf(j10))) {
                    hashSet2.remove(Long.valueOf(j10));
                } else if (hashSet2.isEmpty()) {
                    ArrayList arrayList = p5Var.f;
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj6 = arrayList.get(i9);
                        i9++;
                        long j11 = ((TL_stars.starGiftAttributeModel) obj6).document.id;
                        if (j11 != j10) {
                            hashSet2.add(Long.valueOf(j11));
                        }
                    }
                } else {
                    hashSet2.add(Long.valueOf(j10));
                }
                p5Var.h();
                this.c.u();
                break;
            case 1:
                int i10 = ((TL_stars.starGiftAttributeBackdrop) l41Var.G).backdrop_id;
                p5 p5Var2 = this.b.c;
                HashSet hashSet3 = p5Var2.k;
                HashSet hashSet4 = p5Var2.k;
                if (hashSet3.contains(Integer.valueOf(i10))) {
                    hashSet4.remove(Integer.valueOf(i10));
                } else if (hashSet4.isEmpty()) {
                    ArrayList arrayList2 = p5Var2.g;
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj7 = arrayList2.get(i11);
                        i11++;
                        int i12 = ((TL_stars.starGiftAttributeBackdrop) obj7).backdrop_id;
                        if (i12 != i10) {
                            hashSet4.add(Integer.valueOf(i12));
                        }
                    }
                } else {
                    hashSet4.add(Integer.valueOf(i10));
                }
                p5Var2.h();
                this.c.u();
                break;
            default:
                long j12 = ((TL_stars.starGiftAttributePattern) l41Var.G).document.id;
                p5 p5Var3 = this.b.c;
                HashSet hashSet5 = p5Var3.l;
                HashSet hashSet6 = p5Var3.l;
                if (hashSet5.contains(Long.valueOf(j12))) {
                    hashSet6.remove(Long.valueOf(j12));
                } else if (hashSet6.isEmpty()) {
                    ArrayList arrayList3 = p5Var3.h;
                    int size3 = arrayList3.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        Object obj8 = arrayList3.get(i13);
                        i13++;
                        long j13 = ((TL_stars.starGiftAttributePattern) obj8).document.id;
                        if (j13 != j12) {
                            hashSet6.add(Long.valueOf(j13));
                        }
                    }
                } else {
                    hashSet6.add(Long.valueOf(j12));
                }
                p5Var3.h();
                this.c.u();
                break;
        }
    }
}
