package fg;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.z80;
import org.telegram.ui.v70;
import wh.v5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class s0 extends TextView {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(org.telegram.ui.Components.voip.v0 v0Var, Context context) {
        super(context);
        this.a = 6;
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

    public void a() {
        k90 k90Var = (k90) this.c;
        z80 z80Var = (z80) this.b;
        if (z80Var == null || k90Var == null) {
            return;
        }
        z80Var.rewind();
        if (getLayout() != null && getLayout().getText() != null) {
            z80Var.e(getLayout(), 0, getPaddingLeft(), getPaddingTop());
            getLayout().getSelectionPath(0, getLayout().getText().length(), z80Var);
        }
        k90Var.k();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        g6 g6Var;
        switch (this.a) {
            case 0:
                Paint paint = (Paint) this.b;
                int i10 = k6.z6;
                g6Var = ((h3) ((u0) this.c).e).resourcesProvider;
                paint.setColor(k6.l1(0.8f, k6.v0(i10, g6Var)));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(1.0f);
                float height = getHeight() / 2.0f;
                Layout layout = getLayout();
                int i11 = 0;
                for (int i12 = 0; i12 < layout.getLineCount(); i12++) {
                    i11 = Math.max(i11, (int) layout.getLineWidth(i12));
                }
                float f10 = i11 / 2.0f;
                canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f10) - AndroidUtilities.dp(8.0f), height, paint);
                canvas.drawLine((getWidth() / 2.0f) + f10 + AndroidUtilities.dp(8.0f), height, getWidth(), height, paint);
                super.dispatchDraw(canvas);
                break;
            case 8:
                Paint paint2 = (Paint) this.b;
                int dp = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout2 = getLayout();
                if (layout2 != null) {
                    paint2.setColor(k6.l1(0.45f, k6.v0(k6.y6, ((ph.l) this.c).T.c)));
                    float f11 = dp;
                    float f12 = max / 2.0f;
                    float f13 = f11 - f12;
                    float f14 = f11 + f12;
                    canvas.drawRect(0.0f, f13, (getWidth() - (layout2.getLineWidth(0) + AndroidUtilities.dp(16.0f))) / 2.0f, f14, paint2);
                    canvas.drawRect(((layout2.getLineWidth(0) + getWidth()) + AndroidUtilities.dp(16.0f)) / 2.0f, f13, getWidth(), f14, paint2);
                }
                super.dispatchDraw(canvas);
                break;
            case 9:
                Paint paint3 = (Paint) this.b;
                int dp2 = AndroidUtilities.dp(1.0f) + (getHeight() / 2);
                int max2 = Math.max(1, AndroidUtilities.dp(0.66f));
                Layout layout3 = getLayout();
                if (layout3 != null) {
                    paint3.setColor(k6.l1(0.45f, k6.v0(k6.y6, (g6) this.c)));
                    float f15 = dp2;
                    float f16 = max2 / 2.0f;
                    float f17 = f15 - f16;
                    float f18 = f15 + f16;
                    canvas.drawRect(0.0f, f17, (getWidth() - (layout3.getLineWidth(0) + AndroidUtilities.dp(16.0f))) / 2.0f, f18, paint3);
                    canvas.drawRect(((layout3.getLineWidth(0) + getWidth()) + AndroidUtilities.dp(16.0f)) / 2.0f, f17, getWidth(), f18, paint3);
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
            case 2:
                ((org.telegram.ui.i) this.c).b.draw(canvas);
                super.draw(canvas);
                break;
            case 7:
                ((v70) this.c).h.draw(canvas);
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
            case 5:
                super.onDetachedFromWindow();
                ((k90) this.c).b = -1L;
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                Paint paint = (Paint) this.b;
                paint.setColor(((hh.f) this.c).getThemedColor(k6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint);
                super.onDraw(canvas);
                break;
            case 2:
                super.onDraw(canvas);
                if (((org.telegram.ui.i) this.c).w) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    ((org.telegram.ui.Components.voip.h) this.b).a(getMeasuredHeight() / 2.0f, canvas, rectF, null);
                    invalidate();
                    break;
                }
                break;
            case 3:
                Paint paint2 = (Paint) this.b;
                paint2.setColor(((mi) this.c).getThemedColor(k6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint2);
                super.onDraw(canvas);
                break;
            case 4:
                if (((o2) this.b) != null) {
                    canvas.save();
                    canvas.clipPath((Path) this.c);
                    ((o2) this.b).d(canvas);
                    canvas.restore();
                    invalidate();
                }
                super.onDraw(canvas);
                break;
            case 5:
            case 8:
            case 9:
            default:
                super.onDraw(canvas);
                break;
            case 6:
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) this.b;
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.c;
                paintArr[v0Var.x].setAlpha(255);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[v0Var.x]);
                float f10 = v0Var.w;
                if (f10 > 0.0f) {
                    int i10 = v0Var.x;
                    if (i10 + 1 < paintArr.length) {
                        paintArr[i10 + 1].setAlpha((int) (f10 * 255.0f));
                        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintArr[v0Var.x + 1]);
                    }
                }
                super.onDraw(canvas);
                break;
            case 7:
                super.onDraw(canvas);
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.b).a(getMeasuredHeight() / 2.0f, canvas, rectF3, null);
                invalidate();
                break;
            case 10:
                Paint paint3 = (Paint) this.b;
                paint3.setColor(((th.n) this.c).getThemedColor(k6.Oh));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), paint3);
                super.onDraw(canvas);
                break;
            case 11:
                Paint paint4 = (Paint) this.b;
                wh.a aVar = ((v5) this.c).x;
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
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 4:
                super.onLayout(z4, i10, i11, i12, i13);
                o2 o2Var = new o2(10);
                this.b = o2Var;
                o2Var.N = 100;
                o2Var.J = false;
                o2Var.M = true;
                o2Var.G = false;
                o2Var.K = true;
                o2Var.H = true;
                o2Var.r = 1;
                o2Var.w = 0.98f;
                o2Var.v = 0.98f;
                o2Var.u = 0.98f;
                o2Var.g = false;
                o2Var.o = 0.0f;
                o2Var.x = 750L;
                o2Var.y = 750;
                o2Var.c();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                ((o2) this.b).a.set(rectF);
                ((o2) this.b).b.set(rectF);
                ((o2) this.b).f();
                Path path = (Path) this.c;
                path.reset();
                path.addRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, Path.Direction.CW);
                break;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 5:
                super.onMeasure(i10, i11);
                a();
                break;
            case 6:
            default:
                super.onMeasure(i10, i11);
                break;
            case 7:
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
            case 2:
                super.onSizeChanged(i10, i11, i12, i13);
                org.telegram.ui.i iVar = (org.telegram.ui.i) this.c;
                iVar.b.setBounds(0, 0, i10, i11);
                iVar.b.setCornerRadius(Math.min(i10, i11) / 2.0f);
                ((org.telegram.ui.Components.voip.h) this.b).f = i10;
                break;
            case 6:
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.c;
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
            case 7:
                super.onSizeChanged(i10, i11, i12, i13);
                v70 v70Var = (v70) this.c;
                v70Var.h.setBounds(0, 0, i10, i11);
                v70Var.h.setCornerRadius(Math.min(i10, i11) / 2.0f);
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
            case 5:
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
            case 5:
                super.setTextColor(k6.l1(0.2f, i10));
                ((k90) this.c).f(k6.l1(0.03f, i10), k6.l1(0.175f, i10), k6.l1(0.2f, i10), k6.l1(0.45f, i10));
                break;
            default:
                super.setTextColor(i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(v5 v5Var, Context context) {
        super(context);
        this.a = 11;
        this.c = v5Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 5:
                super(context);
                z80 z80Var = new z80(0);
                this.b = z80Var;
                k90 k90Var = new k90();
                this.c = k90Var;
                k90Var.x = z80Var;
                k90Var.u = 0.65f;
                k90Var.j(4.0f);
                setBackground(k90Var);
                break;
            default:
                this.c = new Path();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(hh.f fVar, Context context) {
        super(context);
        this.a = 1;
        this.c = fVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(th.n nVar, Context context) {
        super(context);
        this.a = 10;
        this.c = nVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(v70 v70Var, Context context) {
        super(context);
        this.a = 7;
        this.c = v70Var;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.b = hVar;
        hVar.k = false;
        hVar.m = 2.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(org.telegram.ui.i iVar, Context context) {
        super(context);
        this.a = 2;
        this.c = iVar;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.b = hVar;
        hVar.k = false;
        hVar.m = 2.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(ph.l lVar, Context context) {
        super(context);
        this.a = 8;
        this.c = lVar;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(Context context, g6 g6Var) {
        super(context);
        this.a = 9;
        this.c = g6Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(u0 u0Var, Context context) {
        super(context);
        this.a = 0;
        this.c = u0Var;
        this.b = new Paint(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(mi miVar, Context context) {
        super(context);
        this.a = 3;
        this.c = miVar;
        this.b = new Paint(1);
    }
}
