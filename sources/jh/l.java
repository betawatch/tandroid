package jh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import h6.m;
import hi.f9;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.en;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class l {
    public static final Rect f = new Rect();
    public final ui.c a = new ui.c();
    public final ui.b b = new ui.b();
    public final m c = new m(new f9(7));
    public final m d = new m(new f9(8));
    public final m e = new m(new f9(9));

    public final int a(ui.a aVar) {
        if (aVar instanceof ui.c) {
            return ((ui.c) aVar).b;
        }
        if (aVar instanceof ui.b) {
            return ((Integer) this.d.r(((ui.b) aVar).d)).intValue();
        }
        if (aVar instanceof ui.g) {
            return a(((ui.g) aVar).a);
        }
        return 0;
    }

    public final int b(ui.a aVar) {
        if (aVar instanceof ui.c) {
            return ((ui.c) aVar).b;
        }
        if (aVar instanceof ui.b) {
            return ((Integer) this.e.r(((ui.b) aVar).d)).intValue();
        }
        if (aVar instanceof ui.g) {
            return b(((ui.g) aVar).a);
        }
        return 0;
    }

    public final ui.a c(Drawable drawable) {
        boolean z10 = drawable instanceof ColorDrawable;
        ui.c cVar = this.a;
        if (z10) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z11 = drawable instanceof bb0;
        ui.b bVar = this.b;
        if (z11) {
            bb0 bb0Var = (bb0) drawable;
            if (bb0Var.q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(bb0Var.k);
            return bVar;
        }
        boolean z12 = drawable instanceof BitmapDrawable;
        m mVar = this.c;
        if (z12) {
            bVar.a((Bitmap) mVar.r(((BitmapDrawable) drawable).getBitmap()));
            return bVar;
        }
        if (drawable instanceof en) {
            return c(((en) drawable).c(false));
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
            canvas.scale(f10 / round, ks.q2 / round2);
            Rect bounds = drawable.getBounds();
            Rect rect = f;
            rect.set(bounds);
            drawable.setBounds(0, 0, 120, ks.q2);
            drawable.draw(canvas);
            drawable.setBounds(rect);
            bVar.a(bVar.f);
            bVar.f = null;
            bVar.a((Bitmap) mVar.r(bVar.d));
        }
        return bVar;
    }
}
