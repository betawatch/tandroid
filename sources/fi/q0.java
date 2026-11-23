package fi;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ma;
import c8.ra;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q9;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class q0 extends FrameLayout {
    public final n0 a;
    public final q9 b;
    public final org.telegram.ui.Components.b9 c;
    public final ImageView d;
    public final o0 e;
    public s0 f;

    public q0(Context context) {
        super(context);
        ra.a(this);
        n0 n0Var = new n0(this, context);
        this.a = n0Var;
        n0Var.setOrientation(0);
        addView(n0Var, ma.d(-2, -2.0f, ls.E1, 0.0f, 0.0f, 6.0f, 0.0f));
        this.c = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        q9 q9Var = new q9(context);
        this.b = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(11.0f));
        n0Var.addView(q9Var, ma.q(22, 22, 0.0f, 51, 3, 2, 7, 2));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setVisibility(8);
        n0Var.addView(imageView, ma.t(18, 18, 19, 0, 0, 3, 0));
        o0 o0Var = new o0(context);
        this.e = o0Var;
        o0Var.setLines(1);
        o0Var.setSingleLine();
        o0Var.setTextColor(-1);
        o0Var.setTextSize(1, 14.0f);
        o0Var.setTypeface(org.telegram.messenger.g0.o());
        n0Var.addView(o0Var, ma.t(-2, -2, 16, 0, 0, 7, 0));
    }

    public void set(s0 s0Var) {
        this.f = s0Var;
        long j3 = s0Var.b;
        q9 q9Var = this.b;
        org.telegram.ui.Components.b9 b9Var = this.c;
        if (j3 >= 0) {
            TLRPC.User c22 = np.u1(k10.t0).c2(Long.valueOf(s0Var.b));
            b9Var.r(c22);
            q9Var.f(c22, b9Var);
        } else {
            TLRPC.Chat O0 = np.u1(k10.t0).O0(Long.valueOf(-s0Var.b));
            b9Var.q(O0);
            q9Var.f(O0, b9Var);
        }
        int i7 = s0Var.e;
        ImageView imageView = this.d;
        if (i7 > 0) {
            imageView.setImageDrawable(new i0(getContext(), s0Var.e));
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.e.setText(org.telegram.messenger.n5.l(k10.t0, s0Var.b));
        this.a.invalidate();
    }
}
