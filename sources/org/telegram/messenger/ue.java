package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class ue {
    public final int a;
    public boolean b;
    public final String c;
    public final ef d;
    public final ArrayList e = new ArrayList();
    public final SparseArray f = new SparseArray();

    public ue(int i7, String str, ef efVar) {
        this.a = i7;
        this.c = str;
        this.d = efVar;
    }

    public final void a(ef efVar) {
        this.e.add(efVar);
        this.f.put(efVar.C, efVar);
    }
}
