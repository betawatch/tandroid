package fh;

import android.graphics.Bitmap;
import android.util.LruCache;
import hi.a3;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class i extends LruCache {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i7, int i10) {
        super(i7);
        this.a = i10;
    }

    @Override // android.util.LruCache
    public void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 1:
                String str = (String) obj;
                Bitmap bitmap = (Bitmap) obj2;
                if (!bitmap.isRecycled() && !a3.f0.containsKey(str)) {
                    bitmap.recycle();
                    break;
                }
                break;
            default:
                super.entryRemoved(z10, obj, obj2, obj3);
                break;
        }
    }

    @Override // android.util.LruCache
    public int sizeOf(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((j) obj2).d;
            default:
                return super.sizeOf(obj, obj2);
        }
    }
}
