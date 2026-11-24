// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Scope;
import j$.util.Objects;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Comparator;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class is6 implements Comparator {
    public static final is6 b = new is6(0);
    public static final is6 c = new is6(1);
    public static final is6 d = new is6(2);
    public static final /* synthetic */ is6 e = new is6(3);
    public static final /* synthetic */ is6 f = new is6(12);
    public static final /* synthetic */ is6 h = new is6(13);
    public final /* synthetic */ byte a;

    public /* synthetic */ is6(byte b2) {
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
                return ((eu6) obj).d.compareToIgnoreCase(((eu6) obj2).d);
            case 1:
                return ((eu6) obj).d.compareToIgnoreCase(((eu6) obj2).d);
            case 2:
                return ((eu6) obj).d.compareToIgnoreCase(((eu6) obj2).d);
            case 3:
                ((u3d) obj2).getClass();
                ((u3d) obj).getClass();
                return 0;
            case 4:
                return ((fl2) obj2).b() - ((fl2) obj).b();
            case 5:
                un3 un3Var = (un3) obj;
                un3 un3Var2 = (un3) obj2;
                int i = un3Var.a - un3Var2.a;
                return i == 0 ? un3Var.b - un3Var2.b : i;
            case 6:
                Runnable runnable = (Runnable) obj;
                Runnable runnable2 = (Runnable) obj2;
                return (runnable2 instanceof go3 ? ((go3) runnable2).a : 1) - (runnable instanceof go3 ? ((go3) runnable).a : 1);
            case 7:
                xr4 xr4Var = (xr4) obj;
                xr4 xr4Var2 = (xr4) obj2;
                RecyclerView recyclerView = xr4Var.d;
                if ((recyclerView == null) == (xr4Var2.d == null)) {
                    boolean z = xr4Var.a;
                    if (z == xr4Var2.a) {
                        int i2 = xr4Var2.b - xr4Var.b;
                        if (i2 == 0 && (i2 = xr4Var.c - xr4Var2.c) == 0) {
                            return 0;
                        }
                        return i2;
                    }
                }
                break;
            case 8:
                return ((ewa) obj).d - ((ewa) obj2).d;
            case 9:
                InetAddress inetAddress = (InetAddress) obj;
                if (inetAddress.getClass() != ((InetAddress) obj2).getClass()) {
                    return inetAddress instanceof Inet6Address ? -1 : 1;
                }
                return 0;
            case 10:
                return ((cec) obj).b - ((cec) obj2).b;
            case 11:
                dec decVar = (dec) ((View) obj).getLayoutParams();
                dec decVar2 = (dec) ((View) obj2).getLayoutParams();
                boolean z2 = decVar.a;
                return z2 != decVar2.a ? z2 ? 1 : -1 : decVar.e - decVar2.e;
            case 12:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            case 13:
                f84 f84Var = (f84) obj2;
                f84 f84Var2 = (f84) obj;
                return !f84Var2.a.equals(f84Var.a) ? f84Var2.a.compareTo(f84Var.a) : Long.compare(f84Var2.b(), f84Var.b());
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
