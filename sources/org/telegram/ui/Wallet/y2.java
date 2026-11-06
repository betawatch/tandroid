package org.telegram.ui.Wallet;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class y2 extends FrameLayout implements x2 {
    public final FrameLayout a;

    public y2(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        addView(frameLayout, c8.ha.e(-1, -2, 80));
    }

    public FrameLayout getContent() {
        return this.a;
    }
}
