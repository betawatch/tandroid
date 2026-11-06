package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class me implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ me(an anVar, int i7) {
        this.a = i7;
        this.b = anVar;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                an.g1(this.b, (Integer) obj, (Boolean) obj2);
                break;
            case 1:
                an.t1(this.b, (Long) obj, (Boolean) obj2);
                break;
            case 2:
                an anVar = this.b;
                ri.b bVar = anVar.N8;
                bVar.a((Bitmap) obj2);
                ih.d.c(bVar, anVar.fragmentView);
                anVar.O8.d();
                break;
            default:
                an anVar2 = this.b;
                anVar2.P8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                anVar2.R8 = paint;
                Bitmap bitmap = anVar2.P8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                anVar2.Q8 = bitmapShader;
                paint.setShader(bitmapShader);
                anVar2.S8 = new Matrix();
                ri.b bVar2 = anVar2.N8;
                bVar2.a((Bitmap) obj2);
                ih.d.c(bVar2, anVar2.fragmentView);
                anVar2.O8.d();
                break;
        }
    }
}
