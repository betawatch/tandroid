package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class m5 implements o5 {
    public final WeakReference a;
    public final boolean b;
    public Layout c;
    public r5 d;
    public Rect e;
    public i5 f;
    public org.telegram.messenger.e6 h;
    public boolean n;
    public float r;
    public float s;
    public boolean w;

    public m5(View view, boolean z9) {
        this.a = new WeakReference(view);
        this.b = z9;
    }

    @Override // org.telegram.ui.Components.o5
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
