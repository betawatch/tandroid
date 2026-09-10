package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class AlertDialog$Builder {
    public final d2 a;
    public final boolean[] b;

    public AlertDialog$Builder(Context context) {
        this(context, 0, null);
    }

    public final d2 a() {
        return this.a;
    }

    public d2 b(Context context, int i10, f6 f6Var) {
        return new d2(context, i10, f6Var);
    }

    public final void c() {
        int i10 = d2.c1;
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
        d2 d2Var = this.a;
        d2Var.P = charSequenceArr;
        d2Var.M = onClickListener;
    }

    public final void g(CharSequence charSequence) {
        this.a.T = charSequence;
    }

    public final void h(String str, c2 c2Var) {
        d2 d2Var = this.a;
        d2Var.n0 = str;
        d2Var.o0 = c2Var;
    }

    public final void i(String str, c2 c2Var) {
        d2 d2Var = this.a;
        d2Var.r0 = str;
        d2Var.s0 = c2Var;
    }

    public final void j(DialogInterface.OnDismissListener onDismissListener) {
        this.a.setOnDismissListener(onDismissListener);
    }

    public final void k(CharSequence charSequence, c2 c2Var) {
        d2 d2Var = this.a;
        d2Var.l0 = charSequence;
        d2Var.m0 = c2Var;
    }

    public final void l(CharSequence charSequence) {
        this.a.R = charSequence;
    }

    public final void m(int i10, int i11, int i12, HashMap hashMap) {
        d2 d2Var = this.a;
        d2Var.X = i10;
        d2Var.Y = i11;
        d2Var.S0 = false;
        d2Var.c0 = i12;
        d2Var.Z = hashMap;
    }

    public final void n(View view) {
        d2 d2Var = this.a;
        d2Var.b = view;
        d2Var.e = -2;
    }

    public final d2 o() {
        TextView textView;
        d2 d2Var = this.a;
        d2Var.show();
        int i10 = 0;
        while (true) {
            boolean[] zArr = this.b;
            if (i10 >= zArr.length) {
                return d2Var;
            }
            if (zArr[i10] && (textView = (TextView) d2Var.d(-(i10 + 1))) != null) {
                textView.setTextColor(d2Var.e(j6.q7));
            }
            i10++;
        }
    }

    public AlertDialog$Builder setTopImage(int i10, int i11) {
        d2 d2Var = this.a;
        d2Var.U = i10;
        d2Var.c0 = i11;
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
