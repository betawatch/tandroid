package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.ArrayList;
import org.telegram.ui.Components.mh0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class ib extends h2.j0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ec f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ib(ec ecVar, int i7, int i10) {
        super(i7, 2);
        this.e = i10;
        this.f = ecVar;
    }

    @Override // h2.j0
    public void e(String str, Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                ec ecVar = this.f;
                String str2 = ecVar.F;
                if (str2 == null || !str2.equals(str)) {
                    Integer num = (Integer) ecVar.a.get(str);
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
                ec ecVar2 = this.f;
                String str3 = ecVar2.F;
                if (str3 == null || !str3.equals(str)) {
                    Integer num2 = (Integer) ecVar2.a.get(str);
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
                ec ecVar3 = this.f;
                Integer num3 = (Integer) ecVar3.a.get(str);
                boolean z10 = bitmapDrawable3 instanceof org.telegram.ui.Components.b6;
                if (z10) {
                    ecVar3.f.remove((org.telegram.ui.Components.b6) bitmapDrawable3);
                }
                if (num3 == null || num3.intValue() == 0) {
                    if (z10) {
                        ((org.telegram.ui.Components.b6) bitmapDrawable3).u();
                    }
                    if (bitmapDrawable3 instanceof mh0) {
                        ((mh0) bitmapDrawable3).C(false);
                        break;
                    }
                }
                break;
        }
    }

    @Override // h2.j0
    public Object l(String str, Object obj) {
        switch (this.e) {
            case 3:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable instanceof org.telegram.ui.Components.b6) {
                    this.f.f.add((org.telegram.ui.Components.b6) bitmapDrawable);
                }
                return (BitmapDrawable) super.l(str, bitmapDrawable);
            default:
                return super.l(str, obj);
        }
    }

    @Override // h2.j0
    public final int q(Object obj) {
        switch (this.e) {
            case 0:
                return ec.d(this.f, (BitmapDrawable) obj);
            case 1:
                return ec.d(this.f, (BitmapDrawable) obj);
            case 2:
                return ec.d(this.f, (BitmapDrawable) obj);
            default:
                return ec.d(this.f, (BitmapDrawable) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib(ec ecVar) {
        super(10485760, 2);
        this.e = 3;
        this.f = ecVar;
    }
}
