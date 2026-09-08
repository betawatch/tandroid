package fb;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.Comparator;
import java.util.Map;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class i implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ i(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054 A[RETURN, SYNTHETIC] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 1:
                Runnable runnable = (Runnable) obj;
                Runnable runnable2 = (Runnable) obj2;
                return (runnable2 instanceof ff.b ? ((ff.b) runnable2).a : 1) - (runnable instanceof ff.b ? ((ff.b) runnable).a : 1);
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                Objects.requireNonNull(entry);
                Objects.requireNonNull(entry2);
                Comparable comparable = (Comparable) entry.getKey();
                Comparable comparable2 = (Comparable) entry2.getKey();
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            case 3:
                return ((q4.a) obj2).b() - ((q4.a) obj).b();
            case 4:
                s4.n nVar = (s4.n) obj;
                s4.n nVar2 = (s4.n) obj2;
                int i10 = nVar.a - nVar2.a;
                return i10 == 0 ? nVar.b - nVar2.b : i10;
            case 5:
                s4.p pVar = (s4.p) obj;
                s4.p pVar2 = (s4.p) obj2;
                RecyclerView recyclerView = pVar.d;
                if ((recyclerView == null) != (pVar2.d == null)) {
                    return recyclerView == null ? 1 : -1;
                }
                boolean z10 = pVar.a;
                if (z10 == pVar2.a) {
                    int i11 = pVar2.b - pVar.b;
                    if (i11 != 0) {
                        return i11;
                    }
                    int i12 = pVar.c - pVar2.c;
                    if (i12 != 0) {
                        return i12;
                    }
                    return 0;
                }
                if (z10) {
                }
            case 6:
                return ((z4.c) obj).b - ((z4.c) obj2).b;
            default:
                z4.d dVar = (z4.d) ((View) obj).getLayoutParams();
                z4.d dVar2 = (z4.d) ((View) obj2).getLayoutParams();
                boolean z11 = dVar.a;
                return z11 != dVar2.a ? z11 ? 1 : -1 : dVar.e - dVar2.e;
        }
    }
}
