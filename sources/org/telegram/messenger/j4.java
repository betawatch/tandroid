package org.telegram.messenger;

import android.util.SparseArray;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class j4 {
    public static final SparseArray e = new SparseArray();
    public static final ArrayList f = new ArrayList();
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    public j4(int i10, int i11) {
        if (i10 == -2) {
            this.d = true;
            i10 = -1;
        }
        this.a = i10;
        Integer valueOf = Integer.valueOf(i10);
        this.b = i11;
        this.c = Objects.hash(0, valueOf, Integer.valueOf(i11));
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
