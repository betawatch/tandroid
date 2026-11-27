// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class if0 extends FrameLayout {
    public final vnb a;
    public final rb0 b;
    public final de0 c;
    public final ff0 d;
    public final ema e;
    public final RadioButton f;
    public final Paint h;
    public boolean n;
    public final View r;

    public if0(Context context, vnb vnbVar) {
        super(context);
        rb0 rb0Var = new rb0((vnb) null);
        this.b = rb0Var;
        this.h = new Paint(1);
        this.a = vnbVar;
        View view = new View(context);
        this.r = view;
        addView(view, tre.o(-1, -1));
        yob.h(aob.h5, vnbVar, view);
        rb0Var.r = hl.L(40.0f);
        de0 de0Var = new de0(context);
        this.c = de0Var;
        de0Var.setRoundRadius(hl.L(20.0f));
        addView(de0Var);
        ff0 ff0Var = new ff0(context, (byte) 0);
        this.d = ff0Var;
        jn7.i(ff0Var);
        jn7.i(de0Var);
        ff0Var.setTextSize(16);
        int i = aob.j5;
        yob.W(ff0Var, i, vnbVar);
        ff0Var.setGravity(ob6.a0 ? 5 : 3);
        addView(ff0Var);
        ema emaVar = new ema(context);
        this.e = emaVar;
        emaVar.setTextSize(14);
        yob.W(emaVar, i, vnbVar);
        emaVar.setGravity(ob6.a0 ? 5 : 3);
        addView(emaVar);
        RadioButton radioButton = new RadioButton(context);
        this.f = radioButton;
        radioButton.setSize(hl.L(20.0f));
        yob.O(radioButton, aob.j7, aob.E5, vnbVar);
        addView(radioButton);
        d();
        if (b()) {
            return;
        }
        radioButton.setVisibility(8);
    }

    public int a() {
        return 0;
    }

    public boolean b() {
        return false;
    }

    public void c(boolean z, boolean z2) {
        RadioButton radioButton = this.f;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z, true);
        }
    }

    public void d() {
        float f;
        float f2;
        float f3;
        float f4;
        this.c.setLayoutParams(tre.d(40, 40.0f, (ob6.a0 ? 5 : 3) | 16, b() ? 53.0f : 16.0f, 0.0f, b() ? 53.0f : 16.0f, 0.0f));
        boolean z = ob6.a0;
        int i = (z ? 5 : 3) | 16;
        if (z) {
            f = 20.0f;
        } else {
            f = b() ? 105 : 70;
        }
        if (ob6.a0) {
            f2 = b() ? 105 : 70;
        } else {
            f2 = 20.0f;
        }
        this.d.setLayoutParams(tre.d(-1, -2.0f, i, f, 0.0f, f2, 0.0f));
        boolean z2 = ob6.a0;
        int i2 = (z2 ? 5 : 3) | 16;
        if (z2) {
            f3 = 20.0f;
        } else {
            f3 = b() ? 105 : 70;
        }
        if (ob6.a0) {
            f4 = b() ? 105 : 70;
        } else {
            f4 = 20.0f;
        }
        this.e.setLayoutParams(tre.d(-1, -2.0f, i2, f3, 0.0f, f4, 0.0f));
        boolean z3 = ob6.a0;
        this.f.setLayoutParams(tre.d(22, 22.0f, (z3 ? 5 : 3) | 16, z3 ? 15.0f : 20.0f, 0.0f, z3 ? 20.0f : 15.0f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.n) {
            int v0 = aob.v0(aob.d7, this.a);
            Paint paint = this.h;
            paint.setColor(v0);
            int i = b() ? jn7.p1 : 70;
            if (this.c.getVisibility() == 8) {
                i -= 40;
            }
            int a = a() + i;
            if (ob6.a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - hl.L(a), getHeight(), paint);
            } else {
                canvas.drawRect(hl.L(a), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public final SpannableStringBuilder e(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
        wm2 wm2Var = new wm2(2, drawable);
        drawable.setBounds(0, hl.L(1.0f), hl.L(11.0f), hl.L(12.0f));
        spannableString.setSpan(wm2Var, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    public int getFullHeight() {
        return 56;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(getFullHeight()), TLObject.FLAG_30));
    }

    public void setCellBackgroundVisible(boolean z) {
        this.r.setVisibility(z ? 0 : 8);
    }

    public void setDivider(boolean z) {
        this.n = z;
        invalidate();
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        ema emaVar = this.e;
        ff0 ff0Var = this.d;
        if (isEmpty) {
            ff0Var.setTranslationY(0.0f);
            emaVar.setVisibility(8);
        } else {
            ff0Var.setTranslationY(hl.L(-9.0f));
            emaVar.setTranslationY(hl.L(12.0f));
            emaVar.l(charSequence, false);
            emaVar.setVisibility(0);
        }
        if (this.c.getVisibility() == 8) {
            if (ob6.a0) {
                ff0Var.setTranslationX(hl.L(40.0f));
                emaVar.setTranslationX(hl.L(40.0f));
            } else {
                ff0Var.setTranslationX(hl.L(-40.0f));
                emaVar.setTranslationX(hl.L(-40.0f));
            }
        }
    }

    public void setSubtitleColorKey(int i) {
        yob.W(this.e, i, this.a);
    }
}
