package j$.util;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Comparator, Serializable {
    public final /* synthetic */ Comparator a;
    public final /* synthetic */ Comparator b;

    public /* synthetic */ d(Comparator comparator, Comparator comparator2) {
        this.a = comparator;
        this.b = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparator comparator = this.a;
        Comparator comparator2 = this.b;
        int compare = comparator.compare(obj, obj2);
        return compare != 0 ? compare : comparator2.compare(obj, obj2);
    }
}
