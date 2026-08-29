package e6;

import java.util.Comparator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {
    public static final /* synthetic */ b a = new b();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        w5.c cVar = (w5.c) obj;
        w5.c cVar2 = (w5.c) obj2;
        return !cVar.a.equals(cVar2.a) ? cVar.a.compareTo(cVar2.a) : (cVar.b() > cVar2.b() ? 1 : (cVar.b() == cVar2.b() ? 0 : -1));
    }
}
