package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public interface z4 {
    k2 getBackgroundFragment();

    z2 getBottomSheet();

    List getFragmentStack();

    k2 getLastFragment();

    c5 getMessageDrawableOutMediaStart();

    c5 getMessageDrawableOutStart();

    FrameLayout getOverlayContainerView();

    Activity getParentActivity();

    List getPulledDialogs();

    k2 getSafeLastFragment();

    float getThemeAnimationValue();

    ViewGroup getView();

    Window getWindow();

    void setBackgroundView(View view);

    void setDelegate(v4 v4Var);

    void setDrawerLayoutContainer(s3 s3Var);

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
