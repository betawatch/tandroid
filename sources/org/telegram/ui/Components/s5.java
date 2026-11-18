package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class s5 implements u5 {
    public final WeakReference a;
    public final boolean b;
    public Layout c;
    public x5 d;
    public Rect e;
    public o5 f;
    public org.telegram.messenger.f6 h;
    public boolean n;
    public float r;
    public float s;
    public boolean w;

    public s5(View view, boolean z10) {
        this.a = new WeakReference(view);
        this.b = z10;
    }

    @Override // org.telegram.ui.Components.u5
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
