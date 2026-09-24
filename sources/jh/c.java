package jh;

import ai.e2;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.gj;
import w7.a6;
import w7.y5;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class c extends LinearLayout {
    public static final /* synthetic */ int e = 0;
    public final d6 a;
    public final cf.c b;
    public final cf.c c;
    public float d;

    public c(Context context, d6 d6Var, gj gjVar, ah.c cVar) {
        super(context);
        cf.c cVar2 = new cf.c(this);
        this.b = cVar2;
        cf.c cVar3 = new cf.c(this);
        this.c = cVar3;
        this.a = d6Var;
        ih.a c10 = ih.a.c(cVar, context, gjVar, d6Var);
        cVar2.a = c10;
        c10.setOnClickListener(new e2(5));
        a6.b((ih.a) cVar2.a, 0.065f, 2.0f);
        ih.a c11 = ih.a.c(cVar, context, gjVar, d6Var);
        cVar3.a = c11;
        c11.setOnClickListener(new e2(5));
        a6.b((ih.a) cVar3.a, 0.065f, 2.0f);
        a(cVar2, LocaleController.getString(R.string.Reply), R.drawable.input_reply, false);
        a(cVar3, LocaleController.getString(R.string.Forward), R.drawable.input_forward, true);
        setOrientation(0);
        setClipChildren(false);
        addView((ih.a) cVar2.a, y5.m(1.0f, 0, 56, 1, -1, 0));
        addView((ih.a) cVar3.a, y5.m(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(cf.c cVar, String str, int i10, boolean z10) {
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        int i11 = h6.Xk;
        d6 d6Var = this.a;
        textView.setTextColor(h6.v0(i11, d6Var));
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(h6.v0(h6.Wk, d6Var), PorterDuff.Mode.MULTIPLY));
        Drawable drawable = z10 ? mutate : null;
        if (z10) {
            mutate = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, mutate, (Drawable) null);
        cVar.b = textView;
        ((ih.a) cVar.a).addView(textView, y5.e(-2, -2, 17));
    }

    public final void b(cf.c cVar) {
        float f7 = this.d * ((le.c) cVar.c).e;
        float f10 = (1.0f - f7) * (-AndroidUtilities.dp(54.0f));
        float interpolation = (1.0f - ke.a.a.getInterpolation(f7)) * (getMeasuredWidth() / 2.0f);
        if (cVar == this.b) {
            interpolation *= -1.0f;
        }
        ((ih.a) cVar.a).setTranslationX(interpolation);
        ((ih.a) cVar.a).setTranslationY(f10);
        ((ih.a) cVar.a).setAlpha(f7);
        ((ih.a) cVar.a).setVisibility(f7 > 0.0f ? 0 : 4);
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
