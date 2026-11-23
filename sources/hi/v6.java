package hi;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class v6 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.Components.b9 b;
    public final org.telegram.ui.Components.q9 c;
    public final TextView d;
    public ViewPropertyAnimator e;

    public v6(Activity activity, int i7) {
        super(activity);
        this.a = i7;
        this.b = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(activity);
        this.c = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
        addView(q9Var, c8.ma.d(30, 30.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, c8.ma.d(-1, -2.0f, 51, 53.0f, 11.33f, 12.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.m6.r1(0.85f, -1));
        addView(textView2, c8.ma.d(-1, -2.0f, 51, 53.0f, 29.33f, 12.0f, 0.0f));
        textView2.setText(org.telegram.messenger.g0.J2(hd.N0(2131748614, null), false, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.33f), 1.0f, R.drawable.msg_mini_forumarrow));
        set(null);
    }

    public final void a(boolean z10, boolean z11) {
        ViewPropertyAnimator viewPropertyAnimator = this.e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.e = null;
        }
        if (!z11) {
            setVisibility(z10 ? 0 : 8);
            setAlpha(z10 ? 1.0f : 0.0f);
        } else {
            setVisibility(0);
            ViewPropertyAnimator duration = animate().alpha(z10 ? 1.0f : 0.0f).setInterpolator(nr.h).withEndAction(new ch.k(8, this, z10)).setDuration(320L);
            this.e = duration;
            duration.start();
        }
    }

    public void set(TLRPC.InputPeer inputPeer) {
        int i7 = this.a;
        long e10 = inputPeer == null ? k10.i(i7).e() : org.telegram.messenger.n5.n(inputPeer);
        TextView textView = this.d;
        org.telegram.ui.Components.q9 q9Var = this.c;
        org.telegram.ui.Components.b9 b9Var = this.b;
        if (e10 >= 0) {
            TLRPC.User c22 = np.u1(i7).c2(Long.valueOf(e10));
            b9Var.r(c22);
            q9Var.f(c22, b9Var);
            textView.setText(p10.q(c22));
            return;
        }
        TLRPC.Chat O0 = np.u1(i7).O0(Long.valueOf(-e10));
        b9Var.q(O0);
        q9Var.f(O0, b9Var);
        textView.setText(O0 == null ? "" : O0.title);
    }
}
