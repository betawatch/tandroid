package org.telegram.ui.ActionBar;

import android.app.Dialog;
import android.view.View;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public interface i2 {
    boolean attachedToParent();

    void dismiss();

    void dismiss(boolean z10);

    xc getBulletinFactory();

    int getNavigationBarColor(int i10);

    View getWindowView();

    boolean isAttachedLightStatusBar();

    boolean isFullyVisible();

    boolean isShown();

    boolean onAttachedBackPressed();

    void setKeyboardHeightFromParent(int i10);

    void setLastVisible(boolean z10);

    void setOnDismissListener(Runnable runnable);

    boolean showDialog(Dialog dialog);
}
