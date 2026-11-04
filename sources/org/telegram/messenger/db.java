package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.ArrayList;
import org.telegram.ui.Components.ch0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class db extends g2.k0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ zb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ db(zb zbVar, int i3, int i10) {
        super(i3, 3);
        this.e = i10;
        this.f = zbVar;
    }

    @Override // g2.k0
    public void e(String str, Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                zb zbVar = this.f;
                String str2 = zbVar.F;
                if (str2 == null || !str2.equals(str)) {
                    Integer num = (Integer) zbVar.a.get(str);
                    if (num == null || num.intValue() == 0) {
                        Bitmap bitmap = bitmapDrawable.getBitmap();
                        if (!bitmap.isRecycled()) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(bitmap);
                            g0.A2(arrayList);
                            break;
                        }
                    }
                }
                break;
            case 1:
                BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj;
                zb zbVar2 = this.f;
                String str3 = zbVar2.F;
                if (str3 == null || !str3.equals(str)) {
                    Integer num2 = (Integer) zbVar2.a.get(str);
                    if (num2 == null || num2.intValue() == 0) {
                        Bitmap bitmap2 = bitmapDrawable2.getBitmap();
                        if (!bitmap2.isRecycled()) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(bitmap2);
                            g0.A2(arrayList2);
                            break;
                        }
                    }
                }
                break;
            case 3:
                BitmapDrawable bitmapDrawable3 = (BitmapDrawable) obj;
                zb zbVar3 = this.f;
                Integer num3 = (Integer) zbVar3.a.get(str);
                boolean z10 = bitmapDrawable3 instanceof org.telegram.ui.Components.t5;
                if (z10) {
                    zbVar3.f.remove((org.telegram.ui.Components.t5) bitmapDrawable3);
                }
                if (num3 == null || num3.intValue() == 0) {
                    if (z10) {
                        ((org.telegram.ui.Components.t5) bitmapDrawable3).u();
                    }
                    if (bitmapDrawable3 instanceof ch0) {
                        ((ch0) bitmapDrawable3).C(false);
                        break;
                    }
                }
                break;
        }
    }

    @Override // g2.k0
    public Object l(String str, Object obj) {
        switch (this.e) {
            case 3:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable instanceof org.telegram.ui.Components.t5) {
                    this.f.f.add((org.telegram.ui.Components.t5) bitmapDrawable);
                }
                return (BitmapDrawable) super.l(str, bitmapDrawable);
            default:
                return super.l(str, obj);
        }
    }

    @Override // g2.k0
    public final int q(Object obj) {
        switch (this.e) {
            case 0:
                return zb.d(this.f, (BitmapDrawable) obj);
            case 1:
                return zb.d(this.f, (BitmapDrawable) obj);
            case 2:
                return zb.d(this.f, (BitmapDrawable) obj);
            default:
                return zb.d(this.f, (BitmapDrawable) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(zb zbVar) {
        super(10485760, 3);
        this.e = 3;
        this.f = zbVar;
    }
}
