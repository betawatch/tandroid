package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class k5 implements m5 {
    public final WeakReference a;
    public final boolean b;
    public Layout c;
    public p5 d;
    public Rect e;
    public g5 f;
    public org.telegram.messenger.f6 h;
    public boolean n;
    public float r;
    public float s;
    public boolean w;

    public k5(View view, boolean z10) {
        this.a = new WeakReference(view);
        this.b = z10;
    }

    @Override // org.telegram.ui.Components.m5
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
