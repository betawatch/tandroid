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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class a3 extends Dialog {
    public final i3 a;
    public final z2 b;
    public final y2 c;
    public final Paint d;
    public boolean e;

    public a3(i3 i3Var) {
        super(i3Var.d().getContext(), R.style.TransparentDialog);
        Paint paint = new Paint(1);
        this.d = paint;
        this.a = i3Var;
        j3 d = i3Var.d();
        y2 y2Var = new y2(this, getContext());
        this.c = y2Var;
        paint.setColor(m6.x0(null, m6.a7, false));
        z2 z2Var = new z2(d);
        this.b = z2Var;
        setContentView(z2Var, new ViewGroup.LayoutParams(-1, -1));
        z2Var.addView(y2Var, ha.e(-1, -2, 80));
        z2Var.setClipToPadding(false);
    }

    public static /* synthetic */ WindowInsets a(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void b(i3 i3Var) {
        f2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        if (org.telegram.messenger.g0.Q1() || i3Var.g() || org.telegram.messenger.g0.u1(T)) {
            a3 a3Var = new a3(i3Var);
            if (i3Var.i(a3Var)) {
                z2 z2Var = a3Var.b;
                View view = (View) z2Var.a;
                org.telegram.messenger.g0.E2(view);
                z2Var.addView(view, ha.e(-1, -1, qs.E1));
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
        z2 z2Var = this.b;
        z2Var.setFitsSystemWindows(true);
        z2Var.setSystemUiVisibility(1792);
        z2Var.setPadding(0, 0, 0, 0);
        z2Var.setOnApplyWindowInsetsListener(new x2(0));
    }
}
