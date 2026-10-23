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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class l3 extends Dialog {
    public final w3 a;
    public final k3 b;
    public final j3 c;
    public final Paint d;
    public boolean e;

    public l3(w3 w3Var) {
        super(w3Var.getWindowView().getContext(), R.style.TransparentDialog);
        Paint paint = new Paint(1);
        this.d = paint;
        this.a = w3Var;
        x3 windowView = w3Var.getWindowView();
        j3 j3Var = new j3(this, getContext());
        this.c = j3Var;
        paint.setColor(k6.x0(null, k6.a7, false));
        k3 k3Var = new k3(windowView);
        this.b = k3Var;
        setContentView(k3Var, new ViewGroup.LayoutParams(-1, -1));
        k3Var.addView(j3Var, w7.z5.e(-1, -2, 80));
        k3Var.setClipToPadding(false);
    }

    public static /* synthetic */ WindowInsets a(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void b(w3 w3Var) {
        o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (AndroidUtilities.isTablet() || w3Var.b() || AndroidUtilities.hasDialogOnTop(U)) {
            l3 l3Var = new l3(w3Var);
            if (w3Var.c(l3Var)) {
                k3 k3Var = l3Var.b;
                View view = (View) k3Var.a;
                AndroidUtilities.removeFromParent(view);
                k3Var.addView(view, w7.z5.e(-1, -1, 119));
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
        AndroidUtilities.applyEdgeToEdgeLayoutParams(attributes);
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        k3 k3Var = this.b;
        k3Var.setFitsSystemWindows(true);
        k3Var.setSystemUiVisibility(1792);
        k3Var.setPadding(0, 0, 0, 0);
        k3Var.setOnApplyWindowInsetsListener(new i3(0));
    }
}
