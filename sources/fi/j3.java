package fi;

import android.graphics.Bitmap;
import android.util.LruCache;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class j3 extends LruCache {
    @Override // android.util.LruCache
    public final void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        Bitmap bitmap = (Bitmap) obj2;
        if (bitmap.isRecycled() || k3.e0.containsKey(str)) {
            return;
        }
        bitmap.recycle();
    }
}
