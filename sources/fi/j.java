package fi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import mi.b6;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.voip.f0;
import org.telegram.ui.Components.voip.x0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.o50;
import vg.h0;
import vg.i0;
import vg.s1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j extends TextView {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Activity activity, x0 x0Var) {
        super(activity);
        this.a = 8;
        this.b = new RectF();
        this.c = x0Var;
        x0Var.a(this);
        setText(bd.M0(2131743313, null));
        setContentDescription(bd.M0(2131743313, null));
        setTextColor(-1);
        setTypeface(g0.o());
        setPadding(g0.L(14.0f), g0.L(4.0f), g0.L(14.0f), g0.L(4.0f));
    }

    public void a() {
        w70 w70Var = (w70) this.c;
        n70 n70Var = (n70) this.b;
        if (n70Var == null || w70Var == null) {
            return;
        }
        n70Var.rewind();
        if (getLayout() != null && getLayout().getText() != null) {
            n70Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
            getLayout().getSelectionPath(0, getLayout().getText().length(), n70Var);
        }
        w70Var.l();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        int i3 = this.a;
        Object obj = this.c;
        switch (i3) {
            case 0:
                Paint paint = (Paint) this.b;
                int L = g0.L(1.0f) + (getHeight() / 2);
                int max = Math.max(1, g0.L(0.66f));
                Layout layout = getLayout();
                if (layout != null) {
                    paint.setColor(k6.r1(0.45f, k6.w0(k6.y6, ((m) obj).a0.c)));
                    float f10 = L;
                    float f11 = max / 2.0f;
                    float f12 = f10 - f11;
                    float f13 = f10 + f11;
                    canvas.drawRect(0.0f, f12, (getWidth() - (layout.getLineWidth(0) + g0.L(16.0f))) / 2.0f, f13, paint);
                    canvas.drawRect(((layout.getLineWidth(0) + getWidth()) + g0.L(16.0f)) / 2.0f, f12, getWidth(), f13, paint);
                }
                super.dispatchDraw(canvas);
                break;
            case 1:
                Paint paint2 = (Paint) this.b;
                int L2 = g0.L(1.0f) + (getHeight() / 2);
                int max2 = Math.max(1, g0.L(0.66f));
                Layout layout2 = getLayout();
                if (layout2 != null) {
                    paint2.setColor(k6.r1(0.45f, k6.w0(k6.y6, (e6) obj)));
                    float f14 = L2;
                    float f15 = max2 / 2.0f;
                    float f16 = f14 - f15;
                    float f17 = f14 + f15;
                    canvas.drawRect(0.0f, f16, (getWidth() - (layout2.getLineWidth(0) + g0.L(16.0f))) / 2.0f, f17, paint2);
                    canvas.drawRect(((layout2.getLineWidth(0) + getWidth()) + g0.L(16.0f)) / 2.0f, f16, getWidth(), f17, paint2);
                }
                super.dispatchDraw(canvas);
                break;
            case 11:
                Paint paint3 = (Paint) this.b;
                int i10 = k6.z6;
                i0 i0Var = ((h0) obj).e;
                int i11 = i0.P2;
                paint3.setColor(k6.r1(0.8f, k6.w0(i10, i0Var.J0)));
                paint3.setStyle(Paint.Style.STROKE);
                paint3.setStrokeWidth(1.0f);
                float height = getHeight() / 2.0f;
                Layout layout3 = getLayout();
                int i12 = 0;
                for (int i13 = 0; i13 < layout3.getLineCount(); i13++) {
                    i12 = Math.max(i12, (int) layout3.getLineWidth(i13));
                }
                float f18 = i12 / 2.0f;
                canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f18) - g0.L(8.0f), height, paint3);
                canvas.drawLine((getWidth() / 2.0f) + f18 + g0.L(8.0f), height, getWidth(), height, paint3);
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 4:
                ((org.telegram.ui.g) this.c).b.draw(canvas);
                super.draw(canvas);
                break;
            case 10:
                ((o50) this.c).h.draw(canvas);
                super.draw(canvas);
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 7:
                super.onDetachedFromWindow();
                ((w70) this.c).b = -1L;
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                Paint paint = (Paint) this.b;
                paint.setColor(((ji.n) this.c).getThemedColor(k6.Ci));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - g0.L(14.0f), getWidth(), (getHeight() / 2.0f) + g0.L(14.0f), g0.L(14.0f), g0.L(14.0f), paint);
                super.onDraw(canvas);
                break;
            case 3:
                Paint paint2 = (Paint) this.b;
                mi.a aVar = ((b6) this.c).y;
                if (aVar != null && aVar.c > 0 && aVar.d == 0 && !aVar.e) {
                    paint2.setColor(getCurrentTextColor());
                    canvas.drawCircle(getWidth() / 2.0f, getBaseline() - (getTextSize() * 0.35f), g0.N(4.3f) / 2.0f, paint2);
                    break;
                } else {
                    super.onDraw(canvas);
                    break;
                }
                break;
            case 4:
                super.onDraw(canvas);
                if (((org.telegram.ui.g) this.c).x) {
                    RectF rectF = g0.P;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((org.telegram.ui.Components.voip.g) this.b).a(getMeasuredHeight() / 2.0f, canvas, rectF, null);
                    invalidate();
                    break;
                }
                break;
            case 5:
                Paint paint3 = (Paint) this.b;
                paint3.setColor(k6.w0(k6.Ci, ((bi) this.c).J0));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - g0.L(14.0f), getWidth(), (getHeight() / 2.0f) + g0.L(14.0f), g0.L(14.0f), g0.L(14.0f), paint3);
                super.onDraw(canvas);
                break;
            case 6:
                if (((s1) this.b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) this.c);
                    ((s1) this.b).d(canvas);
                    canvas.restore();
                    invalidate();
                }
                super.onDraw(canvas);
                break;
            case 7:
            case 11:
            default:
                super.onDraw(canvas);
                break;
            case 8:
                RectF rectF2 = (RectF) this.b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                x0 x0Var = (x0) this.c;
                x0Var.d(((View) getParent()).getX() + getX(), ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF2, g0.L(16.0f), g0.L(16.0f), x0Var.b());
                super.onDraw(canvas);
                break;
            case 9:
                RectF rectF3 = g0.P;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) this.b;
                f0 f0Var = (f0) this.c;
                paintArr[f0Var.y].setAlpha(hs.e4);
                canvas.drawRoundRect(rectF3, g0.L(6.0f), g0.L(6.0f), paintArr[f0Var.y]);
                float f10 = f0Var.x;
                if (f10 > 0.0f) {
                    int i3 = f0Var.y;
                    if (i3 + 1 < paintArr.length) {
                        paintArr[i3 + 1].setAlpha((int) (f10 * 255.0f));
                        canvas.drawRoundRect(rectF3, g0.L(6.0f), g0.L(6.0f), paintArr[f0Var.y + 1]);
                    }
                }
                super.onDraw(canvas);
                break;
            case 10:
                super.onDraw(canvas);
                RectF rectF4 = g0.P;
                rectF4.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.g) this.b).a(getMeasuredHeight() / 2.0f, canvas, rectF4, null);
                invalidate();
                break;
            case 12:
                Paint paint4 = (Paint) this.b;
                paint4.setColor(k6.w0(k6.Ci, ((wh.h) this.c).J0));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - g0.L(14.0f), getWidth(), (getHeight() / 2.0f) + g0.L(14.0f), g0.L(14.0f), g0.L(14.0f), paint4);
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 6:
                super.onLayout(z10, i3, i10, i11, i12);
                s1 s1Var = new s1(10);
                this.b = s1Var;
                s1Var.O = 100;
                s1Var.J = false;
                s1Var.M = true;
                s1Var.G = false;
                s1Var.K = true;
                s1Var.H = true;
                s1Var.r = 1;
                s1Var.w = 0.98f;
                s1Var.v = 0.98f;
                s1Var.u = 0.98f;
                s1Var.g = false;
                s1Var.o = 0.0f;
                s1Var.x = 750L;
                s1Var.y = 750;
                s1Var.c();
                RectF rectF = g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((s1) this.b).a.set(rectF);
                ((s1) this.b).b.set(rectF);
                ((s1) this.b).f();
                Path path = (Path) this.c;
                path.reset();
                path.addRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, Path.Direction.CW);
                break;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i3, int i10) {
        switch (this.a) {
            case 7:
                super.onMeasure(i3, i10);
                a();
                break;
            case 10:
                if (View.MeasureSpec.getSize(i3) <= g0.L(260.0f)) {
                    super.onMeasure(i3, i10);
                    break;
                } else {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(g0.L(320.0f), TLObject.FLAG_30), i10);
                    break;
                }
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        switch (this.a) {
            case 4:
                super.onSizeChanged(i3, i10, i11, i12);
                org.telegram.ui.g gVar = (org.telegram.ui.g) this.c;
                gVar.b.setBounds(0, 0, i3, i10);
                gVar.b.setCornerRadius(Math.min(i3, i10) / 2.0f);
                ((org.telegram.ui.Components.voip.g) this.b).f = i3;
                break;
            case 9:
                f0 f0Var = (f0) this.c;
                Paint[] paintArr = (Paint[]) this.b;
                super.onSizeChanged(i3, i10, i11, i12);
                for (int i16 = 0; i16 < paintArr.length; i16++) {
                    if (i16 == 0 && f0Var.E) {
                        i13 = -8919716;
                        i14 = -11089922;
                    } else {
                        i13 = -9015575;
                        if (i16 == 0 || (i16 == 1 && f0Var.E)) {
                            i14 = -9015575;
                            i13 = -11033346;
                        } else {
                            i14 = -1026983;
                            i15 = -1792170;
                            paintArr[i16].setShader(i15 == 0 ? new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i13, i14, i15}, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i13, i14}, (float[]) null, Shader.TileMode.CLAMP));
                        }
                    }
                    i15 = 0;
                    paintArr[i16].setShader(i15 == 0 ? new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i13, i14, i15}, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i13, i14}, (float[]) null, Shader.TileMode.CLAMP));
                }
                break;
            case 10:
                super.onSizeChanged(i3, i10, i11, i12);
                o50 o50Var = (o50) this.c;
                o50Var.h.setBounds(0, 0, i3, i10);
                o50Var.h.setCornerRadius(Math.min(i3, i10) / 2.0f);
                ((org.telegram.ui.Components.voip.g) this.b).f = i3;
                break;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.a) {
            case 7:
                super.setText(charSequence, bufferType);
                a();
                break;
            default:
                super.setText(charSequence, bufferType);
                break;
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i3) {
        switch (this.a) {
            case 7:
                super.setTextColor(k6.r1(0.2f, i3));
                ((w70) this.c).g(k6.r1(0.03f, i3), k6.r1(0.175f, i3), k6.r1(0.2f, i3), k6.r1(0.45f, i3));
                break;
            default:
                super.setTextColor(i3);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f0 f0Var, Context context) {
        super(context);
        this.a = 9;
        this.c = f0Var;
        this.b = new Paint[f0Var.f.length];
        int i3 = 0;
        while (true) {
            Paint[] paintArr = (Paint[]) this.b;
            if (i3 >= paintArr.length) {
                return;
            }
            paintArr[i3] = new Paint(1);
            i3++;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(b6 b6Var, Context context) {
        super(context);
        this.a = 3;
        this.c = b6Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, int i3) {
        super(context);
        this.a = i3;
        switch (i3) {
            case 7:
                super(context);
                n70 n70Var = new n70(0);
                this.b = n70Var;
                w70 w70Var = new w70();
                this.c = w70Var;
                w70Var.y = n70Var;
                w70Var.u = 0.65f;
                w70Var.k(4.0f);
                setBackground(w70Var);
                break;
            default:
                this.c = new Path();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(wh.h hVar, Context context) {
        super(context);
        this.a = 12;
        this.c = hVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ji.n nVar, Context context) {
        super(context);
        this.a = 2;
        this.c = nVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o50 o50Var, Context context) {
        super(context);
        this.a = 10;
        this.c = o50Var;
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.b = gVar;
        gVar.k = false;
        gVar.m = 2.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(org.telegram.ui.g gVar, Context context) {
        super(context);
        this.a = 4;
        this.c = gVar;
        org.telegram.ui.Components.voip.g gVar2 = new org.telegram.ui.Components.voip.g();
        this.b = gVar2;
        gVar2.k = false;
        gVar2.m = 2.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, Context context) {
        super(context);
        this.a = 0;
        this.c = mVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, e6 e6Var) {
        super(context);
        this.a = 1;
        this.c = e6Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h0 h0Var, Context context) {
        super(context);
        this.a = 11;
        this.c = h0Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(bi biVar, Context context) {
        super(context);
        this.a = 5;
        this.c = biVar;
        this.b = new Paint(1);
    }
}
