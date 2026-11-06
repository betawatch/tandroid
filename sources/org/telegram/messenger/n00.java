package org.telegram.messenger;

import android.icu.text.Collator;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
                ed edVar = (ed) this.b;
                ed edVar2 = (ed) obj;
                ed edVar3 = (ed) obj2;
                if (edVar2 != edVar) {
                    if (edVar3 != edVar) {
                        List list = f10.M;
                        int indexOf = list.indexOf(edVar2.f);
                        int indexOf2 = list.indexOf(edVar3.f);
                        if (indexOf >= 0 && indexOf2 >= 0) {
                            return indexOf - indexOf2;
                        }
                        if (indexOf < 0) {
                            if (indexOf2 < 0) {
                                int i7 = edVar2.k;
                                int i10 = edVar3.k;
                                if (i7 == i10) {
                                    return edVar2.a.compareTo(edVar3.a);
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
