package org.telegram.messenger;

import android.icu.text.Collator;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class h00 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h00(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare;
        switch (this.a) {
            case 0:
                compare = ((Collator) this.b).compare(((s00) obj).b, ((s00) obj2).b);
                return compare;
            default:
                cd cdVar = (cd) this.b;
                cd cdVar2 = (cd) obj;
                cd cdVar3 = (cd) obj2;
                if (cdVar2 != cdVar) {
                    if (cdVar3 != cdVar) {
                        List list = z00.N;
                        int indexOf = list.indexOf(cdVar2.f);
                        int indexOf2 = list.indexOf(cdVar3.f);
                        if (indexOf >= 0 && indexOf2 >= 0) {
                            return indexOf - indexOf2;
                        }
                        if (indexOf < 0) {
                            if (indexOf2 < 0) {
                                int i7 = cdVar2.k;
                                int i10 = cdVar3.k;
                                if (i7 == i10) {
                                    return cdVar2.a.compareTo(cdVar3.a);
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
