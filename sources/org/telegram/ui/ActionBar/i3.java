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
import ci.bb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class i3 extends Dialog {
    public final t3 a;
    public final h3 b;
    public final bb c;
    public final Paint d;
    public boolean e;

    public i3(t3 t3Var) {
        super(t3Var.getWindowView().getContext(), R.style.TransparentDialog);
        Paint paint = new Paint(1);
        this.d = paint;
        this.a = t3Var;
        u3 windowView = t3Var.getWindowView();
        bb bbVar = new bb(this, getContext(), 8);
        this.c = bbVar;
        paint.setColor(h6.w0(null, h6.a7, false));
        h3 h3Var = new h3(windowView);
        this.b = h3Var;
        setContentView(h3Var, new ViewGroup.LayoutParams(-1, -1));
        h3Var.addView(bbVar, w7.x5.e(-1, -2, 80));
        h3Var.setClipToPadding(false);
    }

    public static /* synthetic */ WindowInsets a(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void b(t3 t3Var) {
        n2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (AndroidUtilities.isTablet() || t3Var.b() || AndroidUtilities.hasDialogOnTop(U)) {
            i3 i3Var = new i3(t3Var);
            if (t3Var.c(i3Var)) {
                h3 h3Var = i3Var.b;
                View view = (View) h3Var.a;
                AndroidUtilities.removeFromParent(view);
                h3Var.addView(view, w7.x5.e(-1, -1, 119));
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
        h3 h3Var = this.b;
        h3Var.setFitsSystemWindows(true);
        h3Var.setSystemUiVisibility(1792);
        h3Var.setPadding(0, 0, 0, 0);
        h3Var.setOnApplyWindowInsetsListener(new g3(0));
    }
}
