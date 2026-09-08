package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public abstract class u4 extends FrameLayout {
    public final Paint E;
    public final RectF F;
    public final RectF G;
    public final Path H;
    public boolean I;
    public final org.telegram.ui.Components.e6 J;
    public f01 K;
    public final Path L;
    public boolean M;
    public final org.telegram.ui.Components.na a;
    public final p4 b;
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;
    public int f;
    public final bi.oa h;
    public final org.telegram.ui.Components.zc n;
    public final RectF r;
    public final RectF s;
    public final Paint v;
    public f01 w;
    public final Path x;
    public final RectF y;

    /* JADX WARN: Type inference failed for: r5v0, types: [di.n4] */
    public u4(Context context, bi.b bVar, org.telegram.ui.Components.ja jaVar) {
        super(context);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        final fb fbVar = (fb) this;
        this.h = new bi.oa(fbVar, 24);
        this.n = new org.telegram.ui.Components.zc(this);
        this.r = new RectF();
        this.s = new RectF();
        Paint paint = new Paint(1);
        this.v = paint;
        Path path = new Path();
        this.x = path;
        this.y = new RectF();
        this.E = new Paint(1);
        this.F = new RectF();
        this.G = new RectF();
        this.H = new Path();
        this.J = new org.telegram.ui.Components.e6(this, 0L, 320L, pr.h);
        this.L = new Path();
        this.M = true;
        path.rewind();
        path.moveTo(-AndroidUtilities.dp(4.33f), -AndroidUtilities.dp(4.33f));
        path.lineTo(AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f));
        path.moveTo(-AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f));
        path.lineTo(AndroidUtilities.dp(4.33f), -AndroidUtilities.dp(4.33f));
        this.a = new org.telegram.ui.Components.na(jaVar, this, 0, !fbVar.O.r0.c());
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(44.0f));
        final int i10 = 0;
        p4 p4Var = new p4(fbVar, context, UserConfig.selectedAccount, new Utilities.Callback2() { // from class: di.n4
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                int i11 = i10;
                fb fbVar2 = fbVar;
                int i12 = 0;
                switch (i11) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        v51 v51Var = (v51) obj2;
                        v51Var.M();
                        int i13 = 0;
                        for (int i14 = 0; i14 < fbVar2.d.size(); i14++) {
                            Integer num = (Integer) fbVar2.d.get(i14);
                            int intValue = num.intValue();
                            o8 o8Var = (o8) fbVar2.c.get(intValue);
                            int i15 = s4.a;
                            h51 J = h51.J(s4.class);
                            J.d = intValue;
                            J.G = o8Var;
                            J.z = i13;
                            J.K(fbVar2.f == intValue);
                            J.f = fbVar2.e.contains(num);
                            J.D = new o4(fbVar2, intValue, i12);
                            arrayList.add(J);
                            if (fbVar2.e.contains(num)) {
                                i13++;
                            }
                        }
                        v51Var.L();
                        break;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        fbVar2.d.clear();
                        int size = arrayList2.size();
                        while (i12 < size) {
                            Object obj3 = arrayList2.get(i12);
                            i12++;
                            fbVar2.d.add(Integer.valueOf(((h51) obj3).d));
                        }
                        AndroidUtilities.forEachViews((RecyclerView) fbVar2.b, (e2.h) new ah.m(fbVar2, 4));
                        break;
                }
            }
        }, new a1.c(fbVar, 23), bVar);
        this.b = p4Var;
        p4Var.Y2.r = false;
        p4Var.setClipToPadding(false);
        p4Var.setClipChildren(false);
        p4Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        addView(p4Var, w7.x5.e(-2, 120, 85));
        p4Var.v1(true);
        final int i11 = 1;
        p4Var.A1(new Utilities.Callback2() { // from class: di.n4
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                int i112 = i11;
                fb fbVar2 = fbVar;
                int i12 = 0;
                switch (i112) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        v51 v51Var = (v51) obj2;
                        v51Var.M();
                        int i13 = 0;
                        for (int i14 = 0; i14 < fbVar2.d.size(); i14++) {
                            Integer num = (Integer) fbVar2.d.get(i14);
                            int intValue = num.intValue();
                            o8 o8Var = (o8) fbVar2.c.get(intValue);
                            int i15 = s4.a;
                            h51 J = h51.J(s4.class);
                            J.d = intValue;
                            J.G = o8Var;
                            J.z = i13;
                            J.K(fbVar2.f == intValue);
                            J.f = fbVar2.e.contains(num);
                            J.D = new o4(fbVar2, intValue, i12);
                            arrayList.add(J);
                            if (fbVar2.e.contains(num)) {
                                i13++;
                            }
                        }
                        v51Var.L();
                        break;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        fbVar2.d.clear();
                        int size = arrayList2.size();
                        while (i12 < size) {
                            Object obj3 = arrayList2.get(i12);
                            i12++;
                            fbVar2.d.add(Integer.valueOf(((h51) obj3).d));
                        }
                        AndroidUtilities.forEachViews((RecyclerView) fbVar2.b, (e2.h) new ah.m(fbVar2, 4));
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

    public final void a(Canvas canvas, RectF rectF, float f7, float f10) {
        if (f10 < 1.0f) {
            canvas.saveLayerAlpha(rectF, (int) (255.0f * f10), 31);
        }
        fb fbVar = (fb) this;
        boolean c10 = fbVar.O.r0.c();
        org.telegram.ui.Components.na naVar = this.a;
        Paint paint = this.E;
        if (c10) {
            if (canvas.isHardwareAccelerated()) {
                canvas.save();
                Path path = fbVar.N;
                path.rewind();
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.translate(0.0f, 0.0f);
                naVar.b(canvas, true);
                canvas.restore();
            }
            paint.setAlpha(38);
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            Paint[] d = naVar.d();
            if (d[1] == null) {
                paint.setAlpha(128);
                canvas.drawRoundRect(rectF, f7, f7, paint);
            } else {
                Paint paint2 = d[0];
                if (paint2 != null) {
                    canvas.drawRoundRect(rectF, f7, f7, paint2);
                }
                Paint paint3 = d[1];
                if (paint3 != null) {
                    canvas.drawRoundRect(rectF, f7, f7, paint3);
                }
                paint.setAlpha((int) (f10 * 51.0f));
                canvas.drawRoundRect(rectF, f7, f7, paint);
            }
        }
        if (f10 < 1.0f) {
            canvas.restore();
        }
    }

    public final int b(int i10) {
        if (!this.d.contains(Integer.valueOf(i10))) {
            return -1;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < Math.min(i10, this.c.size()); i12++) {
            if (this.d.contains(Integer.valueOf(i12))) {
                i11++;
            }
        }
        return i11;
    }

    public final void c(boolean z10, boolean z11) {
        if (this.M == z10) {
            return;
        }
        this.M = z10;
        p4 p4Var = this.b;
        p4Var.animate().cancel();
        if (z11) {
            p4Var.setVisibility(0);
            wl.q(p4Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.65f).scaleY(z10 ? 1.0f : 0.65f).setListener(new ah.q0(11, this, z10)).setUpdateListener(new ah.d0(this, 21)), pr.h, 360L);
        } else {
            p4Var.setVisibility(z10 ? 0 : 8);
            p4Var.setAlpha(z10 ? 1.0f : 0.0f);
            p4Var.setScaleX(z10 ? 1.0f : 0.65f);
            p4Var.setScaleY(z10 ? 1.0f : 0.65f);
            invalidate();
        }
        if (z10 && this.I) {
            this.I = false;
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float a2 = this.n.a(0.1f);
        canvas.save();
        float width = getWidth() - AndroidUtilities.dp(42.0f);
        float height = getHeight() - AndroidUtilities.dp(34.0f);
        float width2 = getWidth() - AndroidUtilities.dp(12.0f);
        float height2 = getHeight() - AndroidUtilities.dp(4.0f);
        RectF rectF = this.r;
        rectF.set(width, height, width2, height2);
        RectF rectF2 = this.s;
        rectF2.set(rectF);
        rectF2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        a(canvas, rectF, rectF.width() / 2.0f, 1.0f);
        float dp = AndroidUtilities.dp(2.0f);
        Paint paint = this.v;
        paint.setStrokeWidth(dp);
        paint.setAlpha(255);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) - AndroidUtilities.dp(0.9f), paint);
        f01 f01Var = this.w;
        p4 p4Var = this.b;
        if (f01Var != null) {
            f01Var.c(rectF.centerX() - (this.w.c / 2.0f), rectF.centerY() - AndroidUtilities.dp(0.6f), 1.0f - p4Var.getAlpha(), -1, canvas);
        }
        if (p4Var.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            paint.setAlpha((int) (p4Var.getAlpha() * 255.0f));
            canvas.drawPath(this.x, paint);
            canvas.restore();
        }
        canvas.restore();
        if (this.K != null) {
            float e7 = this.J.e(this.I);
            if (e7 > 0.0f) {
                float lerp = AndroidUtilities.lerp(0.6f, 1.0f, e7);
                float l4 = this.K.l() + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(11.0f);
                float dp2 = AndroidUtilities.dp(32.0f);
                float f7 = rectF.right - l4;
                float dp3 = (rectF.top - AndroidUtilities.dp(9.66f)) - dp2;
                float f10 = rectF.right;
                float dp4 = rectF.top - AndroidUtilities.dp(9.66f);
                RectF rectF3 = this.F;
                rectF3.set(f7, dp3, f10, dp4);
                rectF3.set(rectF3.right - (rectF3.width() * lerp), rectF3.bottom - (rectF3.height() * lerp), rectF3.right, rectF3.bottom);
                rectF3.offset(0.0f, (1.0f - e7) * AndroidUtilities.dp(4.0f));
                Path path = this.H;
                path.rewind();
                float dp5 = AndroidUtilities.dp(8.0f);
                float f11 = rectF3.left;
                float f12 = rectF3.top;
                RectF rectF4 = this.G;
                rectF4.set(f11, f12, f11 + dp5, f12 + dp5);
                path.arcTo(rectF4, 180.0f, 90.0f, false);
                float f13 = rectF3.right;
                float f14 = rectF3.top;
                rectF4.set(f13 - dp5, f14, f13, f14 + dp5);
                path.arcTo(rectF4, 270.0f, 90.0f, false);
                float f15 = rectF3.right;
                float f16 = rectF3.bottom;
                rectF4.set(f15 - dp5, f16 - dp5, f15, f16);
                path.arcTo(rectF4, 0.0f, 90.0f, false);
                path.lineTo(rectF3.right - AndroidUtilities.dp(8.0f), rectF3.bottom);
                path.lineTo(rectF3.right - AndroidUtilities.dp(14.5f), rectF3.bottom + AndroidUtilities.dp(5.66f));
                path.lineTo(rectF3.right - AndroidUtilities.dp(21.0f), rectF3.bottom);
                float f17 = rectF3.left;
                float f18 = rectF3.bottom;
                rectF4.set(f17, f18 - dp5, f17 + dp5, f18);
                path.arcTo(rectF4, 90.0f, 90.0f, false);
                path.close();
                rectF3.bottom += AndroidUtilities.dp(5.66f);
                canvas.save();
                canvas.clipPath(path);
                a(canvas, rectF3, dp5, e7);
                canvas.restore();
                canvas.save();
                canvas.scale(lerp, lerp, rectF3.right, rectF3.bottom);
                this.K.c((rectF.right - l4) + AndroidUtilities.dp(11.0f), (rectF.top - AndroidUtilities.dp(9.66f)) - (dp2 / 2.0f), e7, -1, canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        p4 p4Var = this.b;
        if (view != p4Var) {
            return super.drawChild(canvas, view, j3);
        }
        float x10 = p4Var.getX();
        float y3 = p4Var.getY();
        float x11 = p4Var.getX() + p4Var.getWidth();
        float y10 = p4Var.getY() + p4Var.getHeight();
        RectF rectF = this.y;
        rectF.set(x10, y3, x11, y10);
        AndroidUtilities.scaleRect(rectF, p4Var.getScaleX(), p4Var.getPivotX() + p4Var.getX(), p4Var.getPivotY() + p4Var.getY());
        a(canvas, rectF, AndroidUtilities.dp(10.0f), p4Var.getAlpha());
        Path path = this.L;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        p4 p4Var = this.b;
        p4Var.setPivotX(p4Var.getWidth() - AndroidUtilities.dp(15.0f));
        p4Var.setPivotY(p4Var.getHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(176.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.r.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        org.telegram.ui.Components.zc zcVar = this.n;
        if (action == 0) {
            zcVar.c(contains);
            if (this.M && !contains) {
                if (!this.y.contains(motionEvent.getX(), motionEvent.getY())) {
                    c(false, true);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                zcVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (zcVar.h) {
                c(!this.M, true);
            }
            zcVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            zcVar.c(false);
        }
        return zcVar.h || super.onTouchEvent(motionEvent);
    }

    public void setSelected(int i10) {
        if (this.f == i10) {
            return;
        }
        this.f = i10;
        AndroidUtilities.forEachViews((RecyclerView) this.b, (e2.h) new m4(this, i10, 0));
    }
}
