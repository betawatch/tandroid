package ei;

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
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.i11;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public abstract class l4 extends FrameLayout {
    public final Paint E;
    public final RectF F;
    public final RectF G;
    public final Path H;
    public boolean I;
    public final org.telegram.ui.Components.f6 J;
    public i11 K;
    public final Path L;
    public boolean M;
    public final org.telegram.ui.Components.na a;
    public final g4 b;
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;
    public int f;
    public final com.google.firebase.messaging.s h;
    public final yc n;
    public final RectF r;
    public final RectF s;
    public final Paint v;
    public i11 w;
    public final Path x;
    public final RectF y;

    /* JADX WARN: Type inference failed for: r5v0, types: [ei.f4] */
    public l4(Context context, ci.b bVar, org.telegram.ui.Components.ja jaVar) {
        super(context);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        final ma maVar = (ma) this;
        this.h = new com.google.firebase.messaging.s(maVar, 18);
        this.n = new yc(this);
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
        this.J = new org.telegram.ui.Components.f6(this, 0L, 320L, bs.h);
        this.L = new Path();
        this.M = true;
        path.rewind();
        path.moveTo(-AndroidUtilities.dp(4.33f), -AndroidUtilities.dp(4.33f));
        path.lineTo(AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f));
        path.moveTo(-AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f));
        path.lineTo(AndroidUtilities.dp(4.33f), -AndroidUtilities.dp(4.33f));
        this.a = new org.telegram.ui.Components.na(jaVar, this, 0, !maVar.O.r0.c());
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(44.0f));
        final int i10 = 0;
        g4 g4Var = new g4(maVar, context, UserConfig.selectedAccount, new Utilities.Callback2() { // from class: ei.f4
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                int i11 = i10;
                int i12 = 0;
                ma maVar2 = maVar;
                switch (i11) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        b71 b71Var = (b71) obj2;
                        b71Var.M();
                        int i13 = 0;
                        for (int i14 = 0; i14 < maVar2.d.size(); i14++) {
                            Integer num = (Integer) maVar2.d.get(i14);
                            int intValue = num.intValue();
                            a8 a8Var = (a8) maVar2.c.get(intValue);
                            int i15 = j4.a;
                            m61 J = m61.J(j4.class);
                            J.d = intValue;
                            J.G = a8Var;
                            J.z = i13;
                            J.K(maVar2.f == intValue);
                            J.f = maVar2.e.contains(num);
                            J.D = new ai.n1(maVar2, intValue, 2);
                            arrayList.add(J);
                            if (maVar2.e.contains(num)) {
                                i13++;
                            }
                        }
                        b71Var.L();
                        break;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        maVar2.d.clear();
                        int size = arrayList2.size();
                        while (i12 < size) {
                            Object obj3 = arrayList2.get(i12);
                            i12++;
                            maVar2.d.add(Integer.valueOf(((m61) obj3).d));
                        }
                        AndroidUtilities.forEachViews((RecyclerView) maVar2.b, (Utilities.Callback<View>) new ai.r0(maVar2, 16));
                        break;
                }
            }
        }, new e1.c(maVar, 5), bVar);
        this.b = g4Var;
        g4Var.Z2.r = false;
        g4Var.setClipToPadding(false);
        g4Var.setClipChildren(false);
        g4Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        addView(g4Var, w7.z5.e(-2, 120, 85));
        g4Var.C1(true);
        final int i11 = 1;
        g4Var.H1(new Utilities.Callback2() { // from class: ei.f4
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                int i112 = i11;
                int i12 = 0;
                ma maVar2 = maVar;
                switch (i112) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        b71 b71Var = (b71) obj2;
                        b71Var.M();
                        int i13 = 0;
                        for (int i14 = 0; i14 < maVar2.d.size(); i14++) {
                            Integer num = (Integer) maVar2.d.get(i14);
                            int intValue = num.intValue();
                            a8 a8Var = (a8) maVar2.c.get(intValue);
                            int i15 = j4.a;
                            m61 J = m61.J(j4.class);
                            J.d = intValue;
                            J.G = a8Var;
                            J.z = i13;
                            J.K(maVar2.f == intValue);
                            J.f = maVar2.e.contains(num);
                            J.D = new ai.n1(maVar2, intValue, 2);
                            arrayList.add(J);
                            if (maVar2.e.contains(num)) {
                                i13++;
                            }
                        }
                        b71Var.L();
                        break;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        maVar2.d.clear();
                        int size = arrayList2.size();
                        while (i12 < size) {
                            Object obj3 = arrayList2.get(i12);
                            i12++;
                            maVar2.d.add(Integer.valueOf(((m61) obj3).d));
                        }
                        AndroidUtilities.forEachViews((RecyclerView) maVar2.b, (Utilities.Callback<View>) new ai.r0(maVar2, 16));
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
        ma maVar = (ma) this;
        boolean c10 = maVar.O.r0.c();
        org.telegram.ui.Components.na naVar = this.a;
        Paint paint = this.E;
        if (c10) {
            if (canvas.isHardwareAccelerated()) {
                canvas.save();
                Path path = maVar.N;
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
        g4 g4Var = this.b;
        g4Var.animate().cancel();
        if (z11) {
            g4Var.setVisibility(0);
            sl.t(g4Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.65f).scaleY(z10 ? 1.0f : 0.65f).setListener(new ah.p0(11, this, z10)).setUpdateListener(new ah.c0(this, 28)), bs.h, 360L);
        } else {
            g4Var.setVisibility(z10 ? 0 : 8);
            g4Var.setAlpha(z10 ? 1.0f : 0.0f);
            g4Var.setScaleX(z10 ? 1.0f : 0.65f);
            g4Var.setScaleY(z10 ? 1.0f : 0.65f);
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
        i11 i11Var = this.w;
        g4 g4Var = this.b;
        if (i11Var != null) {
            i11Var.c(rectF.centerX() - (this.w.c / 2.0f), rectF.centerY() - AndroidUtilities.dp(0.6f), 1.0f - g4Var.getAlpha(), -1, canvas);
        }
        if (g4Var.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            paint.setAlpha((int) (g4Var.getAlpha() * 255.0f));
            canvas.drawPath(this.x, paint);
            canvas.restore();
        }
        canvas.restore();
        if (this.K != null) {
            float e = this.J.e(this.I);
            if (e > 0.0f) {
                float lerp = AndroidUtilities.lerp(0.6f, 1.0f, e);
                float l4 = this.K.l() + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(11.0f);
                float dp2 = AndroidUtilities.dp(32.0f);
                float f7 = rectF.right - l4;
                float dp3 = (rectF.top - AndroidUtilities.dp(9.66f)) - dp2;
                float f10 = rectF.right;
                float dp4 = rectF.top - AndroidUtilities.dp(9.66f);
                RectF rectF3 = this.F;
                rectF3.set(f7, dp3, f10, dp4);
                rectF3.set(rectF3.right - (rectF3.width() * lerp), rectF3.bottom - (rectF3.height() * lerp), rectF3.right, rectF3.bottom);
                rectF3.offset(0.0f, (1.0f - e) * AndroidUtilities.dp(4.0f));
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
                a(canvas, rectF3, dp5, e);
                canvas.restore();
                canvas.save();
                canvas.scale(lerp, lerp, rectF3.right, rectF3.bottom);
                this.K.c((rectF.right - l4) + AndroidUtilities.dp(11.0f), (rectF.top - AndroidUtilities.dp(9.66f)) - (dp2 / 2.0f), e, -1, canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        g4 g4Var = this.b;
        if (view != g4Var) {
            return super.drawChild(canvas, view, j10);
        }
        float x10 = g4Var.getX();
        float y3 = g4Var.getY();
        float x11 = g4Var.getX() + g4Var.getWidth();
        float y10 = g4Var.getY() + g4Var.getHeight();
        RectF rectF = this.y;
        rectF.set(x10, y3, x11, y10);
        AndroidUtilities.scaleRect(rectF, g4Var.getScaleX(), g4Var.getPivotX() + g4Var.getX(), g4Var.getPivotY() + g4Var.getY());
        a(canvas, rectF, AndroidUtilities.dp(10.0f), g4Var.getAlpha());
        Path path = this.L;
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
        g4 g4Var = this.b;
        g4Var.setPivotX(g4Var.getWidth() - AndroidUtilities.dp(15.0f));
        g4Var.setPivotY(g4Var.getHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(176.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.r.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        yc ycVar = this.n;
        if (action == 0) {
            ycVar.c(contains);
            if (this.M && !contains) {
                if (!this.y.contains(motionEvent.getX(), motionEvent.getY())) {
                    c(false, true);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                ycVar.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (ycVar.i) {
                c(!this.M, true);
            }
            ycVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            ycVar.c(false);
        }
        return ycVar.i || super.onTouchEvent(motionEvent);
    }

    public void setSelected(int i10) {
        if (this.f == i10) {
            return;
        }
        this.f = i10;
        AndroidUtilities.forEachViews((RecyclerView) this.b, (Utilities.Callback<View>) new e4(this, i10, 0));
    }
}
