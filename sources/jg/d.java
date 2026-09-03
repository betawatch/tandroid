package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class d extends FrameLayout {
    public final g6 a;
    public final z8 b;
    public final p9 c;
    public final c d;
    public final l5 e;
    public final RadioButton f;
    public final Paint h;
    public boolean n;

    public d(Context context, g6 g6Var) {
        super(context);
        z8 z8Var = new z8((g6) null);
        this.b = z8Var;
        this.h = new Paint(1);
        this.a = g6Var;
        View view = new View(context);
        addView(view, c6.n(-1, -1));
        view.setBackgroundColor(k6.v0(k6.h5, g6Var));
        z8Var.r = AndroidUtilities.dp(40.0f);
        p9 p9Var = new p9(context);
        this.c = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(p9Var);
        c cVar = new c(context, 0);
        this.d = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        NotificationCenter.listenEmojiLoading(p9Var);
        cVar.setTextSize(16);
        int i10 = k6.j5;
        cVar.setTextColor(k6.v0(i10, g6Var));
        cVar.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(cVar);
        l5 l5Var = new l5(context);
        this.e = l5Var;
        l5Var.setTextSize(14);
        l5Var.setTextColor(k6.v0(i10, g6Var));
        l5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(l5Var);
        RadioButton radioButton = new RadioButton(context);
        this.f = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(k6.v0(k6.j7, g6Var), k6.v0(k6.E5, g6Var));
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

    public void c(boolean z4, boolean z10) {
        RadioButton radioButton = this.f;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z4, true);
        }
    }

    public void d() {
        float f10;
        float f11;
        float f12;
        float f13;
        this.c.setLayoutParams(c6.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 16, b() ? 53.0f : 16.0f, 0.0f, b() ? 53.0f : 16.0f, 0.0f));
        boolean z4 = LocaleController.isRTL;
        int i10 = (z4 ? 5 : 3) | 16;
        if (z4) {
            f10 = 20.0f;
        } else {
            f10 = b() ? 105 : 70;
        }
        if (LocaleController.isRTL) {
            f11 = b() ? 105 : 70;
        } else {
            f11 = 20.0f;
        }
        this.d.setLayoutParams(c6.d(-1, -2.0f, i10, f10, 0.0f, f11, 0.0f));
        boolean z10 = LocaleController.isRTL;
        int i11 = (z10 ? 5 : 3) | 16;
        if (z10) {
            f12 = 20.0f;
        } else {
            f12 = b() ? 105 : 70;
        }
        if (LocaleController.isRTL) {
            f13 = b() ? 105 : 70;
        } else {
            f13 = 20.0f;
        }
        this.e.setLayoutParams(c6.d(-1, -2.0f, i11, f12, 0.0f, f13, 0.0f));
        boolean z11 = LocaleController.isRTL;
        this.f.setLayoutParams(c6.d(22, 22.0f, (z11 ? 5 : 3) | 16, z11 ? 15.0f : 20.0f, 0.0f, z11 ? 20.0f : 15.0f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.n) {
            int v02 = k6.v0(k6.d7, this.a);
            Paint paint = this.h;
            paint.setColor(v02);
            int i10 = b() ? 105 : 70;
            if (this.c.getVisibility() == 8) {
                i10 -= 40;
            }
            int a2 = a() + i10;
            if (LocaleController.isRTL) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(a2), getHeight(), paint);
            } else {
                canvas.drawRect(AndroidUtilities.dp(a2), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public final SpannableStringBuilder e(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.attach_arrow_right);
        oq oqVar = new oq(2, drawable);
        drawable.setBounds(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f));
        spannableString.setSpan(oqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    public int getFullHeight() {
        return 56;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(getFullHeight()), TLObject.FLAG_30));
    }

    public void setDivider(boolean z4) {
        this.n = z4;
        invalidate();
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        c cVar = this.d;
        l5 l5Var = this.e;
        if (isEmpty) {
            cVar.setTranslationY(0.0f);
            l5Var.setVisibility(8);
        } else {
            cVar.setTranslationY(AndroidUtilities.dp(-9.0f));
            l5Var.setTranslationY(AndroidUtilities.dp(12.0f));
            l5Var.l(charSequence, false);
            l5Var.setVisibility(0);
        }
        if (this.c.getVisibility() == 8) {
            if (LocaleController.isRTL) {
                cVar.setTranslationX(AndroidUtilities.dp(40.0f));
                l5Var.setTranslationX(AndroidUtilities.dp(40.0f));
            } else {
                cVar.setTranslationX(AndroidUtilities.dp(-40.0f));
                l5Var.setTranslationX(AndroidUtilities.dp(-40.0f));
            }
        }
    }
}
