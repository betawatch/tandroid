// default package

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
