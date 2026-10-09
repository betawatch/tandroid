package jh;

import ai.e2;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.u5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.kj;
import w7.x5;
import w7.z5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class c extends LinearLayout {
    public static final /* synthetic */ int e = 0;
    public final e6 a;
    public final u5 b;
    public final u5 c;
    public float d;

    public c(Context context, e6 e6Var, kj kjVar, ah.c cVar) {
        super(context);
        u5 u5Var = new u5(this);
        this.b = u5Var;
        u5 u5Var2 = new u5(this);
        this.c = u5Var2;
        this.a = e6Var;
        ih.a c10 = ih.a.c(cVar, context, kjVar, e6Var);
        u5Var.a = c10;
        c10.setOnClickListener(new e2(5));
        z5.b((ih.a) u5Var.a, 0.065f, 2.0f);
        ih.a c11 = ih.a.c(cVar, context, kjVar, e6Var);
        u5Var2.a = c11;
        c11.setOnClickListener(new e2(5));
        z5.b((ih.a) u5Var2.a, 0.065f, 2.0f);
        a(u5Var, LocaleController.getString(R.string.Reply), R.drawable.input_reply, false);
        a(u5Var2, LocaleController.getString(R.string.Forward), R.drawable.input_forward, true);
        setOrientation(0);
        setClipChildren(false);
        addView((ih.a) u5Var.a, x5.m(1.0f, 0, 56, 1, -1, 0));
        addView((ih.a) u5Var2.a, x5.m(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(u5 u5Var, String str, int i10, boolean z10) {
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        int i11 = i6.Xk;
        e6 e6Var = this.a;
        textView.setTextColor(i6.w0(i11, e6Var));
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(i6.w0(i6.Wk, e6Var), PorterDuff.Mode.MULTIPLY));
        Drawable drawable = z10 ? mutate : null;
        if (z10) {
            mutate = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, mutate, (Drawable) null);
        u5Var.b = textView;
        ((ih.a) u5Var.a).addView(textView, x5.e(-2, -2, 17));
    }

    public final void b(u5 u5Var) {
        float f7 = this.d * ((me.b) u5Var.c).e;
        float f10 = (1.0f - f7) * (-AndroidUtilities.dp(54.0f));
        float interpolation = (1.0f - le.a.a.getInterpolation(f7)) * (getMeasuredWidth() / 2.0f);
        if (u5Var == this.b) {
            interpolation *= -1.0f;
        }
        ((ih.a) u5Var.a).setTranslationX(interpolation);
        ((ih.a) u5Var.a).setTranslationY(f10);
        ((ih.a) u5Var.a).setAlpha(f7);
        ((ih.a) u5Var.a).setVisibility(f7 > 0.0f ? 0 : 4);
    }

    public View getForwardButton() {
        return (ih.a) this.c.a;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        b(this.c);
        b(this.b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((ih.a) this.c.a).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((ih.a) this.b.a).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f7) {
        if (this.d != f7) {
            this.d = f7;
            b(this.c);
            b(this.b);
        }
    }
}
