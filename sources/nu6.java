// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Scope;
import j$.util.Objects;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Comparator;
import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class nu6 implements Comparator {
    public static final nu6 b = new nu6(0);
    public static final nu6 c = new nu6(1);
    public static final nu6 d = new nu6(2);
    public static final /* synthetic */ nu6 e = new nu6(3);
    public static final /* synthetic */ nu6 f = new nu6(12);
    public static final /* synthetic */ nu6 h = new nu6(13);
    public final /* synthetic */ byte a;

    public /* synthetic */ nu6(byte b2) {
        this.a = b2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c6, code lost:
    
        if (r5 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cf, code lost:
    
        if (r5 != false) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((jw6) obj).d.compareToIgnoreCase(((jw6) obj2).d);
            case 1:
                return ((jw6) obj).d.compareToIgnoreCase(((jw6) obj2).d);
            case 2:
                return ((jw6) obj).d.compareToIgnoreCase(((jw6) obj2).d);
            case 3:
                ((l8d) obj2).getClass();
                ((l8d) obj).getClass();
                return 0;
            case 4:
                return ((zl2) obj2).b() - ((zl2) obj).b();
            case 5:
                lo3 lo3Var = (lo3) obj;
                lo3 lo3Var2 = (lo3) obj2;
                int i = lo3Var.a - lo3Var2.a;
                return i == 0 ? lo3Var.b - lo3Var2.b : i;
            case 6:
                Runnable runnable = (Runnable) obj;
                Runnable runnable2 = (Runnable) obj2;
                return (runnable2 instanceof xo3 ? ((xo3) runnable2).a : 1) - (runnable instanceof xo3 ? ((xo3) runnable).a : 1);
            case 7:
                bu4 bu4Var = (bu4) obj;
                bu4 bu4Var2 = (bu4) obj2;
                RecyclerView recyclerView = bu4Var.d;
                if ((recyclerView == null) == (bu4Var2.d == null)) {
                    boolean z = bu4Var.a;
                    if (z == bu4Var2.a) {
                        int i2 = bu4Var2.b - bu4Var.b;
                        if (i2 == 0 && (i2 = bu4Var.c - bu4Var2.c) == 0) {
                            return 0;
                        }
                        return i2;
                    }
                }
                break;
            case 8:
                return ((h0b) obj).d - ((h0b) obj2).d;
            case 9:
                InetAddress inetAddress = (InetAddress) obj;
                if (inetAddress.getClass() != ((InetAddress) obj2).getClass()) {
                    return inetAddress instanceof Inet6Address ? -1 : 1;
                }
                return 0;
            case 10:
                return ((bic) obj).b - ((bic) obj2).b;
            case 11:
                cic cicVar = (cic) ((View) obj).getLayoutParams();
                cic cicVar2 = (cic) ((View) obj2).getLayoutParams();
                boolean z2 = cicVar.a;
                return z2 != cicVar2.a ? z2 ? 1 : -1 : cicVar.e - cicVar2.e;
            case 12:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            case 13:
                a94 a94Var = (a94) obj2;
                a94 a94Var2 = (a94) obj;
                return !a94Var2.a.equals(a94Var.a) ? a94Var2.a.compareTo(a94Var.a) : Long.compare(a94Var2.b(), a94Var.b());
            case 14:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
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
