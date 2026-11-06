package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public abstract class b4 extends FrameLayout {
    public final RectF D;
    public final Paint E;
    public final RectF F;
    public final RectF G;
    public final Path H;
    public boolean I;
    public final org.telegram.ui.Components.w5 J;
    public my0 K;
    public final Path L;
    public boolean M;
    public final org.telegram.ui.Components.ca a;
    public final w3 b;
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;
    public int f;
    public final di.s7 h;
    public final ic n;
    public final RectF r;
    public final RectF s;
    public final Paint w;
    public my0 x;
    public final Path y;

    /* JADX WARN: Type inference failed for: r5v0, types: [fi.u3] */
    public b4(Context context, di.b bVar, org.telegram.ui.Components.y9 y9Var) {
        super(context);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        final o9 o9Var = (o9) this;
        this.h = new di.s7(o9Var, 25);
        this.n = new ic(this);
        this.r = new RectF();
        this.s = new RectF();
        Paint paint = new Paint(1);
        this.w = paint;
        Path path = new Path();
        this.y = path;
        this.D = new RectF();
        this.E = new Paint(1);
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Path();
        this.J = new org.telegram.ui.Components.w5(this, 0L, 320L, xq.h);
        this.L = new Path();
        this.M = true;
        path.rewind();
        path.moveTo(-org.telegram.messenger.g0.L(4.33f), -org.telegram.messenger.g0.L(4.33f));
        path.lineTo(org.telegram.messenger.g0.L(4.33f), org.telegram.messenger.g0.L(4.33f));
        path.moveTo(-org.telegram.messenger.g0.L(4.33f), org.telegram.messenger.g0.L(4.33f));
        path.lineTo(org.telegram.messenger.g0.L(4.33f), -org.telegram.messenger.g0.L(4.33f));
        this.a = new org.telegram.ui.Components.ca(y9Var, this, 0, !o9Var.O.r0.c());
        setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(44.0f));
        final int i7 = 0;
        w3 w3Var = new w3(o9Var, context, p10.s0, (u3) new v10() { // from class: fi.u3
            @Override // org.telegram.messenger.v10
            public final void a(Object obj, Object obj2) {
                int i10 = i7;
                int i11 = 0;
                o9 o9Var2 = o9Var;
                switch (i10) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        l41 l41Var = (l41) obj2;
                        l41Var.M();
                        int i12 = 0;
                        for (int i13 = 0; i13 < o9Var2.d.size(); i13++) {
                            Integer num = (Integer) o9Var2.d.get(i13);
                            int intValue = num.intValue();
                            e7 e7Var = (e7) o9Var2.c.get(intValue);
                            int i14 = z3.b;
                            x31 K = x31.K(z3.class);
                            K.d = intValue;
                            K.G = e7Var;
                            K.z = i12;
                            K.L(o9Var2.f == intValue);
                            K.f = o9Var2.e.contains(num);
                            K.D = new ai.v(o9Var2, intValue, 3);
                            arrayList.add(K);
                            if (o9Var2.e.contains(num)) {
                                i12++;
                            }
                        }
                        l41Var.L();
                        break;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        o9Var2.d.clear();
                        int size = arrayList2.size();
                        while (i11 < size) {
                            Object obj3 = arrayList2.get(i11);
                            i11++;
                            o9Var2.d.add(Integer.valueOf(((x31) obj3).d));
                        }
                        org.telegram.messenger.g0.d0(o9Var2.b, new ai.i(o9Var2, 21));
                        break;
                }
            }
        }, new di.q4(o9Var, 12), bVar);
        this.b = w3Var;
        w3Var.f3.r = false;
        w3Var.setClipToPadding(false);
        w3Var.setClipChildren(false);
        w3Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        addView(w3Var, c8.ha.e(-2, 120, 85));
        w3Var.z1(true);
        final int i10 = 1;
        w3Var.E1(new v10() { // from class: fi.u3
            @Override // org.telegram.messenger.v10
            public final void a(Object obj, Object obj2) {
                int i102 = i10;
                int i11 = 0;
                o9 o9Var2 = o9Var;
                switch (i102) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        l41 l41Var = (l41) obj2;
                        l41Var.M();
                        int i12 = 0;
                        for (int i13 = 0; i13 < o9Var2.d.size(); i13++) {
                            Integer num = (Integer) o9Var2.d.get(i13);
                            int intValue = num.intValue();
                            e7 e7Var = (e7) o9Var2.c.get(intValue);
                            int i14 = z3.b;
                            x31 K = x31.K(z3.class);
                            K.d = intValue;
                            K.G = e7Var;
                            K.z = i12;
                            K.L(o9Var2.f == intValue);
                            K.f = o9Var2.e.contains(num);
                            K.D = new ai.v(o9Var2, intValue, 3);
                            arrayList.add(K);
                            if (o9Var2.e.contains(num)) {
                                i12++;
                            }
                        }
                        l41Var.L();
                        break;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        o9Var2.d.clear();
                        int size = arrayList2.size();
                        while (i11 < size) {
                            Object obj3 = arrayList2.get(i11);
                            i11++;
                            o9Var2.d.add(Integer.valueOf(((x31) obj3).d));
                        }
                        org.telegram.messenger.g0.d0(o9Var2.b, new ai.i(o9Var2, 21));
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
        boolean c10 = o9Var.O.r0.c();
        org.telegram.ui.Components.ca caVar = this.a;
        Paint paint = this.E;
        if (c10) {
            if (canvas.isHardwareAccelerated()) {
                canvas.save();
                Path path = o9Var.N;
                path.rewind();
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.translate(0.0f, 0.0f);
                caVar.b(canvas, true);
                canvas.restore();
            }
            paint.setAlpha(38);
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            Paint[] d = caVar.d();
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

    public final int b(int i7) {
        if (!this.d.contains(Integer.valueOf(i7))) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < Math.min(i7, this.c.size()); i11++) {
            if (this.d.contains(Integer.valueOf(i11))) {
                i10++;
            }
        }
        return i10;
    }

    public final void c(boolean z9, boolean z10) {
        if (this.M == z9) {
            return;
        }
        this.M = z9;
        w3 w3Var = this.b;
        w3Var.animate().cancel();
        if (z10) {
            w3Var.setVisibility(0);
            org.telegram.messenger.camera.q.l(w3Var.animate().alpha(z9 ? 1.0f : 0.0f).scaleX(z9 ? 1.0f : 0.65f).scaleY(z9 ? 1.0f : 0.65f).setListener(new ch.y(10, this, z9)).setUpdateListener(new v3(this, 0)), xq.h, 360L);
        } else {
            w3Var.setVisibility(z9 ? 0 : 8);
            w3Var.setAlpha(z9 ? 1.0f : 0.0f);
            w3Var.setScaleX(z9 ? 1.0f : 0.65f);
            w3Var.setScaleY(z9 ? 1.0f : 0.65f);
            invalidate();
        }
        if (z9 && this.I) {
            this.I = false;
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
        paint.setAlpha(qs.e4);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) - org.telegram.messenger.g0.L(0.9f), paint);
        my0 my0Var = this.x;
        w3 w3Var = this.b;
        if (my0Var != null) {
            my0Var.c(rectF.centerX() - (this.x.c / 2.0f), rectF.centerY() - org.telegram.messenger.g0.L(0.6f), 1.0f - w3Var.getAlpha(), -1, canvas);
        }
        if (w3Var.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            paint.setAlpha((int) (w3Var.getAlpha() * 255.0f));
            canvas.drawPath(this.y, paint);
            canvas.restore();
        }
        canvas.restore();
        if (this.K != null) {
            float d = this.J.d(this.I);
            if (d > 0.0f) {
                float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, d);
                float k10 = this.K.k() + org.telegram.messenger.g0.L(11.0f) + org.telegram.messenger.g0.L(11.0f);
                float L2 = org.telegram.messenger.g0.L(32.0f);
                float f10 = rectF.right - k10;
                float L3 = (rectF.top - org.telegram.messenger.g0.L(9.66f)) - L2;
                float f11 = rectF.right;
                float L4 = rectF.top - org.telegram.messenger.g0.L(9.66f);
                RectF rectF3 = this.F;
                rectF3.set(f10, L3, f11, L4);
                rectF3.set(rectF3.right - (rectF3.width() * T1), rectF3.bottom - (rectF3.height() * T1), rectF3.right, rectF3.bottom);
                rectF3.offset(0.0f, (1.0f - d) * org.telegram.messenger.g0.L(4.0f));
                Path path = this.H;
                path.rewind();
                float L5 = org.telegram.messenger.g0.L(8.0f);
                float f12 = rectF3.left;
                float f13 = rectF3.top;
                RectF rectF4 = this.G;
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
                this.K.c((rectF.right - k10) + org.telegram.messenger.g0.L(11.0f), (rectF.top - org.telegram.messenger.g0.L(9.66f)) - (L2 / 2.0f), d, -1, canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        w3 w3Var = this.b;
        if (view != w3Var) {
            return super.drawChild(canvas, view, j3);
        }
        float x10 = w3Var.getX();
        float y10 = w3Var.getY();
        float x11 = w3Var.getX() + w3Var.getWidth();
        float y11 = w3Var.getY() + w3Var.getHeight();
        RectF rectF = this.D;
        rectF.set(x10, y10, x11, y11);
        org.telegram.messenger.g0.j3(rectF, w3Var.getScaleX(), w3Var.getPivotX() + w3Var.getX(), w3Var.getPivotY() + w3Var.getY());
        a(canvas, rectF, org.telegram.messenger.g0.L(10.0f), w3Var.getAlpha());
        Path path = this.L;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        w3 w3Var = this.b;
        w3Var.setPivotX(w3Var.getWidth() - org.telegram.messenger.g0.L(15.0f));
        w3Var.setPivotY(w3Var.getHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(176.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.r.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        ic icVar = this.n;
        if (action == 0) {
            icVar.c(contains);
            if (this.M && !contains) {
                if (!this.D.contains(motionEvent.getX(), motionEvent.getY())) {
                    c(false, true);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                icVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (icVar.i) {
                c(!this.M, true);
            }
            icVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            icVar.c(false);
        }
        return icVar.i || super.onTouchEvent(motionEvent);
    }

    public void setSelected(int i7) {
        if (this.f == i7) {
            return;
        }
        this.f = i7;
        org.telegram.messenger.g0.d0(this.b, new t3(this, i7, 0));
    }
}
