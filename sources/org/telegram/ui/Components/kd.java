package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.mediarouter.app.MediaRouteButton;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class kd extends MediaRouteButton {
    public boolean a;

    public final void a() {
        boolean b10 = b();
        if (this.a != b10) {
            this.a = b10;
            c(b10);
        }
    }

    public final boolean b() {
        Field declaredField;
        try {
            declaredField = MediaRouteButton.class.getDeclaredField("mConnectionState");
            declaredField.setAccessible(true);
        } catch (Exception unused) {
        }
        return ((Integer) declaredField.get(this)).intValue() > 0;
    }

    public abstract void c(boolean z10);

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        a();
    }

    @Override // androidx.mediarouter.app.MediaRouteButton, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override // androidx.mediarouter.app.MediaRouteButton, android.view.View
    public final void onDraw(Canvas canvas) {
        a();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
    }
}
