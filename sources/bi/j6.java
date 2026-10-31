package bi;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.t80;
import org.telegram.ui.s60;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class j6 extends TextView {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(Activity activity, org.telegram.ui.Components.voip.x0 x0Var) {
        super(activity);
        this.a = 7;
        this.b = new RectF();
        this.c = x0Var;
        x0Var.a(this);
        setText(cd.L0(2131743329, null));
        setContentDescription(cd.L0(2131743329, null));
        setTextColor(-1);
        setTypeface(org.telegram.messenger.i0.o());
        setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(4.0f));
    }

    public void a() {
        t80 t80Var = (t80) this.c;
        k80 k80Var = (k80) this.b;
        if (k80Var == null || t80Var == null) {
            return;
        }
        k80Var.rewind();
        if (getLayout() != null && getLayout().getText() != null) {
            k80Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
            getLayout().getSelectionPath(0, getLayout().getText().length(), k80Var);
        }
        t80Var.l();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        int i10 = this.a;
        Object obj = this.c;
        switch (i10) {
            case 1:
                Paint paint = (Paint) this.b;
                int i11 = org.telegram.ui.ActionBar.t6.z6;
                kg.q0 q0Var = ((kg.p0) obj).e;
                int i12 = kg.q0.O2;
                paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.8f, org.telegram.ui.ActionBar.t6.w0(i11, q0Var.I0)));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(1.0f);
                float height = getHeight() / 2.0f;
                Layout layout = getLayout();
                int i13 = 0;
                for (int i14 = 0; i14 < layout.getLineCount(); i14++) {
                    i13 = Math.max(i13, (int) layout.getLineWidth(i14));
                }
                float f7 = i13 / 2.0f;
                canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f7) - org.telegram.messenger.i0.L(8.0f), height, paint);
                canvas.drawLine((getWidth() / 2.0f) + f7 + org.telegram.messenger.i0.L(8.0f), height, getWidth(), height, paint);
                super.dispatchDraw(canvas);
                break;
            case 10:
                Paint paint2 = (Paint) this.b;
                int L = org.telegram.messenger.i0.L(1.0f) + (getHeight() / 2);
                int max = Math.max(1, org.telegram.messenger.i0.L(0.66f));
                Layout layout2 = getLayout();
                if (layout2 != null) {
                    paint2.setColor(org.telegram.ui.ActionBar.t6.r1(0.45f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.y6, ((uh.i) obj).W.c)));
                    float f10 = L;
                    float f11 = max / 2.0f;
                    float f12 = f10 - f11;
                    float f13 = f10 + f11;
                    canvas.drawRect(0.0f, f12, (getWidth() - (layout2.getLineWidth(0) + org.telegram.messenger.i0.L(16.0f))) / 2.0f, f13, paint2);
                    canvas.drawRect(((layout2.getLineWidth(0) + getWidth()) + org.telegram.messenger.i0.L(16.0f)) / 2.0f, f12, getWidth(), f13, paint2);
                }
                super.dispatchDraw(canvas);
                break;
            case 11:
                Paint paint3 = (Paint) this.b;
                int L2 = org.telegram.messenger.i0.L(1.0f) + (getHeight() / 2);
                int max2 = Math.max(1, org.telegram.messenger.i0.L(0.66f));
                Layout layout3 = getLayout();
                if (layout3 != null) {
                    paint3.setColor(org.telegram.ui.ActionBar.t6.r1(0.45f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.y6, (org.telegram.ui.ActionBar.p6) obj)));
                    float f14 = L2;
                    float f15 = max2 / 2.0f;
                    float f16 = f14 - f15;
                    float f17 = f14 + f15;
                    canvas.drawRect(0.0f, f16, (getWidth() - (layout3.getLineWidth(0) + org.telegram.messenger.i0.L(16.0f))) / 2.0f, f17, paint3);
                    canvas.drawRect(((layout3.getLineWidth(0) + getWidth()) + org.telegram.messenger.i0.L(16.0f)) / 2.0f, f16, getWidth(), f17, paint3);
                }
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
            case 3:
                ((org.telegram.ui.f) this.c).b.draw(canvas);
                super.draw(canvas);
                break;
            case 9:
                ((s60) this.c).h.draw(canvas);
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
            case 6:
                super.onDetachedFromWindow();
                ((t80) this.c).b = -1L;
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                Paint paint = (Paint) this.b;
                a aVar = ((q6) this.c).y;
                if (aVar != null && aVar.c > 0 && aVar.d == 0 && !aVar.e) {
                    paint.setColor(getCurrentTextColor());
                    canvas.drawCircle(getWidth() / 2.0f, getBaseline() - (getTextSize() * 0.35f), org.telegram.messenger.i0.N(4.3f) / 2.0f, paint);
                    break;
                } else {
                    super.onDraw(canvas);
                    break;
                }
            case 1:
            case 6:
            case 10:
            case 11:
            default:
                super.onDraw(canvas);
                break;
            case 2:
                Paint paint2 = (Paint) this.b;
                paint2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, ((lh.g) this.c).I0));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - org.telegram.messenger.i0.L(14.0f), getWidth(), (getHeight() / 2.0f) + org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), paint2);
                super.onDraw(canvas);
                break;
            case 3:
                super.onDraw(canvas);
                if (((org.telegram.ui.f) this.c).x) {
                    RectF rectF = org.telegram.messenger.i0.P;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((org.telegram.ui.Components.voip.g) this.b).a(getMeasuredHeight() / 2.0f, canvas, rectF, null);
                    invalidate();
                    break;
                }
                break;
            case 4:
                Paint paint3 = (Paint) this.b;
                paint3.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, ((bi) this.c).I0));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - org.telegram.messenger.i0.L(14.0f), getWidth(), (getHeight() / 2.0f) + org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), paint3);
                super.onDraw(canvas);
                break;
            case 5:
                if (((kg.f2) this.b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) this.c);
                    ((kg.f2) this.b).d(canvas);
                    canvas.restore();
                    invalidate();
                }
                super.onDraw(canvas);
                break;
            case 7:
                RectF rectF2 = (RectF) this.b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.c;
                x0Var.d(((View) getParent()).getX() + getX(), ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), x0Var.b());
                super.onDraw(canvas);
                break;
            case 8:
                RectF rectF3 = org.telegram.messenger.i0.P;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) this.b;
                org.telegram.ui.Components.voip.e0 e0Var = (org.telegram.ui.Components.voip.e0) this.c;
                paintArr[e0Var.y].setAlpha(zs.e4);
                canvas.drawRoundRect(rectF3, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paintArr[e0Var.y]);
                float f7 = e0Var.x;
                if (f7 > 0.0f) {
                    int i10 = e0Var.y;
                    if (i10 + 1 < paintArr.length) {
                        paintArr[i10 + 1].setAlpha((int) (f7 * 255.0f));
                        canvas.drawRoundRect(rectF3, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paintArr[e0Var.y + 1]);
                    }
                }
                super.onDraw(canvas);
                break;
            case 9:
                super.onDraw(canvas);
                RectF rectF4 = org.telegram.messenger.i0.P;
                rectF4.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.g) this.b).a(getMeasuredHeight() / 2.0f, canvas, rectF4, null);
                invalidate();
                break;
            case 12:
                Paint paint4 = (Paint) this.b;
                paint4.setColor(((yh.l) this.c).getThemedColor(org.telegram.ui.ActionBar.t6.Ci));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - org.telegram.messenger.i0.L(14.0f), getWidth(), (getHeight() / 2.0f) + org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), paint4);
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 5:
                super.onLayout(z10, i10, i11, i12, i13);
                kg.f2 f2Var = new kg.f2(10);
                this.b = f2Var;
                f2Var.O = 100;
                f2Var.J = false;
                f2Var.M = true;
                f2Var.G = false;
                f2Var.K = true;
                f2Var.H = true;
                f2Var.r = 1;
                f2Var.w = 0.98f;
                f2Var.v = 0.98f;
                f2Var.u = 0.98f;
                f2Var.g = false;
                f2Var.o = 0.0f;
                f2Var.x = 750L;
                f2Var.y = 750;
                f2Var.c();
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((kg.f2) this.b).a.set(rectF);
                ((kg.f2) this.b).b.set(rectF);
                ((kg.f2) this.b).f();
                Path path = (Path) this.c;
                path.reset();
                path.addRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, Path.Direction.CW);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 6:
                super.onMeasure(i10, i11);
                a();
                break;
            case 9:
                if (View.MeasureSpec.getSize(i10) <= org.telegram.messenger.i0.L(260.0f)) {
                    super.onMeasure(i10, i11);
                    break;
                } else {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(320.0f), TLObject.FLAG_30), i11);
                    break;
                }
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        switch (this.a) {
            case 3:
                super.onSizeChanged(i10, i11, i12, i13);
                org.telegram.ui.f fVar = (org.telegram.ui.f) this.c;
                fVar.b.setBounds(0, 0, i10, i11);
                fVar.b.setCornerRadius(Math.min(i10, i11) / 2.0f);
                ((org.telegram.ui.Components.voip.g) this.b).f = i10;
                break;
            case 8:
                org.telegram.ui.Components.voip.e0 e0Var = (org.telegram.ui.Components.voip.e0) this.c;
                Paint[] paintArr = (Paint[]) this.b;
                super.onSizeChanged(i10, i11, i12, i13);
                for (int i17 = 0; i17 < paintArr.length; i17++) {
                    if (i17 == 0 && e0Var.D) {
                        i14 = -8919716;
                        i15 = -11089922;
                    } else {
                        i14 = -9015575;
                        if (i17 == 0 || (i17 == 1 && e0Var.D)) {
                            i15 = -9015575;
                            i14 = -11033346;
                        } else {
                            i15 = -1026983;
                            i16 = -1792170;
                            paintArr[i17].setShader(i16 == 0 ? new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i14, i15, i16}, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i14, i15}, (float[]) null, Shader.TileMode.CLAMP));
                        }
                    }
                    i16 = 0;
                    paintArr[i17].setShader(i16 == 0 ? new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i14, i15, i16}, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{i14, i15}, (float[]) null, Shader.TileMode.CLAMP));
                }
                break;
            case 9:
                super.onSizeChanged(i10, i11, i12, i13);
                s60 s60Var = (s60) this.c;
                s60Var.h.setBounds(0, 0, i10, i11);
                s60Var.h.setCornerRadius(Math.min(i10, i11) / 2.0f);
                ((org.telegram.ui.Components.voip.g) this.b).f = i10;
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        switch (this.a) {
            case 6:
                super.setText(charSequence, bufferType);
                a();
                break;
            default:
                super.setText(charSequence, bufferType);
                break;
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        switch (this.a) {
            case 6:
                super.setTextColor(org.telegram.ui.ActionBar.t6.r1(0.2f, i10));
                ((t80) this.c).g(org.telegram.ui.ActionBar.t6.r1(0.03f, i10), org.telegram.ui.ActionBar.t6.r1(0.175f, i10), org.telegram.ui.ActionBar.t6.r1(0.2f, i10), org.telegram.ui.ActionBar.t6.r1(0.45f, i10));
                break;
            default:
                super.setTextColor(i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(org.telegram.ui.Components.voip.e0 e0Var, Context context) {
        super(context);
        this.a = 8;
        this.c = e0Var;
        this.b = new Paint[e0Var.f.length];
        int i10 = 0;
        while (true) {
            Paint[] paintArr = (Paint[]) this.b;
            if (i10 >= paintArr.length) {
                return;
            }
            paintArr[i10] = new Paint(1);
            i10++;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(q6 q6Var, Context context) {
        super(context);
        this.a = 0;
        this.c = q6Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 6:
                super(context);
                k80 k80Var = new k80(0);
                this.b = k80Var;
                t80 t80Var = new t80();
                this.c = t80Var;
                t80Var.y = k80Var;
                t80Var.u = 0.65f;
                t80Var.k(4.0f);
                setBackground(t80Var);
                break;
            default:
                this.c = new Path();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(lh.g gVar, Context context) {
        super(context);
        this.a = 2;
        this.c = gVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(yh.l lVar, Context context) {
        super(context);
        this.a = 12;
        this.c = lVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(s60 s60Var, Context context) {
        super(context);
        this.a = 9;
        this.c = s60Var;
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.b = gVar;
        gVar.k = false;
        gVar.m = 2.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(org.telegram.ui.f fVar, Context context) {
        super(context);
        this.a = 3;
        this.c = fVar;
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.b = gVar;
        gVar.k = false;
        gVar.m = 2.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(uh.i iVar, Context context) {
        super(context);
        this.a = 10;
        this.c = iVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.a = 11;
        this.c = p6Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(kg.p0 p0Var, Context context) {
        super(context);
        this.a = 1;
        this.c = p0Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(bi biVar, Context context) {
        super(context);
        this.a = 4;
        this.c = biVar;
        this.b = new Paint(1);
    }
}
