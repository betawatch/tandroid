package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import java.util.List;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public interface f5 {
    p2 getBackgroundFragment();

    h3 getBottomSheet();

    List getFragmentStack();

    p2 getLastFragment();

    h5 getMessageDrawableOutMediaStart();

    h5 getMessageDrawableOutStart();

    FrameLayout getOverlayContainerView();

    Activity getParentActivity();

    List getPulledDialogs();

    p2 getSafeLastFragment();

    float getThemeAnimationValue();

    ViewGroup getView();

    Window getWindow();

    void setBackgroundView(View view);

    void setDelegate(c5 c5Var);

    void setDrawerLayoutContainer(z3 z3Var);

    void setFragmentPanTranslationOffset(int i10);

    void setFragmentStack(List list);

    void setHighlightActionButtons(boolean z4);

    void setInBubbleMode(boolean z4);

    void setIsSheet(boolean z4);

    void setNavigationBarColor(int i10);

    void setPulledDialogs(List list);

    void setRemoveActionBarExtraHeight(boolean z4);

    void setUseAlphaAnimations(boolean z4);

    void setWindow(Window window);
}
