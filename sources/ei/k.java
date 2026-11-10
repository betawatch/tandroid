package ei;

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
import li.a6;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.voip.i1;
import org.telegram.ui.Components.voip.t0;
import org.telegram.ui.x50;
import ug.h0;
import ug.i0;
import ug.p1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class k extends TextView {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Activity activity, i1 i1Var) {
        super(activity);
        this.a = 8;
        this.b = new RectF();
        this.c = i1Var;
        i1Var.a(this);
        setText(id.M0(2131743303, null));
        setContentDescription(id.M0(2131743303, null));
        setTextColor(-1);
        setTypeface(g0.o());
        setPadding(g0.L(14.0f), g0.L(4.0f), g0.L(14.0f), g0.L(4.0f));
    }

    public void a() {
        a80 a80Var = (a80) this.c;
        r70 r70Var = (r70) this.b;
        if (r70Var == null || a80Var == null) {
            return;
        }
        r70Var.rewind();
        if (getLayout() != null && getLayout().getText() != null) {
            r70Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
            getLayout().getSelectionPath(0, getLayout().getText().length(), r70Var);
        }
        a80Var.l();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        int i7 = this.a;
        Object obj = this.c;
        switch (i7) {
            case 0:
                Paint paint = (Paint) this.b;
                int L = g0.L(1.0f) + (getHeight() / 2);
                int max = Math.max(1, g0.L(0.66f));
                Layout layout = getLayout();
                if (layout != null) {
                    paint.setColor(m6.r1(0.45f, m6.w0(m6.y6, ((n) obj).W.c)));
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
                    paint2.setColor(m6.r1(0.45f, m6.w0(m6.y6, (h6) obj)));
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
                int i10 = m6.z6;
                i0 i0Var = ((h0) obj).e;
                int i11 = i0.R2;
                paint3.setColor(m6.r1(0.8f, m6.w0(i10, i0Var.I0)));
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
                ((x50) this.c).h.draw(canvas);
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
                ((a80) this.c).b = -1L;
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
                paint.setColor(((ii.p) this.c).getThemedColor(m6.Ci));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - g0.L(14.0f), getWidth(), (getHeight() / 2.0f) + g0.L(14.0f), g0.L(14.0f), g0.L(14.0f), paint);
                super.onDraw(canvas);
                break;
            case 3:
                Paint paint2 = (Paint) this.b;
                li.a aVar = ((a6) this.c).y;
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
                    ((org.telegram.ui.Components.voip.n) this.b).a(getMeasuredHeight() / 2.0f, canvas, rectF, null);
                    invalidate();
                    break;
                }
                break;
            case 5:
                Paint paint3 = (Paint) this.b;
                paint3.setColor(m6.w0(m6.Ci, ((ci) this.c).I0));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - g0.L(14.0f), getWidth(), (getHeight() / 2.0f) + g0.L(14.0f), g0.L(14.0f), g0.L(14.0f), paint3);
                super.onDraw(canvas);
                break;
            case 6:
                if (((p1) this.b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) this.c);
                    ((p1) this.b).d(canvas);
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
                i1 i1Var = (i1) this.c;
                i1Var.d(((View) getParent()).getX() + getX(), ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF2, g0.L(16.0f), g0.L(16.0f), i1Var.b());
                super.onDraw(canvas);
                break;
            case 9:
                RectF rectF3 = g0.P;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) this.b;
                t0 t0Var = (t0) this.c;
                paintArr[t0Var.y].setAlpha(qs.e4);
                canvas.drawRoundRect(rectF3, g0.L(6.0f), g0.L(6.0f), paintArr[t0Var.y]);
                float f10 = t0Var.x;
                if (f10 > 0.0f) {
                    int i7 = t0Var.y;
                    if (i7 + 1 < paintArr.length) {
                        paintArr[i7 + 1].setAlpha((int) (f10 * 255.0f));
                        canvas.drawRoundRect(rectF3, g0.L(6.0f), g0.L(6.0f), paintArr[t0Var.y + 1]);
                    }
                }
                super.onDraw(canvas);
                break;
            case 10:
                super.onDraw(canvas);
                RectF rectF4 = g0.P;
                rectF4.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.n) this.b).a(getMeasuredHeight() / 2.0f, canvas, rectF4, null);
                invalidate();
                break;
            case 12:
                Paint paint4 = (Paint) this.b;
                paint4.setColor(m6.w0(m6.Ci, ((vh.g) this.c).I0));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - g0.L(14.0f), getWidth(), (getHeight() / 2.0f) + g0.L(14.0f), g0.L(14.0f), g0.L(14.0f), paint4);
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 6:
                super.onLayout(z9, i7, i10, i11, i12);
                p1 p1Var = new p1(10);
                this.b = p1Var;
                p1Var.O = 100;
                p1Var.J = false;
                p1Var.M = true;
                p1Var.G = false;
                p1Var.K = true;
                p1Var.H = true;
                p1Var.r = 1;
                p1Var.w = 0.98f;
                p1Var.v = 0.98f;
                p1Var.u = 0.98f;
                p1Var.g = false;
                p1Var.o = 0.0f;
                p1Var.x = 750L;
                p1Var.y = 750;
                p1Var.c();
                RectF rectF = g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((p1) this.b).a.set(rectF);
                ((p1) this.b).b.set(rectF);
                ((p1) this.b).f();
                Path path = (Path) this.c;
                path.reset();
                path.addRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, Path.Direction.CW);
                break;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 7:
                super.onMeasure(i7, i10);
                a();
                break;
            case 10:
                if (View.MeasureSpec.getSize(i7) <= g0.L(260.0f)) {
                    super.onMeasure(i7, i10);
                    break;
                } else {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(g0.L(320.0f), TLObject.FLAG_30), i10);
                    break;
                }
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        switch (this.a) {
            case 4:
                super.onSizeChanged(i7, i10, i11, i12);
                org.telegram.ui.g gVar = (org.telegram.ui.g) this.c;
                gVar.b.setBounds(0, 0, i7, i10);
                gVar.b.setCornerRadius(Math.min(i7, i10) / 2.0f);
                ((org.telegram.ui.Components.voip.n) this.b).f = i7;
                break;
            case 9:
                t0 t0Var = (t0) this.c;
                Paint[] paintArr = (Paint[]) this.b;
                super.onSizeChanged(i7, i10, i11, i12);
                for (int i16 = 0; i16 < paintArr.length; i16++) {
                    if (i16 == 0 && t0Var.D) {
                        i13 = -8919716;
                        i14 = -11089922;
                    } else {
                        i13 = -9015575;
                        if (i16 == 0 || (i16 == 1 && t0Var.D)) {
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
                super.onSizeChanged(i7, i10, i11, i12);
                x50 x50Var = (x50) this.c;
                x50Var.h.setBounds(0, 0, i7, i10);
                x50Var.h.setCornerRadius(Math.min(i7, i10) / 2.0f);
                ((org.telegram.ui.Components.voip.n) this.b).f = i7;
                break;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
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
    public void setTextColor(int i7) {
        switch (this.a) {
            case 7:
                super.setTextColor(m6.r1(0.2f, i7));
                ((a80) this.c).g(m6.r1(0.03f, i7), m6.r1(0.175f, i7), m6.r1(0.2f, i7), m6.r1(0.45f, i7));
                break;
            default:
                super.setTextColor(i7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(t0 t0Var, Context context) {
        super(context);
        this.a = 9;
        this.c = t0Var;
        this.b = new Paint[t0Var.f.length];
        int i7 = 0;
        while (true) {
            Paint[] paintArr = (Paint[]) this.b;
            if (i7 >= paintArr.length) {
                return;
            }
            paintArr[i7] = new Paint(1);
            i7++;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a6 a6Var, Context context) {
        super(context);
        this.a = 3;
        this.c = a6Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, int i7) {
        super(context);
        this.a = i7;
        switch (i7) {
            case 7:
                super(context);
                r70 r70Var = new r70(0);
                this.b = r70Var;
                a80 a80Var = new a80();
                this.c = a80Var;
                a80Var.y = r70Var;
                a80Var.u = 0.65f;
                a80Var.k(4.0f);
                setBackground(a80Var);
                break;
            default:
                this.c = new Path();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(vh.g gVar, Context context) {
        super(context);
        this.a = 12;
        this.c = gVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ii.p pVar, Context context) {
        super(context);
        this.a = 2;
        this.c = pVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(x50 x50Var, Context context) {
        super(context);
        this.a = 10;
        this.c = x50Var;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.b = nVar;
        nVar.k = false;
        nVar.m = 2.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(org.telegram.ui.g gVar, Context context) {
        super(context);
        this.a = 4;
        this.c = gVar;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.b = nVar;
        nVar.k = false;
        nVar.m = 2.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, Context context) {
        super(context);
        this.a = 0;
        this.c = nVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, h6 h6Var) {
        super(context);
        this.a = 1;
        this.c = h6Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h0 h0Var, Context context) {
        super(context);
        this.a = 11;
        this.c = h0Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ci ciVar, Context context) {
        super(context);
        this.a = 5;
        this.c = ciVar;
        this.b = new Paint(1);
    }
}
