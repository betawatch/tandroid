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
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.wy0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public abstract class g4 extends FrameLayout {
    public final RectF E;
    public final Paint F;
    public final RectF G;
    public final RectF H;
    public final Path I;
    public boolean J;
    public final org.telegram.ui.Components.c6 K;
    public wy0 L;
    public final Path M;
    public boolean N;
    public final org.telegram.ui.Components.fa a;
    public final bi.i6 b;
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;
    public int f;
    public final w h;
    public final org.telegram.ui.Components.lc n;
    public final RectF r;
    public final RectF s;
    public final Paint w;
    public wy0 x;
    public final Path y;

    /* JADX WARN: Type inference failed for: r5v0, types: [hi.b4] */
    public g4(Context context, fi.b bVar, org.telegram.ui.Components.ba baVar) {
        super(context);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        final ga gaVar = (ga) this;
        this.h = new w(gaVar, 13);
        this.n = new org.telegram.ui.Components.lc(this);
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
        this.K = new org.telegram.ui.Components.c6(this, 0L, 320L, kr.h);
        this.M = new Path();
        this.N = true;
        path.rewind();
        path.moveTo(-org.telegram.messenger.g0.L(4.33f), -org.telegram.messenger.g0.L(4.33f));
        path.lineTo(org.telegram.messenger.g0.L(4.33f), org.telegram.messenger.g0.L(4.33f));
        path.moveTo(-org.telegram.messenger.g0.L(4.33f), org.telegram.messenger.g0.L(4.33f));
        path.lineTo(org.telegram.messenger.g0.L(4.33f), -org.telegram.messenger.g0.L(4.33f));
        this.a = new org.telegram.ui.Components.fa(baVar, this, 0, !gaVar.P.s0.c());
        setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(44.0f));
        final int i7 = 0;
        bi.i6 i6Var = new bi.i6(gaVar, context, i10.t0, (b4) new p10() { // from class: hi.b4
            @Override // org.telegram.messenger.p10
            public final void a(Object obj, Object obj2) {
                int i10 = i7;
                int i11 = 0;
                ga gaVar2 = gaVar;
                switch (i10) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        b51 b51Var = (b51) obj2;
                        b51Var.M();
                        int i12 = 0;
                        for (int i13 = 0; i13 < gaVar2.d.size(); i13++) {
                            Integer num = (Integer) gaVar2.d.get(i13);
                            int intValue = num.intValue();
                            x7 x7Var = (x7) gaVar2.c.get(intValue);
                            int i14 = e4.b;
                            n41 K = n41.K(e4.class);
                            K.d = intValue;
                            K.H = x7Var;
                            K.A = i12;
                            K.L(gaVar2.f == intValue);
                            K.f = gaVar2.e.contains(num);
                            K.E = new ci.q(gaVar2, intValue, 3);
                            arrayList.add(K);
                            if (gaVar2.e.contains(num)) {
                                i12++;
                            }
                        }
                        b51Var.L();
                        break;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        gaVar2.d.clear();
                        int size = arrayList2.size();
                        while (i11 < size) {
                            Object obj3 = arrayList2.get(i11);
                            i11++;
                            gaVar2.d.add(Integer.valueOf(((n41) obj3).d));
                        }
                        org.telegram.messenger.g0.d0(gaVar2.b, new ai.d0(gaVar2, 26));
                        break;
                }
            }
        }, new di.v6(gaVar, 22), bVar);
        this.b = i6Var;
        i6Var.g3.r = false;
        i6Var.setClipToPadding(false);
        i6Var.setClipChildren(false);
        i6Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        addView(i6Var, c8.na.e(-2, 120, 85));
        i6Var.z1(true);
        final int i10 = 1;
        i6Var.E1(new p10() { // from class: hi.b4
            @Override // org.telegram.messenger.p10
            public final void a(Object obj, Object obj2) {
                int i102 = i10;
                int i11 = 0;
                ga gaVar2 = gaVar;
                switch (i102) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        b51 b51Var = (b51) obj2;
                        b51Var.M();
                        int i12 = 0;
                        for (int i13 = 0; i13 < gaVar2.d.size(); i13++) {
                            Integer num = (Integer) gaVar2.d.get(i13);
                            int intValue = num.intValue();
                            x7 x7Var = (x7) gaVar2.c.get(intValue);
                            int i14 = e4.b;
                            n41 K = n41.K(e4.class);
                            K.d = intValue;
                            K.H = x7Var;
                            K.A = i12;
                            K.L(gaVar2.f == intValue);
                            K.f = gaVar2.e.contains(num);
                            K.E = new ci.q(gaVar2, intValue, 3);
                            arrayList.add(K);
                            if (gaVar2.e.contains(num)) {
                                i12++;
                            }
                        }
                        b51Var.L();
                        break;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        gaVar2.d.clear();
                        int size = arrayList2.size();
                        while (i11 < size) {
                            Object obj3 = arrayList2.get(i11);
                            i11++;
                            gaVar2.d.add(Integer.valueOf(((n41) obj3).d));
                        }
                        org.telegram.messenger.g0.d0(gaVar2.b, new ai.d0(gaVar2, 26));
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
        ga gaVar = (ga) this;
        boolean c10 = gaVar.P.s0.c();
        org.telegram.ui.Components.fa faVar = this.a;
        Paint paint = this.F;
        if (c10) {
            if (canvas.isHardwareAccelerated()) {
                canvas.save();
                Path path = gaVar.O;
                path.rewind();
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.translate(0.0f, 0.0f);
                faVar.b(canvas, true);
                canvas.restore();
            }
            paint.setAlpha(38);
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            Paint[] d = faVar.d();
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
        bi.i6 i6Var = this.b;
        i6Var.animate().cancel();
        if (z11) {
            i6Var.setVisibility(0);
            m10.o(i6Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.65f).scaleY(z10 ? 1.0f : 0.65f).setListener(new bi.j7(11, this, z10)).setUpdateListener(new s3(this, 1)), kr.h, 360L);
        } else {
            i6Var.setVisibility(z10 ? 0 : 8);
            i6Var.setAlpha(z10 ? 1.0f : 0.0f);
            i6Var.setScaleX(z10 ? 1.0f : 0.65f);
            i6Var.setScaleY(z10 ? 1.0f : 0.65f);
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
        paint.setAlpha(ks.e4);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) - org.telegram.messenger.g0.L(0.9f), paint);
        wy0 wy0Var = this.x;
        bi.i6 i6Var = this.b;
        if (wy0Var != null) {
            wy0Var.c(rectF.centerX() - (this.x.c / 2.0f), rectF.centerY() - org.telegram.messenger.g0.L(0.6f), 1.0f - i6Var.getAlpha(), -1, canvas);
        }
        if (i6Var.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            paint.setAlpha((int) (i6Var.getAlpha() * 255.0f));
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
        bi.i6 i6Var = this.b;
        if (view != i6Var) {
            return super.drawChild(canvas, view, j3);
        }
        float x10 = i6Var.getX();
        float y10 = i6Var.getY();
        float x11 = i6Var.getX() + i6Var.getWidth();
        float y11 = i6Var.getY() + i6Var.getHeight();
        RectF rectF = this.E;
        rectF.set(x10, y10, x11, y11);
        org.telegram.messenger.g0.i3(rectF, i6Var.getScaleX(), i6Var.getPivotX() + i6Var.getX(), i6Var.getPivotY() + i6Var.getY());
        a(canvas, rectF, org.telegram.messenger.g0.L(10.0f), i6Var.getAlpha());
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
        bi.i6 i6Var = this.b;
        i6Var.setPivotX(i6Var.getWidth() - org.telegram.messenger.g0.L(15.0f));
        i6Var.setPivotY(i6Var.getHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(176.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.r.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        org.telegram.ui.Components.lc lcVar = this.n;
        if (action == 0) {
            lcVar.c(contains);
            if (this.N && !contains) {
                if (!this.E.contains(motionEvent.getX(), motionEvent.getY())) {
                    c(false, true);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                lcVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (lcVar.i) {
                c(!this.N, true);
            }
            lcVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            lcVar.c(false);
        }
        return lcVar.i || super.onTouchEvent(motionEvent);
    }

    public void setSelected(int i7) {
        if (this.f == i7) {
            return;
        }
        this.f = i7;
        org.telegram.messenger.g0.d0(this.b, new a4(this, i7, 0));
    }
}
