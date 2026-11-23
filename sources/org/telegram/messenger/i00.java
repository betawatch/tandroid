package org.telegram.messenger;

import android.icu.text.Collator;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class i00 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i00(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare;
        switch (this.a) {
            case 0:
                compare = ((Collator) this.b).compare(((t00) obj).b, ((t00) obj2).b);
                return compare;
            default:
                dd ddVar = (dd) this.b;
                dd ddVar2 = (dd) obj;
                dd ddVar3 = (dd) obj2;
                if (ddVar2 != ddVar) {
                    if (ddVar3 != ddVar) {
                        List list = a10.N;
                        int indexOf = list.indexOf(ddVar2.f);
                        int indexOf2 = list.indexOf(ddVar3.f);
                        if (indexOf >= 0 && indexOf2 >= 0) {
                            return indexOf - indexOf2;
                        }
                        if (indexOf < 0) {
                            if (indexOf2 < 0) {
                                int i7 = ddVar2.k;
                                int i10 = ddVar3.k;
                                if (i7 == i10) {
                                    return ddVar2.a.compareTo(ddVar3.a);
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
