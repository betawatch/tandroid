package org.telegram.messenger;

import android.icu.text.Collator;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class n00 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n00(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare;
        switch (this.a) {
            case 0:
                compare = ((Collator) this.b).compare(((y00) obj).b, ((y00) obj2).b);
                return compare;
            default:
                fd fdVar = (fd) this.b;
                fd fdVar2 = (fd) obj;
                fd fdVar3 = (fd) obj2;
                if (fdVar2 != fdVar) {
                    if (fdVar3 != fdVar) {
                        List list = f10.M;
                        int indexOf = list.indexOf(fdVar2.f);
                        int indexOf2 = list.indexOf(fdVar3.f);
                        if (indexOf >= 0 && indexOf2 >= 0) {
                            return indexOf - indexOf2;
                        }
                        if (indexOf < 0) {
                            if (indexOf2 < 0) {
                                int i7 = fdVar2.k;
                                int i10 = fdVar3.k;
                                if (i7 == i10) {
                                    return fdVar2.a.compareTo(fdVar3.a);
                                }
                                if (i7 <= i10) {
                                    if (i7 >= i10) {
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
