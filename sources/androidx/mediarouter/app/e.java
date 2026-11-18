package androidx.mediarouter.app;

import java.util.Comparator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
