package fi;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class x6 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.Components.w8 b;
    public final org.telegram.ui.Components.l9 c;
    public final TextView d;
    public ViewPropertyAnimator e;

    public x6(Activity activity, int i7) {
        super(activity);
        this.a = i7;
        this.b = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(activity);
        this.c = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
        addView(l9Var, c8.ha.d(30, 30.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, c8.ha.d(-1, -2.0f, 51, 53.0f, 11.33f, 12.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.r1(0.85f, -1));
        addView(textView2, c8.ha.d(-1, -2.0f, 51, 53.0f, 29.33f, 12.0f, 0.0f));
        textView2.setText(org.telegram.messenger.g0.J2(hd.M0(2131748806, null), false, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.33f), 1.0f, R.drawable.msg_mini_forumarrow));
        set(null);
    }

    public final void a(boolean z9, boolean z10) {
        ViewPropertyAnimator viewPropertyAnimator = this.e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.e = null;
        }
        if (!z10) {
            setVisibility(z9 ? 0 : 8);
            setAlpha(z9 ? 1.0f : 0.0f);
        } else {
            setVisibility(0);
            ViewPropertyAnimator duration = animate().alpha(z9 ? 1.0f : 0.0f).setInterpolator(xq.h).withEndAction(new bi.k1(8, this, z9)).setDuration(320L);
            this.e = duration;
            duration.start();
        }
    }

    public void set(TLRPC.InputPeer inputPeer) {
        int i7 = this.a;
        long e10 = inputPeer == null ? p10.i(i7).e() : org.telegram.messenger.m5.n(inputPeer);
        TextView textView = this.d;
        org.telegram.ui.Components.l9 l9Var = this.c;
        org.telegram.ui.Components.w8 w8Var = this.b;
        if (e10 >= 0) {
            TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(e10));
            w8Var.r(a22);
            l9Var.e(a22, w8Var);
            textView.setText(t10.p(a22));
            return;
        }
        TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-e10));
        w8Var.q(M0);
        l9Var.e(M0, w8Var);
        textView.setText(M0 == null ? "" : M0.title);
    }
}
