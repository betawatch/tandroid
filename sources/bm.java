// default package

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class bm implements dm {
    public final WeakReference a;
    public final boolean b;
    public Layout c;
    public gm d;
    public Rect e;
    public vl f;
    public ru3 h;
    public boolean n;
    public float r;
    public float s;
    public boolean w;

    public bm(View view, boolean z) {
        this.a = new WeakReference(view);
        this.b = z;
    }

    @Override // dm
    public final void invalidate() {
        View view = (View) this.a.get();
        if (view == null) {
            return;
        }
        if (!this.b || view.getParent() == null) {
            view.invalidate();
        } else {
            ((View) view.getParent()).invalidate();
        }
    }
}
