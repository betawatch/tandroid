// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Scope;
import j$.util.Objects;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Comparator;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ju6 implements Comparator {
    public static final ju6 b = new ju6(0);
    public static final ju6 c = new ju6(1);
    public static final ju6 d = new ju6(2);
    public static final /* synthetic */ ju6 e = new ju6(3);
    public static final /* synthetic */ ju6 f = new ju6(12);
    public static final /* synthetic */ ju6 h = new ju6(13);
    public final /* synthetic */ byte a;

    public /* synthetic */ ju6(byte b2) {
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
                return ((ew6) obj).d.compareToIgnoreCase(((ew6) obj2).d);
            case 1:
                return ((ew6) obj).d.compareToIgnoreCase(((ew6) obj2).d);
            case 2:
                return ((ew6) obj).d.compareToIgnoreCase(((ew6) obj2).d);
            case 3:
                ((w5d) obj2).getClass();
                ((w5d) obj).getClass();
                return 0;
            case 4:
                return ((rm2) obj2).b() - ((rm2) obj).b();
            case 5:
                ep3 ep3Var = (ep3) obj;
                ep3 ep3Var2 = (ep3) obj2;
                int i = ep3Var.a - ep3Var2.a;
                return i == 0 ? ep3Var.b - ep3Var2.b : i;
            case 6:
                Runnable runnable = (Runnable) obj;
                Runnable runnable2 = (Runnable) obj2;
                return (runnable2 instanceof qp3 ? ((qp3) runnable2).a : 1) - (runnable instanceof qp3 ? ((qp3) runnable).a : 1);
            case 7:
                yt4 yt4Var = (yt4) obj;
                yt4 yt4Var2 = (yt4) obj2;
                RecyclerView recyclerView = yt4Var.d;
                if ((recyclerView == null) == (yt4Var2.d == null)) {
                    boolean z = yt4Var.a;
                    if (z == yt4Var2.a) {
                        int i2 = yt4Var2.b - yt4Var.b;
                        if (i2 == 0 && (i2 = yt4Var.c - yt4Var2.c) == 0) {
                            return 0;
                        }
                        return i2;
                    }
                }
                break;
            case 8:
                return ((hya) obj).d - ((hya) obj2).d;
            case 9:
                InetAddress inetAddress = (InetAddress) obj;
                if (inetAddress.getClass() != ((InetAddress) obj2).getClass()) {
                    return inetAddress instanceof Inet6Address ? -1 : 1;
                }
                return 0;
            case 10:
                return ((cgc) obj).b - ((cgc) obj2).b;
            case 11:
                dgc dgcVar = (dgc) ((View) obj).getLayoutParams();
                dgc dgcVar2 = (dgc) ((View) obj2).getLayoutParams();
                boolean z2 = dgcVar.a;
                return z2 != dgcVar2.a ? z2 ? 1 : -1 : dgcVar.e - dgcVar2.e;
            case 12:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            case 13:
                o94 o94Var = (o94) obj2;
                o94 o94Var2 = (o94) obj;
                return !o94Var2.a.equals(o94Var.a) ? o94Var2.a.compareTo(o94Var.a) : Long.compare(o94Var2.b(), o94Var.b());
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
