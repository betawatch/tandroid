package org.telegram.ui.ActionBar;

import android.app.Dialog;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import c8.ja;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ns;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class y2 extends Dialog {
    public final g3 a;
    public final x2 b;
    public final w2 c;
    public final Paint d;
    public boolean e;

    public y2(g3 g3Var) {
        super(g3Var.d().getContext(), R.style.TransparentDialog);
        Paint paint = new Paint(1);
        this.d = paint;
        this.a = g3Var;
        h3 d = g3Var.d();
        w2 w2Var = new w2(this, getContext());
        this.c = w2Var;
        paint.setColor(j6.x0(null, j6.a7, false));
        x2 x2Var = new x2(d);
        this.b = x2Var;
        setContentView(x2Var, new ViewGroup.LayoutParams(-1, -1));
        x2Var.addView(w2Var, ja.e(-1, -2, 80));
        x2Var.setClipToPadding(false);
    }

    public static /* synthetic */ WindowInsets a(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void b(g3 g3Var) {
        e2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        if (org.telegram.messenger.g0.Q1() || g3Var.g() || org.telegram.messenger.g0.u1(T)) {
            y2 y2Var = new y2(g3Var);
            if (g3Var.i(y2Var)) {
                x2 x2Var = y2Var.b;
                View view = (View) x2Var.a;
                org.telegram.messenger.g0.E2(view);
                x2Var.addView(view, ja.e(-1, -1, ns.E1));
            }
        }
    }

    public final void c() {
        this.a.i(null);
        if (this.e) {
            this.e = false;
            try {
                super.dismiss();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        this.a.a(false);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            window.addFlags(-2147483392);
        } else {
            window.addFlags(-2147417856);
        }
        window.setWindowAnimations(R.style.DialogNoAnimation);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 51;
        attributes.dimAmount = 0.0f;
        attributes.flags &= -3;
        attributes.softInputMode = 16;
        attributes.height = -1;
        org.telegram.messenger.g0.m(attributes);
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        x2 x2Var = this.b;
        x2Var.setFitsSystemWindows(true);
        x2Var.setSystemUiVisibility(1792);
        x2Var.setPadding(0, 0, 0, 0);
        x2Var.setOnApplyWindowInsetsListener(new v2(0));
    }
}
