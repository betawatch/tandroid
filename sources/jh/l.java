package jh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import h6.m;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.dn;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class l {
    public static final Rect f = new Rect();
    public final ui.c a = new ui.c();
    public final ui.b b = new ui.b();
    public final m c = new m(new i0.b(6));
    public final m d = new m(new i0.b(7));
    public final m e = new m(new i0.b(8));

    public final int a(ui.a aVar) {
        if (aVar instanceof ui.c) {
            return ((ui.c) aVar).b;
        }
        if (aVar instanceof ui.b) {
            return ((Integer) this.d.n(((ui.b) aVar).d)).intValue();
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
            return ((Integer) this.e.n(((ui.b) aVar).d)).intValue();
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
        boolean z11 = drawable instanceof ra0;
        ui.b bVar = this.b;
        if (z11) {
            ra0 ra0Var = (ra0) drawable;
            if (ra0Var.q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(ra0Var.k);
            return bVar;
        }
        boolean z12 = drawable instanceof BitmapDrawable;
        m mVar = this.c;
        if (z12) {
            bVar.a((Bitmap) mVar.n(((BitmapDrawable) drawable).getBitmap()));
            return bVar;
        }
        if (drawable instanceof dn) {
            return c(((dn) drawable).c(false));
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
            canvas.scale(f10 / round, ns.q2 / round2);
            Rect bounds = drawable.getBounds();
            Rect rect = f;
            rect.set(bounds);
            drawable.setBounds(0, 0, 120, ns.q2);
            drawable.draw(canvas);
            drawable.setBounds(rect);
            bVar.a(bVar.f);
            bVar.f = null;
            bVar.a((Bitmap) mVar.n(bVar.d));
        }
        return bVar;
    }
}
