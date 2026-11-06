package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class r5 {
    public static ArrayList j;
    public static r5 k;
    public static final ArrayList l = new ArrayList();
    public static final androidx.emoji2.text.n m = new androidx.emoji2.text.n(4);
    public ArrayList a;
    public SparseIntArray b;
    public ArrayList c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public m.f3 i;

    public static void a(Runnable runnable) {
        if (Thread.currentThread() != t0.d.getLooper().getThread()) {
            boolean z9 = r2.a;
            a8.g(new RuntimeException("wrong thread"), true);
            return;
        }
        if (j == null) {
            ArrayList arrayList = l;
            if (arrayList.isEmpty()) {
                j = new ArrayList(100);
            } else {
                j = (ArrayList) org.telegram.ui.Cells.f1.k(1, arrayList);
            }
            g0.h3(m);
        }
        j.add(runnable);
    }
}
