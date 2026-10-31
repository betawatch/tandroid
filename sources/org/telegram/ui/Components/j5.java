package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j5 implements l5 {
    public final WeakReference a;
    public final boolean b;
    public Layout c;
    public o5 d;
    public Rect e;
    public f5 f;
    public org.telegram.messenger.g6 h;
    public boolean n;
    public float r;
    public float s;
    public boolean w;

    public j5(View view, boolean z10) {
        this.a = new WeakReference(view);
        this.b = z10;
    }

    @Override // org.telegram.ui.Components.l5
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
