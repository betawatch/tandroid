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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class gf0 extends FrameLayout {
    public final wjb a;
    public final pb0 b;
    public final be0 c;
    public final df0 d;
    public final jia e;
    public final RadioButton f;
    public final Paint h;
    public boolean n;
    public final View r;

    public gf0(Context context, wjb wjbVar) {
        super(context);
        pb0 pb0Var = new pb0((wjb) null);
        this.b = pb0Var;
        this.h = new Paint(1);
        this.a = wjbVar;
        View view = new View(context);
        this.r = view;
        addView(view, nme.o(-1, -1));
        zkb.h(bkb.g5, wjbVar, view);
        pb0Var.r = gl.L(40.0f);
        be0 be0Var = new be0(context);
        this.c = be0Var;
        be0Var.setRoundRadius(gl.L(20.0f));
        addView(be0Var);
        df0 df0Var = new df0(context, (byte) 0);
        this.d = df0Var;
        kk7.i(df0Var);
        kk7.i(be0Var);
        df0Var.setTextSize(16);
        int i = bkb.i5;
        zkb.W(df0Var, i, wjbVar);
        df0Var.setGravity(k96.a0 ? 5 : 3);
        addView(df0Var);
        jia jiaVar = new jia(context);
        this.e = jiaVar;
        jiaVar.setTextSize(14);
        zkb.W(jiaVar, i, wjbVar);
        jiaVar.setGravity(k96.a0 ? 5 : 3);
        addView(jiaVar);
        RadioButton radioButton = new RadioButton(context);
        this.f = radioButton;
        radioButton.setSize(gl.L(20.0f));
        zkb.O(radioButton, bkb.i7, bkb.D5, wjbVar);
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
        this.c.setLayoutParams(nme.d(40, 40.0f, (k96.a0 ? 5 : 3) | 16, b() ? 53.0f : 16.0f, 0.0f, b() ? 53.0f : 16.0f, 0.0f));
        boolean z = k96.a0;
        int i = (z ? 5 : 3) | 16;
        if (z) {
            f = 20.0f;
        } else {
            f = b() ? 105 : 70;
        }
        if (k96.a0) {
            f2 = b() ? 105 : 70;
        } else {
            f2 = 20.0f;
        }
        this.d.setLayoutParams(nme.d(-1, -2.0f, i, f, 0.0f, f2, 0.0f));
        boolean z2 = k96.a0;
        int i2 = (z2 ? 5 : 3) | 16;
        if (z2) {
            f3 = 20.0f;
        } else {
            f3 = b() ? 105 : 70;
        }
        if (k96.a0) {
            f4 = b() ? 105 : 70;
        } else {
            f4 = 20.0f;
        }
        this.e.setLayoutParams(nme.d(-1, -2.0f, i2, f3, 0.0f, f4, 0.0f));
        boolean z3 = k96.a0;
        this.f.setLayoutParams(nme.d(22, 22.0f, (z3 ? 5 : 3) | 16, z3 ? 15.0f : 20.0f, 0.0f, z3 ? 20.0f : 15.0f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.n) {
            int v0 = bkb.v0(bkb.c7, this.a);
            Paint paint = this.h;
            paint.setColor(v0);
            int i = b() ? kk7.p1 : 70;
            if (this.c.getVisibility() == 8) {
                i -= 40;
            }
            int a = a() + i;
            if (k96.a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - gl.L(a), getHeight(), paint);
            } else {
                canvas.drawRect(gl.L(a), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public final SpannableStringBuilder e(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
        cm2 cm2Var = new cm2(2, drawable);
        drawable.setBounds(0, gl.L(1.0f), gl.L(11.0f), gl.L(12.0f));
        spannableString.setSpan(cm2Var, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    public int getFullHeight() {
        return 56;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(getFullHeight()), TLObject.FLAG_30));
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
        jia jiaVar = this.e;
        df0 df0Var = this.d;
        if (isEmpty) {
            df0Var.setTranslationY(0.0f);
            jiaVar.setVisibility(8);
        } else {
            df0Var.setTranslationY(gl.L(-9.0f));
            jiaVar.setTranslationY(gl.L(12.0f));
            jiaVar.l(charSequence, false);
            jiaVar.setVisibility(0);
        }
        if (this.c.getVisibility() == 8) {
            if (k96.a0) {
                df0Var.setTranslationX(gl.L(40.0f));
                jiaVar.setTranslationX(gl.L(40.0f));
            } else {
                df0Var.setTranslationX(gl.L(-40.0f));
                jiaVar.setTranslationX(gl.L(-40.0f));
            }
        }
    }

    public void setSubtitleColorKey(int i) {
        zkb.W(this.e, i, this.a);
    }
}
