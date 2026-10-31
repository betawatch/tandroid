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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f8;
import org.telegram.messenger.zs;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d3 extends Dialog {
    public final n3 a;
    public final c3 b;
    public final b3 c;
    public final Paint d;
    public boolean e;

    public d3(n3 n3Var) {
        super(n3Var.d().getContext(), R.style.TransparentDialog);
        Paint paint = new Paint(1);
        this.d = paint;
        this.a = n3Var;
        o3 d = n3Var.d();
        b3 b3Var = new b3(this, getContext());
        this.c = b3Var;
        paint.setColor(t6.x0(null, t6.a7, false));
        c3 c3Var = new c3(d);
        this.b = c3Var;
        setContentView(c3Var, new ViewGroup.LayoutParams(-1, -1));
        c3Var.addView(b3Var, w7.b6.e(-1, -2, 80));
        c3Var.setClipToPadding(false);
    }

    public static /* synthetic */ WindowInsets a(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void b(n3 n3Var) {
        k2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        if (org.telegram.messenger.i0.Q1() || n3Var.g() || org.telegram.messenger.i0.u1(T)) {
            d3 d3Var = new d3(n3Var);
            if (n3Var.i(d3Var)) {
                c3 c3Var = d3Var.b;
                View view = (View) c3Var.a;
                org.telegram.messenger.i0.E2(view);
                c3Var.addView(view, w7.b6.e(-1, -1, zs.E1));
            }
        }
    }

    public final void c() {
        this.a.i(null);
        if (this.e) {
            this.e = false;
            try {
                super.dismiss();
            } catch (Exception e) {
                f8.g(e, true);
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
        org.telegram.messenger.i0.m(attributes);
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        c3 c3Var = this.b;
        c3Var.setFitsSystemWindows(true);
        c3Var.setSystemUiVisibility(1792);
        c3Var.setPadding(0, 0, 0, 0);
        c3Var.setOnApplyWindowInsetsListener(new a3(0));
    }
}
