package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.i10;
import org.telegram.messenger.pc;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lq;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class v1 extends View {
    public lq a;
    public boolean b;
    public final int c;
    public org.telegram.ui.Components.o5 d;
    public final w1 e;
    public ImageReceiver f;
    public long h;
    public final org.telegram.messenger.gc[] n;
    public ImageReceiver r;
    public final org.telegram.ui.Components.lc s;
    public boolean w;

    public v1(Context context, w1 w1Var) {
        super(context);
        this.c = i10.t0;
        this.n = new org.telegram.messenger.gc[2];
        this.s = new org.telegram.ui.Components.lc(this);
        setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        this.e = w1Var;
    }

    public final void a(TLRPC.Document document, boolean z10) {
        if (this.h == (document == null ? 0L : document.id)) {
            return;
        }
        org.telegram.ui.Components.o5 o5Var = this.d;
        if (o5Var != null) {
            o5Var.n(this);
        }
        if (document == null) {
            this.b = false;
            this.h = 0L;
            this.d = null;
            return;
        }
        this.b = true;
        this.h = document.id;
        int i7 = r2.D1;
        org.telegram.ui.Components.o5 l10 = org.telegram.ui.Components.o5.l(this.c, pc.e(z10 ? 1 : 16388) ? 3 : 13, document);
        this.d = l10;
        if (this.w) {
            l10.a(this);
        }
    }

    public float getScale() {
        return this.s.a(0.15f);
    }

    @Override // android.view.View
    public final void invalidate() {
        this.e.invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w = true;
        org.telegram.ui.Components.o5 o5Var = this.d;
        if (o5Var != null) {
            o5Var.a(this);
        }
        ImageReceiver imageReceiver = this.f;
        if (imageReceiver != null) {
            imageReceiver.Q();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.w = false;
        org.telegram.ui.Components.o5 o5Var = this.d;
        if (o5Var != null) {
            o5Var.n(this);
        }
        ImageReceiver imageReceiver = this.f;
        if (imageReceiver != null) {
            imageReceiver.S();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.f;
        if (imageReceiver != null) {
            imageReceiver.z0(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f.h(canvas, null);
            return;
        }
        org.telegram.ui.Components.o5 o5Var = this.d;
        if (o5Var != null) {
            o5Var.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.d.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setDrawable(Drawable drawable) {
        org.telegram.ui.Components.o5 o5Var = this.d;
        if (o5Var != null) {
            o5Var.n(this);
        }
        this.d = null;
        this.h = 0L;
        this.b = false;
        if (this.f == null) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            this.f = imageReceiver;
            imageReceiver.F0(7);
            ImageReceiver imageReceiver2 = this.f;
            imageReceiver2.S0 = true;
            if (this.w) {
                imageReceiver2.Q();
            }
        }
        this.f.x0(drawable);
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.s.c(z10);
    }

    public void setSticker(TLRPC.Document document) {
        this.b = false;
        if (document == null) {
            ImageReceiver imageReceiver = this.f;
            if (imageReceiver != null) {
                this.h = 0L;
                imageReceiver.f();
                return;
            }
            return;
        }
        long j3 = this.h;
        long j10 = document.id;
        if (j3 == j10) {
            return;
        }
        this.h = j10;
        if (this.f == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver(null);
            this.f = imageReceiver2;
            imageReceiver2.F0(7);
            ImageReceiver imageReceiver3 = this.f;
            imageReceiver3.S0 = true;
            if (this.w) {
                imageReceiver3.Q();
            }
        }
        this.f.I0(!this.b ? this : this.e);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
        String str = "video/webm".equals(document.mime_type) ? "80_80_g" : "80_80";
        if (!pc.e(1)) {
            str = str.concat("_firstframe");
        }
        this.f.s0(org.telegram.messenger.fc.b(document), str, org.telegram.messenger.fc.c(w10, document), "80_80", null, 0L, null, document, 0);
    }
}
