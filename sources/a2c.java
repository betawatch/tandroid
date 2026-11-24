// default package

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class a2c extends b6c {
    static {
        b6c.h(new a2c());
    }

    public static c6c i(int i, CharSequence charSequence, boolean z, View.OnClickListener onClickListener, k66 k66Var, View.OnClickListener onClickListener2) {
        c6c K = c6c.K(a2c.class);
        K.d = i;
        K.m = charSequence;
        K.f = z;
        K.u = false;
        K.E = onClickListener;
        K.H = k66Var;
        K.F = onClickListener2;
        return K;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        int i;
        ImageView imageView;
        b2c b2cVar = (b2c) view;
        CharSequence charSequence = c6cVar.m;
        boolean z2 = c6cVar.f;
        View.OnClickListener onClickListener = c6cVar.E;
        Object obj = c6cVar.H;
        k66 k66Var = obj != null ? (k66) obj : null;
        boolean z3 = c6cVar.u;
        View.OnClickListener onClickListener2 = c6cVar.F;
        ImageView imageView2 = b2cVar.n;
        TextView textView = b2cVar.d;
        y1c y1cVar = b2cVar.c;
        z1c z1cVar = b2cVar.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : gn.cloneSpans(charSequence));
        int i2 = 0;
        ta6[] ta6VarArr = (ta6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ta6.class);
        if (ta6VarArr != null) {
            while (i2 < ta6VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(ta6VarArr[i2]);
                int spanEnd = spannableStringBuilder.getSpanEnd(ta6VarArr[i2]);
                boolean z4 = z3;
                spannableStringBuilder.removeSpan(ta6VarArr[i2]);
                int i3 = i2;
                ta6 ta6Var = ta6VarArr[i3];
                View.OnClickListener onClickListener3 = onClickListener2;
                ta6 ta6Var2 = new ta6(z1cVar, ta6Var.a, ta6Var.d, null);
                ta6 ta6Var3 = ta6VarArr[i3];
                ta6Var2.f = ta6Var3.f;
                ta6Var2.h = ta6Var3.h;
                ta6Var2.n = ta6Var3.n;
                if (!ta6Var3.n || on2.h(cmb.v0(cmb.F6, b2cVar.a)) <= 0.5d) {
                    imageView = imageView2;
                } else {
                    float max = Math.max(0.05f, ta6VarArr[i3].h);
                    imageView = imageView2;
                    ta6Var2.a(cmb.p1(Math.min(1.0f, 0.07f / max), -1), cmb.p1(Math.min(1.0f, 0.115f / max), -1));
                }
                spannableStringBuilder.setSpan(ta6Var2, spanStart, spanEnd, 33);
                i2 = i3 + 1;
                z3 = z4;
                onClickListener2 = onClickListener3;
                imageView2 = imageView;
            }
        }
        View.OnClickListener onClickListener4 = onClickListener2;
        boolean z5 = z3;
        ImageView imageView3 = imageView2;
        if (!b2cVar.h || z2) {
            i = 0;
            y1cVar.setVisibility(z2 ? 0 : 8);
            z1cVar.setVisibility(!z2 ? 0 : 8);
        } else {
            i = 0;
            y1cVar.setVisibility(0);
            z1cVar.setVisibility(0);
            ViewPropertyAnimator withEndAction = y1cVar.animate().alpha(0.0f).withEndAction(new zcb(b2cVar, (byte) 23));
            TimeInterpolator timeInterpolator = d53.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            z1cVar.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        b2cVar.h = z2;
        textView.setVisibility(z2 ? i : 8);
        textView.setOnClickListener(onClickListener);
        b2cVar.setClipChildren(z2);
        y1cVar.setText(spannableStringBuilder);
        z1cVar.setText(spannableStringBuilder);
        z1cVar.setTextIsSelectable((z5 || !(ta6VarArr == null || ta6VarArr.length == 0)) ? i : 1);
        z1cVar.setOnLinkPressListener(k66Var);
        imageView3.setVisibility(onClickListener4 != null ? i : 8);
        imageView3.setOnClickListener(onClickListener4);
        b2cVar.b = z;
        b2cVar.setWillNotDraw(!z);
    }

    @Override // b6c
    public final boolean c(c6c c6cVar, c6c c6cVar2) {
        return TextUtils.equals(c6cVar.m, c6cVar2.m) && c6cVar.f == c6cVar2.f;
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new b2c(context, ylbVar);
    }

    @Override // b6c
    public final boolean e(c6c c6cVar, c6c c6cVar2) {
        return c6cVar.d == c6cVar2.d;
    }

    @Override // b6c
    public final boolean f() {
        return false;
    }
}
