package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class me implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;

    public /* synthetic */ me(cn cnVar, int i7) {
        this.a = i7;
        this.b = cnVar;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                cn.l1(this.b, (Integer) obj, (Boolean) obj2);
                break;
            case 1:
                cn.x1(this.b, (Long) obj, (Boolean) obj2);
                break;
            case 2:
                cn cnVar = this.b;
                ri.b bVar = cnVar.N8;
                bVar.a((Bitmap) obj2);
                ih.d.c(bVar, cnVar.fragmentView);
                cnVar.O8.d();
                break;
            default:
                cn cnVar2 = this.b;
                cnVar2.P8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                cnVar2.R8 = paint;
                Bitmap bitmap = cnVar2.P8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                cnVar2.Q8 = bitmapShader;
                paint.setShader(bitmapShader);
                cnVar2.S8 = new Matrix();
                ri.b bVar2 = cnVar2.N8;
                bVar2.a((Bitmap) obj2);
                ih.d.c(bVar2, cnVar2.fragmentView);
                cnVar2.O8.d();
                break;
        }
    }
}
