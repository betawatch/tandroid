package a5;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Comparator;
import java.util.Map;
import s4.o;
import s4.q;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
    
        if (r0 != false) goto L26;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((f) obj).b - ((f) obj2).b;
            case 1:
                g gVar = (g) ((View) obj).getLayoutParams();
                g gVar2 = (g) ((View) obj2).getLayoutParams();
                boolean z10 = gVar.a;
                return z10 != gVar2.a ? z10 ? 1 : -1 : gVar.e - gVar2.e;
            case 2:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 3:
                Runnable runnable = (Runnable) obj;
                Runnable runnable2 = (Runnable) obj2;
                return (runnable2 instanceof jf.b ? ((jf.b) runnable2).a : 1) - (runnable instanceof jf.b ? ((jf.b) runnable).a : 1);
            case 4:
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                Objects.requireNonNull(entry);
                Objects.requireNonNull(entry2);
                Comparable comparable = (Comparable) entry.getKey();
                Comparable comparable2 = (Comparable) entry2.getKey();
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            case 5:
                return ((q4.a) obj2).b() - ((q4.a) obj).b();
            case 6:
                o oVar = (o) obj;
                o oVar2 = (o) obj2;
                int i10 = oVar.a - oVar2.a;
                return i10 == 0 ? oVar.b - oVar2.b : i10;
            case 7:
                q qVar = (q) obj;
                q qVar2 = (q) obj2;
                RecyclerView recyclerView = qVar.d;
                if ((recyclerView == null) == (qVar2.d == null)) {
                    boolean z11 = qVar.a;
                    if (z11 == qVar2.a) {
                        int i11 = qVar2.b - qVar.b;
                        if (i11 != 0) {
                            return i11;
                        }
                        int i12 = qVar.c - qVar2.c;
                        if (i12 != 0) {
                            return i12;
                        }
                        return 0;
                    }
                }
                break;
            default:
                InetAddress inetAddress = (InetAddress) obj;
                if (inetAddress.getClass() == ((InetAddress) obj2).getClass()) {
                    return 0;
                }
                return inetAddress instanceof Inet6Address ? -1 : 1;
        }
    }
}
