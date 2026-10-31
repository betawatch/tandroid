package bh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.jj;
import w7.b6;
import w7.e6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e extends LinearLayout {
    public static final /* synthetic */ int e = 0;
    public final p6 a;
    public final d b;
    public final d c;
    public float d;

    public e(Context context, p6 p6Var, jj jjVar, tg.b bVar) {
        super(context);
        d dVar = new d(this);
        this.b = dVar;
        d dVar2 = new d(this);
        this.c = dVar2;
        this.a = p6Var;
        ah.a c10 = ah.a.c(context, p6Var, bVar, jjVar);
        dVar.a = c10;
        int i10 = 0;
        c10.setOnClickListener(new c(i10));
        e6.b((ah.a) dVar.a, 0.065f, 2.0f);
        ah.a c11 = ah.a.c(context, p6Var, bVar, jjVar);
        dVar2.a = c11;
        c11.setOnClickListener(new c(i10));
        e6.b((ah.a) dVar2.a, 0.065f, 2.0f);
        a(dVar, cd.L0(2131746278, null), R.drawable.input_reply, false);
        a(dVar2, cd.L0(2131750588, null), R.drawable.input_forward, true);
        setOrientation(0);
        setClipChildren(false);
        addView((ah.a) dVar.a, b6.m(1.0f, 0, 56, 1, -1, 0));
        addView((ah.a) dVar2.a, b6.m(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(d dVar, String str, int i10, boolean z10) {
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(i0.L(21.0f), 0, i0.L(21.0f), 0);
        textView.setCompoundDrawablePadding(i0.L(6.0f));
        int i11 = t6.Ll;
        p6 p6Var = this.a;
        a7.V(textView, i11, p6Var);
        textView.setTypeface(i0.o());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        a7.y(this, mutate, t6.Kl, p6Var, PorterDuff.Mode.MULTIPLY);
        Drawable drawable = z10 ? mutate : null;
        if (z10) {
            mutate = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, mutate, (Drawable) null);
        dVar.b = textView;
        ((ah.a) dVar.a).addView(textView, b6.e(-2, -2, 17));
    }

    public final void b(d dVar) {
        float f7 = this.d * ((fe.b) dVar.c).e;
        float f10 = (1.0f - f7) * (-i0.L(54.0f));
        float interpolation = (1.0f - ee.a.a.getInterpolation(f7)) * (getMeasuredWidth() / 2.0f);
        if (dVar == this.b) {
            interpolation *= -1.0f;
        }
        ((ah.a) dVar.a).setTranslationX(interpolation);
        ((ah.a) dVar.a).setTranslationY(f10);
        ((ah.a) dVar.a).setAlpha(f7);
        ((ah.a) dVar.a).setVisibility(f7 > 0.0f ? 0 : 4);
    }

    public View getForwardButton() {
        return (ah.a) this.c.a;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        b(this.c);
        b(this.b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((ah.a) this.c.a).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((ah.a) this.b.a).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f7) {
        if (this.d != f7) {
            this.d = f7;
            b(this.c);
            b(this.b);
        }
    }
}
