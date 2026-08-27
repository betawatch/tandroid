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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class h3 extends Dialog {
    public final s3 a;
    public final g3 b;
    public final ag.s0 c;
    public final Paint d;
    public boolean e;

    public h3(s3 s3Var) {
        super(s3Var.getWindowView().getContext(), R.style.TransparentDialog);
        Paint paint = new Paint(1);
        this.d = paint;
        this.a = s3Var;
        t3 windowView = s3Var.getWindowView();
        ag.s0 s0Var = new ag.s0(this, getContext(), 7);
        this.c = s0Var;
        paint.setColor(g6.w0(null, g6.a7, false));
        g3 g3Var = new g3(windowView);
        this.b = g3Var;
        setContentView(g3Var, new ViewGroup.LayoutParams(-1, -1));
        g3Var.addView(s0Var, h7.z5.e(-1, -2, 80));
        g3Var.setClipToPadding(false);
    }

    public static /* synthetic */ WindowInsets a(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void b(s3 s3Var) {
        n2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (AndroidUtilities.isTablet() || s3Var.b() || AndroidUtilities.hasDialogOnTop(U)) {
            h3 h3Var = new h3(s3Var);
            if (s3Var.c(h3Var)) {
                g3 g3Var = h3Var.b;
                View view = (View) g3Var.a;
                AndroidUtilities.removeFromParent(view);
                g3Var.addView(view, h7.z5.e(-1, -1, 119));
            }
        }
    }

    public final void c() {
        this.a.c(null);
        if (this.e) {
            this.e = false;
            try {
                super.dismiss();
            } catch (Exception e9) {
                FileLog.e(e9);
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
        g3 g3Var = this.b;
        g3Var.setFitsSystemWindows(true);
        g3Var.setSystemUiVisibility(1792);
        g3Var.setPadding(0, 0, 0, 0);
        g3Var.setOnApplyWindowInsetsListener(new f3(0));
    }
}
