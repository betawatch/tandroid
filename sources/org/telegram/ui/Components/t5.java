package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class t5 implements v5 {
    public final View a;
    public final boolean b;
    public Layout c;
    public y5 d;
    public Rect e;
    public p5 f;
    public Emoji.EmojiDrawable h;
    public boolean n;
    public float r;
    public float s;
    public boolean v;

    public t5(View view, boolean z10) {
        this.a = view;
        this.b = z10;
    }

    @Override // org.telegram.ui.Components.v5
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
