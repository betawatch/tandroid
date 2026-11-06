package di;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ha;
import c8.ka;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class r0 extends FrameLayout {
    public final o0 a;
    public final org.telegram.ui.Components.l9 b;
    public final org.telegram.ui.Components.w8 c;
    public final ImageView d;
    public final p0 e;
    public t0 f;

    public r0(Context context) {
        super(context);
        ka.a(this);
        o0 o0Var = new o0(this, context);
        this.a = o0Var;
        o0Var.setOrientation(0);
        addView(o0Var, ha.d(-2, -2.0f, qs.E1, 0.0f, 0.0f, 6.0f, 0.0f));
        this.c = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.b = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(11.0f));
        o0Var.addView(l9Var, ha.q(22, 22, 0.0f, 51, 3, 2, 7, 2));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setVisibility(8);
        o0Var.addView(imageView, ha.t(18, 18, 19, 0, 0, 3, 0));
        p0 p0Var = new p0(context);
        this.e = p0Var;
        p0Var.setLines(1);
        p0Var.setSingleLine();
        p0Var.setTextColor(-1);
        p0Var.setTextSize(1, 14.0f);
        p0Var.setTypeface(org.telegram.messenger.g0.o());
        o0Var.addView(p0Var, ha.t(-2, -2, 16, 0, 0, 7, 0));
    }

    public void set(t0 t0Var) {
        this.f = t0Var;
        long j3 = t0Var.b;
        org.telegram.ui.Components.l9 l9Var = this.b;
        org.telegram.ui.Components.w8 w8Var = this.c;
        if (j3 >= 0) {
            TLRPC.User a22 = qp.s1(p10.s0).a2(Long.valueOf(t0Var.b));
            w8Var.r(a22);
            l9Var.e(a22, w8Var);
        } else {
            TLRPC.Chat M0 = qp.s1(p10.s0).M0(Long.valueOf(-t0Var.b));
            w8Var.q(M0);
            l9Var.e(M0, w8Var);
        }
        int i7 = t0Var.e;
        ImageView imageView = this.d;
        if (i7 > 0) {
            imageView.setImageDrawable(new j0(getContext(), t0Var.e));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.e.setText(org.telegram.messenger.m5.l(p10.s0, t0Var.b));
        this.a.invalidate();
    }
}
