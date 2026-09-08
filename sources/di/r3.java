package di;

import android.graphics.Bitmap;
import android.util.LruCache;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class r3 extends LruCache {
    @Override // android.util.LruCache
    public final void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        Bitmap bitmap = (Bitmap) obj2;
        if (bitmap.isRecycled() || s3.e0.containsKey(str)) {
            return;
        }
        bitmap.recycle();
    }
}
