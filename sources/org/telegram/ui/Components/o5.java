package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o5 implements q5 {
    public final View a;
    public final boolean b;
    public Layout c;
    public t5 d;
    public Rect e;
    public k5 f;
    public Emoji.EmojiDrawable h;
    public boolean n;
    public float r;
    public float s;
    public boolean v;

    public o5(View view, boolean z10) {
        this.a = view;
        this.b = z10;
    }

    @Override // org.telegram.ui.Components.q5
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
