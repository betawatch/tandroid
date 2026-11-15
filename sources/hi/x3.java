package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.p41;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class x3 extends FrameLayout {
    public final RectF E;
    public final Paint F;
    public final RectF G;
    public final RectF H;
    public final Path I;
    public boolean J;
    public final org.telegram.ui.Components.u5 K;
    public oy0 L;
    public final Path M;
    public boolean N;
    public final org.telegram.ui.Components.y9 a;
    public final bi.v3 b;
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;
    public int f;
    public final e1 h;
    public final dc n;
    public final RectF r;
    public final RectF s;
    public final Paint w;
    public oy0 x;
    public final Path y;

    /* JADX WARN: Type inference failed for: r5v0, types: [hi.s3] */
    public x3(Context context, fi.b bVar, org.telegram.ui.Components.u9 u9Var) {
        super(context);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        final l9 l9Var = (l9) this;
        this.h = new e1(l9Var, 8);
        this.n = new dc(this);
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
        this.K = new org.telegram.ui.Components.u5(this, 0L, 320L, er.h);
        this.M = new Path();
        this.N = true;
        path.rewind();
        path.moveTo(-org.telegram.messenger.g0.L(4.33f), -org.telegram.messenger.g0.L(4.33f));
        path.lineTo(org.telegram.messenger.g0.L(4.33f), org.telegram.messenger.g0.L(4.33f));
        path.moveTo(-org.telegram.messenger.g0.L(4.33f), org.telegram.messenger.g0.L(4.33f));
        path.lineTo(org.telegram.messenger.g0.L(4.33f), -org.telegram.messenger.g0.L(4.33f));
        this.a = new org.telegram.ui.Components.y9(u9Var, this, 0, !l9Var.P.s0.c());
        setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(44.0f));
        final int i7 = 0;
        bi.v3 v3Var = new bi.v3(l9Var, context, m10.t0, (s3) new s10() { // from class: hi.s3
            @Override // org.telegram.messenger.s10
            public final void a(Object obj, Object obj2) {
                int i10 = i7;
                int i11 = 0;
                l9 l9Var2 = l9Var;
                switch (i10) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        p41 p41Var = (p41) obj2;
                        p41Var.M();
                        int i12 = 0;
                        for (int i13 = 0; i13 < l9Var2.d.size(); i13++) {
                            Integer num = (Integer) l9Var2.d.get(i13);
                            int intValue = num.intValue();
                            d7 d7Var = (d7) l9Var2.c.get(intValue);
                            int i14 = v3.b;
                            b41 K = b41.K(v3.class);
                            K.d = intValue;
                            K.G = d7Var;
                            K.z = i12;
                            K.L(l9Var2.f == intValue);
                            K.f = l9Var2.e.contains(num);
                            K.D = new ci.q(l9Var2, intValue, 3);
                            arrayList.add(K);
                            if (l9Var2.e.contains(num)) {
                                i12++;
                            }
                        }
                        p41Var.L();
                        break;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        l9Var2.d.clear();
                        int size = arrayList2.size();
                        while (i11 < size) {
                            Object obj3 = arrayList2.get(i11);
                            i11++;
                            l9Var2.d.add(Integer.valueOf(((b41) obj3).d));
                        }
                        org.telegram.messenger.g0.d0(l9Var2.b, new ai.f0(l9Var2, 25));
                        break;
                }
            }
        }, new di.z6(l9Var, 19), bVar);
        this.b = v3Var;
        v3Var.g3.r = false;
        v3Var.setClipToPadding(false);
        v3Var.setClipChildren(false);
        v3Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        addView(v3Var, c8.ja.e(-2, 120, 85));
        v3Var.z1(true);
        final int i10 = 1;
        v3Var.E1(new s10() { // from class: hi.s3
            @Override // org.telegram.messenger.s10
            public final void a(Object obj, Object obj2) {
                int i102 = i10;
                int i11 = 0;
                l9 l9Var2 = l9Var;
                switch (i102) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        p41 p41Var = (p41) obj2;
                        p41Var.M();
                        int i12 = 0;
                        for (int i13 = 0; i13 < l9Var2.d.size(); i13++) {
                            Integer num = (Integer) l9Var2.d.get(i13);
                            int intValue = num.intValue();
                            d7 d7Var = (d7) l9Var2.c.get(intValue);
                            int i14 = v3.b;
                            b41 K = b41.K(v3.class);
                            K.d = intValue;
                            K.G = d7Var;
                            K.z = i12;
                            K.L(l9Var2.f == intValue);
                            K.f = l9Var2.e.contains(num);
                            K.D = new ci.q(l9Var2, intValue, 3);
                            arrayList.add(K);
                            if (l9Var2.e.contains(num)) {
                                i12++;
                            }
                        }
                        p41Var.L();
                        break;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        l9Var2.d.clear();
                        int size = arrayList2.size();
                        while (i11 < size) {
                            Object obj3 = arrayList2.get(i11);
                            i11++;
                            l9Var2.d.add(Integer.valueOf(((b41) obj3).d));
                        }
                        org.telegram.messenger.g0.d0(l9Var2.b, new ai.f0(l9Var2, 25));
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
        l9 l9Var = (l9) this;
        boolean c10 = l9Var.P.s0.c();
        org.telegram.ui.Components.y9 y9Var = this.a;
        Paint paint = this.F;
        if (c10) {
            if (canvas.isHardwareAccelerated()) {
                canvas.save();
                Path path = l9Var.O;
                path.rewind();
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.translate(0.0f, 0.0f);
                y9Var.b(canvas, true);
                canvas.restore();
            }
            paint.setAlpha(38);
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            Paint[] d = y9Var.d();
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

    public final void c(boolean z10, boolean z11) {
        if (this.N == z10) {
            return;
        }
        this.N = z10;
        bi.v3 v3Var = this.b;
        v3Var.animate().cancel();
        if (z11) {
            v3Var.setVisibility(0);
            i20.n(v3Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.65f).scaleY(z10 ? 1.0f : 0.65f).setListener(new bi.v4(11, this, z10)).setUpdateListener(new j3(this, 1)), er.h, 360L);
        } else {
            v3Var.setVisibility(z10 ? 0 : 8);
            v3Var.setAlpha(z10 ? 1.0f : 0.0f);
            v3Var.setScaleX(z10 ? 1.0f : 0.65f);
            v3Var.setScaleY(z10 ? 1.0f : 0.65f);
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
        paint.setAlpha(ns.e4);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) - org.telegram.messenger.g0.L(0.9f), paint);
        oy0 oy0Var = this.x;
        bi.v3 v3Var = this.b;
        if (oy0Var != null) {
            oy0Var.c(rectF.centerX() - (this.x.c / 2.0f), rectF.centerY() - org.telegram.messenger.g0.L(0.6f), 1.0f - v3Var.getAlpha(), -1, canvas);
        }
        if (v3Var.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            paint.setAlpha((int) (v3Var.getAlpha() * 255.0f));
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        bi.v3 v3Var = this.b;
        if (view != v3Var) {
            return super.drawChild(canvas, view, j3);
        }
        float x10 = v3Var.getX();
        float y10 = v3Var.getY();
        float x11 = v3Var.getX() + v3Var.getWidth();
        float y11 = v3Var.getY() + v3Var.getHeight();
        RectF rectF = this.E;
        rectF.set(x10, y10, x11, y11);
        org.telegram.messenger.g0.j3(rectF, v3Var.getScaleX(), v3Var.getPivotX() + v3Var.getX(), v3Var.getPivotY() + v3Var.getY());
        a(canvas, rectF, org.telegram.messenger.g0.L(10.0f), v3Var.getAlpha());
        Path path = this.M;
        path.rewind();
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        bi.v3 v3Var = this.b;
        v3Var.setPivotX(v3Var.getWidth() - org.telegram.messenger.g0.L(15.0f));
        v3Var.setPivotY(v3Var.getHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(176.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.r.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        dc dcVar = this.n;
        if (action == 0) {
            dcVar.c(contains);
            if (this.N && !contains) {
                if (!this.E.contains(motionEvent.getX(), motionEvent.getY())) {
                    c(false, true);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                dcVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (dcVar.i) {
                c(!this.N, true);
            }
            dcVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            dcVar.c(false);
        }
        return dcVar.i || super.onTouchEvent(motionEvent);
    }

    public void setSelected(int i7) {
        if (this.f == i7) {
            return;
        }
        this.f = i7;
        org.telegram.messenger.g0.d0(this.b, new ai.x1(this, i7, 1));
    }
}
