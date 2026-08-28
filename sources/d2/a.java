package d2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f2.r;
import f2.t;
import j$.util.Objects;
import java.util.Comparator;
import java.util.Map;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i9) {
        this.a = i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0095 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097 A[RETURN, SYNTHETIC] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((b) obj2).b() - ((b) obj).b();
            case 1:
                r rVar = (r) obj;
                r rVar2 = (r) obj2;
                int i9 = rVar.a - rVar2.a;
                return i9 == 0 ? rVar.b - rVar2.b : i9;
            case 2:
                t tVar = (t) obj;
                t tVar2 = (t) obj2;
                RecyclerView recyclerView = tVar.d;
                if ((recyclerView == null) != (tVar2.d == null)) {
                    return recyclerView == null ? 1 : -1;
                }
                boolean z10 = tVar.a;
                if (z10 == tVar2.a) {
                    int i10 = tVar2.b - tVar.b;
                    if (i10 != 0) {
                        return i10;
                    }
                    int i11 = tVar.c - tVar2.c;
                    if (i11 != 0) {
                        return i11;
                    }
                    return 0;
                }
                if (z10) {
                }
            case 3:
                return ((m2.c) obj).b - ((m2.c) obj2).b;
            case 4:
                m2.d dVar = (m2.d) ((View) obj).getLayoutParams();
                m2.d dVar2 = (m2.d) ((View) obj2).getLayoutParams();
                boolean z11 = dVar.a;
                return z11 != dVar2.a ? z11 ? 1 : -1 : dVar.e - dVar2.e;
            case 5:
                Runnable runnable = (Runnable) obj;
                Runnable runnable2 = (Runnable) obj2;
                return (runnable2 instanceof me.b ? ((me.b) runnable2).a : 1) - (runnable instanceof me.b ? ((me.b) runnable).a : 1);
            case 6:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            default:
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                Objects.requireNonNull(entry);
                Objects.requireNonNull(entry2);
                Comparable comparable = (Comparable) entry.getKey();
                Comparable comparable2 = (Comparable) entry2.getKey();
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
        }
    }
}
