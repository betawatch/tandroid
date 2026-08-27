package lh;

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
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.pz0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public abstract class k4 extends FrameLayout {
    public final Paint A;
    public final RectF B;
    public final RectF C;
    public final Path D;
    public boolean E;
    public final org.telegram.ui.Components.y5 F;
    public pz0 G;
    public final Path H;
    public boolean I;
    public final org.telegram.ui.Components.da a;
    public final f4 b;
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;
    public int f;
    public final kh.c h;
    public final org.telegram.ui.Components.nc n;
    public final RectF r;
    public final RectF s;
    public final Paint v;
    public pz0 w;
    public final Path x;
    public final RectF y;

    /* JADX WARN: Type inference failed for: r5v0, types: [lh.e4] */
    public k4(Context context, jh.b bVar, org.telegram.ui.Components.z9 z9Var) {
        super(context);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        final ka kaVar = (ka) this;
        this.h = new kh.c(kaVar, 15);
        this.n = new org.telegram.ui.Components.nc(this);
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
        this.F = new org.telegram.ui.Components.y5(this, 0L, 320L, er.h);
        this.H = new Path();
        this.I = true;
        path.rewind();
        path.moveTo(-AndroidUtilities.dp(4.33f), -AndroidUtilities.dp(4.33f));
        path.lineTo(AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f));
        path.moveTo(-AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f));
        path.lineTo(AndroidUtilities.dp(4.33f), -AndroidUtilities.dp(4.33f));
        this.a = new org.telegram.ui.Components.da(z9Var, this, 0, !kaVar.K.n0.c());
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(44.0f));
        final int i10 = 0;
        f4 f4Var = new f4(kaVar, context, UserConfig.selectedAccount, new Utilities.Callback2() { // from class: lh.e4
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                int i11 = i10;
                int i12 = 0;
                ka kaVar2 = kaVar;
                switch (i11) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        b51 b51Var = (b51) obj2;
                        b51Var.M();
                        int i13 = 0;
                        for (int i14 = 0; i14 < kaVar2.d.size(); i14++) {
                            Integer num = (Integer) kaVar2.d.get(i14);
                            int intValue = num.intValue();
                            z7 z7Var = (z7) kaVar2.c.get(intValue);
                            int i15 = i4.a;
                            n41 J = n41.J(i4.class);
                            J.d = intValue;
                            J.G = z7Var;
                            J.z = i13;
                            J.K(kaVar2.f == intValue);
                            J.f = kaVar2.e.contains(num);
                            J.D = new hh.z0(kaVar2, intValue, 2);
                            arrayList.add(J);
                            if (kaVar2.e.contains(num)) {
                                i13++;
                            }
                        }
                        b51Var.L();
                        break;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        kaVar2.d.clear();
                        int size = arrayList2.size();
                        while (i12 < size) {
                            Object obj3 = arrayList2.get(i12);
                            i12++;
                            kaVar2.d.add(Integer.valueOf(((n41) obj3).d));
                        }
                        AndroidUtilities.forEachViews((RecyclerView) kaVar2.b, (d5.d) new ig.i(kaVar2, 4));
                        break;
                }
            }
        }, new p(kaVar, 3), bVar);
        this.b = f4Var;
        f4Var.U2.r = false;
        f4Var.setClipToPadding(false);
        f4Var.setClipChildren(false);
        f4Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        addView(f4Var, h7.z5.e(-2, 120, 85));
        f4Var.w1(true);
        final int i11 = 1;
        f4Var.B1(new Utilities.Callback2() { // from class: lh.e4
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                int i112 = i11;
                int i12 = 0;
                ka kaVar2 = kaVar;
                switch (i112) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        b51 b51Var = (b51) obj2;
                        b51Var.M();
                        int i13 = 0;
                        for (int i14 = 0; i14 < kaVar2.d.size(); i14++) {
                            Integer num = (Integer) kaVar2.d.get(i14);
                            int intValue = num.intValue();
                            z7 z7Var = (z7) kaVar2.c.get(intValue);
                            int i15 = i4.a;
                            n41 J = n41.J(i4.class);
                            J.d = intValue;
                            J.G = z7Var;
                            J.z = i13;
                            J.K(kaVar2.f == intValue);
                            J.f = kaVar2.e.contains(num);
                            J.D = new hh.z0(kaVar2, intValue, 2);
                            arrayList.add(J);
                            if (kaVar2.e.contains(num)) {
                                i13++;
                            }
                        }
                        b51Var.L();
                        break;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        kaVar2.d.clear();
                        int size = arrayList2.size();
                        while (i12 < size) {
                            Object obj3 = arrayList2.get(i12);
                            i12++;
                            kaVar2.d.add(Integer.valueOf(((n41) obj3).d));
                        }
                        AndroidUtilities.forEachViews((RecyclerView) kaVar2.b, (d5.d) new ig.i(kaVar2, 4));
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
        ka kaVar = (ka) this;
        boolean c10 = kaVar.K.n0.c();
        org.telegram.ui.Components.da daVar = this.a;
        Paint paint = this.A;
        if (c10) {
            if (canvas.isHardwareAccelerated()) {
                canvas.save();
                Path path = kaVar.J;
                path.rewind();
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.translate(0.0f, 0.0f);
                daVar.b(canvas, true);
                canvas.restore();
            }
            paint.setAlpha(38);
            canvas.drawRoundRect(rectF, f10, f10, paint);
        } else {
            Paint[] d = daVar.d();
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
        f4 f4Var = this.b;
        f4Var.animate().cancel();
        if (z11) {
            f4Var.setVisibility(0);
            rl.o(f4Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.65f).scaleY(z10 ? 1.0f : 0.65f).setListener(new ag.x(13, this, z10)).setUpdateListener(new m2(this, 3)), er.h, 360L);
        } else {
            f4Var.setVisibility(z10 ? 0 : 8);
            f4Var.setAlpha(z10 ? 1.0f : 0.0f);
            f4Var.setScaleX(z10 ? 1.0f : 0.65f);
            f4Var.setScaleY(z10 ? 1.0f : 0.65f);
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
        pz0 pz0Var = this.w;
        f4 f4Var = this.b;
        if (pz0Var != null) {
            pz0Var.c(rectF.centerX() - (this.w.c / 2.0f), rectF.centerY() - AndroidUtilities.dp(0.6f), 1.0f - f4Var.getAlpha(), -1, canvas);
        }
        if (f4Var.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            paint.setAlpha((int) (f4Var.getAlpha() * 255.0f));
            canvas.drawPath(this.x, paint);
            canvas.restore();
        }
        canvas.restore();
        if (this.G != null) {
            float e9 = this.F.e(this.E);
            if (e9 > 0.0f) {
                float lerp = AndroidUtilities.lerp(0.6f, 1.0f, e9);
                float l10 = this.G.l() + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(11.0f);
                float dp2 = AndroidUtilities.dp(32.0f);
                float f10 = rectF.right - l10;
                float dp3 = (rectF.top - AndroidUtilities.dp(9.66f)) - dp2;
                float f11 = rectF.right;
                float dp4 = rectF.top - AndroidUtilities.dp(9.66f);
                RectF rectF3 = this.B;
                rectF3.set(f10, dp3, f11, dp4);
                rectF3.set(rectF3.right - (rectF3.width() * lerp), rectF3.bottom - (rectF3.height() * lerp), rectF3.right, rectF3.bottom);
                rectF3.offset(0.0f, (1.0f - e9) * AndroidUtilities.dp(4.0f));
                Path path = this.D;
                path.rewind();
                float dp5 = AndroidUtilities.dp(8.0f);
                float f12 = rectF3.left;
                float f13 = rectF3.top;
                RectF rectF4 = this.C;
                rectF4.set(f12, f13, f12 + dp5, f13 + dp5);
                path.arcTo(rectF4, 180.0f, 90.0f, false);
                float f14 = rectF3.right;
                float f15 = rectF3.top;
                rectF4.set(f14 - dp5, f15, f14, f15 + dp5);
                path.arcTo(rectF4, 270.0f, 90.0f, false);
                float f16 = rectF3.right;
                float f17 = rectF3.bottom;
                rectF4.set(f16 - dp5, f17 - dp5, f16, f17);
                path.arcTo(rectF4, 0.0f, 90.0f, false);
                path.lineTo(rectF3.right - AndroidUtilities.dp(8.0f), rectF3.bottom);
                path.lineTo(rectF3.right - AndroidUtilities.dp(14.5f), rectF3.bottom + AndroidUtilities.dp(5.66f));
                path.lineTo(rectF3.right - AndroidUtilities.dp(21.0f), rectF3.bottom);
                float f18 = rectF3.left;
                float f19 = rectF3.bottom;
                rectF4.set(f18, f19 - dp5, f18 + dp5, f19);
                path.arcTo(rectF4, 90.0f, 90.0f, false);
                path.close();
                rectF3.bottom += AndroidUtilities.dp(5.66f);
                canvas.save();
                canvas.clipPath(path);
                a(canvas, rectF3, dp5, e9);
                canvas.restore();
                canvas.save();
                canvas.scale(lerp, lerp, rectF3.right, rectF3.bottom);
                this.G.c((rectF.right - l10) + AndroidUtilities.dp(11.0f), (rectF.top - AndroidUtilities.dp(9.66f)) - (dp2 / 2.0f), e9, -1, canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        f4 f4Var = this.b;
        if (view != f4Var) {
            return super.drawChild(canvas, view, j10);
        }
        float x8 = f4Var.getX();
        float y10 = f4Var.getY();
        float x10 = f4Var.getX() + f4Var.getWidth();
        float y11 = f4Var.getY() + f4Var.getHeight();
        RectF rectF = this.y;
        rectF.set(x8, y10, x10, y11);
        AndroidUtilities.scaleRect(rectF, f4Var.getScaleX(), f4Var.getPivotX() + f4Var.getX(), f4Var.getPivotY() + f4Var.getY());
        a(canvas, rectF, AndroidUtilities.dp(10.0f), f4Var.getAlpha());
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
        f4 f4Var = this.b;
        f4Var.setPivotX(f4Var.getWidth() - AndroidUtilities.dp(15.0f));
        f4Var.setPivotY(f4Var.getHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(176.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.r.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        org.telegram.ui.Components.nc ncVar = this.n;
        if (action == 0) {
            ncVar.c(contains);
            if (this.I && !contains) {
                if (!this.y.contains(motionEvent.getX(), motionEvent.getY())) {
                    c(false, true);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                ncVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (ncVar.h) {
                c(!this.I, true);
            }
            ncVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            ncVar.c(false);
        }
        return ncVar.h || super.onTouchEvent(motionEvent);
    }

    public void setSelected(int i10) {
        if (this.f == i10) {
            return;
        }
        this.f = i10;
        AndroidUtilities.forEachViews((RecyclerView) this.b, (d5.d) new d4(this, i10, 0));
    }
}
