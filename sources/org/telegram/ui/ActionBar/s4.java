package org.telegram.ui.ActionBar;

import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public interface s4 {
    boolean a(q0 q0Var, RectF rectF);

    boolean b();

    gh.g c(i5 i5Var);

    void d(i5 i5Var, q0 q0Var);

    int getButtonsGlassBackgroundColor();

    hh.a getButtonsGlassColorProvider();

    hh.a getMenuGlassColorProvider();

    View getMenuHostView();

    e6 getMenuResourcesProvider();

    int getMenuRise();

    View getMenuView();

    i5 getOpenMenuOverlay();

    void setMenuGlassFrostedProgress(float f10);
}
