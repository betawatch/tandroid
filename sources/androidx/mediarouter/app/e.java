package androidx.mediarouter.app;

import java.util.Comparator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class e implements Comparator {
    public static final e b = new e(0);
    public static final e c = new e(1);
    public static final e d = new e(2);
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i7) {
        this.a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
        }
        return ((s4.v) obj).d.compareToIgnoreCase(((s4.v) obj2).d);
    }
}
