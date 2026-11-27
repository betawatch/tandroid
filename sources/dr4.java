// default package

import android.graphics.Bitmap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class dr4 implements es4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dr4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // es4
    public final Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                hr4 hr4Var = (hr4) obj2;
                p1c p1cVar = (p1c) obj;
                if (p1cVar == null) {
                    return null;
                }
                if ((hr4Var.b & 2048) == 0 || !rk2.e(p1cVar.g)) {
                    return p1cVar;
                }
                return null;
            case 1:
                yh7 yh7Var = (yh7) obj2;
                p1c p1cVar2 = (p1c) obj;
                if (p1cVar2 == null) {
                    return null;
                }
                if ((yh7Var.b & 1024) == 0 || !rk2.e(p1cVar2.g)) {
                    return p1cVar2;
                }
                return null;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                int height = bitmap.getHeight();
                int width = bitmap.getWidth();
                lo5 lo5Var = (lo5) ((ym4) obj2).c;
                if (!lo5Var.a(Math.max(height, width))) {
                    return bitmap;
                }
                if (lo5Var.a(height)) {
                    height--;
                }
                if (lo5Var.a(width)) {
                    width--;
                }
                return zz.p(Bitmap.createScaledBitmap(bitmap, width, height, true));
            default:
                Bitmap bitmap2 = (Bitmap) obj;
                int width2 = bitmap2.getWidth();
                int i = ((ed) obj2).b;
                if (width2 > i || bitmap2.getHeight() > i) {
                    float f = i;
                    float width3 = bitmap2.getWidth();
                    float height2 = bitmap2.getHeight();
                    float min = Math.min(f / width3, f / height2);
                    bitmap2 = Bitmap.createScaledBitmap(bitmap2, (int) (width3 * min), (int) (height2 * min), true);
                }
                return zz.p(bitmap2);
        }
    }
}
