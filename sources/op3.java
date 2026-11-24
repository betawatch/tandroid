// default package

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class op3 {
    public static ArrayList j;
    public static op3 k;
    public static final ArrayList l = new ArrayList();
    public static final sw m = new sw(6);
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
            boolean z = e21.a;
            fc4.g(new RuntimeException("wrong thread"), true);
            return;
        }
        if (j == null) {
            ArrayList arrayList = l;
            if (arrayList.isEmpty()) {
                j = new ArrayList(100);
            } else {
                j = (ArrayList) td4.m(1, arrayList);
            }
            gm.c3(m);
        }
        j.add(runnable);
    }
}
