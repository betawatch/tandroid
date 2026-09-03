package org.telegram.ui.ActionBar;

import android.app.Dialog;
import android.view.View;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public interface l2 {
    boolean attachedToParent();

    void dismiss();

    void dismiss(boolean z4);

    qc getBulletinFactory();

    int getNavigationBarColor(int i10);

    View getWindowView();

    boolean isAttachedLightStatusBar();

    boolean isFullyVisible();

    boolean isShown();

    boolean onAttachedBackPressed();

    void setKeyboardHeightFromParent(int i10);

    void setLastVisible(boolean z4);

    void setOnDismissListener(Runnable runnable);

    boolean showDialog(Dialog dialog);
}
