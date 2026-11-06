package org.telegram.ui.ActionBar;

import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
