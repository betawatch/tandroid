package jh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.i0;
import org.telegram.messenger.w0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kp;
import rf.o;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e extends ih.f implements Drawable.Callback, fe.e {
    public final String b;
    public final Drawable d;
    public final kp f;
    public ih.e h;
    public TLRPC.WebPage n;
    public final fe.b r;
    public final fe.b s;
    public final a5.a c = new a5.a((char) 0, 16);
    public final Paint e = new Paint(1);

    public e(String str) {
        kp kpVar = new kp(-1);
        this.f = kpVar;
        gr grVar = gr.h;
        this.r = new fe.b(0, this, grVar, 320L, false);
        this.s = new fe.b(0, this, grVar, 320L, false);
        this.b = str;
        this.a.J0(i0.L(7.0f));
        this.d = i0.a.f(w0.b, R.drawable.media_link_24);
        kpVar.setCallback(this);
        kpVar.b(t6.x0(null, t6.o7, false));
        kpVar.a = i0.L(15.0f);
    }

    @Override // ih.f
    public final void a(View view) {
        super.a(view);
        this.h = (ih.e) view;
    }

    @Override // ih.f
    public final void b() {
        super.b();
        this.h = null;
    }

    @Override // ih.f
    public final void c(Canvas canvas, int i10, int i11) {
        float f7 = i10;
        float f10 = i11;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.y0(0.0f, 0.0f, f7, f10);
        imageReceiver.h(canvas, null);
        kp kpVar = this.f;
        kpVar.setBounds(0, 0, i10, i11);
        int x02 = t6.x0(null, t6.a7, false);
        fe.b bVar = this.s;
        int f11 = i0.b.f(bVar.e, x02, TLObject.FLAG_30);
        Paint paint = this.e;
        paint.setColor(f11);
        canvas.drawRoundRect(0.0f, 0.0f, f7, f10, i0.L(7.0f), i0.L(7.0f), paint);
        int f12 = i0.b.f(bVar.e, t6.x0(null, t6.o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        a5.a aVar = this.c;
        aVar.getClass();
        if (((PorterDuffColorFilter) aVar.c) == null || aVar.b != f12 || ((PorterDuff.Mode) aVar.d) != mode) {
            aVar.c = new PorterDuffColorFilter(f12, mode);
            aVar.b = f12;
            aVar.d = mode;
        }
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) aVar.c;
        Drawable drawable = this.d;
        drawable.setColorFilter(porterDuffColorFilter);
        o.e(this.d, f7 / 2.0f, f10 / 2.0f, i0.L(24.0f), i0.L(24.0f), 17);
        fe.b bVar2 = this.r;
        o.b(canvas, drawable, 1.0f - bVar2.e);
        o.b(canvas, kpVar, bVar2.e);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        ih.e eVar = this.h;
        if (eVar != null) {
            eVar.invalidate();
        }
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        ih.e eVar = this.h;
        if (eVar != null) {
            eVar.invalidate();
        }
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
    }
}
