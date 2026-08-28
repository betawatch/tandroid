package dg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class d extends FrameLayout {
    public final b6 a;
    public final z8 b;
    public final o9 c;
    public final c d;
    public final h5 e;
    public final RadioButton f;
    public final Paint h;
    public boolean n;

    public d(Context context, b6 b6Var) {
        super(context);
        z8 z8Var = new z8((b6) null);
        this.b = z8Var;
        this.h = new Paint(1);
        this.a = b6Var;
        View view = new View(context);
        addView(view, e6.n(-1, -1));
        view.setBackgroundColor(f6.v0(f6.h5, b6Var));
        z8Var.r = AndroidUtilities.dp(40.0f);
        o9 o9Var = new o9(context);
        this.c = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(o9Var);
        c cVar = new c(context, 0);
        this.d = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        NotificationCenter.listenEmojiLoading(o9Var);
        cVar.setTextSize(16);
        int i9 = f6.j5;
        cVar.setTextColor(f6.v0(i9, b6Var));
        cVar.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(cVar);
        h5 h5Var = new h5(context);
        this.e = h5Var;
        h5Var.setTextSize(14);
        h5Var.setTextColor(f6.v0(i9, b6Var));
        h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(h5Var);
        RadioButton radioButton = new RadioButton(context);
        this.f = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(f6.v0(f6.j7, b6Var), f6.v0(f6.E5, b6Var));
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
        float f10;
        float f11;
        float f12;
        float f13;
        this.c.setLayoutParams(e6.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 16, b() ? 53.0f : 16.0f, 0.0f, b() ? 53.0f : 16.0f, 0.0f));
        boolean z10 = LocaleController.isRTL;
        int i9 = (z10 ? 5 : 3) | 16;
        if (z10) {
            f10 = 20.0f;
        } else {
            f10 = b() ? 105 : 70;
        }
        if (LocaleController.isRTL) {
            f11 = b() ? 105 : 70;
        } else {
            f11 = 20.0f;
        }
        this.d.setLayoutParams(e6.d(-1, -2.0f, i9, f10, 0.0f, f11, 0.0f));
        boolean z11 = LocaleController.isRTL;
        int i10 = (z11 ? 5 : 3) | 16;
        if (z11) {
            f12 = 20.0f;
        } else {
            f12 = b() ? 105 : 70;
        }
        if (LocaleController.isRTL) {
            f13 = b() ? 105 : 70;
        } else {
            f13 = 20.0f;
        }
        this.e.setLayoutParams(e6.d(-1, -2.0f, i10, f12, 0.0f, f13, 0.0f));
        boolean z12 = LocaleController.isRTL;
        this.f.setLayoutParams(e6.d(22, 22.0f, (z12 ? 5 : 3) | 16, z12 ? 15.0f : 20.0f, 0.0f, z12 ? 20.0f : 15.0f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.n) {
            int v02 = f6.v0(f6.d7, this.a);
            Paint paint = this.h;
            paint.setColor(v02);
            int i9 = b() ? 105 : 70;
            if (this.c.getVisibility() == 8) {
                i9 -= 40;
            }
            int a2 = a() + i9;
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
        eq eqVar = new eq(2, drawable);
        drawable.setBounds(0, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f));
        spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    public int getFullHeight() {
        return 56;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(getFullHeight()), TLObject.FLAG_30));
    }

    public void setDivider(boolean z10) {
        this.n = z10;
        invalidate();
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        c cVar = this.d;
        h5 h5Var = this.e;
        if (isEmpty) {
            cVar.setTranslationY(0.0f);
            h5Var.setVisibility(8);
        } else {
            cVar.setTranslationY(AndroidUtilities.dp(-9.0f));
            h5Var.setTranslationY(AndroidUtilities.dp(12.0f));
            h5Var.l(charSequence, false);
            h5Var.setVisibility(0);
        }
        if (this.c.getVisibility() == 8) {
            if (LocaleController.isRTL) {
                cVar.setTranslationX(AndroidUtilities.dp(40.0f));
                h5Var.setTranslationX(AndroidUtilities.dp(40.0f));
            } else {
                cVar.setTranslationX(AndroidUtilities.dp(-40.0f));
                h5Var.setTranslationX(AndroidUtilities.dp(-40.0f));
            }
        }
    }
}
