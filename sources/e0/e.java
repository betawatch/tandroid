package e0;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import c8.ub;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class e extends Activity implements androidx.lifecycle.t, r0.i {
    public final androidx.lifecycle.v a = new androidx.lifecycle.v(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.j.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "window.decorView");
        if (ub.a(decorView, event)) {
            return true;
        }
        return ub.b(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent event) {
        kotlin.jvm.internal.j.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.j.d(decorView, "window.decorView");
        if (ub.a(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override // r0.i
    public final boolean i(KeyEvent event) {
        kotlin.jvm.internal.j.e(event, "event");
        return super.dispatchKeyEvent(event);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i7 = androidx.lifecycle.h0.b;
        androidx.lifecycle.f0.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.j.e(outState, "outState");
        this.a.g();
        super.onSaveInstanceState(outState);
    }
}
