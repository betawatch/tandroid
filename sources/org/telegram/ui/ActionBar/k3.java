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
import bi.nc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class k3 extends Dialog {
    public final w3 a;
    public final j3 b;
    public final nc c;
    public final Paint d;
    public boolean e;

    public k3(w3 w3Var) {
        super(w3Var.getWindowView().getContext(), R.style.TransparentDialog);
        Paint paint = new Paint(1);
        this.d = paint;
        this.a = w3Var;
        x3 windowView = w3Var.getWindowView();
        nc ncVar = new nc(this, getContext(), 8);
        this.c = ncVar;
        paint.setColor(j6.w0(null, j6.a7, false));
        j3 j3Var = new j3(windowView);
        this.b = j3Var;
        setContentView(j3Var, new ViewGroup.LayoutParams(-1, -1));
        j3Var.addView(ncVar, w7.a6.e(-1, -2, 80));
        j3Var.setClipToPadding(false);
    }

    public static /* synthetic */ WindowInsets a(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void b(w3 w3Var) {
        p2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (AndroidUtilities.isTablet() || w3Var.b() || AndroidUtilities.hasDialogOnTop(U)) {
            k3 k3Var = new k3(w3Var);
            if (w3Var.c(k3Var)) {
                j3 j3Var = k3Var.b;
                View view = (View) j3Var.a;
                AndroidUtilities.removeFromParent(view);
                j3Var.addView(view, w7.a6.e(-1, -1, 119));
            }
        }
    }

    public final void c() {
        this.a.c(null);
        if (this.e) {
            this.e = false;
            try {
                super.dismiss();
            } catch (Exception e) {
                FileLog.e(e);
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
