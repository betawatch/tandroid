package ih;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import fi.c2;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.io;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class k {
    public static final Rect f = new Rect();
    public final gh.c a = new gh.c();
    public final gh.b b = new gh.b();
    public final androidx.biometric.e c = new androidx.biometric.e(new c2(24));
    public final androidx.biometric.e d = new androidx.biometric.e(new c2(25));
    public final androidx.biometric.e e = new androidx.biometric.e(new c2(26));

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
        boolean z11 = drawable instanceof cd0;
        gh.b bVar = this.b;
        if (z11) {
            cd0 cd0Var = (cd0) drawable;
            if (cd0Var.q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(cd0Var.k);
            return bVar;
        }
        boolean z12 = drawable instanceof BitmapDrawable;
        androidx.biometric.e eVar = this.c;
        if (z12) {
            bVar.a((Bitmap) eVar.o(((BitmapDrawable) drawable).getBitmap()));
            return bVar;
        }
        if (drawable instanceof io) {
            return c(((io) drawable).c(false));
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
