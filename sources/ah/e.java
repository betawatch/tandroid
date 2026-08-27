package ah;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import gf.s;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hp;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class e extends zg.e implements Drawable.Callback, ud.b {
    public final String b;
    public final Drawable d;
    public final hp f;
    public zg.d h;
    public TLRPC.WebPage n;
    public final ud.a r;
    public final ud.a s;
    public final b6.a c = new b6.a((char) 0, 18);
    public final Paint e = new Paint(1);

    public e(String str) {
        hp hpVar = new hp(-1);
        this.f = hpVar;
        er erVar = er.h;
        this.r = new ud.a(0, this, erVar, 320L, false);
        this.s = new ud.a(0, this, erVar, 320L, false);
        this.b = str;
        this.a.setRoundRadius(AndroidUtilities.dp(7.0f));
        this.d = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
        hpVar.setCallback(this);
        hpVar.b(g6.w0(null, g6.o7, false));
        hpVar.a = AndroidUtilities.dp(15.0f);
    }

    @Override // zg.e
    public final void a(View view) {
        super.a(view);
        this.h = (zg.d) view;
    }

    @Override // zg.e
    public final void b() {
        super.b();
        this.h = null;
    }

    @Override // zg.e
    public final void c(Canvas canvas, int i10, int i11) {
        float f10 = i10;
        float f11 = i11;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setImageCoords(0.0f, 0.0f, f10, f11);
        imageReceiver.draw(canvas);
        hp hpVar = this.f;
        hpVar.setBounds(0, 0, i10, i11);
        int w02 = g6.w0(null, g6.a7, false);
        ud.a aVar = this.s;
        int d = i0.b.d(aVar.e, w02, TLObject.FLAG_30);
        Paint paint = this.e;
        paint.setColor(d);
        canvas.drawRoundRect(0.0f, 0.0f, f10, f11, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), paint);
        int d10 = i0.b.d(aVar.e, g6.w0(null, g6.o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        b6.a aVar2 = this.c;
        aVar2.getClass();
        if (((PorterDuffColorFilter) aVar2.b) == null || aVar2.c != d10 || ((PorterDuff.Mode) aVar2.d) != mode) {
            aVar2.b = new PorterDuffColorFilter(d10, mode);
            aVar2.c = d10;
            aVar2.d = mode;
        }
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) aVar2.b;
        Drawable drawable = this.d;
        drawable.setColorFilter(porterDuffColorFilter);
        s.e(this.d, f10 / 2.0f, f11 / 2.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
        ud.a aVar3 = this.r;
        s.b(canvas, drawable, 1.0f - aVar3.e);
        s.b(canvas, hpVar, aVar3.e);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        zg.d dVar = this.h;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    @Override // ud.b
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        zg.d dVar = this.h;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    @Override // ud.b
    public final /* synthetic */ void A(float f10, int i10) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
    }
}
