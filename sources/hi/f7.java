package hi;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class f7 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.Components.a9 b;
    public final org.telegram.ui.Components.p9 c;
    public final TextView d;
    public ViewPropertyAnimator e;

    public f7(Activity activity, int i7) {
        super(activity);
        this.a = i7;
        this.b = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(activity);
        this.c = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(15.0f));
        addView(p9Var, c8.na.d(30, 30.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, c8.na.d(-1, -2.0f, 51, 53.0f, 11.33f, 12.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.n6.r1(0.85f, -1));
        addView(textView2, c8.na.d(-1, -2.0f, 51, 53.0f, 29.33f, 12.0f, 0.0f));
        textView2.setText(org.telegram.messenger.g0.J2(gd.N0(2131748614, null), false, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.33f), 1.0f, R.drawable.msg_mini_forumarrow));
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
            ViewPropertyAnimator duration = animate().alpha(z10 ? 1.0f : 0.0f).setInterpolator(kr.h).withEndAction(new ch.k(8, this, z10)).setDuration(320L);
            this.e = duration;
            duration.start();
        }
    }

    public void set(TLRPC.InputPeer inputPeer) {
        int i7 = this.a;
        long e10 = inputPeer == null ? i10.i(i7).e() : org.telegram.messenger.n5.n(inputPeer);
        TextView textView = this.d;
        org.telegram.ui.Components.p9 p9Var = this.c;
        org.telegram.ui.Components.a9 a9Var = this.b;
        if (e10 >= 0) {
            TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(e10));
            a9Var.r(c22);
            p9Var.f(c22, a9Var);
            textView.setText(n10.q(c22));
            return;
        }
        TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-e10));
        a9Var.q(O0);
        p9Var.f(O0, a9Var);
        textView.setText(O0 == null ? "" : O0.title);
    }
}
