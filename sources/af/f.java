package af;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.view.View;
import j3.k0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f {
    public final Activity a;
    public final cf.a b;
    public String c;
    public int d;
    public int e = 0;
    public boolean f = false;
    public k0 g;
    public int h;
    public int i;
    public View j;
    public View k;

    public f(Activity activity, cf.a aVar) {
        this.a = activity;
        this.b = aVar;
    }

    public final g a() {
        ComponentCallbacks2 componentCallbacks2 = this.a;
        if (componentCallbacks2 instanceof bf.a) {
            return new g(((LaunchActivity) ((bf.a) componentCallbacks2)).i0, this);
        }
        return null;
    }
}
