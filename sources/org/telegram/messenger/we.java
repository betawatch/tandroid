package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
