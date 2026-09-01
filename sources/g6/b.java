package g6;

import java.util.Comparator;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {
    public static final /* synthetic */ b a = new b();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        y5.c cVar = (y5.c) obj;
        y5.c cVar2 = (y5.c) obj2;
        return !cVar.a.equals(cVar2.a) ? cVar.a.compareTo(cVar2.a) : (cVar.e() > cVar2.e() ? 1 : (cVar.e() == cVar2.e() ? 0 : -1));
    }
}
