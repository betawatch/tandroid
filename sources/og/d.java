package og;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r8;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class d extends FrameLayout {
    public final p6 a;
    public final r8 b;
    public final g9 c;
    public final c d;
    public final u5 e;
    public final RadioButton f;
    public final Paint h;
    public boolean n;
    public final View r;

    public d(Context context, p6 p6Var) {
        super(context);
        r8 r8Var = new r8((p6) null);
        this.b = r8Var;
        this.h = new Paint(1);
        this.a = p6Var;
        View view = new View(context);
        this.r = view;
        addView(view, b6.o(-1, -1));
        a7.i(t6.h5, view, p6Var);
        r8Var.r = i0.L(40.0f);
        g9 g9Var = new g9(context);
        this.c = g9Var;
        g9Var.setRoundRadius(i0.L(20.0f));
        addView(g9Var);
        c cVar = new c(context, 0);
        this.d = cVar;
        zs.i(cVar);
        zs.i(g9Var);
        cVar.setTextSize(16);
        int i10 = t6.j5;
        a7.Y(cVar, i10, p6Var);
        cVar.setGravity(cd.X ? 5 : 3);
        addView(cVar);
        u5 u5Var = new u5(context);
        this.e = u5Var;
        u5Var.setTextSize(14);
        a7.Y(u5Var, i10, p6Var);
        u5Var.setGravity(cd.X ? 5 : 3);
        addView(u5Var);
        RadioButton radioButton = new RadioButton(context);
        this.f = radioButton;
        radioButton.setSize(i0.L(20.0f));
        a7.P(radioButton, t6.j7, t6.E5, p6Var);
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

    public abstract boolean b();

    public void c(boolean z10, boolean z11) {
        RadioButton radioButton = this.f;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z10, true);
        }
    }

    public void d() {
        float f7;
        float f10;
        float f11;
        float f12;
        this.c.setLayoutParams(b6.d(40, 40.0f, (cd.X ? 5 : 3) | 16, b() ? 53.0f : 16.0f, 0.0f, b() ? 53.0f : 16.0f, 0.0f));
        boolean z10 = cd.X;
        int i10 = (z10 ? 5 : 3) | 16;
        if (z10) {
            f7 = 20.0f;
        } else {
            f7 = b() ? 105 : 70;
        }
        if (cd.X) {
            f10 = b() ? 105 : 70;
        } else {
            f10 = 20.0f;
        }
        this.d.setLayoutParams(b6.d(-1, -2.0f, i10, f7, 0.0f, f10, 0.0f));
        boolean z11 = cd.X;
        int i11 = (z11 ? 5 : 3) | 16;
        if (z11) {
            f11 = 20.0f;
        } else {
            f11 = b() ? 105 : 70;
        }
        if (cd.X) {
            f12 = b() ? 105 : 70;
        } else {
            f12 = 20.0f;
        }
        this.e.setLayoutParams(b6.d(-1, -2.0f, i11, f11, 0.0f, f12, 0.0f));
        boolean z12 = cd.X;
        this.f.setLayoutParams(b6.d(22, 22.0f, (z12 ? 5 : 3) | 16, z12 ? 15.0f : 20.0f, 0.0f, z12 ? 20.0f : 15.0f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.n) {
            int w02 = t6.w0(t6.d7, this.a);
            Paint paint = this.h;
            paint.setColor(w02);
            int i10 = b() ? zs.q1 : 70;
            if (this.c.getVisibility() == 8) {
                i10 -= 40;
            }
            int a2 = a() + i10;
            if (cd.X) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - i0.L(a2), getHeight(), paint);
            } else {
                canvas.drawRect(i0.L(a2), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public final SpannableStringBuilder e(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
        dq dqVar = new dq(2, drawable);
        drawable.setBounds(0, i0.L(1.0f), i0.L(11.0f), i0.L(12.0f));
        spannableString.setSpan(dqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    public int getFullHeight() {
        return 56;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i0.L(getFullHeight()), TLObject.FLAG_30));
    }

    public void setDivider(boolean z10) {
        this.n = z10;
        invalidate();
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        c cVar = this.d;
        u5 u5Var = this.e;
        if (isEmpty) {
            cVar.setTranslationY(0.0f);
            u5Var.setVisibility(8);
        } else {
            cVar.setTranslationY(i0.L(-9.0f));
            u5Var.setTranslationY(i0.L(12.0f));
            u5Var.l(charSequence, false);
            u5Var.setVisibility(0);
        }
        if (this.c.getVisibility() == 8) {
            if (cd.X) {
                cVar.setTranslationX(i0.L(40.0f));
                u5Var.setTranslationX(i0.L(40.0f));
            } else {
                cVar.setTranslationX(i0.L(-40.0f));
                u5Var.setTranslationX(i0.L(-40.0f));
            }
        }
    }
}
