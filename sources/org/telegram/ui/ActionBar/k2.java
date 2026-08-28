package org.telegram.ui.ActionBar;

import android.app.Dialog;
import android.view.View;
import org.telegram.ui.Components.oc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public interface k2 {
    boolean attachedToParent();

    void dismiss();

    void dismiss(boolean z10);

    oc getBulletinFactory();

    int getNavigationBarColor(int i9);

    View getWindowView();

    boolean isAttachedLightStatusBar();

    boolean isFullyVisible();

    boolean isShown();

    boolean onAttachedBackPressed();

    void setKeyboardHeightFromParent(int i9);

    void setLastVisible(boolean z10);

    void setOnDismissListener(Runnable runnable);

    boolean showDialog(Dialog dialog);
}
