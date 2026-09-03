package org.telegram.ui.Components;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class zd0 extends Dialog {
    public final FrameLayout a;
    public final yd0 b;

    public zd0(LaunchActivity launchActivity) {
        super(launchActivity, R.style.TransparentDialog);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        FrameLayout frameLayout = new FrameLayout(launchActivity);
        this.a = frameLayout;
        k2 k2Var = new k2(25);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(frameLayout, k2Var);
        yd0 yd0Var = new yd0(this, launchActivity);
        this.b = yd0Var;
        frameLayout.addView(yd0Var, k7.c6.e(-1, -1, 119));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        LaunchActivity launchActivity;
        if (!this.b.g() || (launchActivity = LaunchActivity.D1) == null) {
            return;
        }
        launchActivity.moveTaskToBack(true);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        LaunchActivity launchActivity;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getRepeatCount() != 0) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (this.b.g() && (launchActivity = LaunchActivity.D1) != null) {
            launchActivity.moveTaskToBack(true);
        }
        return true;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        LaunchActivity launchActivity;
        if (!this.b.g() || (launchActivity = LaunchActivity.D1) == null) {
            return;
        }
        launchActivity.moveTaskToBack(true);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = this.a;
        setContentView(frameLayout, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.flags = i10;
        attributes.softInputMode = 16;
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
            attributes.flags = i10 | 8192;
            AndroidUtilities.logFlagSecure();
        }
        attributes.flags |= -2013198976;
        window.setAttributes(attributes);
        frameLayout.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar((Dialog) this, false);
    }
}
