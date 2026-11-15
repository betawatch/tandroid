package m1;

import android.os.FileObserver;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class v0 extends FileObserver {
    public static final Object b = new Object();
    public static final LinkedHashMap c = new LinkedHashMap();
    public final CopyOnWriteArrayList a;

    public v0(String str) {
        super(str, 128);
        this.a = new CopyOnWriteArrayList();
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i7, String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((rd.l) it.next()).invoke(str);
        }
    }
}
