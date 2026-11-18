package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class AlertDialog$Builder {
    public final u1 a;
    public final boolean[] b;

    public AlertDialog$Builder(Context context) {
        this(0, context, null);
    }

    public final u1 a() {
        return this.a;
    }

    public u1 b(int i7, Context context, i6 i6Var) {
        return new u1(i7, context, i6Var);
    }

    public final void c() {
        int i7 = u1.k1;
        this.a.getClass();
    }

    public final void d(int i7) {
        int i10 = (-i7) - 1;
        if (i10 >= 0) {
            boolean[] zArr = this.b;
            if (i10 < zArr.length) {
                zArr[i10] = true;
            }
        }
    }

    public final void e() {
        this.a.R0 = 0.5f;
    }

    public final void f(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        u1 u1Var = this.a;
        u1Var.Q = charSequenceArr;
        u1Var.N = onClickListener;
    }

    public final void g(CharSequence charSequence) {
        this.a.U = charSequence;
    }

    public final void h(String str, r1 r1Var) {
        u1 u1Var = this.a;
        u1Var.o0 = str;
        u1Var.p0 = r1Var;
    }

    public final void i(String str, r1 r1Var) {
        u1 u1Var = this.a;
        u1Var.s0 = str;
        u1Var.t0 = r1Var;
    }

    public final void j(DialogInterface.OnDismissListener onDismissListener) {
        this.a.setOnDismissListener(onDismissListener);
    }

    public final void k(CharSequence charSequence, r1 r1Var) {
        u1 u1Var = this.a;
        u1Var.m0 = charSequence;
        u1Var.n0 = r1Var;
    }

    public final void l(CharSequence charSequence) {
        this.a.S = charSequence;
    }

    public final void m(int i7, int i10, int i11, HashMap hashMap) {
        u1 u1Var = this.a;
        u1Var.Y = i7;
        u1Var.Z = i10;
        u1Var.T0 = false;
        u1Var.d0 = i11;
        u1Var.e0 = -1;
        u1Var.a0 = hashMap;
    }

    public final void n(int i7, i6 i6Var) {
        u1 u1Var = this.a;
        u1Var.e0 = i7;
        u1Var.f0 = i6Var;
        u1Var.d0 = n6.w0(i7, i6Var);
    }

    public final void o(View view) {
        u1 u1Var = this.a;
        u1Var.b = view;
        u1Var.e = -2;
    }

    public final u1 p() {
        TextView textView;
        u1 u1Var = this.a;
        u1Var.show();
        int i7 = 0;
        while (true) {
            boolean[] zArr = this.b;
            if (i7 >= zArr.length) {
                return u1Var;
            }
            if (zArr[i7] && (textView = (TextView) u1Var.d(-(i7 + 1))) != null) {
                u6.U(textView, n6.q7, u1Var.j1);
            }
            i7++;
        }
    }

    public AlertDialog$Builder setTopImage(int i7, int i10) {
        u1 u1Var = this.a;
        u1Var.V = i7;
        u1Var.d0 = i10;
        u1Var.e0 = -1;
        return this;
    }

    public AlertDialog$Builder(Context context, i6 i6Var) {
        this(0, context, i6Var);
    }

    public AlertDialog$Builder(int i7, Context context, i6 i6Var) {
        this.b = new boolean[3];
        if (context == null && (context = org.telegram.messenger.g0.W(LaunchActivity.H1)) == null) {
            context = org.telegram.messenger.t0.b;
        }
        this.a = b(i7, context, i6Var);
    }
}
