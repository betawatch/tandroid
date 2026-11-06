package org.telegram.ui.ActionBar;

import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
