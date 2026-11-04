package gi;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y6 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.Components.u8 b;
    public final org.telegram.ui.Components.k9 c;
    public final TextView d;
    public ViewPropertyAnimator e;

    public y6(Activity activity, int i3) {
        super(activity);
        this.a = i3;
        this.b = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(activity);
        this.c = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
        addView(k9Var, mf.d(30, 30.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, mf.d(-1, -2.0f, 51, 53.0f, 11.33f, 12.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.r1(0.85f, -1));
        addView(textView2, mf.d(-1, -2.0f, 51, 53.0f, 29.33f, 12.0f, 0.0f));
        textView2.setText(org.telegram.messenger.g0.J2(bd.M0(2131748815, null), false, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.33f), 1.0f, R.drawable.msg_mini_forumarrow));
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
            ViewPropertyAnimator duration = animate().alpha(z10 ? 1.0f : 0.0f).setInterpolator(xq.h).withEndAction(new ci.e1(8, this, z10)).setDuration(320L);
            this.e = duration;
            duration.start();
        }
    }

    public void set(TLRPC.InputPeer inputPeer) {
        int i3 = this.a;
        long e10 = inputPeer == null ? h10.i(i3).e() : org.telegram.messenger.m5.n(inputPeer);
        TextView textView = this.d;
        org.telegram.ui.Components.k9 k9Var = this.c;
        org.telegram.ui.Components.u8 u8Var = this.b;
        if (e10 >= 0) {
            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(e10));
            u8Var.r(a22);
            k9Var.e(a22, u8Var);
            textView.setText(l10.p(a22));
            return;
        }
        TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-e10));
        u8Var.q(M0);
        k9Var.e(M0, u8Var);
        textView.setText(M0 == null ? "" : M0.title);
    }
}
