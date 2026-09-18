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
import ci.eb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class j3 extends Dialog {
    public final v3 a;
    public final i3 b;
    public final eb c;
    public final Paint d;
    public boolean e;

    public j3(v3 v3Var) {
        super(v3Var.getWindowView().getContext(), R.style.TransparentDialog);
        Paint paint = new Paint(1);
        this.d = paint;
        this.a = v3Var;
        w3 windowView = v3Var.getWindowView();
        eb ebVar = new eb(this, getContext(), 8);
        this.c = ebVar;
        paint.setColor(j6.w0(null, j6.a7, false));
        i3 i3Var = new i3(windowView);
        this.b = i3Var;
        setContentView(i3Var, new ViewGroup.LayoutParams(-1, -1));
        i3Var.addView(ebVar, w7.x5.e(-1, -2, 80));
        i3Var.setClipToPadding(false);
    }

    public static /* synthetic */ WindowInsets a(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void b(v3 v3Var) {
        o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (AndroidUtilities.isTablet() || v3Var.b() || AndroidUtilities.hasDialogOnTop(U)) {
            j3 j3Var = new j3(v3Var);
            if (v3Var.c(j3Var)) {
                i3 i3Var = j3Var.b;
                View view = (View) i3Var.a;
                AndroidUtilities.removeFromParent(view);
                i3Var.addView(view, w7.x5.e(-1, -1, 119));
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
        i3 i3Var = this.b;
        i3Var.setFitsSystemWindows(true);
        i3Var.setSystemUiVisibility(1792);
        i3Var.setPadding(0, 0, 0, 0);
        i3Var.setOnApplyWindowInsetsListener(new h3(0));
    }
}
