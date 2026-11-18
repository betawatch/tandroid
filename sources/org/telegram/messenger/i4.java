package org.telegram.messenger;

import android.util.SparseArray;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class i4 {
    public static final SparseArray e = new SparseArray();
    public static final ArrayList f = new ArrayList();
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    public i4(int i7, int i10) {
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
