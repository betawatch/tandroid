package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class af implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;

    public /* synthetic */ af(co coVar, int i10) {
        this.a = i10;
        this.b = coVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                co.g1(this.b, (Integer) obj, (Boolean) obj2);
                break;
            case 1:
                co.O0(this.b, (Long) obj, (Boolean) obj2);
                break;
            case 2:
                co coVar = this.b;
                gh.b bVar = coVar.z8;
                bVar.a((Bitmap) obj2);
                hh.d.c(bVar, coVar.fragmentView);
                coVar.A8.d();
                break;
            default:
                co coVar2 = this.b;
                coVar2.B8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                coVar2.D8 = paint;
                Bitmap bitmap = coVar2.B8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                coVar2.C8 = bitmapShader;
                paint.setShader(bitmapShader);
                coVar2.E8 = new Matrix();
                gh.b bVar2 = coVar2.z8;
                bVar2.a((Bitmap) obj2);
                hh.d.c(bVar2, coVar2.fragmentView);
                coVar2.A8.d();
                break;
        }
    }
}
