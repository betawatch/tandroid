package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class le implements org.telegram.messenger.r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;

    public /* synthetic */ le(bn bnVar, int i7) {
        this.a = i7;
        this.b = bnVar;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                bn.l1(this.b, (Integer) obj, (Boolean) obj2);
                break;
            case 1:
                bn.x1(this.b, (Long) obj, (Boolean) obj2);
                break;
            case 2:
                bn bnVar = this.b;
                ui.b bVar = bnVar.P8;
                bVar.a((Bitmap) obj2);
                ih.d.c(bVar, bnVar.fragmentView);
                bnVar.Q8.d();
                break;
            default:
                bn bnVar2 = this.b;
                bnVar2.R8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                bnVar2.T8 = paint;
                Bitmap bitmap = bnVar2.R8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                bnVar2.S8 = bitmapShader;
                paint.setShader(bitmapShader);
                bnVar2.U8 = new Matrix();
                ui.b bVar2 = bnVar2.P8;
                bVar2.a((Bitmap) obj2);
                ih.d.c(bVar2, bnVar2.fragmentView);
                bnVar2.Q8.d();
                break;
        }
    }
}
