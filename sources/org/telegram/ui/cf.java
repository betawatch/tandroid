package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cf implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;

    public /* synthetic */ cf(yn ynVar, int i10) {
        this.a = i10;
        this.b = ynVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                yn.U(this.b, (Integer) obj, (Boolean) obj2);
                break;
            case 1:
                yn.i1(this.b, (Long) obj, (Boolean) obj2);
                break;
            case 2:
                yn ynVar = this.b;
                fh.b bVar = ynVar.x8;
                bVar.a((Bitmap) obj2);
                gh.d.c(bVar, ynVar.fragmentView);
                ynVar.y8.d();
                break;
            default:
                yn ynVar2 = this.b;
                ynVar2.z8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                ynVar2.B8 = paint;
                Bitmap bitmap = ynVar2.z8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                ynVar2.A8 = bitmapShader;
                paint.setShader(bitmapShader);
                ynVar2.C8 = new Matrix();
                fh.b bVar2 = ynVar2.x8;
                bVar2.a((Bitmap) obj2);
                gh.d.c(bVar2, ynVar2.fragmentView);
                ynVar2.y8.d();
                break;
        }
    }
}
