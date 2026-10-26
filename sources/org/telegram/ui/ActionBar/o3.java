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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class o3 extends Dialog {
    public final y3 a;
    public final n3 b;
    public final m3 c;
    public final Paint d;
    public boolean e;

    public o3(y3 y3Var) {
        super(y3Var.getWindowView().getContext(), R.style.TransparentDialog);
        Paint paint = new Paint(1);
        this.d = paint;
        this.a = y3Var;
        z3 windowView = y3Var.getWindowView();
        m3 m3Var = new m3(this, getContext());
        this.c = m3Var;
        paint.setColor(y6.x0(null, y6.a7, false));
        n3 n3Var = new n3(windowView);
        this.b = n3Var;
        setContentView(n3Var, new ViewGroup.LayoutParams(-1, -1));
        n3Var.addView(m3Var, gb1.i(-1, -2, 80));
        n3Var.setClipToPadding(false);
    }

    public static /* synthetic */ WindowInsets a(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        return Build.VERSION.SDK_INT >= 30 ? WindowInsets.CONSUMED : windowInsets.consumeSystemWindowInsets();
    }

    public static void b(y3 y3Var) {
        r2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (AndroidUtilities.isTablet() || y3Var.b() || AndroidUtilities.hasDialogOnTop(U)) {
            o3 o3Var = new o3(y3Var);
            if (y3Var.c(o3Var)) {
                n3 n3Var = o3Var.b;
                View view = (View) n3Var.a;
                AndroidUtilities.removeFromParent(view);
                n3Var.addView(view, gb1.i(-1, -1, 119));
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
        n3 n3Var = this.b;
        n3Var.setFitsSystemWindows(true);
        n3Var.setSystemUiVisibility(1792);
        n3Var.setPadding(0, 0, 0, 0);
        n3Var.setOnApplyWindowInsetsListener(new l3(0));
    }
}
