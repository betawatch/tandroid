package androidx.mediarouter.app;

import java.util.Comparator;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
