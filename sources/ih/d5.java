package ih;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.w41;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class d5 implements Utilities.Callback5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p5 b;
    public final /* synthetic */ j70 c;

    public /* synthetic */ d5(p5 p5Var, j70 j70Var, int i10) {
        this.a = i10;
        this.b = p5Var;
        this.c = j70Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        w41 w41Var = (w41) obj;
        switch (this.a) {
            case 0:
                long j10 = ((TL_stars.starGiftAttributeModel) w41Var.G).document.id;
                b5 b5Var = this.b.c;
                HashSet hashSet = b5Var.j;
                HashSet hashSet2 = b5Var.j;
                if (hashSet.contains(Long.valueOf(j10))) {
                    hashSet2.remove(Long.valueOf(j10));
                } else if (hashSet2.isEmpty()) {
                    ArrayList arrayList = b5Var.f;
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
                b5Var.h();
                this.c.u();
                break;
            case 1:
                int i11 = ((TL_stars.starGiftAttributeBackdrop) w41Var.G).backdrop_id;
                b5 b5Var2 = this.b.c;
                HashSet hashSet3 = b5Var2.k;
                HashSet hashSet4 = b5Var2.k;
                if (hashSet3.contains(Integer.valueOf(i11))) {
                    hashSet4.remove(Integer.valueOf(i11));
                } else if (hashSet4.isEmpty()) {
                    ArrayList arrayList2 = b5Var2.g;
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
                b5Var2.h();
                this.c.u();
                break;
            default:
                long j12 = ((TL_stars.starGiftAttributePattern) w41Var.G).document.id;
                b5 b5Var3 = this.b.c;
                HashSet hashSet5 = b5Var3.l;
                HashSet hashSet6 = b5Var3.l;
                if (hashSet5.contains(Long.valueOf(j12))) {
                    hashSet6.remove(Long.valueOf(j12));
                } else if (hashSet6.isEmpty()) {
                    ArrayList arrayList3 = b5Var3.h;
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
                b5Var3.h();
                this.c.u();
                break;
        }
    }
}
