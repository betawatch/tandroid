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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class bd0 extends Dialog {
    public final FrameLayout a;
    public final ad0 b;

    public bd0(LaunchActivity launchActivity) {
        super(launchActivity, R.style.TransparentDialog);
        org.telegram.messenger.i0.S(getWindow());
        FrameLayout frameLayout = new FrameLayout(launchActivity);
        this.a = frameLayout;
        au auVar = new au(11);
        WeakHashMap weakHashMap = r0.h0.a;
        r0.z.i(frameLayout, auVar);
        ad0 ad0Var = new ad0(this, launchActivity);
        this.b = ad0Var;
        frameLayout.addView(ad0Var, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        LaunchActivity launchActivity;
        if (!this.b.i() || (launchActivity = LaunchActivity.I1) == null) {
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
        if (this.b.i() && (launchActivity = LaunchActivity.I1) != null) {
            launchActivity.moveTaskToBack(true);
        }
        return true;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        LaunchActivity launchActivity;
        if (!this.b.i() || (launchActivity = LaunchActivity.I1) == null) {
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
        attributes.gravity = org.telegram.messenger.zs.E1;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.flags = i10;
        attributes.softInputMode = 16;
        boolean z10 = org.telegram.messenger.v2.a;
        attributes.flags = i10 | TLObject.FLAG_13;
        org.telegram.messenger.i0.h2();
        attributes.flags |= -2013198976;
        window.setAttributes(attributes);
        frameLayout.setSystemUiVisibility(256);
        org.telegram.messenger.i0.m3(this, false);
    }
}
