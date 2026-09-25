package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import java.util.List;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public interface b5 {
    m2 getBackgroundFragment();

    e3 getBottomSheet();

    List getFragmentStack();

    m2 getLastFragment();

    d5 getMessageDrawableOutMediaStart();

    d5 getMessageDrawableOutStart();

    FrameLayout getOverlayContainerView();

    Activity getParentActivity();

    List getPulledDialogs();

    m2 getSafeLastFragment();

    float getThemeAnimationValue();

    ViewGroup getView();

    Window getWindow();

    void setBackgroundView(View view);

    void setDelegate(y4 y4Var);

    void setDrawerLayoutContainer(x3 x3Var);

    void setFragmentPanTranslationOffset(int i10);

    void setFragmentStack(List list);

    void setHighlightActionButtons(boolean z10);

    void setInBubbleMode(boolean z10);

    void setIsSheet(boolean z10);

    void setNavigationBarColor(int i10);

    void setPulledDialogs(List list);

    void setRemoveActionBarExtraHeight(boolean z10);

    void setUseAlphaAnimations(boolean z10);

    void setWindow(Window window);
}
