package nh;

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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.zz0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public abstract class g4 extends FrameLayout {
    public final Paint A;
    public final RectF B;
    public final RectF C;
    public final Path D;
    public boolean E;
    public final org.telegram.ui.Components.d6 F;
    public zz0 G;
    public final Path H;
    public boolean I;
    public final org.telegram.ui.Components.ka a;
    public final b4 b;
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;
    public int f;
    public final lh.m5 h;
    public final uc n;
    public final RectF r;
    public final RectF s;
    public final Paint v;
    public zz0 w;
    public final Path x;
    public final RectF y;

    /* JADX WARN: Type inference failed for: r5v0, types: [nh.a4] */
    public g4(Context context, lh.b bVar, org.telegram.ui.Components.ga gaVar) {
        super(context);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        final y9 y9Var = (y9) this;
        this.h = new lh.m5(y9Var, 29);
        this.n = new uc(this);
        this.r = new RectF();
        this.s = new RectF();
        Paint paint = new Paint(1);
        this.v = paint;
        Path path = new Path();
        this.x = path;
        this.y = new RectF();
        this.A = new Paint(1);
        this.B = new RectF();
        this.C = new RectF();
        this.D = new Path();
        this.F = new org.telegram.ui.Components.d6(this, 0L, 320L, jr.h);
        this.H = new Path();
        this.I = true;
        path.rewind();
        path.moveTo(-AndroidUtilities.dp(4.33f), -AndroidUtilities.dp(4.33f));
        path.lineTo(AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f));
        path.moveTo(-AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f));
        path.lineTo(AndroidUtilities.dp(4.33f), -AndroidUtilities.dp(4.33f));
        this.a = new org.telegram.ui.Components.ka(gaVar, this, 0, !y9Var.K.n0.c());
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(44.0f));
        final int i10 = 0;
        b4 b4Var = new b4(y9Var, context, UserConfig.selectedAccount, new Utilities.Callback2() { // from class: nh.a4
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                int i11 = i10;
                int i12 = 0;
                y9 y9Var2 = y9Var;
                switch (i11) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        k51 k51Var = (k51) obj2;
                        k51Var.M();
                        int i13 = 0;
                        for (int i14 = 0; i14 < y9Var2.d.size(); i14++) {
                            Integer num = (Integer) y9Var2.d.get(i14);
                            int intValue = num.intValue();
                            o7 o7Var = (o7) y9Var2.c.get(intValue);
                            int i15 = e4.a;
                            w41 J = w41.J(e4.class);
                            J.d = intValue;
                            J.G = o7Var;
                            J.z = i13;
                            J.K(y9Var2.f == intValue);
                            J.f = y9Var2.e.contains(num);
                            J.D = new jh.y0(y9Var2, intValue, 2);
                            arrayList.add(J);
                            if (y9Var2.e.contains(num)) {
                                i13++;
                            }
                        }
                        k51Var.L();
                        break;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        y9Var2.d.clear();
                        int size = arrayList2.size();
                        while (i12 < size) {
                            Object obj3 = arrayList2.get(i12);
                            i12++;
                            y9Var2.d.add(Integer.valueOf(((w41) obj3).d));
                        }
                        AndroidUtilities.forEachViews((RecyclerView) y9Var2.b, (f5.d) new kg.i(y9Var2, 4));
                        break;
                }
            }
        }, new l4.s0(y9Var, 15), bVar);
        this.b = b4Var;
        b4Var.U2.r = false;
        b4Var.setClipToPadding(false);
        b4Var.setClipChildren(false);
        b4Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        addView(b4Var, i7.f6.e(-2, 120, 85));
        b4Var.w1(true);
        final int i11 = 1;
        b4Var.B1(new Utilities.Callback2() { // from class: nh.a4
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                int i112 = i11;
                int i12 = 0;
                y9 y9Var2 = y9Var;
                switch (i112) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        k51 k51Var = (k51) obj2;
                        k51Var.M();
                        int i13 = 0;
                        for (int i14 = 0; i14 < y9Var2.d.size(); i14++) {
                            Integer num = (Integer) y9Var2.d.get(i14);
                            int intValue = num.intValue();
                            o7 o7Var = (o7) y9Var2.c.get(intValue);
                            int i15 = e4.a;
                            w41 J = w41.J(e4.class);
                            J.d = intValue;
                            J.G = o7Var;
                            J.z = i13;
                            J.K(y9Var2.f == intValue);
                            J.f = y9Var2.e.contains(num);
                            J.D = new jh.y0(y9Var2, intValue, 2);
                            arrayList.add(J);
                            if (y9Var2.e.contains(num)) {
                                i13++;
                            }
                        }
                        k51Var.L();
                        break;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        y9Var2.d.clear();
                        int size = arrayList2.size();
                        while (i12 < size) {
                            Object obj3 = arrayList2.get(i12);
                            i12++;
                            y9Var2.d.add(Integer.valueOf(((w41) obj3).d));
                        }
                        AndroidUtilities.forEachViews((RecyclerView) y9Var2.b, (f5.d) new kg.i(y9Var2, 4));
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

    public final void a(Canvas canvas, RectF rectF, float f9, float f10) {
        if (f10 < 1.0f) {
            canvas.saveLayerAlpha(rectF, (int) (255.0f * f10), 31);
        }
        y9 y9Var = (y9) this;
        boolean c3 = y9Var.K.n0.c();
        org.telegram.ui.Components.ka kaVar = this.a;
        Paint paint = this.A;
        if (c3) {
            if (canvas.isHardwareAccelerated()) {
                canvas.save();
                Path path = y9Var.J;
                path.rewind();
                path.addRoundRect(rectF, f9, f9, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.translate(0.0f, 0.0f);
                kaVar.b(canvas, true);
                canvas.restore();
            }
            paint.setAlpha(38);
            canvas.drawRoundRect(rectF, f9, f9, paint);
        } else {
            Paint[] d = kaVar.d();
            if (d[1] == null) {
                paint.setAlpha(128);
                canvas.drawRoundRect(rectF, f9, f9, paint);
            } else {
                Paint paint2 = d[0];
                if (paint2 != null) {
                    canvas.drawRoundRect(rectF, f9, f9, paint2);
                }
                Paint paint3 = d[1];
                if (paint3 != null) {
                    canvas.drawRoundRect(rectF, f9, f9, paint3);
                }
                paint.setAlpha((int) (f10 * 51.0f));
                canvas.drawRoundRect(rectF, f9, f9, paint);
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
        if (this.I == z10) {
            return;
        }
        this.I = z10;
        b4 b4Var = this.b;
        b4Var.animate().cancel();
        if (z11) {
            b4Var.setVisibility(0);
            org.telegram.ui.b.q(b4Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.65f).scaleY(z10 ? 1.0f : 0.65f).setListener(new bg.z2(14, this, z10)).setUpdateListener(new lh.d5(this, 9)), jr.h, 360L);
        } else {
            b4Var.setVisibility(z10 ? 0 : 8);
            b4Var.setAlpha(z10 ? 1.0f : 0.0f);
            b4Var.setScaleX(z10 ? 1.0f : 0.65f);
            b4Var.setScaleY(z10 ? 1.0f : 0.65f);
            invalidate();
        }
        if (z10 && this.E) {
            this.E = false;
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
        zz0 zz0Var = this.w;
        b4 b4Var = this.b;
        if (zz0Var != null) {
            zz0Var.c(rectF.centerX() - (this.w.c / 2.0f), rectF.centerY() - AndroidUtilities.dp(0.6f), 1.0f - b4Var.getAlpha(), -1, canvas);
        }
        if (b4Var.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            paint.setAlpha((int) (b4Var.getAlpha() * 255.0f));
            canvas.drawPath(this.x, paint);
            canvas.restore();
        }
        canvas.restore();
        if (this.G != null) {
            float e10 = this.F.e(this.E);
            if (e10 > 0.0f) {
                float lerp = AndroidUtilities.lerp(0.6f, 1.0f, e10);
                float l10 = this.G.l() + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(11.0f);
                float dp2 = AndroidUtilities.dp(32.0f);
                float f9 = rectF.right - l10;
                float dp3 = (rectF.top - AndroidUtilities.dp(9.66f)) - dp2;
                float f10 = rectF.right;
                float dp4 = rectF.top - AndroidUtilities.dp(9.66f);
                RectF rectF3 = this.B;
                rectF3.set(f9, dp3, f10, dp4);
                rectF3.set(rectF3.right - (rectF3.width() * lerp), rectF3.bottom - (rectF3.height() * lerp), rectF3.right, rectF3.bottom);
                rectF3.offset(0.0f, (1.0f - e10) * AndroidUtilities.dp(4.0f));
                Path path = this.D;
                path.rewind();
                float dp5 = AndroidUtilities.dp(8.0f);
                float f11 = rectF3.left;
                float f12 = rectF3.top;
                RectF rectF4 = this.C;
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
                a(canvas, rectF3, dp5, e10);
                canvas.restore();
                canvas.save();
                canvas.scale(lerp, lerp, rectF3.right, rectF3.bottom);
                this.G.c((rectF.right - l10) + AndroidUtilities.dp(11.0f), (rectF.top - AndroidUtilities.dp(9.66f)) - (dp2 / 2.0f), e10, -1, canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        b4 b4Var = this.b;
        if (view != b4Var) {
            return super.drawChild(canvas, view, j10);
        }
        float x4 = b4Var.getX();
        float y8 = b4Var.getY();
        float x10 = b4Var.getX() + b4Var.getWidth();
        float y10 = b4Var.getY() + b4Var.getHeight();
        RectF rectF = this.y;
        rectF.set(x4, y8, x10, y10);
        AndroidUtilities.scaleRect(rectF, b4Var.getScaleX(), b4Var.getPivotX() + b4Var.getX(), b4Var.getPivotY() + b4Var.getY());
        a(canvas, rectF, AndroidUtilities.dp(10.0f), b4Var.getAlpha());
        Path path = this.H;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b4 b4Var = this.b;
        b4Var.setPivotX(b4Var.getWidth() - AndroidUtilities.dp(15.0f));
        b4Var.setPivotY(b4Var.getHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(176.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.r.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        uc ucVar = this.n;
        if (action == 0) {
            ucVar.c(contains);
            if (this.I && !contains) {
                if (!this.y.contains(motionEvent.getX(), motionEvent.getY())) {
                    c(false, true);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                ucVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (ucVar.h) {
                c(!this.I, true);
            }
            ucVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            ucVar.c(false);
        }
        return ucVar.h || super.onTouchEvent(motionEvent);
    }

    public void setSelected(int i10) {
        if (this.f == i10) {
            return;
        }
        this.f = i10;
        AndroidUtilities.forEachViews((RecyclerView) this.b, (f5.d) new z3(this, i10, 0));
    }
}
