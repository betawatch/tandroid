package mh;

import ai.t;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.ke;
import b8.mf;
import b8.pf;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ki;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c extends LinearLayout {
    public static final /* synthetic */ int e = 0;
    public final e6 a;
    public final ke b;
    public final ke c;
    public float d;

    public c(Context context, e6 e6Var, ki kiVar, eh.c cVar) {
        super(context);
        ke keVar = new ke(this);
        this.b = keVar;
        ke keVar2 = new ke(this);
        this.c = keVar2;
        this.a = e6Var;
        lh.a c2 = lh.a.c(context, cVar, kiVar, e6Var);
        keVar.b = c2;
        int i3 = 9;
        c2.setOnClickListener(new t(i3));
        pf.b((lh.a) keVar.b, 0.065f, 2.0f);
        lh.a c10 = lh.a.c(context, cVar, kiVar, e6Var);
        keVar2.b = c10;
        c10.setOnClickListener(new t(i3));
        pf.b((lh.a) keVar2.b, 0.065f, 2.0f);
        a(keVar, bd.M0(2131746271, null), R.drawable.input_reply, false);
        a(keVar2, bd.M0(2131750588, null), R.drawable.input_forward, true);
        setOrientation(0);
        setClipChildren(false);
        addView((lh.a) keVar.b, mf.m(1.0f, 0, 56, 1, -1, 0));
        addView((lh.a) keVar2.b, mf.m(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(ke keVar, String str, int i3, boolean z10) {
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(g0.L(21.0f), 0, g0.L(21.0f), 0);
        textView.setCompoundDrawablePadding(g0.L(6.0f));
        int i10 = k6.Ll;
        e6 e6Var = this.a;
        r6.V(textView, i10, e6Var);
        textView.setTypeface(g0.o());
        Drawable mutate = getContext().getResources().getDrawable(i3).mutate();
        r6.y(this, mutate, k6.Kl, e6Var, PorterDuff.Mode.MULTIPLY);
        Drawable drawable = z10 ? mutate : null;
        if (z10) {
            mutate = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, mutate, (Drawable) null);
        keVar.c = textView;
        ((lh.a) keVar.b).addView(textView, mf.e(-2, -2, 17));
    }

    public final void b(ke keVar) {
        float f10 = this.d * ((qe.a) keVar.d).e;
        float f11 = (1.0f - f10) * (-g0.L(54.0f));
        float interpolation = (1.0f - pe.a.a.getInterpolation(f10)) * (getMeasuredWidth() / 2.0f);
        if (keVar == this.b) {
            interpolation *= -1.0f;
        }
        ((lh.a) keVar.b).setTranslationX(interpolation);
        ((lh.a) keVar.b).setTranslationY(f11);
        ((lh.a) keVar.b).setAlpha(f10);
        ((lh.a) keVar.b).setVisibility(f10 > 0.0f ? 0 : 4);
    }

    public View getForwardButton() {
        return (lh.a) this.c.b;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        b(this.c);
        b(this.b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((lh.a) this.c.b).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((lh.a) this.b.b).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f10) {
        if (this.d != f10) {
            this.d = f10;
            b(this.c);
            b(this.b);
        }
    }
}
