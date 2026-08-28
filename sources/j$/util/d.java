package j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Comparator, Serializable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Comparator b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(Comparator comparator, Object obj, int i9) {
        this.a = i9;
        this.b = comparator;
        this.c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Comparator comparator = this.b;
                Comparator comparator2 = (Comparator) this.c;
                int compare = comparator.compare(obj, obj2);
                return compare != 0 ? compare : comparator2.compare(obj, obj2);
            default:
                Comparator comparator3 = this.b;
                Function function = (Function) this.c;
                return comparator3.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
