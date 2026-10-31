package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class AlertDialog$Builder {
    public final x1 a;
    public final boolean[] b;

    public AlertDialog$Builder(Context context) {
        this(0, context, null);
    }

    public final x1 a() {
        return this.a;
    }

    public x1 b(int i10, Context context, p6 p6Var) {
        return new x1(i10, context, p6Var);
    }

    public final void c() {
        int i10 = x1.l1;
        this.a.getClass();
    }

    public final void d(int i10) {
        int i11 = (-i10) - 1;
        if (i11 >= 0) {
            boolean[] zArr = this.b;
            if (i11 < zArr.length) {
                zArr[i11] = true;
            }
        }
    }

    public final void e() {
        this.a.S0 = 0.5f;
    }

    public final void f(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        x1 x1Var = this.a;
        x1Var.P = charSequenceArr;
        x1Var.M = onClickListener;
    }

    public final void g(CharSequence charSequence) {
        this.a.T = charSequence;
    }

    public final void h(String str, u1 u1Var) {
        x1 x1Var = this.a;
        x1Var.p0 = str;
        x1Var.q0 = u1Var;
    }

    public final void i(String str, u1 u1Var) {
        x1 x1Var = this.a;
        x1Var.t0 = str;
        x1Var.u0 = u1Var;
    }

    public final void j(DialogInterface.OnDismissListener onDismissListener) {
        this.a.setOnDismissListener(onDismissListener);
    }

    public final void k(CharSequence charSequence, u1 u1Var) {
        x1 x1Var = this.a;
        x1Var.n0 = charSequence;
        x1Var.o0 = u1Var;
    }

    public final void l(CharSequence charSequence) {
        this.a.R = charSequence;
    }

    public final void m(int i10, int i11, int i12, HashMap hashMap) {
        x1 x1Var = this.a;
        x1Var.X = i10;
        x1Var.Y = i11;
        x1Var.U0 = false;
        x1Var.c0 = i12;
        x1Var.d0 = -1;
        x1Var.Z = hashMap;
    }

    public final void n(int i10, p6 p6Var) {
        x1 x1Var = this.a;
        x1Var.d0 = i10;
        x1Var.e0 = p6Var;
        x1Var.c0 = t6.w0(i10, p6Var);
    }

    public final void o(View view) {
        x1 x1Var = this.a;
        x1Var.b = view;
        x1Var.e = -2;
    }

    public final x1 p() {
        TextView textView;
        x1 x1Var = this.a;
        x1Var.show();
        int i10 = 0;
        while (true) {
            boolean[] zArr = this.b;
            if (i10 >= zArr.length) {
                return x1Var;
            }
            if (zArr[i10] && (textView = (TextView) x1Var.d(-(i10 + 1))) != null) {
                a7.V(textView, t6.q7, x1Var.k1);
            }
            i10++;
        }
    }

    public AlertDialog$Builder setTopImage(int i10, int i11) {
        x1 x1Var = this.a;
        x1Var.U = i10;
        x1Var.c0 = i11;
        x1Var.d0 = -1;
        return this;
    }

    public AlertDialog$Builder(Context context, p6 p6Var) {
        this(0, context, p6Var);
    }

    public AlertDialog$Builder(int i10, Context context, p6 p6Var) {
        this.b = new boolean[3];
        if (context == null && (context = org.telegram.messenger.i0.W(LaunchActivity.I1)) == null) {
            context = org.telegram.messenger.w0.b;
        }
        this.a = b(i10, context, p6Var);
    }
}
