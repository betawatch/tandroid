package androidx.mediarouter.app;

import java.util.Comparator;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class f implements Comparator {
    public static final f b = new f(0);
    public static final f c = new f(1);
    public static final f d = new f(2);
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i10) {
        this.a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
        }
        return ((p4.v) obj).d.compareToIgnoreCase(((p4.v) obj2).d);
    }
}
