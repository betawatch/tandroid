package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.ArrayList;
import org.telegram.ui.Components.ch0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class jb extends h2.j0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ fc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jb(fc fcVar, int i7, int i10) {
        super(i7, 2);
        this.e = i10;
        this.f = fcVar;
    }

    @Override // h2.j0
    public void e(String str, Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                fc fcVar = this.f;
                String str2 = fcVar.F;
                if (str2 == null || !str2.equals(str)) {
                    Integer num = (Integer) fcVar.a.get(str);
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
                fc fcVar2 = this.f;
                String str3 = fcVar2.F;
                if (str3 == null || !str3.equals(str)) {
                    Integer num2 = (Integer) fcVar2.a.get(str);
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
                fc fcVar3 = this.f;
                Integer num3 = (Integer) fcVar3.a.get(str);
                boolean z10 = bitmapDrawable3 instanceof org.telegram.ui.Components.t5;
                if (z10) {
                    fcVar3.f.remove((org.telegram.ui.Components.t5) bitmapDrawable3);
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

    @Override // h2.j0
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

    @Override // h2.j0
    public final int q(Object obj) {
        switch (this.e) {
            case 0:
                return fc.d(this.f, (BitmapDrawable) obj);
            case 1:
                return fc.d(this.f, (BitmapDrawable) obj);
            case 2:
                return fc.d(this.f, (BitmapDrawable) obj);
            default:
                return fc.d(this.f, (BitmapDrawable) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb(fc fcVar) {
        super(10485760, 2);
        this.e = 3;
        this.f = fcVar;
    }
}
