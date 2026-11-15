package lh;

import a8.r7;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.o;
import c8.ja;
import c8.na;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.oi;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class c extends LinearLayout {
    public static final /* synthetic */ int e = 0;
    public final e6 a;
    public final r7 b;
    public final r7 c;
    public float d;

    public c(Context context, e6 e6Var, oi oiVar, dh.c cVar) {
        super(context);
        r7 r7Var = new r7(this);
        this.b = r7Var;
        r7 r7Var2 = new r7(this);
        this.c = r7Var2;
        this.a = e6Var;
        kh.a c10 = kh.a.c(context, cVar, oiVar, e6Var);
        r7Var.b = c10;
        int i7 = 8;
        c10.setOnClickListener(new o(i7));
        na.b((kh.a) r7Var.b, 0.065f, 2.0f);
        kh.a c11 = kh.a.c(context, cVar, oiVar, e6Var);
        r7Var2.b = c11;
        c11.setOnClickListener(new o(i7));
        na.b((kh.a) r7Var2.b, 0.065f, 2.0f);
        a(r7Var, hd.M0(2131746263, null), R.drawable.input_reply, false);
        a(r7Var2, hd.M0(2131750587, null), R.drawable.input_forward, true);
        setOrientation(0);
        setClipChildren(false);
        addView((kh.a) r7Var.b, ja.m(1.0f, 0, 56, 1, -1, 0));
        addView((kh.a) r7Var2.b, ja.m(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(r7 r7Var, String str, int i7, boolean z10) {
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(g0.L(21.0f), 0, g0.L(21.0f), 0);
        textView.setCompoundDrawablePadding(g0.L(6.0f));
        int i10 = j6.Ol;
        e6 e6Var = this.a;
        q6.U(textView, i10, e6Var);
        textView.setTypeface(g0.o());
        Drawable mutate = getContext().getResources().getDrawable(i7).mutate();
        q6.x(this, mutate, j6.Nl, e6Var, PorterDuff.Mode.MULTIPLY);
        Drawable drawable = z10 ? mutate : null;
        if (z10) {
            mutate = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, mutate, (Drawable) null);
        r7Var.c = textView;
        ((kh.a) r7Var.b).addView(textView, ja.e(-2, -2, 17));
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
