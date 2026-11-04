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
import b8.mf;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x2 extends Dialog {
    public final g3 a;
    public final w2 b;
    public final v2 c;
    public final Paint d;
    public boolean e;

    public x2(g3 g3Var) {
        super(g3Var.d().getContext(), R.style.TransparentDialog);
        Paint paint = new Paint(1);
        this.d = paint;
        this.a = g3Var;
        h3 d = g3Var.d();
        v2 v2Var = new v2(this, getContext());
        this.c = v2Var;
        paint.setColor(k6.x0(null, k6.a7, false));
        w2 w2Var = new w2(d);
        this.b = w2Var;
        setContentView(w2Var, new ViewGroup.LayoutParams(-1, -1));
        w2Var.addView(v2Var, mf.e(-1, -2, 80));
        w2Var.setClipToPadding(false);
    }

    public static /* synthetic */ WindowInsets a(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void b(g3 g3Var) {
        d2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        if (org.telegram.messenger.g0.Q1() || g3Var.g() || org.telegram.messenger.g0.u1(T)) {
            x2 x2Var = new x2(g3Var);
            if (g3Var.i(x2Var)) {
                w2 w2Var = x2Var.b;
                View view = (View) w2Var.a;
                org.telegram.messenger.g0.E2(view);
                w2Var.addView(view, mf.e(-1, -1, hs.E1));
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
        w2 w2Var = this.b;
        w2Var.setFitsSystemWindows(true);
        w2Var.setSystemUiVisibility(1792);
        w2Var.setPadding(0, 0, 0, 0);
        w2Var.setOnApplyWindowInsetsListener(new u2(0));
    }
}
