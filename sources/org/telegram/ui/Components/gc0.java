package org.telegram.ui.Components;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class gc0 extends Dialog {
    public final FrameLayout a;
    public final fc0 b;

    public gc0(LaunchActivity launchActivity) {
        super(launchActivity, R.style.TransparentDialog);
        org.telegram.messenger.g0.S(getWindow());
        FrameLayout frameLayout = new FrameLayout(launchActivity);
        this.a = frameLayout;
        k2 k2Var = new k2(28);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(frameLayout, k2Var);
        fc0 fc0Var = new fc0(this, launchActivity);
        this.b = fc0Var;
        frameLayout.addView(fc0Var, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        LaunchActivity launchActivity;
        if (!this.b.i() || (launchActivity = LaunchActivity.G1) == null) {
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
        if (this.b.i() && (launchActivity = LaunchActivity.G1) != null) {
            launchActivity.moveTaskToBack(true);
        }
        return true;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        LaunchActivity launchActivity;
        if (!this.b.i() || (launchActivity = LaunchActivity.G1) == null) {
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
        attributes.gravity = org.telegram.messenger.qs.E1;
        attributes.dimAmount = 0.0f;
        int i7 = attributes.flags & (-3);
        attributes.flags = i7;
        attributes.softInputMode = 16;
        boolean z9 = org.telegram.messenger.r2.a;
        attributes.flags = i7 | TLObject.FLAG_13;
        org.telegram.messenger.g0.h2();
        attributes.flags |= -2013198976;
        window.setAttributes(attributes);
        frameLayout.setSystemUiVisibility(256);
        org.telegram.messenger.g0.n3(this, false);
    }
}
