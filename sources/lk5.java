// default package

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class lk5 extends iq {
    public final /* synthetic */ byte e;
    public final /* synthetic */ fl5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk5(fl5 fl5Var) {
        super(10485760);
        this.e = (byte) 2;
        this.f = fl5Var;
    }

    @Override // iq
    public final void e(Object obj, Object obj2, String str) {
        byte b = this.e;
        fl5 fl5Var = this.f;
        switch (b) {
            case 0:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                String str2 = fl5Var.F;
                if (str2 == null || !str2.equals(str)) {
                    Integer num = (Integer) fl5Var.a.get(str);
                    if (num == null || num.intValue() == 0) {
                        Bitmap bitmap = bitmapDrawable.getBitmap();
                        if (!bitmap.isRecycled()) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(bitmap);
                            gl.x2(arrayList);
                            break;
                        }
                    }
                }
                break;
            case 1:
                BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj;
                String str3 = fl5Var.F;
                if (str3 == null || !str3.equals(str)) {
                    Integer num2 = (Integer) fl5Var.a.get(str);
                    if (num2 == null || num2.intValue() == 0) {
                        Bitmap bitmap2 = bitmapDrawable2.getBitmap();
                        if (!bitmap2.isRecycled()) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(bitmap2);
                            gl.x2(arrayList2);
                            break;
                        }
                    }
                }
                break;
            default:
                BitmapDrawable bitmapDrawable3 = (BitmapDrawable) obj;
                Integer num3 = (Integer) fl5Var.a.get(str);
                boolean z = bitmapDrawable3 instanceof km;
                if (z) {
                    fl5Var.f.remove((km) bitmapDrawable3);
                }
                if (num3 == null || num3.intValue() == 0) {
                    if (z) {
                        ((km) bitmapDrawable3).u();
                    }
                    if (bitmapDrawable3 instanceof oy8) {
                        ((oy8) bitmapDrawable3).x(false);
                        break;
                    }
                }
                break;
        }
    }

    @Override // iq
    public final Object l(String str, Object obj) {
        switch (this.e) {
            case 2:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable instanceof km) {
                    this.f.f.add((km) bitmapDrawable);
                }
                return (BitmapDrawable) super.l(str, bitmapDrawable);
            default:
                return super.l(str, obj);
        }
    }

    @Override // iq
    public final int q(Object obj) {
        switch (this.e) {
        }
        return fl5.Z((BitmapDrawable) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lk5(fl5 fl5Var, int i, byte b) {
        super(i);
        this.e = b;
        this.f = fl5Var;
    }
}
