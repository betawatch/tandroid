package org.telegram.messenger;

import android.util.SparseArray;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class g4 {
    public static final SparseArray e = new SparseArray();
    public static final ArrayList f = new ArrayList();
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    public g4(int i7, int i10) {
        if (i7 == -2) {
            this.d = true;
            i7 = -1;
        }
        this.a = i7;
        Integer valueOf = Integer.valueOf(i7);
        this.b = i10;
        this.c = Objects.hash(0, valueOf, Integer.valueOf(i10));
    }

    public final void a() {
        if (e.indexOfKey(this.c) >= 0) {
            return;
        }
        ArrayList arrayList = f;
        if (arrayList.contains(Integer.valueOf(this.c))) {
            return;
        }
        arrayList.add(Integer.valueOf(this.c));
        Utilities.e.c(new a(this, 5));
    }

    public final int hashCode() {
        return this.c;
    }
}
