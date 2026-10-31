package org.telegram.ui.ActionBar;

import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public interface b5 {
    boolean a(t0 t0Var, RectF rectF);

    boolean b();

    vg.f c(s5 s5Var);

    void d(s5 s5Var, t0 t0Var);

    int getButtonsGlassBackgroundColor();

    wg.a getButtonsGlassColorProvider();

    wg.a getMenuGlassColorProvider();

    View getMenuHostView();

    p6 getMenuResourcesProvider();

    View getMenuView();

    s5 getOpenMenuOverlay();

    void setMenuGlassFrostedProgress(float f7);
}
