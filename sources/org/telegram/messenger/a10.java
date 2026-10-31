package org.telegram.messenger;

import android.icu.text.Collator;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class a10 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a10(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare;
        switch (this.a) {
            case 0:
                compare = ((Collator) this.b).compare(((m10) obj).b, ((m10) obj2).b);
                return compare;
            default:
                zc zcVar = (zc) this.b;
                zc zcVar2 = (zc) obj;
                zc zcVar3 = (zc) obj2;
                if (zcVar2 != zcVar) {
                    if (zcVar3 != zcVar) {
                        List list = t10.M;
                        int indexOf = list.indexOf(zcVar2.f);
                        int indexOf2 = list.indexOf(zcVar3.f);
                        if (indexOf >= 0 && indexOf2 >= 0) {
                            return indexOf - indexOf2;
                        }
                        if (indexOf < 0) {
                            if (indexOf2 < 0) {
                                int i10 = zcVar2.k;
                                int i11 = zcVar3.k;
                                if (i10 == i11) {
                                    return zcVar2.a.compareTo(zcVar3.a);
                                }
                                if (i10 <= i11) {
                                    if (i10 >= i11) {
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
