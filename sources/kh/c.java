package kh;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.jj;
import w7.x5;
import w7.z5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class c extends LinearLayout {
    public static final /* synthetic */ int e = 0;
    public final f6 a;
    public final cf.c b;
    public final cf.c c;
    public float d;

    public c(Context context, f6 f6Var, jj jjVar, bh.b bVar) {
        super(context);
        cf.c cVar = new cf.c(this);
        this.b = cVar;
        cf.c cVar2 = new cf.c(this);
        this.c = cVar2;
        this.a = f6Var;
        jh.a c10 = jh.a.c(context, bVar, jjVar, f6Var);
        cVar.a = c10;
        c10.setOnClickListener(new ah.f(6));
        z5.b((jh.a) cVar.a, 0.065f, 2.0f);
        jh.a c11 = jh.a.c(context, bVar, jjVar, f6Var);
        cVar2.a = c11;
        c11.setOnClickListener(new ah.f(6));
        z5.b((jh.a) cVar2.a, 0.065f, 2.0f);
        a(cVar, LocaleController.getString(R.string.Reply), R.drawable.input_reply, false);
        a(cVar2, LocaleController.getString(R.string.Forward), R.drawable.input_forward, true);
        setOrientation(0);
        setClipChildren(false);
        addView((jh.a) cVar.a, x5.m(1.0f, 0, 56, 1, -1, 0));
        addView((jh.a) cVar2.a, x5.m(1.0f, 0, 56, -1, 1, 0));
    }

    public final void a(cf.c cVar, String str, int i10, boolean z10) {
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        int i11 = j6.Xk;
        f6 f6Var = this.a;
        textView.setTextColor(j6.v0(i11, f6Var));
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.Wk, f6Var), PorterDuff.Mode.MULTIPLY));
        Drawable drawable = z10 ? mutate : null;
        if (z10) {
            mutate = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, mutate, (Drawable) null);
        cVar.b = textView;
        ((jh.a) cVar.a).addView(textView, x5.e(-2, -2, 17));
    }

    public final void b(cf.c cVar) {
        float f7 = this.d * ((le.b) cVar.c).e;
        float f10 = (1.0f - f7) * (-AndroidUtilities.dp(54.0f));
        float interpolation = (1.0f - ke.a.a.getInterpolation(f7)) * (getMeasuredWidth() / 2.0f);
        if (cVar == this.b) {
            interpolation *= -1.0f;
        }
        ((jh.a) cVar.a).setTranslationX(interpolation);
        ((jh.a) cVar.a).setTranslationY(f10);
        ((jh.a) cVar.a).setAlpha(f7);
        ((jh.a) cVar.a).setVisibility(f7 > 0.0f ? 0 : 4);
    }

    public View getForwardButton() {
        return (jh.a) this.c.a;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        b(this.c);
        b(this.b);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        ((jh.a) this.c.a).setOnClickListener(onClickListener);
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        ((jh.a) this.b.a).setOnClickListener(onClickListener);
    }

    public void setTotalVisibilityFactor(float f7) {
        if (this.d != f7) {
            this.d = f7;
            b(this.c);
            b(this.b);
        }
    }
}
