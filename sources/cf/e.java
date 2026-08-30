package cf;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.view.View;
import j3.f0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class e {
    public final Activity a;
    public final ef.a b;
    public String c;
    public int d;
    public int e = 0;
    public boolean f = false;
    public f0 g;
    public int h;
    public int i;
    public View j;
    public View k;

    public e(Activity activity, ef.a aVar) {
        this.a = activity;
        this.b = aVar;
    }

    public final f a() {
        ComponentCallbacks2 componentCallbacks2 = this.a;
        if (componentCallbacks2 instanceof df.a) {
            return new f(((LaunchActivity) ((df.a) componentCallbacks2)).j0, this);
        }
        return null;
    }
}
