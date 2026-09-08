package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.mediarouter.app.MediaRouteButton;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class md extends MediaRouteButton {
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
