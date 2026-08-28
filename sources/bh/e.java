package bh;

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
import jh.q;
import nh.o;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.voip.u0;
import org.telegram.ui.i70;
import qh.s5;
import zf.i0;
import zf.v1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e extends TextView {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(u0 u0Var, Context context) {
        super(context);
        this.a = 8;
        this.c = u0Var;
        this.b = new Paint[u0Var.f.length];
        int i9 = 0;
        while (true) {
            Paint[] paintArr = (Paint[]) this.b;
            if (i9 >= paintArr.length) {
                return;
            }
            paintArr[i9] = new Paint(1);
            i9++;
        }
    }

    public void a() {
        p80 p80Var = (p80) this.c;
        f80 f80Var = (f80) this.b;
        if (f80Var == null || p80Var == null) {
            return;
        }
        f80Var.rewind();
        if (getLayout() != null && getLayout().getText() != null) {
            f80Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
            getLayout().getSelectionPath(0, getLayout().getText().length(), f80Var);
        }
        p80Var.k();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        b6 b6Var;
        switch (this.a) {
            case 1:
                Paint paint = (Paint) this.b;
                int dp = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout = getLayout();
                if (layout != null) {
                    paint.setColor(f6.l1(0.45f, f6.v0(f6.y6, ((q) this.c).S.c)));
                    float f10 = dp;
                    float f11 = max / 2.0f;
                    float f12 = f10 - f11;
                    float f13 = f10 + f11;
                    canvas.drawRect(0.0f, f12, (getWidth() - (layout.getLineWidth(0) + AndroidUtilities.dp(16.0f))) / 2.0f, f13, paint);
                    canvas.drawRect(((layout.getLineWidth(0) + getWidth()) + AndroidUtilities.dp(16.0f)) / 2.0f, f12, getWidth(), f13, paint);
                }
                super.dispatchDraw(canvas);
                break;
            case 2:
                Paint paint2 = (Paint) this.b;
                int dp2 = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max2 = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout2 = getLayout();
                if (layout2 != null) {
                    paint2.setColor(f6.l1(0.45f, f6.v0(f6.y6, (b6) this.c)));
                    float f14 = dp2;
                    float f15 = max2 / 2.0f;
                    float f16 = f14 - f15;
                    float f17 = f14 + f15;
                    canvas.drawRect(0.0f, f16, (getWidth() - (layout2.getLineWidth(0) + AndroidUtilities.dp(16.0f))) / 2.0f, f17, paint2);
                    canvas.drawRect(((layout2.getLineWidth(0) + getWidth()) + AndroidUtilities.dp(16.0f)) / 2.0f, f16, getWidth(), f17, paint2);
                }
                super.dispatchDraw(canvas);
                break;
            case 11:
                Paint paint3 = (Paint) this.b;
                int i9 = f6.z6;
                b6Var = ((f3) ((i0) this.c).e).resourcesProvider;
                paint3.setColor(f6.l1(0.8f, f6.v0(i9, b6Var)));
                paint3.setStyle(Paint.Style.STROKE);
                paint3.setStrokeWidth(1.0f);
                float height = getHeight() / 2.0f;
                Layout layout3 = getLayout();
                int i10 = 0;
                for (int i11 = 0; i11 < layout3.getLineCount(); i11++) {
                    i10 = Math.max(i10, (int) layout3.getLineWidth(i11));
                }
                float f18 = i10 / 2.0f;
                canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f18) - AndroidUtilities.dp(8.0f), height, paint3);
                canvas.drawLine((getWidth() / 2.0f) + f18 + AndroidUtilities.dp(8.0f), height, getWidth(), height, paint3);
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
                ((org.telegram.ui.h) this.c).b.draw(canvas);
                super.draw(canvas);
                break;
            case 9:
                ((i70) this.c).h.draw(canvas);
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
                ((p80) this.c).b = -1L;
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
                paint.setColor(((j) this.c).getThemedColor(f6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
                super.onDraw(canvas);
                break;
            case 1:
            case 2:
            case 7:
            default:
                super.onDraw(canvas);
                break;
            case 3:
                Paint paint2 = (Paint) this.b;
                paint2.setColor(((o) this.c).getThemedColor(f6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint2);
                super.onDraw(canvas);
                break;
            case 4:
                super.onDraw(canvas);
                if (((org.telegram.ui.h) this.c).w) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((org.telegram.ui.Components.voip.h) this.b).a(getMeasuredHeight() / 2.0f, canvas, rectF, null);
                    invalidate();
                    break;
                }
                break;
            case 5:
                Paint paint3 = (Paint) this.b;
                paint3.setColor(((ki) this.c).getThemedColor(f6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint3);
                super.onDraw(canvas);
                break;
            case 6:
                if (((v1) this.b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) this.c);
                    ((v1) this.b).d(canvas);
                    canvas.restore();
                    invalidate();
                }
                super.onDraw(canvas);
                break;
            case 8:
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) this.b;
                u0 u0Var = (u0) this.c;
                paintArr[u0Var.x].setAlpha(255);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[u0Var.x]);
                float f10 = u0Var.w;
                if (f10 > 0.0f) {
                    int i9 = u0Var.x;
                    if (i9 + 1 < paintArr.length) {
                        paintArr[i9 + 1].setAlpha((int) (f10 * 255.0f));
                        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[u0Var.x + 1]);
                    }
                }
                super.onDraw(canvas);
                break;
            case 9:
                super.onDraw(canvas);
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.b).a(getMeasuredHeight() / 2.0f, canvas, rectF3, null);
                invalidate();
                break;
            case 10:
                Paint paint4 = (Paint) this.b;
                qh.a aVar = ((s5) this.c).x;
                if (aVar != null && aVar.c > 0 && aVar.d == 0 && !aVar.e) {
                    paint4.setColor(getCurrentTextColor());
                    canvas.drawCircle(getWidth() / 2.0f, getBaseline() - (getTextSize() * 0.35f), AndroidUtilities.dpf2(4.3f) / 2.0f, paint4);
                    break;
                } else {
                    super.onDraw(canvas);
                    break;
                }
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 6:
                super.onLayout(z10, i9, i10, i11, i12);
                v1 v1Var = new v1(10);
                this.b = v1Var;
                v1Var.N = 100;
                v1Var.J = false;
                v1Var.M = true;
                v1Var.G = false;
                v1Var.K = true;
                v1Var.H = true;
                v1Var.r = 1;
                v1Var.w = 0.98f;
                v1Var.v = 0.98f;
                v1Var.u = 0.98f;
                v1Var.g = false;
                v1Var.o = 0.0f;
                v1Var.x = 750L;
                v1Var.y = 750;
                v1Var.c();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((v1) this.b).a.set(rectF);
                ((v1) this.b).b.set(rectF);
                ((v1) this.b).f();
                Path path = (Path) this.c;
                path.reset();
                path.addRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, Path.Direction.CW);
                break;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.a) {
            case 7:
                super.onMeasure(i9, i10);
                a();
                break;
            case 8:
            default:
                super.onMeasure(i9, i10);
                break;
            case 9:
                if (View.MeasureSpec.getSize(i9) <= AndroidUtilities.dp(260.0f)) {
                    super.onMeasure(i9, i10);
                    break;
                } else {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(320.0f), TLObject.FLAG_30), i10);
                    break;
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        switch (this.a) {
            case 4:
                super.onSizeChanged(i9, i10, i11, i12);
                org.telegram.ui.h hVar = (org.telegram.ui.h) this.c;
                hVar.b.setBounds(0, 0, i9, i10);
                hVar.b.setCornerRadius(Math.min(i9, i10) / 2.0f);
                ((org.telegram.ui.Components.voip.h) this.b).f = i9;
                break;
            case 8:
                u0 u0Var = (u0) this.c;
                Paint[] paintArr = (Paint[]) this.b;
                super.onSizeChanged(i9, i10, i11, i12);
                for (int i16 = 0; i16 < paintArr.length; i16++) {
                    if (i16 == 0 && u0Var.y) {
                        i13 = -8919716;
                        i14 = -11089922;
                    } else {
                        i13 = -9015575;
                        if (i16 == 0 || (i16 == 1 && u0Var.y)) {
                            i13 = -11033346;
                            i14 = -9015575;
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
            case 9:
                super.onSizeChanged(i9, i10, i11, i12);
                i70 i70Var = (i70) this.c;
                i70Var.h.setBounds(0, 0, i9, i10);
                i70Var.h.setCornerRadius(Math.min(i9, i10) / 2.0f);
                ((org.telegram.ui.Components.voip.h) this.b).f = i9;
                break;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
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
    public void setTextColor(int i9) {
        switch (this.a) {
            case 7:
                super.setTextColor(f6.l1(0.2f, i9));
                ((p80) this.c).f(f6.l1(0.03f, i9), f6.l1(0.175f, i9), f6.l1(0.2f, i9), f6.l1(0.45f, i9));
                break;
            default:
                super.setTextColor(i9);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(s5 s5Var, Context context) {
        super(context);
        this.a = 10;
        this.c = s5Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, int i9) {
        super(context);
        this.a = i9;
        switch (i9) {
            case 7:
                super(context);
                f80 f80Var = new f80(0);
                this.b = f80Var;
                p80 p80Var = new p80();
                this.c = p80Var;
                p80Var.x = f80Var;
                p80Var.u = 0.65f;
                p80Var.j(4.0f);
                setBackground(p80Var);
                break;
            default:
                this.c = new Path();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, Context context) {
        super(context);
        this.a = 0;
        this.c = jVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(o oVar, Context context) {
        super(context);
        this.a = 3;
        this.c = oVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i70 i70Var, Context context) {
        super(context);
        this.a = 9;
        this.c = i70Var;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.b = hVar;
        hVar.k = false;
        hVar.m = 2.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(org.telegram.ui.h hVar, Context context) {
        super(context);
        this.a = 4;
        this.c = hVar;
        org.telegram.ui.Components.voip.h hVar2 = new org.telegram.ui.Components.voip.h();
        this.b = hVar2;
        hVar2.k = false;
        hVar2.m = 2.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q qVar, Context context) {
        super(context);
        this.a = 1;
        this.c = qVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, b6 b6Var) {
        super(context);
        this.a = 2;
        this.c = b6Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i0 i0Var, Context context) {
        super(context);
        this.a = 11;
        this.c = i0Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ki kiVar, Context context) {
        super(context);
        this.a = 5;
        this.c = kiVar;
        this.b = new Paint(1);
    }
}
