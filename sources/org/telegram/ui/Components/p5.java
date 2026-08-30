package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class p5 implements r5 {
    public final View a;
    public final boolean b;
    public Layout c;
    public u5 d;
    public Rect e;
    public l5 f;
    public Emoji.EmojiDrawable h;
    public boolean n;
    public float r;
    public float s;
    public boolean v;

    public p5(View view, boolean z4) {
        this.a = view;
        this.b = z4;
    }

    @Override // org.telegram.ui.Components.r5
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
