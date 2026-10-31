package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.ArrayList;
import org.telegram.ui.Components.bi0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class kb extends e2.j0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ hc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kb(hc hcVar, int i10, int i11) {
        super(i10, 3);
        this.e = i11;
        this.f = hcVar;
    }

    @Override // e2.j0
    public void e(String str, Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                hc hcVar = this.f;
                String str2 = hcVar.F;
                if (str2 == null || !str2.equals(str)) {
                    Integer num = (Integer) hcVar.a.get(str);
                    if (num == null || num.intValue() == 0) {
                        Bitmap bitmap = bitmapDrawable.getBitmap();
                        if (!bitmap.isRecycled()) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(bitmap);
                            i0.A2(arrayList);
                            break;
                        }
                    }
                }
                break;
            case 1:
                BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj;
                hc hcVar2 = this.f;
                String str3 = hcVar2.F;
                if (str3 == null || !str3.equals(str)) {
                    Integer num2 = (Integer) hcVar2.a.get(str);
                    if (num2 == null || num2.intValue() == 0) {
                        Bitmap bitmap2 = bitmapDrawable2.getBitmap();
                        if (!bitmap2.isRecycled()) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(bitmap2);
                            i0.A2(arrayList2);
                            break;
                        }
                    }
                }
                break;
            case 3:
                BitmapDrawable bitmapDrawable3 = (BitmapDrawable) obj;
                hc hcVar3 = this.f;
                Integer num3 = (Integer) hcVar3.a.get(str);
                boolean z10 = bitmapDrawable3 instanceof org.telegram.ui.Components.s5;
                if (z10) {
                    hcVar3.f.remove((org.telegram.ui.Components.s5) bitmapDrawable3);
                }
                if (num3 == null || num3.intValue() == 0) {
                    if (z10) {
                        ((org.telegram.ui.Components.s5) bitmapDrawable3).u();
                    }
                    if (bitmapDrawable3 instanceof bi0) {
                        ((bi0) bitmapDrawable3).C(false);
                        break;
                    }
                }
                break;
        }
    }

    @Override // e2.j0
    public Object l(String str, Object obj) {
        switch (this.e) {
            case 3:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable instanceof org.telegram.ui.Components.s5) {
                    this.f.f.add((org.telegram.ui.Components.s5) bitmapDrawable);
                }
                return (BitmapDrawable) super.l(str, bitmapDrawable);
            default:
                return super.l(str, obj);
        }
    }

    @Override // e2.j0
    public final int q(Object obj) {
        switch (this.e) {
            case 0:
                return hc.d(this.f, (BitmapDrawable) obj);
            case 1:
                return hc.d(this.f, (BitmapDrawable) obj);
            case 2:
                return hc.d(this.f, (BitmapDrawable) obj);
            default:
                return hc.d(this.f, (BitmapDrawable) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(hc hcVar) {
        super(10485760, 3);
        this.e = 3;
        this.f = hcVar;
    }
}
