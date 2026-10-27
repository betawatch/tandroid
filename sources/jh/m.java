package jh;

import a8.h0;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class m {
    public static final Rect f = new Rect();
    public final hh.c a = new hh.c();
    public final hh.b b = new hh.b();
    public final h0 c = new h0(new j2.d(29));
    public final h0 d = new h0(new l(0));
    public final h0 e = new h0(new l(1));

    public final int a(hh.a aVar) {
        if (aVar instanceof hh.c) {
            return ((hh.c) aVar).b;
        }
        if (aVar instanceof hh.b) {
            return ((Integer) this.d.o(((hh.b) aVar).d)).intValue();
        }
        if (aVar instanceof hh.e) {
            return a(((hh.e) aVar).a);
        }
        return 0;
    }

    public final int b(hh.a aVar) {
        if (aVar instanceof hh.c) {
            return ((hh.c) aVar).b;
        }
        if (aVar instanceof hh.b) {
            return ((Integer) this.e.o(((hh.b) aVar).d)).intValue();
        }
        if (aVar instanceof hh.e) {
            return b(((hh.e) aVar).a);
        }
        return 0;
    }

    public final hh.a c(Drawable drawable) {
        boolean z10 = drawable instanceof ColorDrawable;
        hh.c cVar = this.a;
        if (z10) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z11 = drawable instanceof vc0;
        hh.b bVar = this.b;
        if (z11) {
            vc0 vc0Var = (vc0) drawable;
            if (vc0Var.q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(vc0Var.k);
            return bVar;
        }
        boolean z12 = drawable instanceof BitmapDrawable;
        h0 h0Var = this.c;
        if (z12) {
            bVar.a((Bitmap) h0Var.o(((BitmapDrawable) drawable).getBitmap()));
            return bVar;
        }
        if (drawable instanceof zn) {
            return c(((zn) drawable).c(false));
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
            bVar.a((Bitmap) h0Var.o(bVar.d));
        }
        return bVar;
    }
}
