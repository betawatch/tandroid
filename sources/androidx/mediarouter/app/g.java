package androidx.mediarouter.app;

import java.util.Comparator;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class g implements Comparator {
    public static final g b = new g(0);
    public static final g c = new g(1);
    public static final g d = new g(2);
    public final /* synthetic */ int a;

    public /* synthetic */ g(int i10) {
        this.a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
        }
        return ((c2.a0) obj).d.compareToIgnoreCase(((c2.a0) obj2).d);
    }
}
