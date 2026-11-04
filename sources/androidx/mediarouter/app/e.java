package androidx.mediarouter.app;

import java.util.Comparator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e implements Comparator {
    public static final e b = new e(0);
    public static final e c = new e(1);
    public static final e d = new e(2);
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i3) {
        this.a = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
        }
        return ((r4.w) obj).d.compareToIgnoreCase(((r4.w) obj2).d);
    }
}
