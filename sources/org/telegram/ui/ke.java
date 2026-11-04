package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ke implements org.telegram.messenger.n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;

    public /* synthetic */ ke(wm wmVar, int i3) {
        this.a = i3;
        this.b = wmVar;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                wm.g1(this.b, (Integer) obj, (Boolean) obj2);
                break;
            case 1:
                wm.t1(this.b, (Long) obj, (Boolean) obj2);
                break;
            case 2:
                wm wmVar = this.b;
                si.b bVar = wmVar.O8;
                bVar.a((Bitmap) obj2);
                jh.d.c(bVar, wmVar.fragmentView);
                wmVar.P8.d();
                break;
            default:
                wm wmVar2 = this.b;
                wmVar2.Q8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                wmVar2.S8 = paint;
                Bitmap bitmap = wmVar2.Q8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                wmVar2.R8 = bitmapShader;
                paint.setShader(bitmapShader);
                wmVar2.T8 = new Matrix();
                si.b bVar2 = wmVar2.O8;
                bVar2.a((Bitmap) obj2);
                jh.d.c(bVar2, wmVar2.fragmentView);
                wmVar2.P8.d();
                break;
        }
    }
}
