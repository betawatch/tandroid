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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class gg0 extends FrameLayout {
    public final ylb a;
    public final pc0 b;
    public final bf0 c;
    public final dg0 d;
    public final lka e;
    public final RadioButton f;
    public final Paint h;
    public boolean n;
    public final View r;

    public gg0(Context context, ylb ylbVar) {
        super(context);
        pc0 pc0Var = new pc0((ylb) null);
        this.b = pc0Var;
        this.h = new Paint(1);
        this.a = ylbVar;
        View view = new View(context);
        this.r = view;
        addView(view, qoe.o(-1, -1));
        anb.h(cmb.g5, ylbVar, view);
        pc0Var.r = gm.L(40.0f);
        bf0 bf0Var = new bf0(context);
        this.c = bf0Var;
        bf0Var.setRoundRadius(gm.L(20.0f));
        addView(bf0Var);
        dg0 dg0Var = new dg0(context, (byte) 0);
        this.d = dg0Var;
        nm7.i(dg0Var);
        nm7.i(bf0Var);
        dg0Var.setTextSize(16);
        int i = cmb.i5;
        anb.W(dg0Var, i, ylbVar);
        dg0Var.setGravity(jb6.a0 ? 5 : 3);
        addView(dg0Var);
        lka lkaVar = new lka(context);
        this.e = lkaVar;
        lkaVar.setTextSize(14);
        anb.W(lkaVar, i, ylbVar);
        lkaVar.setGravity(jb6.a0 ? 5 : 3);
        addView(lkaVar);
        RadioButton radioButton = new RadioButton(context);
        this.f = radioButton;
        radioButton.setSize(gm.L(20.0f));
        anb.O(radioButton, cmb.i7, cmb.D5, ylbVar);
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
        this.c.setLayoutParams(qoe.d(40, 40.0f, (jb6.a0 ? 5 : 3) | 16, b() ? 53.0f : 16.0f, 0.0f, b() ? 53.0f : 16.0f, 0.0f));
        boolean z = jb6.a0;
        int i = (z ? 5 : 3) | 16;
        if (z) {
            f = 20.0f;
        } else {
            f = b() ? 105 : 70;
        }
        if (jb6.a0) {
            f2 = b() ? 105 : 70;
        } else {
            f2 = 20.0f;
        }
        this.d.setLayoutParams(qoe.d(-1, -2.0f, i, f, 0.0f, f2, 0.0f));
        boolean z2 = jb6.a0;
        int i2 = (z2 ? 5 : 3) | 16;
        if (z2) {
            f3 = 20.0f;
        } else {
            f3 = b() ? 105 : 70;
        }
        if (jb6.a0) {
            f4 = b() ? 105 : 70;
        } else {
            f4 = 20.0f;
        }
        this.e.setLayoutParams(qoe.d(-1, -2.0f, i2, f3, 0.0f, f4, 0.0f));
        boolean z3 = jb6.a0;
        this.f.setLayoutParams(qoe.d(22, 22.0f, (z3 ? 5 : 3) | 16, z3 ? 15.0f : 20.0f, 0.0f, z3 ? 20.0f : 15.0f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.n) {
            int v0 = cmb.v0(cmb.c7, this.a);
            Paint paint = this.h;
            paint.setColor(v0);
            int i = b() ? nm7.p1 : 70;
            if (this.c.getVisibility() == 8) {
                i -= 40;
            }
            int a = a() + i;
            if (jb6.a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - gm.L(a), getHeight(), paint);
            } else {
                canvas.drawRect(gm.L(a), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public final SpannableStringBuilder e(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
        pn2 pn2Var = new pn2(2, drawable);
        drawable.setBounds(0, gm.L(1.0f), gm.L(11.0f), gm.L(12.0f));
        spannableString.setSpan(pn2Var, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    public int getFullHeight() {
        return 56;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(getFullHeight()), TLObject.FLAG_30));
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
        lka lkaVar = this.e;
        dg0 dg0Var = this.d;
        if (isEmpty) {
            dg0Var.setTranslationY(0.0f);
            lkaVar.setVisibility(8);
        } else {
            dg0Var.setTranslationY(gm.L(-9.0f));
            lkaVar.setTranslationY(gm.L(12.0f));
            lkaVar.l(charSequence, false);
            lkaVar.setVisibility(0);
        }
        if (this.c.getVisibility() == 8) {
            if (jb6.a0) {
                dg0Var.setTranslationX(gm.L(40.0f));
                lkaVar.setTranslationX(gm.L(40.0f));
            } else {
                dg0Var.setTranslationX(gm.L(-40.0f));
                lkaVar.setTranslationX(gm.L(-40.0f));
            }
        }
    }

    public void setSubtitleColorKey(int i) {
        anb.W(this.e, i, this.a);
    }
}
