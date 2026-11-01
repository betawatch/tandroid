package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.ArrayList;
import org.telegram.ui.Components.ci0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class lb extends e2.j0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ic f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lb(ic icVar, int i10, int i11) {
        super(i10, 3);
        this.e = i11;
        this.f = icVar;
    }

    @Override // e2.j0
    public void e(String str, Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                ic icVar = this.f;
                String str2 = icVar.F;
                if (str2 == null || !str2.equals(str)) {
                    Integer num = (Integer) icVar.a.get(str);
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
                ic icVar2 = this.f;
                String str3 = icVar2.F;
                if (str3 == null || !str3.equals(str)) {
                    Integer num2 = (Integer) icVar2.a.get(str);
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
                ic icVar3 = this.f;
                Integer num3 = (Integer) icVar3.a.get(str);
                boolean z10 = bitmapDrawable3 instanceof org.telegram.ui.Components.s5;
                if (z10) {
                    icVar3.f.remove((org.telegram.ui.Components.s5) bitmapDrawable3);
                }
                if (num3 == null || num3.intValue() == 0) {
                    if (z10) {
                        ((org.telegram.ui.Components.s5) bitmapDrawable3).u();
                    }
                    if (bitmapDrawable3 instanceof ci0) {
                        ((ci0) bitmapDrawable3).C(false);
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
                return ic.d(this.f, (BitmapDrawable) obj);
            case 1:
                return ic.d(this.f, (BitmapDrawable) obj);
            case 2:
                return ic.d(this.f, (BitmapDrawable) obj);
            default:
                return ic.d(this.f, (BitmapDrawable) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(ic icVar) {
        super(10485760, 3);
        this.e = 3;
        this.f = icVar;
    }
}
