package bf;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.view.View;
import j3.f0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class e {
    public final Activity a;
    public final df.a b;
    public String c;
    public int d;
    public int e = 0;
    public boolean f = false;
    public f0 g;
    public int h;
    public int i;
    public View j;
    public View k;

    public e(Activity activity, df.a aVar) {
        this.a = activity;
        this.b = aVar;
    }

    public final f a() {
        ComponentCallbacks2 componentCallbacks2 = this.a;
        if (componentCallbacks2 instanceof cf.a) {
            return new f(((LaunchActivity) ((cf.a) componentCallbacks2)).j0, this);
        }
        return null;
    }
}
