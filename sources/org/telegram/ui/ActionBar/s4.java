package org.telegram.ui.ActionBar;

import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public interface s4 {
    boolean a(r0 r0Var, RectF rectF);

    boolean b();

    fh.g c(i5 i5Var);

    void d(i5 i5Var, r0 r0Var);

    int getButtonsGlassBackgroundColor();

    gh.a getButtonsGlassColorProvider();

    gh.a getMenuGlassColorProvider();

    View getMenuHostView();

    f6 getMenuResourcesProvider();

    int getMenuRise();

    View getMenuView();

    i5 getOpenMenuOverlay();

    void setMenuGlassFrostedProgress(float f10);
}
