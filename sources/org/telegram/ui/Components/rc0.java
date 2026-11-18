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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class rc0 extends Dialog {
    public final FrameLayout a;
    public final qc0 b;

    public rc0(LaunchActivity launchActivity) {
        super(launchActivity, R.style.TransparentDialog);
        org.telegram.messenger.g0.S(getWindow());
        FrameLayout frameLayout = new FrameLayout(launchActivity);
        this.a = frameLayout;
        wb0 wb0Var = new wb0(3);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(frameLayout, wb0Var);
        qc0 qc0Var = new qc0(this, launchActivity);
        this.b = qc0Var;
        frameLayout.addView(qc0Var, c8.ma.e(-1, -1, org.telegram.messenger.ks.E1));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        LaunchActivity launchActivity;
        if (!this.b.i() || (launchActivity = LaunchActivity.H1) == null) {
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
        if (this.b.i() && (launchActivity = LaunchActivity.H1) != null) {
            launchActivity.moveTaskToBack(true);
        }
        return true;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        LaunchActivity launchActivity;
        if (!this.b.i() || (launchActivity = LaunchActivity.H1) == null) {
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
        attributes.gravity = org.telegram.messenger.ks.E1;
        attributes.dimAmount = 0.0f;
        int i7 = attributes.flags & (-3);
        attributes.flags = i7;
        attributes.softInputMode = 16;
        boolean z10 = org.telegram.messenger.s2.a;
        attributes.flags = i7 | TLObject.FLAG_13;
        org.telegram.messenger.g0.h2();
        attributes.flags |= -2013198976;
        window.setAttributes(attributes);
        frameLayout.setSystemUiVisibility(256);
        org.telegram.messenger.g0.m3(this, false);
    }
}
