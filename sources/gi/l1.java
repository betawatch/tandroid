package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.bc;
import org.telegram.messenger.h10;
import org.telegram.messenger.lc;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.xp;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l1 extends View {
    public xp a;
    public boolean b;
    public final int c;
    public org.telegram.ui.Components.g5 d;
    public final m1 e;
    public ImageReceiver f;
    public long h;
    public final bc[] n;
    public ImageReceiver r;
    public final gc s;
    public boolean w;

    public l1(Context context, m1 m1Var) {
        super(context);
        this.c = h10.t0;
        this.n = new bc[2];
        this.s = new gc(this);
        setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        this.e = m1Var;
    }

    public final void a(TLRPC.Document document, boolean z10) {
        if (this.h == (document == null ? 0L : document.id)) {
            return;
        }
        org.telegram.ui.Components.g5 g5Var = this.d;
        if (g5Var != null) {
            g5Var.n(this);
        }
        if (document == null) {
            this.b = false;
            this.h = 0L;
            this.d = null;
            return;
        }
        this.b = true;
        this.h = document.id;
        int i3 = i2.z1;
        org.telegram.ui.Components.g5 l10 = org.telegram.ui.Components.g5.l(this.c, lc.e(z10 ? 1 : 16388) ? 3 : 13, document);
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
        org.telegram.ui.Components.g5 g5Var = this.d;
        if (g5Var != null) {
            g5Var.a(this);
        }
        ImageReceiver imageReceiver = this.f;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.w = false;
        org.telegram.ui.Components.g5 g5Var = this.d;
        if (g5Var != null) {
            g5Var.n(this);
        }
        ImageReceiver imageReceiver = this.f;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver = this.f;
        if (imageReceiver != null) {
            imageReceiver.y0(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.f.h(canvas, null);
            return;
        }
        org.telegram.ui.Components.g5 g5Var = this.d;
        if (g5Var != null) {
            g5Var.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            this.d.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setDrawable(Drawable drawable) {
        org.telegram.ui.Components.g5 g5Var = this.d;
        if (g5Var != null) {
            g5Var.n(this);
        }
        this.d = null;
        this.h = 0L;
        this.b = false;
        if (this.f == null) {
            ImageReceiver imageReceiver = new ImageReceiver(null);
            this.f = imageReceiver;
            imageReceiver.E0(7);
            ImageReceiver imageReceiver2 = this.f;
            imageReceiver2.S0 = true;
            if (this.w) {
                imageReceiver2.P();
            }
        }
        this.f.w0(drawable);
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
        long j10 = this.h;
        long j11 = document.id;
        if (j10 == j11) {
            return;
        }
        this.h = j11;
        if (this.f == null) {
            ImageReceiver imageReceiver2 = new ImageReceiver(null);
            this.f = imageReceiver2;
            imageReceiver2.E0(7);
            ImageReceiver imageReceiver3 = this.f;
            imageReceiver3.S0 = true;
            if (this.w) {
                imageReceiver3.P();
            }
        }
        this.f.H0(!this.b ? this : this.e);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
        String str = "video/webm".equals(document.mime_type) ? "80_80_g" : "80_80";
        if (!lc.e(1)) {
            str = str.concat("_firstframe");
        }
        this.f.r0(ac.b(document), str, ac.c(w10, document), "80_80", null, 0L, null, document, 0);
    }
}
