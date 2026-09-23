package ci;

import android.graphics.Bitmap;
import android.util.LruCache;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class q3 extends LruCache {
    @Override // android.util.LruCache
    public final void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        Bitmap bitmap = (Bitmap) obj2;
        if (bitmap.isRecycled() || r3.e0.containsKey(str)) {
            return;
        }
        bitmap.recycle();
    }
}
