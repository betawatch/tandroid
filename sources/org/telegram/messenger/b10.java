package org.telegram.messenger;

import android.icu.text.Collator;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class b10 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b10(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare;
        switch (this.a) {
            case 0:
                compare = ((Collator) this.b).compare(((n10) obj).b, ((n10) obj2).b);
                return compare;
            default:
                ad adVar = (ad) this.b;
                ad adVar2 = (ad) obj;
                ad adVar3 = (ad) obj2;
                if (adVar2 != adVar) {
                    if (adVar3 != adVar) {
                        List list = u10.M;
                        int indexOf = list.indexOf(adVar2.f);
                        int indexOf2 = list.indexOf(adVar3.f);
                        if (indexOf >= 0 && indexOf2 >= 0) {
                            return indexOf - indexOf2;
                        }
                        if (indexOf < 0) {
                            if (indexOf2 < 0) {
                                int i10 = adVar2.k;
                                int i11 = adVar3.k;
                                if (i10 == i11) {
                                    return adVar2.a.compareTo(adVar3.a);
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
