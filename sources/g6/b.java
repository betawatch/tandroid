package g6;

import java.util.Comparator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
