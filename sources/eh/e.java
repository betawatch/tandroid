package eh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import b4.e0;
import kf.r;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.qp;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class e extends dh.h implements Drawable.Callback, xd.b {
    public final String b;
    public final Drawable d;
    public final qp f;
    public dh.g h;
    public TLRPC.WebPage n;
    public final xd.a r;
    public final xd.a s;
    public final e0 c = new e0((char) 0, 19);
    public final Paint e = new Paint(1);

    public e(String str) {
        qp qpVar = new qp(-1);
        this.f = qpVar;
        mr mrVar = mr.h;
        this.r = new xd.a(0, this, mrVar, 320L, false);
        this.s = new xd.a(0, this, mrVar, 320L, false);
        this.b = str;
        this.a.setRoundRadius(AndroidUtilities.dp(7.0f));
        this.d = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
        qpVar.setCallback(this);
        qpVar.b(j6.w0(null, j6.o7, false));
        qpVar.a = AndroidUtilities.dp(15.0f);
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        dh.g gVar = this.h;
        if (gVar != null) {
            gVar.invalidate();
        }
    }

    @Override // dh.h
    public final void a(View view) {
        super.a(view);
        this.h = (dh.g) view;
    }

    @Override // dh.h
    public final void b() {
        super.b();
        this.h = null;
    }

    @Override // dh.h
    public final void c(Canvas canvas, int i10, int i11) {
        float f10 = i10;
        float f11 = i11;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setImageCoords(0.0f, 0.0f, f10, f11);
        imageReceiver.draw(canvas);
        qp qpVar = this.f;
        qpVar.setBounds(0, 0, i10, i11);
        int w02 = j6.w0(null, j6.a7, false);
        xd.a aVar = this.s;
        int d = i0.a.d(aVar.e, w02, TLObject.FLAG_30);
        Paint paint = this.e;
        paint.setColor(d);
        canvas.drawRoundRect(0.0f, 0.0f, f10, f11, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), paint);
        int d10 = i0.a.d(aVar.e, j6.w0(null, j6.o7, false), -1);
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
        r.b(canvas, qpVar, aVar2.e);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        dh.g gVar = this.h;
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
