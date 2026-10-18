package ih;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.vn;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class k {
    public static final Rect f = new Rect();
    public final gh.c a = new gh.c();
    public final gh.b b = new gh.b();
    public final androidx.biometric.e c = new androidx.biometric.e(new fh.b(26));
    public final androidx.biometric.e d = new androidx.biometric.e(new fh.b(27));
    public final androidx.biometric.e e = new androidx.biometric.e(new fh.b(28));

    public final int a(gh.a aVar) {
        if (aVar instanceof gh.c) {
            return ((gh.c) aVar).a.getColor();
        }
        if (aVar instanceof gh.b) {
            return ((Integer) this.d.o(((gh.b) aVar).d)).intValue();
        }
        if (aVar instanceof gh.e) {
            return a(((gh.e) aVar).a);
        }
        return 0;
    }

    public final int b(gh.a aVar) {
        if (aVar instanceof gh.c) {
            return ((gh.c) aVar).a.getColor();
        }
        if (aVar instanceof gh.b) {
            return ((Integer) this.e.o(((gh.b) aVar).d)).intValue();
        }
        if (aVar instanceof gh.e) {
            return b(((gh.e) aVar).a);
        }
        return 0;
    }

    public final gh.a c(Drawable drawable) {
        boolean z10 = drawable instanceof ColorDrawable;
        gh.c cVar = this.a;
        if (z10) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z11 = drawable instanceof wc0;
        gh.b bVar = this.b;
        if (z11) {
            wc0 wc0Var = (wc0) drawable;
            if (wc0Var.q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(wc0Var.k);
            return bVar;
        }
        boolean z12 = drawable instanceof BitmapDrawable;
        androidx.biometric.e eVar = this.c;
        if (z12) {
            bVar.a((Bitmap) eVar.o(((BitmapDrawable) drawable).getBitmap()));
            return bVar;
        }
        if (drawable instanceof vn) {
            return c(((vn) drawable).c(false));
        }
        if (drawable != null) {
            bVar.getClass();
            float f7 = 120;
            float f10 = f7 / 1.0f;
            int round = Math.round(f10);
            int round2 = Math.round(f10);
            Bitmap bitmap = bVar.f;
            if (bitmap == null || bitmap.isRecycled() || bVar.f.getWidth() != round2 || bVar.f.getHeight() != round2) {
                bVar.f = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
            } else {
                bVar.f.eraseColor(0);
            }
            Canvas canvas = new Canvas(bVar.f);
            canvas.scale(f7 / round, 160 / round2);
            Rect bounds = drawable.getBounds();
            Rect rect = f;
            rect.set(bounds);
            drawable.setBounds(0, 0, 120, 160);
            drawable.draw(canvas);
            drawable.setBounds(rect);
            bVar.a(bVar.f);
            bVar.f = null;
            bVar.a((Bitmap) eVar.o(bVar.d));
        }
        return bVar;
    }
}
