// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public abstract class dh7 extends FrameLayout {
    public final RectF E;
    public final Paint F;
    public final RectF G;
    public final RectF H;
    public final Path I;
    public boolean J;
    public final lm K;
    public tgb L;
    public final Path M;
    public boolean N;
    public final wl0 a;
    public final va b;
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;
    public int f;
    public final vl6 h;
    public final n41 n;
    public final RectF r;
    public final RectF s;
    public final Paint w;
    public tgb x;
    public final Path y;

    /* JADX WARN: Type inference failed for: r5v0, types: [yg7] */
    public dh7(Context context, f53 f53Var, sl0 sl0Var) {
        super(context);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        final p6b p6bVar = (p6b) this;
        this.h = new vl6(p6bVar, (byte) 19);
        this.n = new n41(this);
        this.r = new RectF();
        this.s = new RectF();
        final byte b = 1;
        Paint paint = new Paint(1);
        this.w = paint;
        Path path = new Path();
        this.y = path;
        this.E = new RectF();
        this.F = new Paint(1);
        this.G = new RectF();
        this.H = new RectF();
        this.I = new Path();
        this.K = new lm(this, 0L, 320L, s33.h);
        this.M = new Path();
        this.N = true;
        path.rewind();
        path.moveTo(-gl.L(4.33f), -gl.L(4.33f));
        path.lineTo(gl.L(4.33f), gl.L(4.33f));
        path.moveTo(-gl.L(4.33f), gl.L(4.33f));
        path.lineTo(gl.L(4.33f), -gl.L(4.33f));
        final byte b2 = 0;
        this.a = new wl0(sl0Var, this, 0, !p6bVar.P.s0.c());
        setPadding(gl.L(12.0f), gl.L(12.0f), gl.L(12.0f), gl.L(44.0f));
        va vaVar = new va(p6bVar, context, y6c.t0, (yg7) new i8c() { // from class: yg7
            @Override // i8c
            public final void a(Object obj, Object obj2) {
                byte b3 = b2;
                int i = 0;
                p6b p6bVar2 = p6bVar;
                switch (b3) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        l5c l5cVar = (l5c) obj2;
                        l5cVar.M();
                        int i2 = 0;
                        for (int i3 = 0; i3 < p6bVar2.d.size(); i3++) {
                            Integer num = (Integer) p6bVar2.d.get(i3);
                            int intValue = num.intValue();
                            f4b f4bVar = (f4b) p6bVar2.c.get(intValue);
                            int i4 = bh7.b;
                            c4c K = c4c.K(bh7.class);
                            K.d = intValue;
                            K.H = f4bVar;
                            K.A = i2;
                            K.L(p6bVar2.f == intValue);
                            K.f = p6bVar2.e.contains(num);
                            K.E = new v0(p6bVar2, intValue, (byte) 11);
                            arrayList.add(K);
                            if (p6bVar2.e.contains(num)) {
                                i2++;
                            }
                        }
                        l5cVar.L();
                        break;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        p6bVar2.d.clear();
                        int size = arrayList2.size();
                        while (i < size) {
                            Object obj3 = arrayList2.get(i);
                            i++;
                            p6bVar2.d.add(Integer.valueOf(((c4c) obj3).d));
                        }
                        gl.d0(p6bVar2.b, new zf7(p6bVar2, (byte) 1));
                        break;
                }
            }
        }, new im6(p6bVar, (byte) 11), f53Var);
        this.b = vaVar;
        vaVar.g3.r = false;
        vaVar.setClipToPadding(false);
        vaVar.setClipChildren(false);
        vaVar.setPadding(gl.L(2.0f), 0, gl.L(2.0f), 0);
        addView(vaVar, nme.e(-2, 120, 85));
        vaVar.z1(true);
        vaVar.E1(new i8c() { // from class: yg7
            @Override // i8c
            public final void a(Object obj, Object obj2) {
                byte b3 = b;
                int i = 0;
                p6b p6bVar2 = p6bVar;
                switch (b3) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        l5c l5cVar = (l5c) obj2;
                        l5cVar.M();
                        int i2 = 0;
                        for (int i3 = 0; i3 < p6bVar2.d.size(); i3++) {
                            Integer num = (Integer) p6bVar2.d.get(i3);
                            int intValue = num.intValue();
                            f4b f4bVar = (f4b) p6bVar2.c.get(intValue);
                            int i4 = bh7.b;
                            c4c K = c4c.K(bh7.class);
                            K.d = intValue;
                            K.H = f4bVar;
                            K.A = i2;
                            K.L(p6bVar2.f == intValue);
                            K.f = p6bVar2.e.contains(num);
                            K.E = new v0(p6bVar2, intValue, (byte) 11);
                            arrayList.add(K);
                            if (p6bVar2.e.contains(num)) {
                                i2++;
                            }
                        }
                        l5cVar.L();
                        break;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        p6bVar2.d.clear();
                        int size = arrayList2.size();
                        while (i < size) {
                            Object obj3 = arrayList2.get(i);
                            i++;
                            p6bVar2.d.add(Integer.valueOf(((c4c) obj3).d));
                        }
                        gl.d0(p6bVar2.b, new zf7(p6bVar2, (byte) 1));
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

    public final void a(Canvas canvas, RectF rectF, float f, float f2) {
        if (f2 < 1.0f) {
            canvas.saveLayerAlpha(rectF, (int) (255.0f * f2), 31);
        }
        p6b p6bVar = (p6b) this;
        boolean c = p6bVar.P.s0.c();
        Paint paint = this.F;
        wl0 wl0Var = this.a;
        if (c) {
            if (canvas.isHardwareAccelerated()) {
                canvas.save();
                Path path = p6bVar.O;
                path.rewind();
                path.addRoundRect(rectF, f, f, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.translate(0.0f, 0.0f);
                wl0Var.b(canvas, true);
                canvas.restore();
            }
            paint.setAlpha(38);
            canvas.drawRoundRect(rectF, f, f, paint);
        } else {
            Paint[] d = wl0Var.d();
            if (d[1] == null) {
                paint.setAlpha(128);
                canvas.drawRoundRect(rectF, f, f, paint);
            } else {
                Paint paint2 = d[0];
                if (paint2 != null) {
                    canvas.drawRoundRect(rectF, f, f, paint2);
                }
                Paint paint3 = d[1];
                if (paint3 != null) {
                    canvas.drawRoundRect(rectF, f, f, paint3);
                }
                paint.setAlpha((int) (f2 * 51.0f));
                canvas.drawRoundRect(rectF, f, f, paint);
            }
        }
        if (f2 < 1.0f) {
            canvas.restore();
        }
    }

    public final int b(int i) {
        if (!this.d.contains(Integer.valueOf(i))) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < Math.min(i, this.c.size()); i3++) {
            if (this.d.contains(Integer.valueOf(i3))) {
                i2++;
            }
        }
        return i2;
    }

    public final void c(boolean z, boolean z2) {
        if (this.N != z) {
            this.N = z;
            va vaVar = this.b;
            vaVar.animate().cancel();
            if (z2) {
                vaVar.setVisibility(0);
                ug8.t(vaVar.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.65f).scaleY(z ? 1.0f : 0.65f).setListener(new id4((byte) 16, this, z)).setUpdateListener(new ni4(this, (byte) 24)), s33.h, 360L);
            } else {
                vaVar.setVisibility(z ? 0 : 8);
                vaVar.setAlpha(z ? 1.0f : 0.0f);
                vaVar.setScaleX(z ? 1.0f : 0.65f);
                vaVar.setScaleY(z ? 1.0f : 0.65f);
                invalidate();
            }
            if (z && this.J) {
                this.J = false;
                invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float a = this.n.a(0.1f);
        canvas.save();
        float width = getWidth() - gl.L(42.0f);
        float height = getHeight() - gl.L(34.0f);
        float width2 = getWidth() - gl.L(12.0f);
        float height2 = getHeight() - gl.L(4.0f);
        RectF rectF = this.r;
        rectF.set(width, height, width2, height2);
        RectF rectF2 = this.s;
        rectF2.set(rectF);
        rectF2.inset(-gl.L(8.0f), -gl.L(8.0f));
        canvas.scale(a, a, rectF.centerX(), rectF.centerY());
        a(canvas, rectF, rectF.width() / 2.0f, 1.0f);
        float L = gl.L(2.0f);
        Paint paint = this.w;
        paint.setStrokeWidth(L);
        paint.setAlpha(kk7.d4);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) - gl.L(0.9f), paint);
        tgb tgbVar = this.x;
        va vaVar = this.b;
        if (tgbVar != null) {
            tgbVar.c(rectF.centerX() - (this.x.c / 2.0f), rectF.centerY() - gl.L(0.6f), 1.0f - vaVar.getAlpha(), -1, canvas);
        }
        if (vaVar.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            paint.setAlpha((int) (vaVar.getAlpha() * 255.0f));
            canvas.drawPath(this.y, paint);
            canvas.restore();
        }
        canvas.restore();
        if (this.L != null) {
            float d = this.K.d(this.J);
            if (d > 0.0f) {
                float R1 = gl.R1(0.6f, 1.0f, d);
                float j = this.L.j() + gl.L(11.0f) + gl.L(11.0f);
                float L2 = gl.L(32.0f);
                float f = rectF.right - j;
                float L3 = (rectF.top - gl.L(9.66f)) - L2;
                float f2 = rectF.right;
                float L4 = rectF.top - gl.L(9.66f);
                RectF rectF3 = this.G;
                rectF3.set(f, L3, f2, L4);
                rectF3.set(rectF3.right - (rectF3.width() * R1), rectF3.bottom - (rectF3.height() * R1), rectF3.right, rectF3.bottom);
                rectF3.offset(0.0f, (1.0f - d) * gl.L(4.0f));
                Path path = this.I;
                path.rewind();
                float L5 = gl.L(8.0f);
                float f3 = rectF3.left;
                float f4 = rectF3.top;
                RectF rectF4 = this.H;
                rectF4.set(f3, f4, f3 + L5, f4 + L5);
                path.arcTo(rectF4, 180.0f, 90.0f, false);
                float f5 = rectF3.right;
                float f6 = rectF3.top;
                rectF4.set(f5 - L5, f6, f5, f6 + L5);
                path.arcTo(rectF4, 270.0f, 90.0f, false);
                float f7 = rectF3.right;
                float f8 = rectF3.bottom;
                rectF4.set(f7 - L5, f8 - L5, f7, f8);
                path.arcTo(rectF4, 0.0f, 90.0f, false);
                path.lineTo(rectF3.right - gl.L(8.0f), rectF3.bottom);
                path.lineTo(rectF3.right - gl.L(14.5f), rectF3.bottom + gl.L(5.66f));
                path.lineTo(rectF3.right - gl.L(21.0f), rectF3.bottom);
                float f9 = rectF3.left;
                float f10 = rectF3.bottom;
                rectF4.set(f9, f10 - L5, f9 + L5, f10);
                path.arcTo(rectF4, 90.0f, 90.0f, false);
                path.close();
                rectF3.bottom += gl.L(5.66f);
                canvas.save();
                canvas.clipPath(path);
                a(canvas, rectF3, L5, d);
                canvas.restore();
                canvas.save();
                canvas.scale(R1, R1, rectF3.right, rectF3.bottom);
                this.L.c((rectF.right - j) + gl.L(11.0f), (rectF.top - gl.L(9.66f)) - (L2 / 2.0f), d, -1, canvas);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        va vaVar = this.b;
        if (view != vaVar) {
            return super.drawChild(canvas, view, j);
        }
        float x = vaVar.getX();
        float y = vaVar.getY();
        float x2 = vaVar.getX() + vaVar.getWidth();
        float y2 = vaVar.getY() + vaVar.getHeight();
        RectF rectF = this.E;
        rectF.set(x, y, x2, y2);
        gl.e3(rectF, vaVar.getScaleX(), vaVar.getPivotX() + vaVar.getX(), vaVar.getPivotY() + vaVar.getY());
        a(canvas, rectF, gl.L(10.0f), vaVar.getAlpha());
        Path path = this.M;
        path.rewind();
        path.addRoundRect(rectF, gl.L(10.0f), gl.L(10.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        va vaVar = this.b;
        vaVar.setPivotX(vaVar.getWidth() - gl.L(15.0f));
        vaVar.setPivotY(vaVar.getHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(176.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.r.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        n41 n41Var = this.n;
        if (action == 0) {
            n41Var.c(contains);
            if (this.N && !contains) {
                if (!this.E.contains(motionEvent.getX(), motionEvent.getY())) {
                    c(false, true);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            if (!contains) {
                n41Var.c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (n41Var.i) {
                c(!this.N, true);
            }
            n41Var.c(false);
        } else if (motionEvent.getAction() == 3) {
            n41Var.c(false);
        }
        return n41Var.i || super.onTouchEvent(motionEvent);
    }

    public void setSelected(int i) {
        if (this.f == i) {
            return;
        }
        this.f = i;
        gl.d0(this.b, new jq0(this, i, (byte) 2));
    }
}
