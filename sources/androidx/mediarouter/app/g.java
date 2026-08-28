package androidx.mediarouter.app;

import java.util.Comparator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g implements Comparator {
    public static final g b = new g(0);
    public static final g c = new g(1);
    public static final g d = new g(2);
    public final /* synthetic */ int a;

    public /* synthetic */ g(int i9) {
        this.a = i9;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
        }
        return ((c2.a0) obj).d.compareToIgnoreCase(((c2.a0) obj2).d);
    }
}
