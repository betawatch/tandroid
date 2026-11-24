// default package

import android.graphics.Bitmap;
import android.util.LruCache;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class nr4 extends LruCache {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nr4(int i, byte b) {
        super(i);
        this.a = b;
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                Bitmap bitmap = (Bitmap) obj2;
                if (!bitmap.isRecycled() && !or4.f0.containsKey(str)) {
                    bitmap.recycle();
                    break;
                }
                break;
            default:
                super.entryRemoved(z, obj, obj2, obj3);
                break;
        }
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                return ((cx4) obj2).d;
            case 2:
                bb8 bb8Var = (bb8) obj2;
                return Math.max(1, gb8.a(bb8Var.q) + gb8.a(bb8Var.o) + gb8.a(bb8Var.n) + gb8.a(bb8Var.m) + gb8.a(bb8Var.l) + gb8.a(bb8Var.k) + gb8.a(bb8Var.j));
            default:
                return super.sizeOf(obj, obj2);
        }
    }
}
