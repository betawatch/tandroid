package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.t5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d2 extends View {
    public final t5 D;
    public ig.c1 E;
    public float F;
    public float G;
    public ig.q1 H;
    public Runnable I;
    public boolean J;
    public c2 K;
    public final Paint a;
    public final Paint b;
    public final Path c;
    public final m2.t d;
    public final RectF e;
    public boolean f;
    public boolean h;
    public float n;
    public float r;
    public long s;
    public boolean w;
    public final t5 x;
    public final t5 y;

    public d2(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        this.c = new Path();
        this.e = new RectF();
        this.w = true;
        this.x = new t5(this);
        this.y = new t5(this);
        this.D = new t5(this);
        this.H = new ig.q1(1.0f, 0.016773745f, -1);
        this.J = true;
        this.d = new m2.t(context, new b2(this));
        paint2.setColor(-1);
        paint2.setShadowLayer(org.telegram.messenger.i0.L(4.0f), 0.0f, org.telegram.messenger.i0.L(2.0f), 1342177280);
        paint.setColor(1090519039);
        paint.setShadowLayer(org.telegram.messenger.i0.L(3.0f), 0.0f, org.telegram.messenger.i0.L(1.0f), 637534208);
    }

    public final void a(float f7, float f10, float f11, Canvas canvas, boolean z10) {
        if (z10) {
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set((f7 - f11) - org.telegram.messenger.i0.L(6.0f), (f10 - f11) - org.telegram.messenger.i0.L(6.0f), f7 + f11 + org.telegram.messenger.i0.L(6.0f), f10 + f11 + org.telegram.messenger.i0.L(6.0f));
            canvas.saveLayerAlpha(rectF, (int) (this.r * 255.0f), 31);
        }
        canvas.drawCircle(f7, f10, f11, this.b);
        if (z10) {
            canvas.restore();
        }
    }

    public final void b(float f7, float f10) {
        this.F = f7;
        this.G = f10;
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        boolean z10;
        super.onDraw(canvas);
        long min = Math.min(16L, System.currentTimeMillis() - this.s);
        this.s = System.currentTimeMillis();
        c2 c2Var = this.K;
        float e = this.x.e(false, c2Var != null ? c2Var.get() : this.H.c);
        float e7 = this.y.e(false, this.F);
        float e10 = this.D.e(false, this.G);
        boolean z11 = this.h;
        if (z11) {
            float f7 = this.n;
            if (f7 != 1.0f) {
                this.n = org.telegram.ui.Cells.f1.e(min, 200.0f, f7, 1.0f);
                invalidate();
                z10 = this.f;
                if (z10) {
                    float f10 = this.r;
                    if (f10 != 1.0f) {
                        this.r = org.telegram.ui.Cells.f1.e(min, 200.0f, f10, 1.0f);
                        invalidate();
                        RectF rectF = this.e;
                        float height = rectF.height();
                        int L = org.telegram.messenger.i0.L(16.0f);
                        int L2 = org.telegram.messenger.i0.L(3.0f);
                        int L3 = org.telegram.messenger.i0.L(3.0f);
                        Path path = this.c;
                        path.rewind();
                        path.moveTo(0.0f, 0.0f);
                        RectF rectF2 = org.telegram.messenger.i0.P;
                        int i10 = -L3;
                        int i11 = -L;
                        rectF2.set(org.telegram.messenger.i0.W1(this.r, i10, i11), 0.0f, org.telegram.messenger.i0.W1(this.r, L3, L), org.telegram.messenger.i0.W1(this.r, L3, L) * 2);
                        path.arcTo(rectF2, -90.0f, 90.0f);
                        path.lineTo(org.telegram.messenger.i0.W1(this.r, L3, L2), height);
                        rectF2.set(org.telegram.messenger.i0.W1(this.r, i10, -L2), height - (L2 * 2), org.telegram.messenger.i0.W1(this.r, L3, L2), height);
                        path.arcTo(rectF2, 0.0f, 180.0f);
                        float f11 = L;
                        path.lineTo(org.telegram.messenger.i0.W1(this.r, i10, i11), f11);
                        rectF2.set(org.telegram.messenger.i0.W1(this.r, i10, i11), 0.0f, org.telegram.messenger.i0.W1(this.r, L3, L), L * 2);
                        path.arcTo(rectF2, -180.0f, 90.0f);
                        path.close();
                        if (this.n != 0.0f) {
                            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                            canvas.saveLayerAlpha(rectF2, (int) ((1.0f - this.n) * 255.0f), 31);
                        }
                        canvas.save();
                        float L4 = org.telegram.messenger.i0.L(32.0f);
                        gr grVar = gr.f;
                        canvas.translate(grVar.getInterpolation(this.r) * L4, rectF.top);
                        canvas.drawPath(path, this.a);
                        canvas.restore();
                        float f12 = (e - e7) / (e10 - e7);
                        float f13 = L2 * 1.5f;
                        a(grVar.getInterpolation(this.r) * org.telegram.messenger.i0.L(32.0f), w7.u.a(c3.i0.z(1.0f, f12, rectF.height(), rectF.top), rectF.top + f11, rectF.bottom - Math.min(f13, f11)), org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.T1(Math.min(f13, f11), f11, f12), this.r), canvas, false);
                        if (this.J && this.r != 0.0f && this.w && this.E != null) {
                            ig.c1 c1Var = this.E;
                            float f14 = c1Var.c.g.a;
                            a(getWidth() / 2.0f, getHeight() / 2.0f, c1Var.getCurrentBrush().h() * c3.i0.u(f14, 0.043945312f, e, 0.00390625f * f14) * this.E.getCurrentBrush().g(), canvas, true);
                        }
                        if (this.n != 0.0f) {
                            canvas.restore();
                            return;
                        }
                        return;
                    }
                }
                if (!z10) {
                    float f15 = this.r;
                    if (f15 != 0.0f) {
                        this.r = org.telegram.ui.Cells.f1.v(min, 200.0f, f15, 0.0f);
                        invalidate();
                    }
                }
                RectF rectF3 = this.e;
                float height2 = rectF3.height();
                int L5 = org.telegram.messenger.i0.L(16.0f);
                int L22 = org.telegram.messenger.i0.L(3.0f);
                int L32 = org.telegram.messenger.i0.L(3.0f);
                Path path2 = this.c;
                path2.rewind();
                path2.moveTo(0.0f, 0.0f);
                RectF rectF22 = org.telegram.messenger.i0.P;
                int i102 = -L32;
                int i112 = -L5;
                rectF22.set(org.telegram.messenger.i0.W1(this.r, i102, i112), 0.0f, org.telegram.messenger.i0.W1(this.r, L32, L5), org.telegram.messenger.i0.W1(this.r, L32, L5) * 2);
                path2.arcTo(rectF22, -90.0f, 90.0f);
                path2.lineTo(org.telegram.messenger.i0.W1(this.r, L32, L22), height2);
                rectF22.set(org.telegram.messenger.i0.W1(this.r, i102, -L22), height2 - (L22 * 2), org.telegram.messenger.i0.W1(this.r, L32, L22), height2);
                path2.arcTo(rectF22, 0.0f, 180.0f);
                float f112 = L5;
                path2.lineTo(org.telegram.messenger.i0.W1(this.r, i102, i112), f112);
                rectF22.set(org.telegram.messenger.i0.W1(this.r, i102, i112), 0.0f, org.telegram.messenger.i0.W1(this.r, L32, L5), L5 * 2);
                path2.arcTo(rectF22, -180.0f, 90.0f);
                path2.close();
                if (this.n != 0.0f) {
                }
                canvas.save();
                float L42 = org.telegram.messenger.i0.L(32.0f);
                gr grVar2 = gr.f;
                canvas.translate(grVar2.getInterpolation(this.r) * L42, rectF3.top);
                canvas.drawPath(path2, this.a);
                canvas.restore();
                float f122 = (e - e7) / (e10 - e7);
                float f132 = L22 * 1.5f;
                a(grVar2.getInterpolation(this.r) * org.telegram.messenger.i0.L(32.0f), w7.u.a(c3.i0.z(1.0f, f122, rectF3.height(), rectF3.top), rectF3.top + f112, rectF3.bottom - Math.min(f132, f112)), org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.T1(Math.min(f132, f112), f112, f122), this.r), canvas, false);
                if (this.J) {
                    ig.c1 c1Var2 = this.E;
                    float f142 = c1Var2.c.g.a;
                    a(getWidth() / 2.0f, getHeight() / 2.0f, c1Var2.getCurrentBrush().h() * c3.i0.u(f142, 0.043945312f, e, 0.00390625f * f142) * this.E.getCurrentBrush().g(), canvas, true);
                }
                if (this.n != 0.0f) {
                }
            }
        }
        if (!z11) {
            float f16 = this.n;
            if (f16 != 0.0f) {
                this.n = org.telegram.ui.Cells.f1.v(min, 200.0f, f16, 0.0f);
                invalidate();
            }
        }
        z10 = this.f;
        if (z10) {
        }
        if (!z10) {
        }
        RectF rectF32 = this.e;
        float height22 = rectF32.height();
        int L52 = org.telegram.messenger.i0.L(16.0f);
        int L222 = org.telegram.messenger.i0.L(3.0f);
        int L322 = org.telegram.messenger.i0.L(3.0f);
        Path path22 = this.c;
        path22.rewind();
        path22.moveTo(0.0f, 0.0f);
        RectF rectF222 = org.telegram.messenger.i0.P;
        int i1022 = -L322;
        int i1122 = -L52;
        rectF222.set(org.telegram.messenger.i0.W1(this.r, i1022, i1122), 0.0f, org.telegram.messenger.i0.W1(this.r, L322, L52), org.telegram.messenger.i0.W1(this.r, L322, L52) * 2);
        path22.arcTo(rectF222, -90.0f, 90.0f);
        path22.lineTo(org.telegram.messenger.i0.W1(this.r, L322, L222), height22);
        rectF222.set(org.telegram.messenger.i0.W1(this.r, i1022, -L222), height22 - (L222 * 2), org.telegram.messenger.i0.W1(this.r, L322, L222), height22);
        path22.arcTo(rectF222, 0.0f, 180.0f);
        float f1122 = L52;
        path22.lineTo(org.telegram.messenger.i0.W1(this.r, i1022, i1122), f1122);
        rectF222.set(org.telegram.messenger.i0.W1(this.r, i1022, i1122), 0.0f, org.telegram.messenger.i0.W1(this.r, L322, L52), L52 * 2);
        path22.arcTo(rectF222, -180.0f, 90.0f);
        path22.close();
        if (this.n != 0.0f) {
        }
        canvas.save();
        float L422 = org.telegram.messenger.i0.L(32.0f);
        gr grVar22 = gr.f;
        canvas.translate(grVar22.getInterpolation(this.r) * L422, rectF32.top);
        canvas.drawPath(path22, this.a);
        canvas.restore();
        float f1222 = (e - e7) / (e10 - e7);
        float f1322 = L222 * 1.5f;
        a(grVar22.getInterpolation(this.r) * org.telegram.messenger.i0.L(32.0f), w7.u.a(c3.i0.z(1.0f, f1222, rectF32.height(), rectF32.top), rectF32.top + f1122, rectF32.bottom - Math.min(f1322, f1122)), org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.T1(Math.min(f1322, f1122), f1122, f1222), this.r), canvas, false);
        if (this.J) {
        }
        if (this.n != 0.0f) {
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int height = (int) (getHeight() * 0.3f);
        this.e.set(0.0f, (getHeight() - height) / 2.0f, org.telegram.messenger.i0.L(32.0f), (getHeight() + height) / 2.0f);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = ((GestureDetector) this.d.b).onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return onTouchEvent;
        }
        this.f = false;
        invalidate();
        return onTouchEvent;
    }

    public void setBrushWeight(float f7) {
        this.H.c = f7;
        invalidate();
    }

    public void setColorSwatch(ig.q1 q1Var) {
        this.H = q1Var;
        invalidate();
    }

    public void setDrawCenter(boolean z10) {
        this.J = z10;
        invalidate();
    }

    public void setOnUpdate(Runnable runnable) {
        this.I = runnable;
    }

    public void setRenderView(ig.c1 c1Var) {
        this.E = c1Var;
    }

    public void setShowPreview(boolean z10) {
        this.w = z10;
        invalidate();
    }

    public void setValueOverride(c2 c2Var) {
        this.K = c2Var;
        invalidate();
    }

    public void setViewHidden(boolean z10) {
        this.h = z10;
        invalidate();
    }
}
