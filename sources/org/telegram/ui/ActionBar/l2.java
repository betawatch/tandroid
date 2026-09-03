package org.telegram.ui.ActionBar;

import android.app.Dialog;
import android.view.View;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
