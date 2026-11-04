package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class pe {
    public final int a;
    public boolean b;
    public final String c;
    public final ye d;
    public final ArrayList e = new ArrayList();
    public final SparseArray f = new SparseArray();

    public pe(int i3, String str, ye yeVar) {
        this.a = i3;
        this.c = str;
        this.d = yeVar;
    }

    public final void a(ye yeVar) {
        this.e.add(yeVar);
        this.f.put(yeVar.C, yeVar);
    }
}
