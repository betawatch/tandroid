package org.telegram.ui.ActionBar;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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

    public c2 b(Context context, int i10, f6 f6Var) {
        return new c2(context, i10, f6Var);
    }

    public final void c() {
        int i10 = c2.c1;
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
        c2 c2Var = this.a;
        c2Var.P = charSequenceArr;
        c2Var.M = onClickListener;
    }

    public final void g(CharSequence charSequence) {
        this.a.T = charSequence;
    }

    public final void h(String str, b2 b2Var) {
        c2 c2Var = this.a;
        c2Var.n0 = str;
        c2Var.o0 = b2Var;
    }

    public final void i(String str, b2 b2Var) {
        c2 c2Var = this.a;
        c2Var.r0 = str;
        c2Var.s0 = b2Var;
    }

    public final void j(DialogInterface.OnDismissListener onDismissListener) {
        this.a.setOnDismissListener(onDismissListener);
    }

    public final void k(CharSequence charSequence, b2 b2Var) {
        c2 c2Var = this.a;
        c2Var.l0 = charSequence;
        c2Var.m0 = b2Var;
    }

    public final void l(CharSequence charSequence) {
        this.a.R = charSequence;
    }

    public final void m(int i10, int i11, int i12, HashMap hashMap) {
        c2 c2Var = this.a;
        c2Var.X = i10;
        c2Var.Y = i11;
        c2Var.S0 = false;
        c2Var.c0 = i12;
        c2Var.Z = hashMap;
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
        int i10 = 0;
        while (true) {
            boolean[] zArr = this.b;
            if (i10 >= zArr.length) {
                return c2Var;
            }
            if (zArr[i10] && (textView = (TextView) c2Var.d(-(i10 + 1))) != null) {
                textView.setTextColor(c2Var.e(j6.q7));
            }
            i10++;
        }
    }

    public AlertDialog$Builder setTopImage(int i10, int i11) {
        c2 c2Var = this.a;
        c2Var.U = i10;
        c2Var.c0 = i11;
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
