package b7;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.Comparator;
import java.util.Map;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ r(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0074 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076 A[RETURN, SYNTHETIC] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                Objects.requireNonNull(entry);
                Objects.requireNonNull(entry2);
                Comparable comparable = (Comparable) entry.getKey();
                Comparable comparable2 = (Comparable) entry2.getKey();
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            case 1:
                return ((d2.a) obj2).b() - ((d2.a) obj).b();
            case 2:
                f2.p pVar = (f2.p) obj;
                f2.p pVar2 = (f2.p) obj2;
                int i10 = pVar.a - pVar2.a;
                return i10 == 0 ? pVar.b - pVar2.b : i10;
            case 3:
                f2.r rVar = (f2.r) obj;
                f2.r rVar2 = (f2.r) obj2;
                RecyclerView recyclerView = rVar.d;
                if ((recyclerView == null) != (rVar2.d == null)) {
                    return recyclerView == null ? 1 : -1;
                }
                boolean z4 = rVar.a;
                if (z4 == rVar2.a) {
                    int i11 = rVar2.b - rVar.b;
                    if (i11 != 0) {
                        return i11;
                    }
                    int i12 = rVar.c - rVar2.c;
                    if (i12 != 0) {
                        return i12;
                    }
                    return 0;
                }
                if (z4) {
                }
            case 4:
                return ((m2.d) obj).b - ((m2.d) obj2).b;
            case 5:
                m2.e eVar = (m2.e) ((View) obj).getLayoutParams();
                m2.e eVar2 = (m2.e) ((View) obj2).getLayoutParams();
                boolean z10 = eVar.a;
                return z10 != eVar2.a ? z10 ? 1 : -1 : eVar.e - eVar2.e;
            case 6:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            default:
                Runnable runnable = (Runnable) obj;
                Runnable runnable2 = (Runnable) obj2;
                return (runnable2 instanceof re.b ? ((re.b) runnable2).a : 1) - (runnable instanceof re.b ? ((re.b) runnable).a : 1);
        }
    }
}
