package gi;

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
import oi.z5;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.voip.l1;
import org.telegram.ui.Components.voip.w0;
import org.telegram.ui.v50;
import ug.k0;
import ug.l0;
import ug.t1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class j extends TextView {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Activity activity, l1 l1Var) {
        super(activity);
        this.a = 8;
        this.b = new RectF();
        this.c = l1Var;
        l1Var.a(this);
        setText(gd.M0(2131743066, null));
        setContentDescription(gd.M0(2131743066, null));
        setTextColor(-1);
        setTypeface(g0.o());
        setPadding(g0.L(14.0f), g0.L(4.0f), g0.L(14.0f), g0.L(4.0f));
    }

    public void a() {
        o80 o80Var = (o80) this.c;
        f80 f80Var = (f80) this.b;
        if (f80Var == null || o80Var == null) {
            return;
        }
        f80Var.rewind();
        if (getLayout() != null && getLayout().getText() != null) {
            f80Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
            getLayout().getSelectionPath(0, getLayout().getText().length(), f80Var);
        }
        o80Var.l();
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
                    paint.setColor(n6.r1(0.45f, n6.w0(n6.y6, ((m) obj).a0.c)));
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
                    paint2.setColor(n6.r1(0.45f, n6.w0(n6.y6, (i6) obj)));
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
                int i10 = n6.z6;
                l0 l0Var = ((k0) obj).e;
                int i11 = l0.S2;
                paint3.setColor(n6.r1(0.8f, n6.w0(i10, l0Var.J0)));
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
                ((v50) this.c).h.draw(canvas);
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
                ((o80) this.c).b = -1L;
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
                paint.setColor(((li.p) this.c).getThemedColor(n6.Fi));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - g0.L(14.0f), getWidth(), (getHeight() / 2.0f) + g0.L(14.0f), g0.L(14.0f), g0.L(14.0f), paint);
                super.onDraw(canvas);
                break;
            case 3:
                Paint paint2 = (Paint) this.b;
                oi.a aVar = ((z5) this.c).y;
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
                paint3.setColor(n6.w0(n6.Fi, ((si) this.c).J0));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - g0.L(14.0f), getWidth(), (getHeight() / 2.0f) + g0.L(14.0f), g0.L(14.0f), g0.L(14.0f), paint3);
                super.onDraw(canvas);
                break;
            case 6:
                if (((t1) this.b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) this.c);
                    ((t1) this.b).d(canvas);
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
                l1 l1Var = (l1) this.c;
                l1Var.d(((View) getParent()).getX() + getX(), ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF2, g0.L(16.0f), g0.L(16.0f), l1Var.b());
                super.onDraw(canvas);
                break;
            case 9:
                RectF rectF3 = g0.P;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) this.b;
                w0 w0Var = (w0) this.c;
                paintArr[w0Var.y].setAlpha(ks.e4);
                canvas.drawRoundRect(rectF3, g0.L(6.0f), g0.L(6.0f), paintArr[w0Var.y]);
                float f10 = w0Var.x;
                if (f10 > 0.0f) {
                    int i7 = w0Var.y;
                    if (i7 + 1 < paintArr.length) {
                        paintArr[i7 + 1].setAlpha((int) (f10 * 255.0f));
                        canvas.drawRoundRect(rectF3, g0.L(6.0f), g0.L(6.0f), paintArr[w0Var.y + 1]);
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
                paint4.setColor(n6.w0(n6.Fi, ((vh.g) this.c).J0));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - g0.L(14.0f), getWidth(), (getHeight() / 2.0f) + g0.L(14.0f), g0.L(14.0f), g0.L(14.0f), paint4);
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 6:
                super.onLayout(z10, i7, i10, i11, i12);
                t1 t1Var = new t1(10);
                this.b = t1Var;
                t1Var.O = 100;
                t1Var.J = false;
                t1Var.M = true;
                t1Var.G = false;
                t1Var.K = true;
                t1Var.H = true;
                t1Var.r = 1;
                t1Var.w = 0.98f;
                t1Var.v = 0.98f;
                t1Var.u = 0.98f;
                t1Var.g = false;
                t1Var.o = 0.0f;
                t1Var.x = 750L;
                t1Var.y = 750;
                t1Var.c();
                RectF rectF = g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((t1) this.b).a.set(rectF);
                ((t1) this.b).b.set(rectF);
                ((t1) this.b).f();
                Path path = (Path) this.c;
                path.reset();
                path.addRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, Path.Direction.CW);
                break;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
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
                w0 w0Var = (w0) this.c;
                Paint[] paintArr = (Paint[]) this.b;
                super.onSizeChanged(i7, i10, i11, i12);
                for (int i16 = 0; i16 < paintArr.length; i16++) {
                    if (i16 == 0 && w0Var.E) {
                        i13 = -8919716;
                        i14 = -11089922;
                    } else {
                        i13 = -9015575;
                        if (i16 == 0 || (i16 == 1 && w0Var.E)) {
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
                v50 v50Var = (v50) this.c;
                v50Var.h.setBounds(0, 0, i7, i10);
                v50Var.h.setCornerRadius(Math.min(i7, i10) / 2.0f);
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
                super.setTextColor(n6.r1(0.2f, i7));
                ((o80) this.c).g(n6.r1(0.03f, i7), n6.r1(0.175f, i7), n6.r1(0.2f, i7), n6.r1(0.45f, i7));
                break;
            default:
                super.setTextColor(i7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(w0 w0Var, Context context) {
        super(context);
        this.a = 9;
        this.c = w0Var;
        this.b = new Paint[w0Var.f.length];
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
    public j(z5 z5Var, Context context) {
        super(context);
        this.a = 3;
        this.c = z5Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, int i7) {
        super(context);
        this.a = i7;
        switch (i7) {
            case 7:
                super(context);
                f80 f80Var = new f80(0);
                this.b = f80Var;
                o80 o80Var = new o80();
                this.c = o80Var;
                o80Var.y = f80Var;
                o80Var.u = 0.65f;
                o80Var.k(4.0f);
                setBackground(o80Var);
                break;
            default:
                this.c = new Path();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(vh.g gVar, Context context) {
        super(context);
        this.a = 12;
        this.c = gVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(li.p pVar, Context context) {
        super(context);
        this.a = 2;
        this.c = pVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(v50 v50Var, Context context) {
        super(context);
        this.a = 10;
        this.c = v50Var;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.b = nVar;
        nVar.k = false;
        nVar.m = 2.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(org.telegram.ui.g gVar, Context context) {
        super(context);
        this.a = 4;
        this.c = gVar;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.b = nVar;
        nVar.k = false;
        nVar.m = 2.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, Context context) {
        super(context);
        this.a = 0;
        this.c = mVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, i6 i6Var) {
        super(context);
        this.a = 1;
        this.c = i6Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k0 k0Var, Context context) {
        super(context);
        this.a = 11;
        this.c = k0Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(si siVar, Context context) {
        super(context);
        this.a = 5;
        this.c = siVar;
        this.b = new Paint(1);
    }
}
