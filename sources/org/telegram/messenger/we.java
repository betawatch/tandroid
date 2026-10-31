package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class we {
    public final int a;
    public boolean b;
    public final String c;
    public final ef d;
    public final ArrayList e = new ArrayList();
    public final SparseArray f = new SparseArray();

    public we(int i10, String str, ef efVar) {
        this.a = i10;
        this.c = str;
        this.d = efVar;
    }

    public final void a(ef efVar) {
        this.e.add(efVar);
        this.f.put(efVar.C, efVar);
    }
}
