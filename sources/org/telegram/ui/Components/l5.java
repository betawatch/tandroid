package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class l5 implements n5 {
    public final WeakReference a;
    public final boolean b;
    public Layout c;
    public q5 d;
    public Rect e;
    public h5 f;
    public org.telegram.messenger.e6 h;
    public boolean n;
    public float r;
    public float s;
    public boolean w;

    public l5(View view, boolean z9) {
        this.a = new WeakReference(view);
        this.b = z9;
    }

    @Override // org.telegram.ui.Components.n5
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
