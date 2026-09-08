package ci;

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
import ji.g6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.voip.v0;
import org.telegram.ui.Components.x80;
import org.telegram.ui.d80;
import sg.j0;
import sg.y1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class n extends TextView {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(g6 g6Var, Context context) {
        super(context);
        this.a = 3;
        this.c = g6Var;
        this.b = new Paint(1);
    }

    public void a() {
        h90 h90Var = (h90) this.c;
        x80 x80Var = (x80) this.b;
        if (x80Var == null || h90Var == null) {
            return;
        }
        x80Var.rewind();
        if (getLayout() != null && getLayout().getText() != null) {
            x80Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
            getLayout().getSelectionPath(0, getLayout().getText().length(), x80Var);
        }
        h90Var.k();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        f6 f6Var;
        switch (this.a) {
            case 0:
                Paint paint = (Paint) this.b;
                int dp = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout = getLayout();
                if (layout != null) {
                    paint.setColor(j6.l1(0.45f, j6.v0(j6.y6, ((t) this.c).W.c)));
                    float f7 = dp;
                    float f10 = max / 2.0f;
                    float f11 = f7 - f10;
                    float f12 = f7 + f10;
                    canvas.drawRect(0.0f, f11, (getWidth() - (layout.getLineWidth(0) + AndroidUtilities.dp(16.0f))) / 2.0f, f12, paint);
                    canvas.drawRect(((layout.getLineWidth(0) + getWidth()) + AndroidUtilities.dp(16.0f)) / 2.0f, f11, getWidth(), f12, paint);
                }
                super.dispatchDraw(canvas);
                break;
            case 1:
                Paint paint2 = (Paint) this.b;
                int dp2 = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max2 = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout2 = getLayout();
                if (layout2 != null) {
                    paint2.setColor(j6.l1(0.45f, j6.v0(j6.y6, (f6) this.c)));
                    float f13 = dp2;
                    float f14 = max2 / 2.0f;
                    float f15 = f13 - f14;
                    float f16 = f13 + f14;
                    canvas.drawRect(0.0f, f15, (getWidth() - (layout2.getLineWidth(0) + AndroidUtilities.dp(16.0f))) / 2.0f, f16, paint2);
                    canvas.drawRect(((layout2.getLineWidth(0) + getWidth()) + AndroidUtilities.dp(16.0f)) / 2.0f, f15, getWidth(), f16, paint2);
                }
                super.dispatchDraw(canvas);
                break;
            case 10:
                Paint paint3 = (Paint) this.b;
                int i10 = j6.z6;
                f6Var = ((f3) ((j0) this.c).e).resourcesProvider;
                paint3.setColor(j6.l1(0.8f, j6.v0(i10, f6Var)));
                paint3.setStyle(Paint.Style.STROKE);
                paint3.setStrokeWidth(1.0f);
                float height = getHeight() / 2.0f;
                Layout layout3 = getLayout();
                int i11 = 0;
                for (int i12 = 0; i12 < layout3.getLineCount(); i12++) {
                    i11 = Math.max(i11, (int) layout3.getLineWidth(i12));
                }
                float f17 = i11 / 2.0f;
                canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f17) - AndroidUtilities.dp(8.0f), height, paint3);
                canvas.drawLine((getWidth() / 2.0f) + f17 + AndroidUtilities.dp(8.0f), height, getWidth(), height, paint3);
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
                ((d80) this.c).h.draw(canvas);
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
                ((h90) this.c).b = -1L;
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
                paint.setColor(((gi.p) this.c).getThemedColor(j6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
                super.onDraw(canvas);
                break;
            case 3:
                Paint paint2 = (Paint) this.b;
                ji.a aVar = ((g6) this.c).x;
                if (aVar != null && aVar.c > 0 && aVar.d == 0 && !aVar.e) {
                    paint2.setColor(getCurrentTextColor());
                    canvas.drawCircle(getWidth() / 2.0f, getBaseline() - (getTextSize() * 0.35f), AndroidUtilities.dpf2(4.3f) / 2.0f, paint2);
                    break;
                } else {
                    super.onDraw(canvas);
                    break;
                }
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
                paint3.setColor(((vi) this.c).getThemedColor(j6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint3);
                super.onDraw(canvas);
                break;
            case 6:
                if (((y1) this.b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) this.c);
                    ((y1) this.b).d(canvas);
                    canvas.restore();
                    invalidate();
                }
                super.onDraw(canvas);
                break;
            case 7:
            case 10:
            default:
                super.onDraw(canvas);
                break;
            case 8:
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) this.b;
                v0 v0Var = (v0) this.c;
                paintArr[v0Var.x].setAlpha(255);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[v0Var.x]);
                float f7 = v0Var.w;
                if (f7 > 0.0f) {
                    int i10 = v0Var.x;
                    if (i10 + 1 < paintArr.length) {
                        paintArr[i10 + 1].setAlpha((int) (f7 * 255.0f));
                        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[v0Var.x + 1]);
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
            case 11:
                Paint paint4 = (Paint) this.b;
                paint4.setColor(((uh.f) this.c).getThemedColor(j6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint4);
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                y1 y1Var = new y1(10);
                this.b = y1Var;
                y1Var.N = 100;
                y1Var.J = false;
                y1Var.M = true;
                y1Var.G = false;
                y1Var.K = true;
                y1Var.H = true;
                y1Var.r = 1;
                y1Var.w = 0.98f;
                y1Var.v = 0.98f;
                y1Var.u = 0.98f;
                y1Var.g = false;
                y1Var.o = 0.0f;
                y1Var.x = 750L;
                y1Var.y = 750;
                y1Var.c();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((y1) this.b).a.set(rectF);
                ((y1) this.b).b.set(rectF);
                ((y1) this.b).f();
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
            case 7:
                super.onMeasure(i10, i11);
                a();
                break;
            case 8:
            default:
                super.onMeasure(i10, i11);
                break;
            case 9:
                if (View.MeasureSpec.getSize(i10) <= AndroidUtilities.dp(260.0f)) {
                    super.onMeasure(i10, i11);
                    break;
                } else {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(320.0f), TLObject.FLAG_30), i11);
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
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        switch (this.a) {
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                org.telegram.ui.h hVar = (org.telegram.ui.h) this.c;
                hVar.b.setBounds(0, 0, i10, i11);
                hVar.b.setCornerRadius(Math.min(i10, i11) / 2.0f);
                ((org.telegram.ui.Components.voip.h) this.b).f = i10;
                break;
            case 8:
                v0 v0Var = (v0) this.c;
                Paint[] paintArr = (Paint[]) this.b;
                super.onSizeChanged(i10, i11, i12, i13);
                for (int i17 = 0; i17 < paintArr.length; i17++) {
                    if (i17 == 0 && v0Var.y) {
                        i14 = -8919716;
                        i15 = -11089922;
                    } else {
                        i14 = -9015575;
                        if (i17 == 0 || (i17 == 1 && v0Var.y)) {
                            i14 = -11033346;
                            i15 = -9015575;
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
                d80 d80Var = (d80) this.c;
                d80Var.h.setBounds(0, 0, i10, i11);
                d80Var.h.setCornerRadius(Math.min(i10, i11) / 2.0f);
                ((org.telegram.ui.Components.voip.h) this.b).f = i10;
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
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
    public void setTextColor(int i10) {
        switch (this.a) {
            case 7:
                super.setTextColor(j6.l1(0.2f, i10));
                ((h90) this.c).f(j6.l1(0.03f, i10), j6.l1(0.175f, i10), j6.l1(0.2f, i10), j6.l1(0.45f, i10));
                break;
            default:
                super.setTextColor(i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(v0 v0Var, Context context) {
        super(context);
        this.a = 8;
        this.c = v0Var;
        this.b = new Paint[v0Var.f.length];
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
    public n(Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 7:
                super(context);
                x80 x80Var = new x80(0);
                this.b = x80Var;
                h90 h90Var = new h90();
                this.c = h90Var;
                h90Var.x = x80Var;
                h90Var.u = 0.65f;
                h90Var.j(4.0f);
                setBackground(h90Var);
                break;
            default:
                this.c = new Path();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(uh.f fVar, Context context) {
        super(context);
        this.a = 11;
        this.c = fVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(gi.p pVar, Context context) {
        super(context);
        this.a = 2;
        this.c = pVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(d80 d80Var, Context context) {
        super(context);
        this.a = 9;
        this.c = d80Var;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.b = hVar;
        hVar.k = false;
        hVar.m = 2.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(org.telegram.ui.h hVar, Context context) {
        super(context);
        this.a = 4;
        this.c = hVar;
        org.telegram.ui.Components.voip.h hVar2 = new org.telegram.ui.Components.voip.h();
        this.b = hVar2;
        hVar2.k = false;
        hVar2.m = 2.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t tVar, Context context) {
        super(context);
        this.a = 0;
        this.c = tVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, f6 f6Var) {
        super(context);
        this.a = 1;
        this.c = f6Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(j0 j0Var, Context context) {
        super(context);
        this.a = 10;
        this.c = j0Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(vi viVar, Context context) {
        super(context);
        this.a = 5;
        this.c = viVar;
        this.b = new Paint(1);
    }
}
