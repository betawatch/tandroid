package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class t5 {
    public static ArrayList j;
    public static t5 k;
    public static final ArrayList l = new ArrayList();
    public static final androidx.emoji2.text.n m = new androidx.emoji2.text.n(3);
    public ArrayList a;
    public SparseIntArray b;
    public ArrayList c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public mg.c2 i;

    public static void a(Runnable runnable) {
        if (Thread.currentThread() != w0.d.getLooper().getThread()) {
            boolean z10 = v2.a;
            f8.g(new RuntimeException("wrong thread"), true);
            return;
        }
        if (j == null) {
            ArrayList arrayList = l;
            if (arrayList.isEmpty()) {
                j = new ArrayList(100);
            } else {
                j = (ArrayList) i0.a.v(1, arrayList);
            }
            i0.g3(m);
        }
        j.add(runnable);
    }
}
