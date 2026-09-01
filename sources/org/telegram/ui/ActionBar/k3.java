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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class k3 extends Dialog {
    public final u3 a;
    public final j3 b;
    public final fg.h0 c;
    public final Paint d;
    public boolean e;

    public k3(u3 u3Var) {
        super(u3Var.getWindowView().getContext(), R.style.TransparentDialog);
        Paint paint = new Paint(1);
        this.d = paint;
        this.a = u3Var;
        v3 windowView = u3Var.getWindowView();
        fg.h0 h0Var = new fg.h0(this, getContext(), 3);
        this.c = h0Var;
        paint.setColor(k6.w0(null, k6.a7, false));
        j3 j3Var = new j3(windowView);
        this.b = j3Var;
        setContentView(j3Var, new ViewGroup.LayoutParams(-1, -1));
        j3Var.addView(h0Var, k7.c6.e(-1, -2, 80));
        j3Var.setClipToPadding(false);
    }

    public static /* synthetic */ WindowInsets a(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void b(u3 u3Var) {
        p2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (AndroidUtilities.isTablet() || u3Var.b() || AndroidUtilities.hasDialogOnTop(U)) {
            k3 k3Var = new k3(u3Var);
            if (u3Var.c(k3Var)) {
                j3 j3Var = k3Var.b;
                View view = (View) j3Var.a;
                AndroidUtilities.removeFromParent(view);
                j3Var.addView(view, k7.c6.e(-1, -1, 119));
            }
        }
    }

    public final void c() {
        this.a.c(null);
        if (this.e) {
            this.e = false;
            try {
                super.dismiss();
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        this.a.dismiss(false);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
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
        if (i10 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        if (i10 >= 23) {
            window.setStatusBarColor(0);
        }
        j3 j3Var = this.b;
        j3Var.setFitsSystemWindows(true);
        j3Var.setSystemUiVisibility(1792);
        j3Var.setPadding(0, 0, 0, 0);
        j3Var.setOnApplyWindowInsetsListener(new i3(0));
    }
}
