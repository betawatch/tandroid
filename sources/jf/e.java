package jf;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.view.View;
import i2.i0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e {
    public final Activity a;
    public final lf.a b;
    public String c;
    public int d;
    public int e = 0;
    public boolean f = false;
    public i0 g;
    public int h;
    public int i;
    public View j;
    public View k;

    public e(Activity activity, lf.a aVar) {
        this.a = activity;
        this.b = aVar;
    }

    public final f a() {
        ComponentCallbacks2 componentCallbacks2 = this.a;
        if (componentCallbacks2 instanceof kf.a) {
            return new f(((LaunchActivity) ((kf.a) componentCallbacks2)).m0, this);
        }
        return null;
    }
}
