package jh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import h6.m;
import hi.x3;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.fn;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class l {
    public static final Rect f = new Rect();
    public final ri.c a = new ri.c();
    public final ri.b b = new ri.b();
    public final m c = new m(new x3(10));
    public final m d = new m(new x3(11));
    public final m e = new m(new x3(12));

    public final int a(ri.a aVar) {
        if (aVar instanceof ri.c) {
            return ((ri.c) aVar).b;
        }
        if (aVar instanceof ri.b) {
            return ((Integer) this.d.n(((ri.b) aVar).d)).intValue();
        }
        if (aVar instanceof ri.g) {
            return a(((ri.g) aVar).a);
        }
        return 0;
    }

    public final int b(ri.a aVar) {
        if (aVar instanceof ri.c) {
            return ((ri.c) aVar).b;
        }
        if (aVar instanceof ri.b) {
            return ((Integer) this.e.n(((ri.b) aVar).d)).intValue();
        }
        if (aVar instanceof ri.g) {
            return b(((ri.g) aVar).a);
        }
        return 0;
    }

    public final ri.a c(Drawable drawable) {
        boolean z9 = drawable instanceof ColorDrawable;
        ri.c cVar = this.a;
        if (z9) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z10 = drawable instanceof ra0;
        ri.b bVar = this.b;
        if (z10) {
            ra0 ra0Var = (ra0) drawable;
            if (ra0Var.q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(ra0Var.k);
            return bVar;
        }
        boolean z11 = drawable instanceof BitmapDrawable;
        m mVar = this.c;
        if (z11) {
            bVar.a((Bitmap) mVar.n(((BitmapDrawable) drawable).getBitmap()));
            return bVar;
        }
        if (drawable instanceof fn) {
            return c(((fn) drawable).c(false));
        }
        if (drawable != null) {
            bVar.getClass();
            float f10 = 120;
            float f11 = f10 / 1.0f;
            int round = Math.round(f11);
            int round2 = Math.round(f11);
            Bitmap bitmap = bVar.f;
            if (bitmap == null || bitmap.isRecycled() || bVar.f.getWidth() != round2 || bVar.f.getHeight() != round2) {
                bVar.f = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
            } else {
                bVar.f.eraseColor(0);
            }
            Canvas canvas = new Canvas(bVar.f);
            canvas.scale(f10 / round, qs.q2 / round2);
            Rect bounds = drawable.getBounds();
            Rect rect = f;
            rect.set(bounds);
            drawable.setBounds(0, 0, 120, qs.q2);
            drawable.draw(canvas);
            drawable.setBounds(rect);
            bVar.a(bVar.f);
            bVar.f = null;
            bVar.a((Bitmap) mVar.n(bVar.d));
        }
        return bVar;
    }
}
