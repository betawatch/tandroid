package org.telegram.ui.Wallet;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class h2 extends FrameLayout implements g2 {
    public final FrameLayout a;

    public h2(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        addView(frameLayout, kb1.i(-1, -2, 80));
    }

    public FrameLayout getContent() {
        return this.a;
    }
}
