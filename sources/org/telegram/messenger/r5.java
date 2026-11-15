package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class r5 {
    public static ArrayList j;
    public static r5 k;
    public static final ArrayList l = new ArrayList();
    public static final androidx.emoji2.text.o m = new androidx.emoji2.text.o(4);
    public ArrayList a;
    public SparseIntArray b;
    public ArrayList c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public j6.o i;

    public static void a(Runnable runnable) {
        if (Thread.currentThread() != t0.d.getLooper().getThread()) {
            boolean z10 = r2.a;
            a8.g(new RuntimeException("wrong thread"), true);
            return;
        }
        if (j == null) {
            ArrayList arrayList = l;
            if (arrayList.isEmpty()) {
                j = new ArrayList(100);
            } else {
                j = (ArrayList) r.b.g(1, arrayList);
            }
            g0.h3(m);
        }
        j.add(runnable);
    }
}
