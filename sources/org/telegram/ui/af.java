package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class af implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ af(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                zn.k1(this.b, (Integer) obj, (Boolean) obj2);
                break;
            case 1:
                zn.O0(this.b, (Long) obj, (Boolean) obj2);
                break;
            case 2:
                zn znVar = this.b;
                fh.b bVar = znVar.z8;
                bVar.a((Bitmap) obj2);
                gh.d.c(bVar, znVar.fragmentView);
                znVar.A8.d();
                break;
            default:
                zn znVar2 = this.b;
                znVar2.B8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                znVar2.D8 = paint;
                Bitmap bitmap = znVar2.B8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                znVar2.C8 = bitmapShader;
                paint.setShader(bitmapShader);
                znVar2.E8 = new Matrix();
                fh.b bVar2 = znVar2.z8;
                bVar2.a((Bitmap) obj2);
                gh.d.c(bVar2, znVar2.fragmentView);
                znVar2.A8.d();
                break;
        }
    }
}
