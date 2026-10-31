package lc;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Comparator;
import java.util.Map;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class s implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ s(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0069, code lost:
    
        if (r0 != false) goto L36;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                InetAddress inetAddress = (InetAddress) obj;
                if (inetAddress.getClass() == ((InetAddress) obj2).getClass()) {
                    return 0;
                }
                return inetAddress instanceof Inet6Address ? -1 : 1;
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                Objects.requireNonNull(entry);
                Objects.requireNonNull(entry2);
                Comparable comparable = (Comparable) entry.getKey();
                Comparable comparable2 = (Comparable) entry2.getKey();
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            case 2:
                return ((q4.a) obj2).b() - ((q4.a) obj).b();
            case 3:
                s4.m mVar = (s4.m) obj;
                s4.m mVar2 = (s4.m) obj2;
                int i10 = mVar.a - mVar2.a;
                return i10 == 0 ? mVar.b - mVar2.b : i10;
            case 4:
                s4.o oVar = (s4.o) obj;
                s4.o oVar2 = (s4.o) obj2;
                RecyclerView recyclerView = oVar.d;
                if ((recyclerView == null) == (oVar2.d == null)) {
                    boolean z10 = oVar.a;
                    if (z10 == oVar2.a) {
                        int i11 = oVar2.b - oVar.b;
                        if (i11 != 0) {
                            return i11;
                        }
                        int i12 = oVar.c - oVar2.c;
                        if (i12 != 0) {
                            return i12;
                        }
                        return 0;
                    }
                }
                break;
            case 5:
                return ((z4.c) obj).b - ((z4.c) obj2).b;
            case 6:
                z4.d dVar = (z4.d) ((View) obj).getLayoutParams();
                z4.d dVar2 = (z4.d) ((View) obj2).getLayoutParams();
                boolean z11 = dVar.a;
                return z11 != dVar2.a ? z11 ? 1 : -1 : dVar.e - dVar2.e;
            default:
                Runnable runnable = (Runnable) obj;
                Runnable runnable2 = (Runnable) obj2;
                return (runnable2 instanceof ze.b ? ((ze.b) runnable2).a : 1) - (runnable instanceof ze.b ? ((ze.b) runnable).a : 1);
        }
    }
}
