package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import java.util.List;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public interface o4 {
    e2 getBackgroundFragment();

    u2 getBottomSheet();

    List getFragmentStack();

    e2 getLastFragment();

    r4 getMessageDrawableOutMediaStart();

    r4 getMessageDrawableOutStart();

    FrameLayout getOverlayContainerView();

    Activity getParentActivity();

    List getPulledDialogs();

    e2 getSafeLastFragment();

    float getThemeAnimationValue();

    ViewGroup getView();

    Window getWindow();

    void setBackgroundView(View view);

    void setDelegate(l4 l4Var);

    void setDrawerLayoutContainer(l3 l3Var);

    void setFragmentPanTranslationOffset(int i7);

    void setFragmentStack(List list);

    void setHighlightActionButtons(boolean z10);

    void setInBubbleMode(boolean z10);

    void setIsSheet(boolean z10);

    void setNavigationBarColor(int i7);

    void setPulledDialogs(List list);

    void setRemoveActionBarExtraHeight(boolean z10);

    void setUseAlphaAnimations(boolean z10);

    void setWindow(Window window);
}
