// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class iv3 extends View {
    public fm2 a;
    public boolean b;
    public final int c;
    public vl d;
    public final jv3 e;
    public ImageReceiver f;
    public long h;
    public final il5[] n;
    public ImageReceiver r;
    public final n41 s;
    public boolean w;

    public iv3(Context context, jv3 jv3Var) {
        super(context);
        this.c = y6c.t0;
        this.n = new il5[2];
        this.s = new n41(this);
        setPadding(gl.L(2.0f), gl.L(2.0f), gl.L(2.0f), gl.L(2.0f));
        this.e = jv3Var;
    }

    public final void a(TLRPC.Document document, boolean z) {
        if (this.h != (document == null ? 0L : document.id)) {
            vl vlVar = this.d;
            if (vlVar != null) {
                vlVar.o(this);
            }
            if (document == null) {
                this.b = false;
                this.h = 0L;
                this.d = null;
                return;
            }
            this.b = true;
            this.h = document.id;
            int i = ew3.C1;
            vl l = vl.l(this.c, e66.e(z ? 1 : 16388) ? 3 : 13, document);
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
        vl vlVar = this.d;
        if (vlVar != null) {
            vlVar.b(this);
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
        vl vlVar = this.d;
        if (vlVar != null) {
            vlVar.o(this);
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
        vl vlVar = this.d;
        if (vlVar != null) {
            vlVar.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.d.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setDrawable(Drawable drawable) {
        vl vlVar = this.d;
        if (vlVar != null) {
            vlVar.o(this);
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
            TLRPC.PhotoSize w = ba4.w(document.thumbs, 90, false, null, false);
            String str = "video/webm".equals(document.mime_type) ? "80_80_g" : "80_80";
            if (!e66.e(1)) {
                str = str.concat("_firstframe");
            }
            this.f.Z(gl5.b(document), str, gl5.c(w, document), "80_80", null, 0L, null, document, 0);
        }
    }
}
