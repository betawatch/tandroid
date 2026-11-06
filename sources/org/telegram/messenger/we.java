package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class we {
    public final int a;
    public boolean b;
    public final String c;
    public final gf d;
    public final ArrayList e = new ArrayList();
    public final SparseArray f = new SparseArray();

    public we(int i7, String str, gf gfVar) {
        this.a = i7;
        this.c = str;
        this.d = gfVar;
    }

    public final void a(gf gfVar) {
        this.e.add(gfVar);
        this.f.put(gfVar.C, gfVar);
    }
}
