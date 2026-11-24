// default package

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class a0c extends b4c {
    static {
        b4c.h(new a0c());
    }

    public static c4c i(int i, CharSequence charSequence, boolean z, View.OnClickListener onClickListener, k46 k46Var, View.OnClickListener onClickListener2) {
        c4c K = c4c.K(a0c.class);
        K.d = i;
        K.m = charSequence;
        K.f = z;
        K.u = false;
        K.E = onClickListener;
        K.H = k46Var;
        K.F = onClickListener2;
        return K;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        int i;
        ImageView imageView;
        b0c b0cVar = (b0c) view;
        CharSequence charSequence = c4cVar.m;
        boolean z2 = c4cVar.f;
        View.OnClickListener onClickListener = c4cVar.E;
        Object obj = c4cVar.H;
        k46 k46Var = obj != null ? (k46) obj : null;
        boolean z3 = c4cVar.u;
        View.OnClickListener onClickListener2 = c4cVar.F;
        ImageView imageView2 = b0cVar.n;
        TextView textView = b0cVar.d;
        yzb yzbVar = b0cVar.c;
        zzb zzbVar = b0cVar.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : gm.cloneSpans(charSequence));
        int i2 = 0;
        u86[] u86VarArr = (u86[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), u86.class);
        if (u86VarArr != null) {
            while (i2 < u86VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(u86VarArr[i2]);
                int spanEnd = spannableStringBuilder.getSpanEnd(u86VarArr[i2]);
                boolean z4 = z3;
                spannableStringBuilder.removeSpan(u86VarArr[i2]);
                int i3 = i2;
                u86 u86Var = u86VarArr[i3];
                View.OnClickListener onClickListener3 = onClickListener2;
                u86 u86Var2 = new u86(zzbVar, u86Var.a, u86Var.d, null);
                u86 u86Var3 = u86VarArr[i3];
                u86Var2.f = u86Var3.f;
                u86Var2.h = u86Var3.h;
                u86Var2.n = u86Var3.n;
                if (!u86Var3.n || bm2.h(bkb.v0(bkb.F6, b0cVar.a)) <= 0.5d) {
                    imageView = imageView2;
                } else {
                    float max = Math.max(0.05f, u86VarArr[i3].h);
                    imageView = imageView2;
                    u86Var2.a(bkb.p1(Math.min(1.0f, 0.07f / max), -1), bkb.p1(Math.min(1.0f, 0.115f / max), -1));
                }
                spannableStringBuilder.setSpan(u86Var2, spanStart, spanEnd, 33);
                i2 = i3 + 1;
                z3 = z4;
                onClickListener2 = onClickListener3;
                imageView2 = imageView;
            }
        }
        View.OnClickListener onClickListener4 = onClickListener2;
        boolean z5 = z3;
        ImageView imageView3 = imageView2;
        if (!b0cVar.h || z2) {
            i = 0;
            yzbVar.setVisibility(z2 ? 0 : 8);
            zzbVar.setVisibility(!z2 ? 0 : 8);
        } else {
            i = 0;
            yzbVar.setVisibility(0);
            zzbVar.setVisibility(0);
            ViewPropertyAnimator withEndAction = yzbVar.animate().alpha(0.0f).withEndAction(new cib(b0cVar, (byte) 15));
            TimeInterpolator timeInterpolator = s33.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            zzbVar.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        b0cVar.h = z2;
        textView.setVisibility(z2 ? i : 8);
        textView.setOnClickListener(onClickListener);
        b0cVar.setClipChildren(z2);
        yzbVar.setText(spannableStringBuilder);
        zzbVar.setText(spannableStringBuilder);
        zzbVar.setTextIsSelectable((z5 || !(u86VarArr == null || u86VarArr.length == 0)) ? i : 1);
        zzbVar.setOnLinkPressListener(k46Var);
        imageView3.setVisibility(onClickListener4 != null ? i : 8);
        imageView3.setOnClickListener(onClickListener4);
        b0cVar.b = z;
        b0cVar.setWillNotDraw(!z);
    }

    @Override // b4c
    public final boolean c(c4c c4cVar, c4c c4cVar2) {
        return TextUtils.equals(c4cVar.m, c4cVar2.m) && c4cVar.f == c4cVar2.f;
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new b0c(context, wjbVar);
    }

    @Override // b4c
    public final boolean e(c4c c4cVar, c4c c4cVar2) {
        return c4cVar.d == c4cVar2.d;
    }

    @Override // b4c
    public final boolean f() {
        return false;
    }
}
