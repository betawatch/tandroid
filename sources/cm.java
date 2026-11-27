// default package

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class cm implements em {
    public final WeakReference a;
    public final boolean b;
    public Layout c;
    public hm d;
    public Rect e;
    public wl f;
    public lv3 h;
    public boolean n;
    public float r;
    public float s;
    public boolean w;

    public cm(View view, boolean z) {
        this.a = new WeakReference(view);
        this.b = z;
    }

    @Override // em
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
