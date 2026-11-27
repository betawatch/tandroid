// default package

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class i2a extends FrameLayout {
    public final int a;
    public final rb0 b;
    public final de0 c;
    public final TextView d;
    public ViewPropertyAnimator e;

    public i2a(Activity activity, int i) {
        super(activity);
        this.a = i;
        this.b = new rb0((vnb) null);
        de0 de0Var = new de0(activity);
        this.c = de0Var;
        de0Var.setRoundRadius(hl.L(15.0f));
        addView(de0Var, tre.d(30, 30.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setTypeface(hl.o());
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, tre.d(-1, -2.0f, 51, 53.0f, 11.33f, 12.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(aob.p1(0.85f, -1));
        addView(textView2, tre.d(-1, -2.0f, 51, 53.0f, 29.33f, 12.0f, 0.0f));
        textView2.setText(hl.F2(ob6.M0(2131748561, null), false, hl.L(2.6666667f), hl.L(0.33f), 1.0f, R.drawable.msg_mini_forumarrow));
        set(null);
    }

    public final void a(boolean z, boolean z2) {
        ViewPropertyAnimator viewPropertyAnimator = this.e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            this.e = null;
        }
        if (!z2) {
            setVisibility(z ? 0 : 8);
            setAlpha(z ? 1.0f : 0.0f);
        } else {
            setVisibility(0);
            ViewPropertyAnimator duration = animate().alpha(z ? 1.0f : 0.0f).setInterpolator(k43.h).withEndAction(new q38((byte) 11, (Object) this, z)).setDuration(320L);
            this.e = duration;
            duration.start();
        }
    }

    public void set(TLRPC.InputPeer inputPeer) {
        int i = this.a;
        long e = inputPeer == null ? yac.h(i).e() : wf3.m(inputPeer);
        TextView textView = this.d;
        de0 de0Var = this.c;
        rb0 rb0Var = this.b;
        if (e >= 0) {
            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(e));
            rb0Var.q(X1);
            de0Var.f(X1, rb0Var);
            textView.setText(lbc.r(X1));
            return;
        }
        TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-e));
        rb0Var.p(M0);
        de0Var.f(M0, rb0Var);
        textView.setText(M0 == null ? "" : M0.title);
    }
}
