package org.telegram.ui.Components;

import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import java.lang.ref.WeakReference;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
