package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
