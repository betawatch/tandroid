package ig;

import ag.u2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.g6;
import org.telegram.messenger.cd;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.s5;
import org.telegram.ui.c91;
import org.telegram.ui.m91;
import org.telegram.ui.n81;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s extends FrameLayout {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public int c;
    public Object d;
    public final Object e;
    public Object f;
    public Object h;

    public s(Context context, p6 p6Var) {
        super(context);
        this.c = org.telegram.messenger.i0.L(64.0f);
        g9 g9Var = new g9(context);
        this.d = g9Var;
        g9Var.setAspectFit(true);
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(12.0f));
        addView(g9Var, b6.c(-1.0f, -1));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, p6Var);
        this.e = radialProgress2;
        radialProgress2.E = 0.0f;
        radialProgress2.setIcon(10, false, false);
        radialProgress2.setColors(1107296256, 1107296256, -1, -1);
    }

    public void a(int i10) {
        TextView textView = (TextView) this.d;
        this.c = i10;
        ((o) this.e).c = i10;
        if (i10 == 0) {
            textView.setText(cd.L0(2131747680, null).toUpperCase());
        } else if (i10 == 1) {
            textView.setText(cd.L0(2131747682, null).toUpperCase());
        } else if (i10 == 2) {
            textView.setText(cd.L0(2131747683, null).toUpperCase());
        }
        b();
    }

    public void b() {
        u uVar = (u) this.h;
        this.b = true;
        o oVar = (o) this.e;
        oVar.d = i0.b.o(oVar.e.m1, zs.e4);
        oVar.a();
        oVar.invalidate();
        EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f;
        int selectionStart = editTextBoldCursor.getSelectionStart();
        int selectionEnd = editTextBoldCursor.getSelectionEnd();
        int i10 = this.c;
        if (i10 == 0) {
            editTextBoldCursor.setText(String.valueOf(Color.red(uVar.m1)));
        } else if (i10 == 1) {
            editTextBoldCursor.setText(String.valueOf(Color.green(uVar.m1)));
        } else if (i10 == 2) {
            editTextBoldCursor.setText(String.valueOf(Color.blue(uVar.m1)));
        }
        editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        this.b = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int i10 = this.a;
        float f7 = 1.0f;
        Object obj = this.e;
        final int i11 = 0;
        switch (i10) {
            case 1:
                RadialProgress2 radialProgress2 = (RadialProgress2) obj;
                super.dispatchDraw(canvas);
                if (this.b) {
                    Drawable t10 = ((g9) this.d).getImageReceiver().t();
                    final int i12 = 1;
                    if ((t10 instanceof s5) && ((s5) t10).d[4] > 0) {
                        ValueAnimator valueAnimator = (ValueAnimator) this.h;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            if ((radialProgress2.c ? radialProgress2.j : radialProgress2.i).w < 1.0f) {
                                radialProgress2.p(true, 1.0f);
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ValueAnimator) this.h).getAnimatedValue()).floatValue(), 0.0f);
                            this.f = ofFloat;
                            ofFloat.addListener(new bg.e(this, 27));
                            ((ValueAnimator) this.f).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.s4
                                public final /* synthetic */ ig.s b;

                                {
                                    this.b = this;
                                }

                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    switch (i11) {
                                        case 0:
                                            this.b.invalidate();
                                            break;
                                        default:
                                            this.b.invalidate();
                                            break;
                                    }
                                }
                            });
                            ((ValueAnimator) this.f).setDuration(250L);
                            ((ValueAnimator) this.f).start();
                        } else {
                            this.b = false;
                        }
                    } else if (((ValueAnimator) this.h) == null) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.h = ofFloat2;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.s4
                            public final /* synthetic */ ig.s b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                switch (i12) {
                                    case 0:
                                        this.b.invalidate();
                                        break;
                                    default:
                                        this.b.invalidate();
                                        break;
                                }
                            }
                        });
                        ((ValueAnimator) this.h).setStartDelay(250L);
                        ((ValueAnimator) this.h).setDuration(250L);
                        ((ValueAnimator) this.h).start();
                    }
                    ValueAnimator valueAnimator2 = (ValueAnimator) this.f;
                    if (valueAnimator2 == null) {
                        ValueAnimator valueAnimator3 = (ValueAnimator) this.h;
                        if (valueAnimator3 != null) {
                            radialProgress2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                            radialProgress2.draw(canvas);
                            break;
                        }
                    } else {
                        radialProgress2.E = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                        radialProgress2.draw(canvas);
                        break;
                    }
                }
                break;
            case 2:
                Paint paint = (Paint) obj;
                m91 m91Var = (m91) this.h;
                n81 n81Var = m91Var.a;
                if (this.b) {
                    RectF rectF = org.telegram.messenger.i0.P;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), zs.e4, 31);
                    t6.t(this, m91Var.y0, n81Var);
                    Paint d = n81Var.d("paintChatActionBackground");
                    ColorFilter colorFilter = d.getColorFilter();
                    d.setColorFilter((ColorMatrixColorFilter) this.f);
                    c91 c91Var = m91Var.y0;
                    if (c91Var != null && (c91Var.getBackground() instanceof jb0) && m91Var.m1 < 0.0f) {
                        f7 = 0.33f;
                    }
                    int alpha = d.getAlpha();
                    d.setAlpha((int) (alpha * f7));
                    canvas.drawRect(rectF, d);
                    d.setAlpha(alpha);
                    d.setColorFilter(colorFilter);
                    if (m91Var.N1) {
                        float f10 = m91Var.o1;
                        if (f10 > 0.0f) {
                            canvas.drawColor(i0.b.o(-16777216, (int) (f10 * 255.0f * m91Var.p1)));
                        }
                    }
                    canvas.save();
                    if (((LinearGradient) this.d) == null || this.c != getHeight()) {
                        int height = getHeight();
                        this.c = height;
                        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, height, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                        this.d = linearGradient;
                        paint.setShader(linearGradient);
                    }
                    canvas.drawRect(rectF, paint);
                    canvas.restore();
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int width = getWidth() / 2;
                int height = getHeight() / 2;
                RadialProgress2 radialProgress2 = (RadialProgress2) this.e;
                int i14 = this.c;
                radialProgress2.r(width - i14, height - i14, width + i14, height + i14);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(52.0f), TLObject.FLAG_30));
                break;
            case 1:
            default:
                super.onMeasure(i10, i11);
                break;
            case 2:
                super.onMeasure(i10, i11);
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt.getMeasuredWidth() > org.telegram.messenger.i0.L(420.0f)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(420.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), TLObject.FLAG_30));
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, Context context) {
        super(context);
        this.h = uVar;
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(-1711276033);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        addView(textView, b6.d(-2, -2.0f, 3, 8.0f, 0.0f, 8.0f, 0.0f));
        View oVar = new o(uVar, context);
        this.e = oVar;
        addView(oVar, b6.d(-1, -1.0f, 3, 0.0f, 16.0f, 78.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(t6.d0(org.telegram.messenger.i0.L(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(cd.L0(2131751355, null), 6);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(org.telegram.messenger.i0.o());
        editTextBoldCursor.addTextChangedListener(new u2(this));
        editTextBoldCursor.setOnFocusChangeListener(new g6(this, 1));
        editTextBoldCursor.setOnEditorActionListener(new r(0));
        addView(editTextBoldCursor, b6.e(72, 36, 85));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(m91 m91Var, Context context, boolean z10) {
        super(context);
        this.h = m91Var;
        this.b = z10;
        Paint paint = new Paint(3);
        this.e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.i0.i(colorMatrix, 0.4f);
        org.telegram.messenger.i0.n2(colorMatrix, 0.65f);
        this.f = new ColorMatrixColorFilter(colorMatrix);
    }
}
