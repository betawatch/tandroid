// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class cw3 extends View {
    public zm2 a;
    public boolean b;
    public final int c;
    public wl d;
    public final dw3 e;
    public ImageReceiver f;
    public long h;
    public final ln5[] n;
    public ImageReceiver r;
    public final v41 s;
    public boolean w;

    public cw3(Context context, dw3 dw3Var) {
        super(context);
        this.c = yac.t0;
        this.n = new ln5[2];
        this.s = new v41(this);
        setPadding(hl.L(2.0f), hl.L(2.0f), hl.L(2.0f), hl.L(2.0f));
        this.e = dw3Var;
    }

    public final void a(TLRPC.Document document, boolean z) {
        if (this.h != (document == null ? 0L : document.id)) {
            wl wlVar = this.d;
            if (wlVar != null) {
                wlVar.o(this);
            }
            if (document == null) {
                this.b = false;
                this.h = 0L;
                this.d = null;
                return;
            }
            this.b = true;
            this.h = document.id;
            int i = zw3.C1;
            wl l = wl.l(this.c, i86.e(z ? 1 : 16388) ? 3 : 13, document);
            this.d = l;
            if (this.w) {
                l.b(this);
            }
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
        wl wlVar = this.d;
        if (wlVar != null) {
            wlVar.b(this);
        }
        ImageReceiver imageReceiver = this.f;
        if (imageReceiver != null) {
            imageReceiver.I();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.w = false;
        wl wlVar = this.d;
        if (wlVar != null) {
            wlVar.o(this);
        }
        ImageReceiver imageReceiver = this.f;
        if (imageReceiver != null) {
            imageReceiver.K();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.f;
        if (imageReceiver != null) {
            imageReceiver.i0(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f.h(canvas, null);
            return;
        }
        wl wlVar = this.d;
        if (wlVar != null) {
            wlVar.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.d.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setDrawable(Drawable drawable) {
        wl wlVar = this.d;
        if (wlVar != null) {
            wlVar.o(this);
        }
        this.d = null;
        this.h = 0L;
        this.b = false;
        if (this.f == null) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            this.f = imageReceiver;
            imageReceiver.m0(7);
            ImageReceiver imageReceiver2 = this.f;
            imageReceiver2.S0 = true;
            if (this.w) {
                imageReceiver2.I();
            }
        }
        this.f.g0(drawable);
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        this.s.c(z);
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
        long j = this.h;
        long j2 = document.id;
        if (j != j2) {
            this.h = j2;
            if (this.f == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(null);
                this.f = imageReceiver2;
                imageReceiver2.m0(7);
                ImageReceiver imageReceiver3 = this.f;
                imageReceiver3.S0 = true;
                if (this.w) {
                    imageReceiver3.I();
                }
            }
            this.f.p0(!this.b ? this : this.e);
            TLRPC.PhotoSize w = xb4.w(document.thumbs, 90, false, null, false);
            String str = "video/webm".equals(document.mime_type) ? "80_80_g" : "80_80";
            if (!i86.e(1)) {
                str = str.concat("_firstframe");
            }
            this.f.Z(jn5.b(document), str, jn5.c(w, document), "80_80", null, 0L, null, document, 0);
        }
    }
}
