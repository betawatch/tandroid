package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public class AlertDialog$Builder {
    public final b2 a;
    public final boolean[] b;

    public AlertDialog$Builder(Context context) {
        this(context, 0, null);
    }

    public final b2 a() {
        return this.a;
    }

    public b2 b(Context context, int i10, f6 f6Var) {
        return new b2(context, i10, f6Var);
    }

    public final void c() {
        int i10 = b2.c1;
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
        this.a.Q0 = 0.5f;
    }

    public final void f(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        b2 b2Var = this.a;
        b2Var.P = charSequenceArr;
        b2Var.M = onClickListener;
    }

    public final void g(CharSequence charSequence) {
        this.a.T = charSequence;
    }

    public final void h(String str, a2 a2Var) {
        b2 b2Var = this.a;
        b2Var.n0 = str;
        b2Var.o0 = a2Var;
    }

    public final void i(String str, a2 a2Var) {
        b2 b2Var = this.a;
        b2Var.r0 = str;
        b2Var.s0 = a2Var;
    }

    public final void j(DialogInterface.OnDismissListener onDismissListener) {
        this.a.setOnDismissListener(onDismissListener);
    }

    public final void k(CharSequence charSequence, a2 a2Var) {
        b2 b2Var = this.a;
        b2Var.l0 = charSequence;
        b2Var.m0 = a2Var;
    }

    public final void l(CharSequence charSequence) {
        this.a.R = charSequence;
    }

    public final void m(int i10, int i11, int i12, HashMap hashMap) {
        b2 b2Var = this.a;
        b2Var.X = i10;
        b2Var.Y = i11;
        b2Var.S0 = false;
        b2Var.c0 = i12;
        b2Var.Z = hashMap;
    }

    public final void n(View view) {
        b2 b2Var = this.a;
        b2Var.b = view;
        b2Var.e = -2;
    }

    public final b2 o() {
        TextView textView;
        b2 b2Var = this.a;
        b2Var.show();
        int i10 = 0;
        while (true) {
            boolean[] zArr = this.b;
            if (i10 >= zArr.length) {
                return b2Var;
            }
            if (zArr[i10] && (textView = (TextView) b2Var.d(-(i10 + 1))) != null) {
                textView.setTextColor(b2Var.e(j6.q7));
            }
            i10++;
        }
    }

    public AlertDialog$Builder setTopImage(int i10, int i11) {
        b2 b2Var = this.a;
        b2Var.U = i10;
        b2Var.c0 = i11;
        return this;
    }

    public AlertDialog$Builder(Context context, f6 f6Var) {
        this(context, 0, f6Var);
    }

    public AlertDialog$Builder(Context context, int i10, f6 f6Var) {
        this.b = new boolean[3];
        if (context == null && (context = AndroidUtilities.findActivity(LaunchActivity.G1)) == null) {
            context = ApplicationLoader.applicationContext;
        }
        this.a = b(context, i10, f6Var);
    }
}
