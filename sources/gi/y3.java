package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class y3 extends FrameLayout {
    public final RectF E;
    public final Paint F;
    public final RectF G;
    public final RectF H;
    public final Path I;
    public boolean J;
    public final org.telegram.ui.Components.u5 K;
    public ly0 L;
    public final Path M;
    public boolean N;
    public final org.telegram.ui.Components.ba a;
    public final ai.h4 b;
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;
    public int f;
    public final ei.z5 h;
    public final gc n;
    public final RectF r;
    public final RectF s;
    public final Paint w;
    public ly0 x;
    public final Path y;

    /* JADX WARN: Type inference failed for: r5v0, types: [gi.t3] */
    public y3(Context context, ei.b bVar, org.telegram.ui.Components.x9 x9Var) {
        super(context);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        final o9 o9Var = (o9) this;
        this.h = new ei.z5(o9Var, 29);
        this.n = new gc(this);
        this.r = new RectF();
        this.s = new RectF();
        Paint paint = new Paint(1);
        this.w = paint;
        Path path = new Path();
        this.y = path;
        this.E = new RectF();
        this.F = new Paint(1);
        this.G = new RectF();
        this.H = new RectF();
        this.I = new Path();
        this.K = new org.telegram.ui.Components.u5(this, 0L, 320L, xq.h);
        this.M = new Path();
        this.N = true;
        path.rewind();
        path.moveTo(-org.telegram.messenger.g0.L(4.33f), -org.telegram.messenger.g0.L(4.33f));
        path.lineTo(org.telegram.messenger.g0.L(4.33f), org.telegram.messenger.g0.L(4.33f));
        path.moveTo(-org.telegram.messenger.g0.L(4.33f), org.telegram.messenger.g0.L(4.33f));
        path.lineTo(org.telegram.messenger.g0.L(4.33f), -org.telegram.messenger.g0.L(4.33f));
        this.a = new org.telegram.ui.Components.ba(x9Var, this, 0, !o9Var.P.s0.c());
        setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(44.0f));
        final int i3 = 0;
        ai.h4 h4Var = new ai.h4(o9Var, context, h10.t0, (t3) new n10() { // from class: gi.t3
            @Override // org.telegram.messenger.n10
            public final void a(Object obj, Object obj2) {
                int i10 = i3;
                int i11 = 0;
                o9 o9Var2 = o9Var;
                switch (i10) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        f41 f41Var = (f41) obj2;
                        f41Var.M();
                        int i12 = 0;
                        for (int i13 = 0; i13 < o9Var2.d.size(); i13++) {
                            Integer num = (Integer) o9Var2.d.get(i13);
                            int intValue = num.intValue();
                            f7 f7Var = (f7) o9Var2.c.get(intValue);
                            int i14 = w3.b;
                            r31 K = r31.K(w3.class);
                            K.d = intValue;
                            K.G = f7Var;
                            K.z = i12;
                            K.L(o9Var2.f == intValue);
                            K.f = o9Var2.e.contains(num);
                            K.D = new bi.q(o9Var2, intValue, 3);
                            arrayList.add(K);
                            if (o9Var2.e.contains(num)) {
                                i12++;
                            }
                        }
                        f41Var.L();
                        break;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        o9Var2.d.clear();
                        int size = arrayList2.size();
                        while (i11 < size) {
                            Object obj3 = arrayList2.get(i11);
                            i11++;
                            o9Var2.d.add(Integer.valueOf(((r31) obj3).d));
                        }
                        org.telegram.messenger.g0.d0(o9Var2.b, new ai.v2(o9Var2, 24));
                        break;
                }
            }
        }, new ei.y8(o9Var, 8), bVar);
        this.b = h4Var;
        h4Var.g3.r = false;
        h4Var.setClipToPadding(false);
        h4Var.setClipChildren(false);
        h4Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        addView(h4Var, mf.e(-2, 120, 85));
        h4Var.z1(true);
        final int i10 = 1;
        h4Var.E1(new n10() { // from class: gi.t3
            @Override // org.telegram.messenger.n10
            public final void a(Object obj, Object obj2) {
                int i102 = i10;
                int i11 = 0;
                o9 o9Var2 = o9Var;
                switch (i102) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        f41 f41Var = (f41) obj2;
                        f41Var.M();
                        int i12 = 0;
                        for (int i13 = 0; i13 < o9Var2.d.size(); i13++) {
                            Integer num = (Integer) o9Var2.d.get(i13);
                            int intValue = num.intValue();
                            f7 f7Var = (f7) o9Var2.c.get(intValue);
                            int i14 = w3.b;
                            r31 K = r31.K(w3.class);
                            K.d = intValue;
                            K.G = f7Var;
                            K.z = i12;
                            K.L(o9Var2.f == intValue);
                            K.f = o9Var2.e.contains(num);
                            K.D = new bi.q(o9Var2, intValue, 3);
                            arrayList.add(K);
                            if (o9Var2.e.contains(num)) {
                                i12++;
                            }
                        }
                        f41Var.L();
                        break;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        o9Var2.d.clear();
                        int size = arrayList2.size();
                        while (i11 < size) {
                            Object obj3 = arrayList2.get(i11);
                            i11++;
                            o9Var2.d.add(Integer.valueOf(((r31) obj3).d));
                        }
                        org.telegram.messenger.g0.d0(o9Var2.b, new ai.v2(o9Var2, 24));
                        break;
                }
            }
        }, true);
        c(false, false);
        setWillNotDraw(false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-1);
    }

    public final void a(Canvas canvas, RectF rectF, float f10, float f11) {
        if (f11 < 1.0f) {
            canvas.saveLayerAlpha(rectF, (int) (255.0f * f11), 31);
        }
        o9 o9Var = (o9) this;
        boolean c2 = o9Var.P.s0.c();
        org.telegram.ui.Components.ba baVar = this.a;
        Paint paint = this.F;
        if (c2) {
            if (canvas.isHardwareAccelerated()) {
                canvas.save();
                Path path = o9Var.O;
                path.rewind();
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.translate(0.0f, 0.0f);
                baVar.b(canvas, true);
                canvas.restore();
            }
            paint.setAlpha(38);
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            Paint[] d = baVar.d();
            if (d[1] == null) {
                paint.setAlpha(128);
                canvas.drawRoundRect(rectF, f10, f10, paint);
            } else {
                Paint paint2 = d[0];
                if (paint2 != null) {
                    canvas.drawRoundRect(rectF, f10, f10, paint2);
                }
                Paint paint3 = d[1];
                if (paint3 != null) {
                    canvas.drawRoundRect(rectF, f10, f10, paint3);
                }
                paint.setAlpha((int) (f11 * 51.0f));
                canvas.drawRoundRect(rectF, f10, f10, paint);
            }
        }
        if (f11 < 1.0f) {
            canvas.restore();
        }
    }

    public final int b(int i3) {
        if (!this.d.contains(Integer.valueOf(i3))) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < Math.min(i3, this.c.size()); i11++) {
            if (this.d.contains(Integer.valueOf(i11))) {
                i10++;
            }
        }
        return i10;
    }

    public final void c(boolean z10, boolean z11) {
        if (this.N == z10) {
            return;
        }
        this.N = z10;
        ai.h4 h4Var = this.b;
        h4Var.animate().cancel();
        if (z11) {
            h4Var.setVisibility(0);
            org.telegram.messenger.camera.q.l(h4Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.65f).scaleY(z10 ? 1.0f : 0.65f).setListener(new dh.x(11, this, z10)).setUpdateListener(new j3(this, 1)), xq.h, 360L);
        } else {
            h4Var.setVisibility(z10 ? 0 : 8);
            h4Var.setAlpha(z10 ? 1.0f : 0.0f);
            h4Var.setScaleX(z10 ? 1.0f : 0.65f);
            h4Var.setScaleY(z10 ? 1.0f : 0.65f);
            invalidate();
        }
        if (z10 && this.J) {
            this.J = false;
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float a10 = this.n.a(0.1f);
        canvas.save();
        float width = getWidth() - org.telegram.messenger.g0.L(42.0f);
        float height = getHeight() - org.telegram.messenger.g0.L(34.0f);
        float width2 = getWidth() - org.telegram.messenger.g0.L(12.0f);
        float height2 = getHeight() - org.telegram.messenger.g0.L(4.0f);
        RectF rectF = this.r;
        rectF.set(width, height, width2, height2);
        RectF rectF2 = this.s;
        rectF2.set(rectF);
        rectF2.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        a(canvas, rectF, rectF.width() / 2.0f, 1.0f);
        float L = org.telegram.messenger.g0.L(2.0f);
        Paint paint = this.w;
        paint.setStrokeWidth(L);
        paint.setAlpha(hs.e4);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) - org.telegram.messenger.g0.L(0.9f), paint);
        ly0 ly0Var = this.x;
        ai.h4 h4Var = this.b;
        if (ly0Var != null) {
            ly0Var.c(rectF.centerX() - (this.x.c / 2.0f), rectF.centerY() - org.telegram.messenger.g0.L(0.6f), 1.0f - h4Var.getAlpha(), -1, canvas);
        }
        if (h4Var.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            paint.setAlpha((int) (h4Var.getAlpha() * 255.0f));
            canvas.drawPath(this.y, paint);
            canvas.restore();
        }
        canvas.restore();
        if (this.L != null) {
            float d = this.K.d(this.J);
            if (d > 0.0f) {
                float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, d);
                float k10 = this.L.k() + org.telegram.messenger.g0.L(11.0f) + org.telegram.messenger.g0.L(11.0f);
                float L2 = org.telegram.messenger.g0.L(32.0f);
                float f10 = rectF.right - k10;
                float L3 = (rectF.top - org.telegram.messenger.g0.L(9.66f)) - L2;
                float f11 = rectF.right;
                float L4 = rectF.top - org.telegram.messenger.g0.L(9.66f);
                RectF rectF3 = this.G;
                rectF3.set(f10, L3, f11, L4);
                rectF3.set(rectF3.right - (rectF3.width() * T1), rectF3.bottom - (rectF3.height() * T1), rectF3.right, rectF3.bottom);
                rectF3.offset(0.0f, (1.0f - d) * org.telegram.messenger.g0.L(4.0f));
                Path path = this.I;
                path.rewind();
                float L5 = org.telegram.messenger.g0.L(8.0f);
                float f12 = rectF3.left;
                float f13 = rectF3.top;
                RectF rectF4 = this.H;
                rectF4.set(f12, f13, f12 + L5, f13 + L5);
                path.arcTo(rectF4, 180.0f, 90.0f, false);
                float f14 = rectF3.right;
                float f15 = rectF3.top;
                rectF4.set(f14 - L5, f15, f14, f15 + L5);
                path.arcTo(rectF4, 270.0f, 90.0f, false);
                float f16 = rectF3.right;
                float f17 = rectF3.bottom;
                rectF4.set(f16 - L5, f17 - L5, f16, f17);
                path.arcTo(rectF4, 0.0f, 90.0f, false);
                path.lineTo(rectF3.right - org.telegram.messenger.g0.L(8.0f), rectF3.bottom);
                path.lineTo(rectF3.right - org.telegram.messenger.g0.L(14.5f), rectF3.bottom + org.telegram.messenger.g0.L(5.66f));
                path.lineTo(rectF3.right - org.telegram.messenger.g0.L(21.0f), rectF3.bottom);
                float f18 = rectF3.left;
                float f19 = rectF3.bottom;
                rectF4.set(f18, f19 - L5, f18 + L5, f19);
                path.arcTo(rectF4, 90.0f, 90.0f, false);
                path.close();
                rectF3.bottom += org.telegram.messenger.g0.L(5.66f);
                canvas.save();
                canvas.clipPath(path);
                a(canvas, rectF3, L5, d);
                canvas.restore();
                canvas.save();
                canvas.scale(T1, T1, rectF3.right, rectF3.bottom);
                this.L.c((rectF.right - k10) + org.telegram.messenger.g0.L(11.0f), (rectF.top - org.telegram.messenger.g0.L(9.66f)) - (L2 / 2.0f), d, -1, canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ai.h4 h4Var = this.b;
        if (view != h4Var) {
            return super.drawChild(canvas, view, j10);
        }
        float x10 = h4Var.getX();
        float y9 = h4Var.getY();
        float x11 = h4Var.getX() + h4Var.getWidth();
        float y10 = h4Var.getY() + h4Var.getHeight();
        RectF rectF = this.E;
        rectF.set(x10, y9, x11, y10);
        org.telegram.messenger.g0.j3(rectF, h4Var.getScaleX(), h4Var.getPivotX() + h4Var.getX(), h4Var.getPivotY() + h4Var.getY());
        a(canvas, rectF, org.telegram.messenger.g0.L(10.0f), h4Var.getAlpha());
        Path path = this.M;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        ai.h4 h4Var = this.b;
        h4Var.setPivotX(h4Var.getWidth() - org.telegram.messenger.g0.L(15.0f));
        h4Var.setPivotY(h4Var.getHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(176.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.r.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        gc gcVar = this.n;
        if (action == 0) {
            gcVar.c(contains);
            if (this.N && !contains) {
                if (!this.E.contains(motionEvent.getX(), motionEvent.getY())) {
                    c(false, true);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                gcVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (gcVar.i) {
                c(!this.N, true);
            }
            gcVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            gcVar.c(false);
        }
        return gcVar.i || super.onTouchEvent(motionEvent);
    }

    public void setSelected(int i3) {
        if (this.f == i3) {
            return;
        }
        this.f = i3;
        org.telegram.messenger.g0.d0(this.b, new s3(this, i3, 0));
    }
}
