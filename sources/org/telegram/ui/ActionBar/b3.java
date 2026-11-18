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
import c8.ma;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ks;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class b3 extends Dialog {
    public final k3 a;
    public final a3 b;
    public final z2 c;
    public final Paint d;
    public boolean e;

    public b3(k3 k3Var) {
        super(k3Var.d().getContext(), R.style.TransparentDialog);
        Paint paint = new Paint(1);
        this.d = paint;
        this.a = k3Var;
        l3 d = k3Var.d();
        z2 z2Var = new z2(this, getContext());
        this.c = z2Var;
        paint.setColor(n6.x0(null, n6.a7, false));
        a3 a3Var = new a3(d);
        this.b = a3Var;
        setContentView(a3Var, new ViewGroup.LayoutParams(-1, -1));
        a3Var.addView(z2Var, ma.e(-1, -2, 80));
        a3Var.setClipToPadding(false);
    }

    public static /* synthetic */ WindowInsets a(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void b(k3 k3Var) {
        h2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        if (org.telegram.messenger.g0.Q1() || k3Var.g() || org.telegram.messenger.g0.u1(T)) {
            b3 b3Var = new b3(k3Var);
            if (k3Var.i(b3Var)) {
                a3 a3Var = b3Var.b;
                View view = (View) a3Var.a;
                org.telegram.messenger.g0.E2(view);
                a3Var.addView(view, ma.e(-1, -1, ks.E1));
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
        a3 a3Var = this.b;
        a3Var.setFitsSystemWindows(true);
        a3Var.setSystemUiVisibility(1792);
        a3Var.setPadding(0, 0, 0, 0);
        a3Var.setOnApplyWindowInsetsListener(new y2(0));
    }
}
