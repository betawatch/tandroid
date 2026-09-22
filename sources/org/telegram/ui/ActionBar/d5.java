package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import java.util.List;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public interface d5 {
    n2 getBackgroundFragment();

    f3 getBottomSheet();

    List getFragmentStack();

    n2 getLastFragment();

    f5 getMessageDrawableOutMediaStart();

    f5 getMessageDrawableOutStart();

    FrameLayout getOverlayContainerView();

    Activity getParentActivity();

    List getPulledDialogs();

    n2 getSafeLastFragment();

    float getThemeAnimationValue();

    ViewGroup getView();

    Window getWindow();

    void setBackgroundView(View view);

    void setDelegate(a5 a5Var);

    void setDrawerLayoutContainer(z3 z3Var);

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
