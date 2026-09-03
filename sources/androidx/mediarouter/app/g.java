package androidx.mediarouter.app;

import java.util.Comparator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class g implements Comparator {
    public static final g b = new g(0);
    public static final g c = new g(1);
    public static final g d = new g(2);
    public final /* synthetic */ int a;

    public /* synthetic */ g(int i10) {
        this.a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
        }
        return ((c2.b0) obj).d.compareToIgnoreCase(((c2.b0) obj2).d);
    }
}
