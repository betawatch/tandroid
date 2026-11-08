package c5;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Scope;
import j$.util.Objects;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Comparator;
import java.util.Map;
import v4.n;
import v4.p;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class b implements Comparator {
    public static final /* synthetic */ b b = new b(2);
    public static final /* synthetic */ b c = new b(10);
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i7) {
        this.a = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        if (r0 != false) goto L23;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((d) obj).b - ((d) obj2).b;
            case 1:
                e eVar = (e) ((View) obj).getLayoutParams();
                e eVar2 = (e) ((View) obj2).getLayoutParams();
                boolean z9 = eVar.a;
                return z9 != eVar2.a ? z9 ? 1 : -1 : eVar.e - eVar2.e;
            case 2:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            case 3:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            case 4:
                Runnable runnable = (Runnable) obj;
                Runnable runnable2 = (Runnable) obj2;
                return (runnable2 instanceof of.b ? ((of.b) runnable2).a : 1) - (runnable instanceof of.b ? ((of.b) runnable).a : 1);
            case 5:
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                Objects.requireNonNull(entry);
                Objects.requireNonNull(entry2);
                Comparable comparable = (Comparable) entry.getKey();
                Comparable comparable2 = (Comparable) entry2.getKey();
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            case 6:
                InetAddress inetAddress = (InetAddress) obj;
                if (inetAddress.getClass() == ((InetAddress) obj2).getClass()) {
                    return 0;
                }
                return inetAddress instanceof Inet6Address ? -1 : 1;
            case 7:
                return ((t4.a) obj2).b() - ((t4.a) obj).b();
            case 8:
                n nVar = (n) obj;
                n nVar2 = (n) obj2;
                int i7 = nVar.a - nVar2.a;
                return i7 == 0 ? nVar.b - nVar2.b : i7;
            case 9:
                p pVar = (p) obj;
                p pVar2 = (p) obj2;
                RecyclerView recyclerView = pVar.d;
                if ((recyclerView == null) == (pVar2.d == null)) {
                    boolean z10 = pVar.a;
                    if (z10 == pVar2.a) {
                        int i10 = pVar2.b - pVar.b;
                        if (i10 != 0) {
                            return i10;
                        }
                        int i11 = pVar.c - pVar2.c;
                        if (i11 != 0) {
                            return i11;
                        }
                        return 0;
                    }
                }
                break;
            default:
                n6.c cVar = (n6.c) obj2;
                n6.c cVar2 = (n6.c) obj;
                return !cVar2.a.equals(cVar.a) ? cVar2.a.compareTo(cVar.a) : Long.compare(cVar2.b(), cVar.b());
        }
    }
}
