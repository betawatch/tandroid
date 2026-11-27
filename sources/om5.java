// default package

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class om5 extends jq {
    public final /* synthetic */ byte e;
    public final /* synthetic */ in5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om5(in5 in5Var) {
        super(10485760);
        this.e = (byte) 2;
        this.f = in5Var;
    }

    @Override // jq
    public final void e(Object obj, Object obj2, String str) {
        byte b = this.e;
        in5 in5Var = this.f;
        switch (b) {
            case 0:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                String str2 = in5Var.F;
                if (str2 == null || !str2.equals(str)) {
                    Integer num = (Integer) in5Var.a.get(str);
                    if (num == null || num.intValue() == 0) {
                        Bitmap bitmap = bitmapDrawable.getBitmap();
                        if (!bitmap.isRecycled()) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(bitmap);
                            hl.x2(arrayList);
                            break;
                        }
                    }
                }
                break;
            case 1:
                BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj;
                String str3 = in5Var.F;
                if (str3 == null || !str3.equals(str)) {
                    Integer num2 = (Integer) in5Var.a.get(str);
                    if (num2 == null || num2.intValue() == 0) {
                        Bitmap bitmap2 = bitmapDrawable2.getBitmap();
                        if (!bitmap2.isRecycled()) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(bitmap2);
                            hl.x2(arrayList2);
                            break;
                        }
                    }
                }
                break;
            default:
                BitmapDrawable bitmapDrawable3 = (BitmapDrawable) obj;
                Integer num3 = (Integer) in5Var.a.get(str);
                boolean z = bitmapDrawable3 instanceof lm;
                if (z) {
                    in5Var.f.remove((lm) bitmapDrawable3);
                }
                if (num3 == null || num3.intValue() == 0) {
                    if (z) {
                        ((lm) bitmapDrawable3).u();
                    }
                    if (bitmapDrawable3 instanceof b29) {
                        ((b29) bitmapDrawable3).x(false);
                        break;
                    }
                }
                break;
        }
    }

    @Override // jq
    public final Object l(String str, Object obj) {
        switch (this.e) {
            case 2:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable instanceof lm) {
                    this.f.f.add((lm) bitmapDrawable);
                }
                return (BitmapDrawable) super.l(str, bitmapDrawable);
            default:
                return super.l(str, obj);
        }
    }

    @Override // jq
    public final int q(Object obj) {
        switch (this.e) {
        }
        return in5.Z((BitmapDrawable) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ om5(in5 in5Var, int i, byte b) {
        super(i);
        this.e = b;
        this.f = in5Var;
    }
}
