package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public class AlertDialog$Builder {
    public final c2 a;
    public final boolean[] b;

    public AlertDialog$Builder(Context context) {
        this(context, 0, null);
    }

    public final c2 a() {
        return this.a;
    }

    public c2 b(Context context, int i10, g6 g6Var) {
        return new c2(context, i10, g6Var);
    }

    public final void c() {
        int i10 = c2.l1;
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
        c2 c2Var = this.a;
        c2Var.P = charSequenceArr;
        c2Var.M = onClickListener;
    }

    public final void g(CharSequence charSequence) {
        this.a.T = charSequence;
    }

    public final void h(String str, z1 z1Var) {
        c2 c2Var = this.a;
        c2Var.p0 = str;
        c2Var.q0 = z1Var;
    }

    public final void i(String str, z1 z1Var) {
        c2 c2Var = this.a;
        c2Var.t0 = str;
        c2Var.u0 = z1Var;
    }

    public final void j(DialogInterface.OnDismissListener onDismissListener) {
        this.a.setOnDismissListener(onDismissListener);
    }

    public final void k(CharSequence charSequence, z1 z1Var) {
        c2 c2Var = this.a;
        c2Var.n0 = charSequence;
        c2Var.o0 = z1Var;
    }

    public final void l(CharSequence charSequence) {
        this.a.R = charSequence;
    }

    public final void m(int i10, int i11, int i12, HashMap hashMap) {
        c2 c2Var = this.a;
        c2Var.X = i10;
        c2Var.Y = i11;
        c2Var.U0 = false;
        c2Var.c0 = i12;
        c2Var.d0 = -1;
        c2Var.Z = hashMap;
    }

    public final void n(int i10, g6 g6Var) {
        c2 c2Var = this.a;
        c2Var.d0 = i10;
        c2Var.e0 = g6Var;
        c2Var.c0 = k6.w0(i10, g6Var);
    }

    public final void o(View view) {
        c2 c2Var = this.a;
        c2Var.b = view;
        c2Var.e = -2;
    }

    public final c2 p() {
        TextView textView;
        c2 c2Var = this.a;
        c2Var.show();
        int i10 = 0;
        while (true) {
            boolean[] zArr = this.b;
            if (i10 >= zArr.length) {
                return c2Var;
            }
            if (zArr[i10] && (textView = (TextView) c2Var.d(-(i10 + 1))) != null) {
                r6.W(textView, k6.q7, c2Var.k1);
            }
            i10++;
        }
    }

    public AlertDialog$Builder setTopImage(int i10, int i11) {
        c2 c2Var = this.a;
        c2Var.U = i10;
        c2Var.c0 = i11;
        c2Var.d0 = -1;
        return this;
    }

    public AlertDialog$Builder(Context context, g6 g6Var) {
        this(context, 0, g6Var);
    }

    public AlertDialog$Builder(Context context, int i10, g6 g6Var) {
        this.b = new boolean[3];
        if (context == null && (context = AndroidUtilities.findActivity(LaunchActivity.J1)) == null) {
            context = ApplicationLoader.applicationContext;
        }
        this.a = b(context, i10, g6Var);
    }
}
