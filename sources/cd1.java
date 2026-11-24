// default package

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.mediarouter.app.MediaRouteButton;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class cd1 extends MediaRouteButton {
    public boolean a;

    public final void a() {
        boolean b = b();
        if (this.a != b) {
            this.a = b;
            c(b);
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

    public abstract void c(boolean z);

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
