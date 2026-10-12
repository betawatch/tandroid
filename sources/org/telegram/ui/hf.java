package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class hf implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;

    public /* synthetic */ hf(fo foVar, int i10) {
        this.a = i10;
        this.b = foVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                fo.z1(this.b, (Integer) obj, (Boolean) obj2);
                break;
            case 1:
                fo.p1(this.b, (Long) obj, (Boolean) obj2);
                break;
            case 2:
                fo foVar = this.b;
                gh.b bVar = foVar.z8;
                bVar.a((Bitmap) obj2);
                hh.d.c(bVar, foVar.fragmentView);
                foVar.A8.d();
                break;
            default:
                fo foVar2 = this.b;
                foVar2.B8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                foVar2.D8 = paint;
                Bitmap bitmap = foVar2.B8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                foVar2.C8 = bitmapShader;
                paint.setShader(bitmapShader);
                foVar2.E8 = new Matrix();
                gh.b bVar2 = foVar2.z8;
                bVar2.a((Bitmap) obj2);
                hh.d.c(bVar2, foVar2.fragmentView);
                foVar2.A8.d();
                break;
        }
    }
}
