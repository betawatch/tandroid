package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class cf implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;

    public /* synthetic */ cf(eo eoVar, int i10) {
        this.a = i10;
        this.b = eoVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                eo.g1(this.b, (Integer) obj, (Boolean) obj2);
                break;
            case 1:
                eo.O0(this.b, (Long) obj, (Boolean) obj2);
                break;
            case 2:
                eo eoVar = this.b;
                eh.b bVar = eoVar.z8;
                bVar.a((Bitmap) obj2);
                fh.d.c(bVar, eoVar.fragmentView);
                eoVar.A8.d();
                break;
            default:
                eo eoVar2 = this.b;
                eoVar2.B8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                eoVar2.D8 = paint;
                Bitmap bitmap = eoVar2.B8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                eoVar2.C8 = bitmapShader;
                paint.setShader(bitmapShader);
                eoVar2.E8 = new Matrix();
                eh.b bVar2 = eoVar2.z8;
                bVar2.a((Bitmap) obj2);
                fh.d.c(bVar2, eoVar2.fragmentView);
                eoVar2.A8.d();
                break;
        }
    }
}
