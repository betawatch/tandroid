package bi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x70;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class c extends LinearLayout implements ls {
    public final int a;
    public final org.telegram.ui.ActionBar.g6 b;
    public final TextView c;
    public final x70 d;
    public cg.b e;
    public final wp[] f;

    public c(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, i7, cg.b.a, g6Var);
    }

    public final void a() {
        cg.b bVar = this.e;
        int i7 = this.a;
        cg.a s5 = ea.x(i7, bVar).s();
        cg.b bVar2 = this.e;
        cg.b bVar3 = cg.b.a;
        TextView textView = this.c;
        org.telegram.ui.ActionBar.g6 g6Var = this.b;
        x70 x70Var = this.d;
        if (bVar2 == bVar3) {
            textView.setText(dd.a1(false, org.telegram.messenger.id.a0(null, null, 2131750116, org.telegram.messenger.id.E(s5.a(), ',')), 0.6f, null));
            int i10 = org.telegram.ui.ActionBar.l6.uj;
            org.telegram.ui.ActionBar.s6.U(x70Var, i10, g6Var);
            org.telegram.ui.ActionBar.s6.G(x70Var, i10, g6Var);
            x70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131750115, null), new a3.f(this, 14)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
            return;
        }
        if (bVar2 == cg.b.b) {
            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131750114, s5.b()));
            wp[] wpVarArr = this.f;
            textView.setText(dd.a1(true, X2, 0.6f, wpVarArr));
            wpVarArr[0].a(org.telegram.ui.ActionBar.l6.uj);
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            org.telegram.messenger.r1 i11 = org.telegram.messenger.r1.i();
            long c10 = (long) (s5.c() * ((org.telegram.messenger.i0) qp.s1(i7).x7.l.b).a * 100.0d);
            i11.getClass();
            sb2.append(org.telegram.messenger.r1.g("USD", 2, c10, false));
            int i12 = org.telegram.ui.ActionBar.l6.vj;
            int i13 = org.telegram.ui.ActionBar.l6.tj;
            org.telegram.ui.ActionBar.s6.m(x70Var, i12, i13, 3, 0.33f, g6Var);
            org.telegram.ui.ActionBar.s6.n(x70Var, 2, i12, i13, 3, 0.33f, g6Var);
            x70Var.setText(sb2);
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.y3) {
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
        qs.f(i7).c(this, qs.y3);
        qs.f(i7).c(this, qs.C3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.a;
        qs.f(i7).n(this, qs.y3);
        qs.f(i7).n(this, qs.C3);
    }

    public c(Context context, int i7, cg.b bVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f = new wp[1];
        this.a = i7;
        this.b = g6Var;
        this.e = bVar;
        setOrientation(1);
        setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(9.0f));
        int L = org.telegram.messenger.g0.L(24.0f);
        int i10 = org.telegram.ui.ActionBar.l6.tj;
        Drawable d02 = org.telegram.ui.ActionBar.l6.d0(L, org.telegram.ui.ActionBar.l6.w0(i10, g6Var));
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i10);
        setBackground(d02);
        org.telegram.ui.ActionBar.s6.j(this, d02, M, null, g6Var);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.vj, g6Var);
        textView.setGravity(17);
        addView(textView, c8.ha.q(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        x70 x70Var = new x70(context, g6Var);
        this.d = x70Var;
        x70Var.setTextSize(1, 12.0f);
        x70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131750115, null), new b(0, context, g6Var)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
        x70Var.setGravity(17);
        addView(x70Var, c8.ha.q(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        a();
    }
}
