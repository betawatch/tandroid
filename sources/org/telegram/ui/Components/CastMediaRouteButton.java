package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.mediarouter.app.MediaRouteButton;
import java.lang.reflect.Field;

/* loaded from: classes5.dex */
public abstract class CastMediaRouteButton extends MediaRouteButton {
    private boolean lastConnected;

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
    }

    public abstract void stateUpdated(boolean z);

    public CastMediaRouteButton(Context context) {
        super(context);
    }

    public boolean isConnected() {
        try {
            Field declaredField = MediaRouteButton.class.getDeclaredField("mConnectionState");
            declaredField.setAccessible(true);
            return ((Integer) declaredField.get(this)).intValue() > 0;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        checkConnected();
    }

    @Override // androidx.mediarouter.app.MediaRouteButton, android.view.View
    protected void onDraw(Canvas canvas) {
        checkConnected();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        checkConnected();
    }

    @Override // androidx.mediarouter.app.MediaRouteButton, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        checkConnected();
    }

    private void checkConnected() {
        boolean isConnected = isConnected();
        if (this.lastConnected != isConnected) {
            this.lastConnected = isConnected;
            stateUpdated(isConnected);
        }
    }
}
