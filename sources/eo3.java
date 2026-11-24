// default package

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class eo3 {
    public static ArrayList j;
    public static eo3 k;
    public static final ArrayList l = new ArrayList();
    public static final sv m = new sv(6);
    public ArrayList a;
    public SparseIntArray b;
    public ArrayList c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public o1 i;

    public static void a(Runnable runnable) {
        if (Thread.currentThread() != a.d.getLooper().getThread()) {
            boolean z = w01.a;
            fa4.g(new RuntimeException("wrong thread"), true);
            return;
        }
        if (j == null) {
            ArrayList arrayList = l;
            if (arrayList.isEmpty()) {
                j = new ArrayList(100);
            } else {
                j = (ArrayList) tb4.l(1, arrayList);
            }
            gl.c3(m);
        }
        j.add(runnable);
    }
}
