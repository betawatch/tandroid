package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
