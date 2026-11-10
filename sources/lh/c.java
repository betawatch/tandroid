package lh;

import a8.r7;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.l1;
import c8.ha;
import c8.ka;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.qi;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class c extends LinearLayout {
    public static final /* synthetic */ int e = 0;
    public final h6 a;
    public final r7 b;
    public final r7 c;
    public float d;

    public c(Context context, h6 h6Var, qi qiVar, dh.c cVar) {
        super(context);
        r7 r7Var = new r7(this);
        this.b = r7Var;
        r7 r7Var2 = new r7(this);
        this.c = r7Var2;
        this.a = h6Var;
        kh.a c10 = kh.a.c(context, cVar, qiVar, h6Var);
        r7Var.b = c10;
        int i7 = 5;
        c10.setOnClickListener(new l1(i7));
        ka.b((kh.a) r7Var.b, 0.065f, 2.0f);
        kh.a c11 = kh.a.c(context, cVar, qiVar, h6Var);
        r7Var2.b = c11;
        c11.setOnClickListener(new l1(i7));
        ka.b((kh.a) r7Var2.b, 0.065f, 2.0f);
        a(r7Var, id.M0(2131746263, null), R.drawable.input_reply, false);
        a(r7Var2, id.M0(2131750587, null), R.drawable.input_forward, true);
        setOrientation(0);
        setClipChildren(false);
        addView((kh.a) r7Var.b, ha.m(1.0f, 0, 56, 1, -1, 0));
        addView((kh.a) r7Var2.b, ha.m(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(r7 r7Var, String str, int i7, boolean z9) {
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(g0.L(21.0f), 0, g0.L(21.0f), 0);
        textView.setCompoundDrawablePadding(g0.L(6.0f));
        int i10 = m6.Ll;
        h6 h6Var = this.a;
        t6.U(textView, i10, h6Var);
        textView.setTypeface(g0.o());
        Drawable mutate = getContext().getResources().getDrawable(i7).mutate();
        t6.x(this, mutate, m6.Kl, h6Var, PorterDuff.Mode.MULTIPLY);
        Drawable drawable = z9 ? mutate : null;
        if (z9) {
            mutate = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, mutate, (Drawable) null);
        r7Var.c = textView;
        ((kh.a) r7Var.b).addView(textView, ha.e(-2, -2, 17));
    }

    public final void b(r7 r7Var) {
        float f10 = this.d * ((te.a) r7Var.d).e;
        float f11 = (1.0f - f10) * (-g0.L(54.0f));
        float interpolation = (1.0f - se.a.a.getInterpolation(f10)) * (getMeasuredWidth() / 2.0f);
        if (r7Var == this.b) {
            interpolation *= -1.0f;
        }
        ((kh.a) r7Var.b).setTranslationX(interpolation);
        ((kh.a) r7Var.b).setTranslationY(f11);
        ((kh.a) r7Var.b).setAlpha(f10);
        ((kh.a) r7Var.b).setVisibility(f10 > 0.0f ? 0 : 4);
    }

    public View getForwardButton() {
        return (kh.a) this.c.b;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        b(this.c);
        b(this.b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((kh.a) this.c.b).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((kh.a) this.b.b).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f10) {
        if (this.d != f10) {
            this.d = f10;
            b(this.c);
            b(this.b);
        }
    }
}
