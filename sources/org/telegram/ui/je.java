package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class je implements org.telegram.messenger.s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ je(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                an.l1(this.b, (Integer) obj, (Boolean) obj2);
                break;
            case 1:
                an.x1(this.b, (Long) obj, (Boolean) obj2);
                break;
            case 2:
                an anVar = this.b;
                ui.b bVar = anVar.O8;
                bVar.a((Bitmap) obj2);
                ih.d.c(bVar, anVar.fragmentView);
                anVar.P8.d();
                break;
            default:
                an anVar2 = this.b;
                anVar2.Q8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                anVar2.S8 = paint;
                Bitmap bitmap = anVar2.Q8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                anVar2.R8 = bitmapShader;
                paint.setShader(bitmapShader);
                anVar2.T8 = new Matrix();
                ui.b bVar2 = anVar2.O8;
                bVar2.a((Bitmap) obj2);
                ih.d.c(bVar2, anVar2.fragmentView);
                anVar2.P8.d();
                break;
        }
    }
}
