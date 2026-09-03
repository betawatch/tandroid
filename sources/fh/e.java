package fh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import b4.e0;
import lf.r;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tp;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class e extends eh.h implements Drawable.Callback, xd.b {
    public final String b;
    public final Drawable d;
    public final tp f;
    public eh.g h;
    public TLRPC.WebPage n;
    public final xd.a r;
    public final xd.a s;
    public final e0 c = new e0((char) 0, 19);
    public final Paint e = new Paint(1);

    public e(String str) {
        tp tpVar = new tp(-1);
        this.f = tpVar;
        pr prVar = pr.h;
        this.r = new xd.a(0, this, prVar, 320L, false);
        this.s = new xd.a(0, this, prVar, 320L, false);
        this.b = str;
        this.a.setRoundRadius(AndroidUtilities.dp(7.0f));
        this.d = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
        tpVar.setCallback(this);
        tpVar.b(k6.w0(null, k6.o7, false));
        tpVar.a = AndroidUtilities.dp(15.0f);
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        eh.g gVar = this.h;
        if (gVar != null) {
            gVar.invalidate();
        }
    }

    @Override // eh.h
    public final void a(View view) {
        super.a(view);
        this.h = (eh.g) view;
    }

    @Override // eh.h
    public final void b() {
        super.b();
        this.h = null;
    }

    @Override // eh.h
    public final void c(Canvas canvas, int i10, int i11) {
        float f10 = i10;
        float f11 = i11;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setImageCoords(0.0f, 0.0f, f10, f11);
        imageReceiver.draw(canvas);
        tp tpVar = this.f;
        tpVar.setBounds(0, 0, i10, i11);
        int w02 = k6.w0(null, k6.a7, false);
        xd.a aVar = this.s;
        int d = i0.a.d(aVar.e, w02, TLObject.FLAG_30);
        Paint paint = this.e;
        paint.setColor(d);
        canvas.drawRoundRect(0.0f, 0.0f, f10, f11, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), paint);
        int d10 = i0.a.d(aVar.e, k6.w0(null, k6.o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        e0 e0Var = this.c;
        e0Var.getClass();
        if (((PorterDuffColorFilter) e0Var.c) == null || e0Var.b != d10 || ((PorterDuff.Mode) e0Var.d) != mode) {
            e0Var.c = new PorterDuffColorFilter(d10, mode);
            e0Var.b = d10;
            e0Var.d = mode;
        }
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) e0Var.c;
        Drawable drawable = this.d;
        drawable.setColorFilter(porterDuffColorFilter);
        r.e(this.d, f10 / 2.0f, f11 / 2.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
        xd.a aVar2 = this.r;
        r.b(canvas, drawable, 1.0f - aVar2.e);
        r.b(canvas, tpVar, aVar2.e);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        eh.g gVar = this.h;
        if (gVar != null) {
            gVar.invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
    }
}
