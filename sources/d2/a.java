package d2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f2.p;
import f2.s;
import j$.util.Objects;
import java.util.Comparator;
import java.util.Map;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
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
                p pVar = (p) obj;
                p pVar2 = (p) obj2;
                int i10 = pVar.a - pVar2.a;
                return i10 == 0 ? pVar.b - pVar2.b : i10;
            case 2:
                s sVar = (s) obj;
                s sVar2 = (s) obj2;
                RecyclerView recyclerView = sVar.d;
                if ((recyclerView == null) != (sVar2.d == null)) {
                    return recyclerView == null ? 1 : -1;
                }
                boolean z10 = sVar.a;
                if (z10 == sVar2.a) {
                    int i11 = sVar2.b - sVar.b;
                    if (i11 != 0) {
                        return i11;
                    }
                    int i12 = sVar.c - sVar2.c;
                    if (i12 != 0) {
                        return i12;
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
                return (runnable2 instanceof ne.b ? ((ne.b) runnable2).a : 1) - (runnable instanceof ne.b ? ((ne.b) runnable).a : 1);
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
