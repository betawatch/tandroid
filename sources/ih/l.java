package ih;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.go;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class l {
    public static final Rect f = new Rect();
    public final gh.c a = new gh.c();
    public final gh.b b = new gh.b();
    public final aa.a c = new aa.a(new i0.b(9));
    public final aa.a d = new aa.a(new i0.b(10));
    public final aa.a e = new aa.a(new i0.b(11));

    public final int a(gh.a aVar) {
        if (aVar instanceof gh.c) {
            return ((gh.c) aVar).a.getColor();
        }
        if (aVar instanceof gh.b) {
            return ((Integer) this.d.p(((gh.b) aVar).d)).intValue();
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
            return ((Integer) this.e.p(((gh.b) aVar).d)).intValue();
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
        boolean z11 = drawable instanceof dc0;
        gh.b bVar = this.b;
        if (z11) {
            dc0 dc0Var = (dc0) drawable;
            if (dc0Var.q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(dc0Var.k);
            return bVar;
        }
        boolean z12 = drawable instanceof BitmapDrawable;
        aa.a aVar = this.c;
        if (z12) {
            bVar.a((Bitmap) aVar.p(((BitmapDrawable) drawable).getBitmap()));
            return bVar;
        }
        if (drawable instanceof go) {
            return c(((go) drawable).c(false));
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
            bVar.a((Bitmap) aVar.p(bVar.d));
        }
        return bVar;
    }
}
