package ch;

import ag.j2;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import jf.r;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.np;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e extends bh.h implements Drawable.Callback, vd.b {
    public final String b;
    public final Drawable d;
    public final np f;
    public bh.g h;
    public TLRPC.WebPage n;
    public final vd.a r;
    public final vd.a s;
    public final j2 c = new j2((char) 0, 17);
    public final Paint e = new Paint(1);

    public e(String str) {
        np npVar = new np(-1);
        this.f = npVar;
        jr jrVar = jr.h;
        this.r = new vd.a(0, this, jrVar, 320L, false);
        this.s = new vd.a(0, this, jrVar, 320L, false);
        this.b = str;
        this.a.setRoundRadius(AndroidUtilities.dp(7.0f));
        this.d = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
        npVar.setCallback(this);
        npVar.b(g6.w0(null, g6.o7, false));
        npVar.a = AndroidUtilities.dp(15.0f);
    }

    @Override // vd.b
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        bh.g gVar = this.h;
        if (gVar != null) {
            gVar.invalidate();
        }
    }

    @Override // bh.h
    public final void a(View view) {
        super.a(view);
        this.h = (bh.g) view;
    }

    @Override // bh.h
    public final void b() {
        super.b();
        this.h = null;
    }

    @Override // bh.h
    public final void c(Canvas canvas, int i10, int i11) {
        float f9 = i10;
        float f10 = i11;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setImageCoords(0.0f, 0.0f, f9, f10);
        imageReceiver.draw(canvas);
        np npVar = this.f;
        npVar.setBounds(0, 0, i10, i11);
        int w02 = g6.w0(null, g6.a7, false);
        vd.a aVar = this.s;
        int d = i0.a.d(aVar.e, w02, TLObject.FLAG_30);
        Paint paint = this.e;
        paint.setColor(d);
        canvas.drawRoundRect(0.0f, 0.0f, f9, f10, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), paint);
        int d10 = i0.a.d(aVar.e, g6.w0(null, g6.o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        j2 j2Var = this.c;
        j2Var.getClass();
        if (((PorterDuffColorFilter) j2Var.c) == null || j2Var.b != d10 || ((PorterDuff.Mode) j2Var.d) != mode) {
            j2Var.c = new PorterDuffColorFilter(d10, mode);
            j2Var.b = d10;
            j2Var.d = mode;
        }
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) j2Var.c;
        Drawable drawable = this.d;
        drawable.setColorFilter(porterDuffColorFilter);
        r.e(this.d, f9 / 2.0f, f10 / 2.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
        vd.a aVar2 = this.r;
        r.b(canvas, drawable, 1.0f - aVar2.e);
        r.b(canvas, npVar, aVar2.e);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        bh.g gVar = this.h;
        if (gVar != null) {
            gVar.invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // vd.b
    public final /* synthetic */ void z(float f9, int i10) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
    }
}
