package a8;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c {
    public static final Object c = new Object();
    public static int d;
    public final SparseIntArray a = new SparseIntArray();
    public final SparseIntArray b = new SparseIntArray();

    public final int a(int i9) {
        synchronized (c) {
            try {
                int i10 = this.a.get(i9, -1);
                if (i10 != -1) {
                    return i10;
                }
                int i11 = d;
                d = i11 + 1;
                this.a.append(i9, i11);
                this.b.append(i11, i9);
                return i11;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
