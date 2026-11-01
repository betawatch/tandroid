package org.telegram.ui.ActionBar;

import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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

    int getMenuRise();

    View getMenuView();

    s5 getOpenMenuOverlay();

    void setMenuGlassFrostedProgress(float f7);
}
