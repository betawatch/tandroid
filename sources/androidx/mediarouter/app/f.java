package androidx.mediarouter.app;

import java.util.Comparator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
