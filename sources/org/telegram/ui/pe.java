package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;

    public /* synthetic */ pe(tn tnVar, int i10) {
        this.a = i10;
        this.b = tnVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                tn.g1(this.b, (Integer) obj, (Boolean) obj2);
                break;
            case 1:
                tn.O0(this.b, (Long) obj, (Boolean) obj2);
                break;
            case 2:
                tn tnVar = this.b;
                qg.b bVar = tnVar.v8;
                bVar.a((Bitmap) obj2);
                rg.c.c(bVar, tnVar.fragmentView);
                tnVar.w8.d();
                break;
            default:
                tn tnVar2 = this.b;
                tnVar2.x8 = (Bitmap) obj;
                Paint paint = new Paint(1);
                tnVar2.z8 = paint;
                Bitmap bitmap = tnVar2.x8;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                tnVar2.y8 = bitmapShader;
                paint.setShader(bitmapShader);
                tnVar2.A8 = new Matrix();
                qg.b bVar2 = tnVar2.v8;
                bVar2.a((Bitmap) obj2);
                rg.c.c(bVar2, tnVar2.fragmentView);
                tnVar2.w8.d();
                break;
        }
    }
}
