package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class u5 implements w5 {
    public final View a;
    public final boolean b;
    public Layout c;
    public z5 d;
    public Rect e;
    public q5 f;
    public Emoji.EmojiDrawable h;
    public boolean n;
    public float r;
    public float s;
    public boolean v;

    public u5(View view, boolean z10) {
        this.a = view;
        this.b = z10;
    }

    @Override // org.telegram.ui.Components.w5
    public final void invalidate() {
        View view = this.a;
        if (view != null) {
            if (!this.b || view.getParent() == null) {
                view.invalidate();
            } else {
                ((View) view.getParent()).invalidate();
            }
        }
    }
}
