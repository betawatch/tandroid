package kh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.a0;
import ii.y3;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.la0;
import org.telegram.ui.zm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l {
    public static final Rect f = new Rect();
    public final si.c a = new si.c();
    public final si.b b = new si.b();
    public final a0 c = new a0(new y3(15));
    public final a0 d = new a0(new y3(16));
    public final a0 e = new a0(new y3(17));

    public final int a(si.a aVar) {
        if (aVar instanceof si.c) {
            return ((si.c) aVar).b;
        }
        if (aVar instanceof si.b) {
            return ((Integer) this.d.j(((si.b) aVar).d)).intValue();
        }
        if (aVar instanceof si.g) {
            return a(((si.g) aVar).a);
        }
        return 0;
    }

    public final int b(si.a aVar) {
        if (aVar instanceof si.c) {
            return ((si.c) aVar).b;
        }
        if (aVar instanceof si.b) {
            return ((Integer) this.e.j(((si.b) aVar).d)).intValue();
        }
        if (aVar instanceof si.g) {
            return b(((si.g) aVar).a);
        }
        return 0;
    }

    public final si.a c(Drawable drawable) {
        boolean z10 = drawable instanceof ColorDrawable;
        si.c cVar = this.a;
        if (z10) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z11 = drawable instanceof la0;
        si.b bVar = this.b;
        if (z11) {
            la0 la0Var = (la0) drawable;
            if (la0Var.q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(la0Var.k);
            return bVar;
        }
        boolean z12 = drawable instanceof BitmapDrawable;
        a0 a0Var = this.c;
        if (z12) {
            bVar.a((Bitmap) a0Var.j(((BitmapDrawable) drawable).getBitmap()));
            return bVar;
        }
        if (drawable instanceof zm) {
            return c(((zm) drawable).c(false));
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
            canvas.scale(f10 / round, hs.q2 / round2);
            Rect bounds = drawable.getBounds();
            Rect rect = f;
            rect.set(bounds);
            drawable.setBounds(0, 0, 120, hs.q2);
            drawable.draw(canvas);
            drawable.setBounds(rect);
            bVar.a(bVar.f);
            bVar.f = null;
            bVar.a((Bitmap) a0Var.j(bVar.d));
        }
        return bVar;
    }
}
