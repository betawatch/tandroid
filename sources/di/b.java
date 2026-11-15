package di;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.z70;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class b extends LinearLayout implements is {
    public final int a;
    public final org.telegram.ui.ActionBar.e6 b;
    public final TextView c;
    public final z70 d;
    public cg.b e;
    public final eq[] f;

    public b(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, i7, cg.b.a, e6Var);
    }

    public final void a() {
        cg.b bVar = this.e;
        int i7 = this.a;
        cg.a s5 = v8.x(i7, bVar).s();
        cg.b bVar2 = this.e;
        cg.b bVar3 = cg.b.a;
        TextView textView = this.c;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        z70 z70Var = this.d;
        if (bVar2 == bVar3) {
            textView.setText(mb.a1(false, hd.a0(null, null, 2131750116, hd.E(s5.a(), ',')), 0.6f, null));
            int i10 = org.telegram.ui.ActionBar.j6.xj;
            org.telegram.ui.ActionBar.q6.U(z70Var, i10, e6Var);
            org.telegram.ui.ActionBar.q6.G(z70Var, i10, e6Var);
            z70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(hd.M0(2131750115, null), new ch.w(this, 5)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
            return;
        }
        if (bVar2 == cg.b.b) {
            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(hd.a0(null, null, 2131750114, s5.b()));
            eq[] eqVarArr = this.f;
            textView.setText(mb.a1(true, X2, 0.6f, eqVarArr));
            eqVarArr[0].a(org.telegram.ui.ActionBar.j6.xj);
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            org.telegram.messenger.r1 i11 = org.telegram.messenger.r1.i();
            long c10 = (long) (s5.c() * ((org.telegram.messenger.i0) np.s1(i7).y7.l.b).a * 100.0d);
            i11.getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", 2, c10, false));
            int i12 = org.telegram.ui.ActionBar.j6.yj;
            int i13 = org.telegram.ui.ActionBar.j6.wj;
            org.telegram.ui.ActionBar.q6.m(z70Var, i12, i13, 3, 0.33f, e6Var);
            org.telegram.ui.ActionBar.q6.n(z70Var, 2, i12, i13, 3, 0.33f, e6Var);
            z70Var.setText(sb2);
        }
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.y3) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return isEnabled() && super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        int i7 = this.a;
        ns.f(i7).c(this, ns.y3);
        ns.f(i7).c(this, ns.C3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.a;
        ns.f(i7).n(this, ns.y3);
        ns.f(i7).n(this, ns.C3);
    }

    public b(Context context, int i7, cg.b bVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f = new eq[1];
        this.a = i7;
        this.b = e6Var;
        this.e = bVar;
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(9.0f));
        int L = org.telegram.messenger.g0.L(24.0f);
        int i10 = org.telegram.ui.ActionBar.j6.wj;
        Drawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(this, d02, M, null, e6Var);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.yj, e6Var);
        textView.setGravity(17);
        addView(textView, c8.ja.q(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        z70 z70Var = new z70(context, e6Var);
        this.d = z70Var;
        z70Var.setTextSize(1, 12.0f);
        z70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(hd.M0(2131750115, null), new a(0, context, e6Var)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
        z70Var.setGravity(17);
        addView(z70Var, c8.ja.q(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        a();
    }
}
