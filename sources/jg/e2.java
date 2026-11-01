package jg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import org.telegram.messenger.a30;
import org.telegram.messenger.b8;
import org.telegram.messenger.ze;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.t5;
import vh.n5;
import w7.b6;
import w7.w7;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class e2 extends j {
    public final Bitmap A0;
    public boolean B0;
    public boolean C0;
    public final Rect D0;
    public final Rect E0;
    public final Paint F0;
    public ze G0;
    public final TLObject q0;
    public final String r0;
    public final int s0;
    public boolean t0;
    public final t5 u0;
    public final qu0 v0;
    public final int w0;
    public boolean x0;
    public final t5 y0;
    public final l0 z0;

    public e2(Context context, PointF pointF, qu0 qu0Var, String str, int i10) {
        super(context, pointF);
        this.s0 = -1;
        this.t0 = false;
        this.x0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.D0 = new Rect();
        this.E0 = new Rect();
        this.F0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.r0 = str;
        this.v0 = qu0Var;
        l0 l0Var = new l0(this, context);
        this.z0 = l0Var;
        addView(l0Var, b6.c(-1.0f, -1));
        gr grVar = gr.h;
        this.u0 = new t5(l0Var, 0L, 500L, grVar);
        this.y0 = new t5(l0Var, 0L, 350L, grVar);
        this.w0 = i10;
        Bitmap q6 = n5.q(new ig.c0(str, 12), 1920, 1920, 0, false);
        this.A0 = q6;
        if (q6 != null) {
            s(q6);
        }
        k();
    }

    private String getImageFilter() {
        Point point = org.telegram.messenger.i0.q;
        int round = Math.round((Math.min(point.x, point.y) * 0.8f) / org.telegram.messenger.i0.p);
        return a1.g.i(round, round, "_");
    }

    @Override // jg.j
    public final i a() {
        return new u0(this, getContext());
    }

    public int getAnchor() {
        return this.s0;
    }

    public qu0 getBaseSize() {
        return this.v0;
    }

    public int getContentHeight() {
        Bitmap bitmap = this.A0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getHeight();
    }

    public int getContentWidth() {
        Bitmap bitmap = this.A0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getWidth();
    }

    public int getOrientation() {
        return this.w0;
    }

    public Bitmap getSegmentedOutBitmap() {
        return null;
    }

    @Override // jg.j
    public pj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new pj0();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (org.telegram.messenger.i0.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float L2 = (org.telegram.messenger.i0.L(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float L3 = (org.telegram.messenger.i0.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        getMeasuredHeight();
        getScale();
        org.telegram.messenger.i0.L(64.0f);
        float x10 = a30.x(L, 2.0f, getPositionX(), scaleX);
        return new pj0(x10, a30.x(L2, 2.0f, getPositionY(), scaleX), ((L3 * scaleX) + x10) - x10, L2 * scaleX);
    }

    @Override // jg.j
    public final void k() {
        qu0 qu0Var = this.v0;
        float f7 = qu0Var.a / 2.0f;
        float f10 = qu0Var.b / 2.0f;
        ze zeVar = this.G0;
        if (zeVar != null) {
            f7 *= zeVar.e;
            f10 *= zeVar.f;
        }
        setX(getPositionX() - f7);
        setY(getPositionY() - f10);
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        qu0 qu0Var = this.v0;
        float f7 = qu0Var.a;
        float f10 = qu0Var.b;
        ze zeVar = this.G0;
        if (zeVar != null) {
            f7 *= zeVar.e;
            f10 *= zeVar.f;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) f10, TLObject.FLAG_30));
    }

    public final String q(int i10) {
        TLObject tLObject = this.q0;
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.PhotoSize w9 = b8.w(((TLRPC.Photo) tLObject).sizes, 1000, false, null, false);
            try {
                b8.G(i10);
                return b8.K(w9, null, true, true).getAbsolutePath();
            } catch (Exception unused) {
            }
        }
        return this.r0;
    }

    public final void r(boolean z10) {
        boolean z11 = !this.t0;
        this.t0 = z11;
        if (!z10) {
            this.u0.f(z11, true);
        }
        l0 l0Var = this.z0;
        if (l0Var != null) {
            l0Var.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (this.C0 || this.B0 || bitmap == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        ea.b bVar = new ea.b();
        bVar.a = true;
        zzd a2 = w7.a(new tb.d(bVar));
        this.B0 = true;
        a2.g(ob.a.a(bitmap, this.w0)).addOnSuccessListener(new ig.c0(this, 13)).addOnFailureListener(new ag.m(15, this, bitmap));
    }

    public final void t(boolean z10) {
        boolean z11 = !this.x0;
        this.x0 = z11;
        if (!z10) {
            this.y0.f(z11, true);
        }
        l0 l0Var = this.z0;
        if (l0Var != null) {
            l0Var.invalidate();
        }
    }

    public e2(Context context, PointF pointF, qu0 qu0Var, TLObject tLObject) {
        super(context, pointF);
        this.s0 = -1;
        this.t0 = false;
        this.x0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.D0 = new Rect();
        this.E0 = new Rect();
        this.F0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.q0 = tLObject;
        this.v0 = qu0Var;
        l0 l0Var = new l0(this, context);
        this.z0 = l0Var;
        addView(l0Var, b6.c(-1.0f, -1));
        gr grVar = gr.h;
        this.u0 = new t5(l0Var, 0L, 500L, grVar);
        this.y0 = new t5(l0Var, 0L, 350L, grVar);
        k();
    }
}
