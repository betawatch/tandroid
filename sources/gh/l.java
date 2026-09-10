package gh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.ho;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class l {
    public static final Rect f = new Rect();
    public final eh.c a = new eh.c();
    public final eh.b b = new eh.b();
    public final aa.a c = new aa.a(new dh.a(25));
    public final aa.a d = new aa.a(new dh.a(26));
    public final aa.a e = new aa.a(new dh.a(27));

    public final int a(eh.a aVar) {
        if (aVar instanceof eh.c) {
            return ((eh.c) aVar).a.getColor();
        }
        if (aVar instanceof eh.b) {
            return ((Integer) this.d.o(((eh.b) aVar).d)).intValue();
        }
        if (aVar instanceof eh.e) {
            return a(((eh.e) aVar).a);
        }
        return 0;
    }

    public final int b(eh.a aVar) {
        if (aVar instanceof eh.c) {
            return ((eh.c) aVar).a.getColor();
        }
        if (aVar instanceof eh.b) {
            return ((Integer) this.e.o(((eh.b) aVar).d)).intValue();
        }
        if (aVar instanceof eh.e) {
            return b(((eh.e) aVar).a);
        }
        return 0;
    }

    public final eh.a c(Drawable drawable) {
        boolean z10 = drawable instanceof ColorDrawable;
        eh.c cVar = this.a;
        if (z10) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z11 = drawable instanceof lc0;
        eh.b bVar = this.b;
        if (z11) {
            lc0 lc0Var = (lc0) drawable;
            if (lc0Var.q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(lc0Var.k);
            return bVar;
        }
        boolean z12 = drawable instanceof BitmapDrawable;
        aa.a aVar = this.c;
        if (z12) {
            bVar.a((Bitmap) aVar.o(((BitmapDrawable) drawable).getBitmap()));
            return bVar;
        }
        if (drawable instanceof ho) {
            return c(((ho) drawable).c(false));
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
            bVar.a((Bitmap) aVar.o(bVar.d));
        }
        return bVar;
    }
}
