// default package

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bn implements dn {
    public final WeakReference a;
    public final boolean b;
    public Layout c;
    public gn d;
    public Rect e;
    public vm f;
    public cw3 h;
    public boolean n;
    public float r;
    public float s;
    public boolean w;

    public bn(View view, boolean z) {
        this.a = new WeakReference(view);
        this.b = z;
    }

    @Override // dn
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
