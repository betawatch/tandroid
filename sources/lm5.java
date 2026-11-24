// default package

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lm5 extends ir {
    public final /* synthetic */ byte e;
    public final /* synthetic */ fn5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm5(fn5 fn5Var) {
        super(10485760);
        this.e = (byte) 2;
        this.f = fn5Var;
    }

    @Override // ir
    public final void e(Object obj, Object obj2, String str) {
        byte b = this.e;
        fn5 fn5Var = this.f;
        switch (b) {
            case 0:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                String str2 = fn5Var.F;
                if (str2 == null || !str2.equals(str)) {
                    Integer num = (Integer) fn5Var.a.get(str);
                    if (num == null || num.intValue() == 0) {
                        Bitmap bitmap = bitmapDrawable.getBitmap();
                        if (!bitmap.isRecycled()) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(bitmap);
                            gm.x2(arrayList);
                            break;
                        }
                    }
                }
                break;
            case 1:
                BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj;
                String str3 = fn5Var.F;
                if (str3 == null || !str3.equals(str)) {
                    Integer num2 = (Integer) fn5Var.a.get(str);
                    if (num2 == null || num2.intValue() == 0) {
                        Bitmap bitmap2 = bitmapDrawable2.getBitmap();
                        if (!bitmap2.isRecycled()) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(bitmap2);
                            gm.x2(arrayList2);
                            break;
                        }
                    }
                }
                break;
            default:
                BitmapDrawable bitmapDrawable3 = (BitmapDrawable) obj;
                Integer num3 = (Integer) fn5Var.a.get(str);
                boolean z = bitmapDrawable3 instanceof kn;
                if (z) {
                    fn5Var.f.remove((kn) bitmapDrawable3);
                }
                if (num3 == null || num3.intValue() == 0) {
                    if (z) {
                        ((kn) bitmapDrawable3).u();
                    }
                    if (bitmapDrawable3 instanceof p09) {
                        ((p09) bitmapDrawable3).x(false);
                        break;
                    }
                }
                break;
        }
    }

    @Override // ir
    public final Object l(String str, Object obj) {
        switch (this.e) {
            case 2:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable instanceof kn) {
                    this.f.f.add((kn) bitmapDrawable);
                }
                return (BitmapDrawable) super.l(str, bitmapDrawable);
            default:
                return super.l(str, obj);
        }
    }

    @Override // ir
    public final int q(Object obj) {
        switch (this.e) {
        }
        return fn5.Z((BitmapDrawable) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lm5(fn5 fn5Var, int i, byte b) {
        super(i);
        this.e = b;
        this.f = fn5Var;
    }
}
