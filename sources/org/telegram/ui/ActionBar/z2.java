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
import c8.ha;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.qs;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class z2 extends Dialog {
    public final h3 a;
    public final y2 b;
    public final x2 c;
    public final Paint d;
    public boolean e;

    public z2(h3 h3Var) {
        super(h3Var.d().getContext(), R.style.TransparentDialog);
        Paint paint = new Paint(1);
        this.d = paint;
        this.a = h3Var;
        i3 d = h3Var.d();
        x2 x2Var = new x2(this, getContext());
        this.c = x2Var;
        paint.setColor(k6.x0(null, k6.a7, false));
        y2 y2Var = new y2(d);
        this.b = y2Var;
        setContentView(y2Var, new ViewGroup.LayoutParams(-1, -1));
        y2Var.addView(x2Var, ha.e(-1, -2, 80));
        y2Var.setClipToPadding(false);
    }

    public static /* synthetic */ WindowInsets a(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void b(h3 h3Var) {
        f2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        if (org.telegram.messenger.g0.Q1() || h3Var.g() || org.telegram.messenger.g0.u1(T)) {
            z2 z2Var = new z2(h3Var);
            if (h3Var.i(z2Var)) {
                y2 y2Var = z2Var.b;
                View view = (View) y2Var.a;
                org.telegram.messenger.g0.E2(view);
                y2Var.addView(view, ha.e(-1, -1, qs.E1));
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
        y2 y2Var = this.b;
        y2Var.setFitsSystemWindows(true);
        y2Var.setSystemUiVisibility(1792);
        y2Var.setPadding(0, 0, 0, 0);
        y2Var.setOnApplyWindowInsetsListener(new w2(0));
    }
}
