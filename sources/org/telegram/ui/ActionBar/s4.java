package org.telegram.ui.ActionBar;

import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
