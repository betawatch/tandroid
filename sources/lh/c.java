package lh;

import a8.me;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.fj;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class c extends LinearLayout {
    public static final /* synthetic */ int e = 0;
    public final u6 a;
    public final me b;
    public final me c;
    public float d;

    public c(Context context, u6 u6Var, fj fjVar, ch.b bVar) {
        super(context);
        me meVar = new me(this);
        this.b = meVar;
        me meVar2 = new me(this);
        this.c = meVar2;
        this.a = u6Var;
        kh.a c10 = kh.a.c(context, bVar, fjVar, u6Var);
        meVar.a = c10;
        c10.setOnClickListener(new bh.f(6));
        kb1.c((kh.a) meVar.a, 0.065f, 2.0f);
        kh.a c11 = kh.a.c(context, bVar, fjVar, u6Var);
        meVar2.a = c11;
        c11.setOnClickListener(new bh.f(6));
        kb1.c((kh.a) meVar2.a, 0.065f, 2.0f);
        a(meVar, LocaleController.getString(R.string.Reply), R.drawable.input_reply, false);
        a(meVar2, LocaleController.getString(R.string.Forward), R.drawable.input_forward, true);
        setOrientation(0);
        setClipChildren(false);
        addView((kh.a) meVar.a, kb1.q(1.0f, 0, 56, 1, -1, 0));
        addView((kh.a) meVar2.a, kb1.q(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(me meVar, String str, int i10, boolean z10) {
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        int i11 = y6.Xk;
        u6 u6Var = this.a;
        f7.V(textView, i11, u6Var);
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        f7.y(this, mutate, y6.Wk, u6Var, PorterDuff.Mode.MULTIPLY);
        Drawable drawable = z10 ? mutate : null;
        if (z10) {
            mutate = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, mutate, (Drawable) null);
        meVar.b = textView;
        ((kh.a) meVar.a).addView(textView, kb1.i(-2, -2, 17));
    }

    public final void b(me meVar) {
        float f7 = this.d * ((oe.b) meVar.c).e;
        float f10 = (1.0f - f7) * (-AndroidUtilities.dp(54.0f));
        float interpolation = (1.0f - ne.a.a.getInterpolation(f7)) * (getMeasuredWidth() / 2.0f);
        if (meVar == this.b) {
            interpolation *= -1.0f;
        }
        ((kh.a) meVar.a).setTranslationX(interpolation);
        ((kh.a) meVar.a).setTranslationY(f10);
        ((kh.a) meVar.a).setAlpha(f7);
        ((kh.a) meVar.a).setVisibility(f7 > 0.0f ? 0 : 4);
    }

    public View getForwardButton() {
        return (kh.a) this.c.a;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        b(this.c);
        b(this.b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((kh.a) this.c.a).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((kh.a) this.b.a).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f7) {
        if (this.d != f7) {
            this.d = f7;
            b(this.c);
            b(this.b);
        }
    }
}
