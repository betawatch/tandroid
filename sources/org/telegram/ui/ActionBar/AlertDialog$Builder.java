package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class AlertDialog$Builder {
    public final e2 a;
    public final boolean[] b;

    public AlertDialog$Builder(Context context) {
        this(context, 0, null);
    }

    public final e2 a() {
        return this.a;
    }

    public e2 b(Context context, int i10, u6 u6Var) {
        return new e2(context, i10, u6Var);
    }

    public final void c() {
        int i10 = e2.l1;
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
        e2 e2Var = this.a;
        e2Var.P = charSequenceArr;
        e2Var.M = onClickListener;
    }

    public final void g(CharSequence charSequence) {
        this.a.T = charSequence;
    }

    public final void h(String str, b2 b2Var) {
        e2 e2Var = this.a;
        e2Var.p0 = str;
        e2Var.q0 = b2Var;
    }

    public final void i(String str, b2 b2Var) {
        e2 e2Var = this.a;
        e2Var.t0 = str;
        e2Var.u0 = b2Var;
    }

    public final void j(DialogInterface.OnDismissListener onDismissListener) {
        this.a.setOnDismissListener(onDismissListener);
    }

    public final void k(CharSequence charSequence, b2 b2Var) {
        e2 e2Var = this.a;
        e2Var.n0 = charSequence;
        e2Var.o0 = b2Var;
    }

    public final void l(CharSequence charSequence) {
        this.a.R = charSequence;
    }

    public final void m(int i10, int i11, int i12, HashMap hashMap) {
        e2 e2Var = this.a;
        e2Var.X = i10;
        e2Var.Y = i11;
        e2Var.U0 = false;
        e2Var.c0 = i12;
        e2Var.d0 = -1;
        e2Var.Z = hashMap;
    }

    public final void n(int i10, u6 u6Var) {
        e2 e2Var = this.a;
        e2Var.d0 = i10;
        e2Var.e0 = u6Var;
        e2Var.c0 = y6.w0(i10, u6Var);
    }

    public final void o(View view) {
        e2 e2Var = this.a;
        e2Var.b = view;
        e2Var.e = -2;
    }

    public final e2 p() {
        TextView textView;
        e2 e2Var = this.a;
        e2Var.show();
        int i10 = 0;
        while (true) {
            boolean[] zArr = this.b;
            if (i10 >= zArr.length) {
                return e2Var;
            }
            if (zArr[i10] && (textView = (TextView) e2Var.d(-(i10 + 1))) != null) {
                f7.V(textView, y6.q7, e2Var.k1);
            }
            i10++;
        }
    }

    public AlertDialog$Builder setTopImage(int i10, int i11) {
        e2 e2Var = this.a;
        e2Var.U = i10;
        e2Var.c0 = i11;
        e2Var.d0 = -1;
        return this;
    }

    public AlertDialog$Builder(Context context, u6 u6Var) {
        this(context, 0, u6Var);
    }

    public AlertDialog$Builder(Context context, int i10, u6 u6Var) {
        this.b = new boolean[3];
        if (context == null && (context = AndroidUtilities.findActivity(LaunchActivity.I1)) == null) {
            context = ApplicationLoader.applicationContext;
        }
        this.a = b(context, i10, u6Var);
    }
}
