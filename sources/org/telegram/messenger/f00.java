package org.telegram.messenger;

import android.icu.text.Collator;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class f00 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f00(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare;
        switch (this.a) {
            case 0:
                compare = ((Collator) this.b).compare(((q00) obj).b, ((q00) obj2).b);
                return compare;
            default:
                yc ycVar = (yc) this.b;
                yc ycVar2 = (yc) obj;
                yc ycVar3 = (yc) obj2;
                if (ycVar2 != ycVar) {
                    if (ycVar3 != ycVar) {
                        List list = x00.N;
                        int indexOf = list.indexOf(ycVar2.f);
                        int indexOf2 = list.indexOf(ycVar3.f);
                        if (indexOf >= 0 && indexOf2 >= 0) {
                            return indexOf - indexOf2;
                        }
                        if (indexOf < 0) {
                            if (indexOf2 < 0) {
                                int i3 = ycVar2.k;
                                int i10 = ycVar3.k;
                                if (i3 == i10) {
                                    return ycVar2.a.compareTo(ycVar3.a);
                                }
                                if (i3 <= i10) {
                                    if (i3 >= i10) {
                                        return 0;
                                    }
                                }
                            }
                        }
                    }
                    return 1;
                }
                return -1;
        }
    }
}
