package e0;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import g7.z6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class h extends Activity implements androidx.lifecycle.t, r0.k {
    public final androidx.lifecycle.v a = new androidx.lifecycle.v(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.i.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView, "window.decorView");
        if (z6.a(decorView, event)) {
            return true;
        }
        return z6.b(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent event) {
        kotlin.jvm.internal.i.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.i.d(decorView, "window.decorView");
        if (z6.a(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override // r0.k
    public final boolean i(KeyEvent event) {
        kotlin.jvm.internal.i.e(event, "event");
        return super.dispatchKeyEvent(event);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i9 = androidx.lifecycle.h0.b;
        androidx.lifecycle.f0.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.i.e(outState, "outState");
        this.a.g();
        super.onSaveInstanceState(outState);
    }
}
