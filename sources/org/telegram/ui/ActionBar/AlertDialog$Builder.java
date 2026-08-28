package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public c2 b(Context context, int i9, b6 b6Var) {
        return new c2(context, i9, b6Var);
    }

    public final void c() {
        int i9 = c2.Y0;
        this.a.getClass();
    }

    public final void d(int i9) {
        int i10 = (-i9) - 1;
        if (i10 >= 0) {
            boolean[] zArr = this.b;
            if (i10 < zArr.length) {
                zArr[i10] = true;
            }
        }
    }

    public final void e() {
        this.a.M0 = 0.5f;
    }

    public final void f(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        c2 c2Var = this.a;
        c2Var.L = charSequenceArr;
        c2Var.I = onClickListener;
    }

    public final void g(CharSequence charSequence) {
        this.a.P = charSequence;
    }

    public final void h(String str, b2 b2Var) {
        c2 c2Var = this.a;
        c2Var.j0 = str;
        c2Var.k0 = b2Var;
    }

    public final void i(String str, b2 b2Var) {
        c2 c2Var = this.a;
        c2Var.n0 = str;
        c2Var.o0 = b2Var;
    }

    public final void j(DialogInterface.OnDismissListener onDismissListener) {
        this.a.setOnDismissListener(onDismissListener);
    }

    public final void k(CharSequence charSequence, b2 b2Var) {
        c2 c2Var = this.a;
        c2Var.h0 = charSequence;
        c2Var.i0 = b2Var;
    }

    public final void l(CharSequence charSequence) {
        this.a.N = charSequence;
    }

    public final void m(int i9, int i10, int i11, HashMap hashMap) {
        c2 c2Var = this.a;
        c2Var.T = i9;
        c2Var.U = i10;
        c2Var.O0 = false;
        c2Var.Y = i11;
        c2Var.V = hashMap;
    }

    public final void n(View view) {
        c2 c2Var = this.a;
        c2Var.b = view;
        c2Var.e = -2;
    }

    public final c2 o() {
        TextView textView;
        c2 c2Var = this.a;
        c2Var.show();
        int i9 = 0;
        while (true) {
            boolean[] zArr = this.b;
            if (i9 >= zArr.length) {
                return c2Var;
            }
            if (zArr[i9] && (textView = (TextView) c2Var.d(-(i9 + 1))) != null) {
                textView.setTextColor(c2Var.e(f6.q7));
            }
            i9++;
        }
    }

    public AlertDialog$Builder setTopImage(int i9, int i10) {
        c2 c2Var = this.a;
        c2Var.Q = i9;
        c2Var.Y = i10;
        return this;
    }

    public AlertDialog$Builder(Context context, b6 b6Var) {
        this(context, 0, b6Var);
    }

    public AlertDialog$Builder(Context context, int i9, b6 b6Var) {
        this.b = new boolean[3];
        if (context == null && (context = AndroidUtilities.findActivity(LaunchActivity.C1)) == null) {
            context = ApplicationLoader.applicationContext;
        }
        this.a = b(context, i9, b6Var);
    }
}
