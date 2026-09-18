package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class s5 implements u5 {
    public final WeakReference a;
    public final boolean b;
    public Layout c;
    public x5 d;
    public Rect e;
    public o5 f;
    public Emoji.EmojiDrawable h;
    public boolean n;
    public float r;
    public float s;
    public boolean v;

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
