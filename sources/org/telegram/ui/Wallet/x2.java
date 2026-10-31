package org.telegram.ui.Wallet;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x2 extends FrameLayout implements w2 {
    public final FrameLayout a;

    public x2(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        addView(frameLayout, w7.b6.e(-1, -2, 80));
    }

    public FrameLayout getContent() {
        return this.a;
    }
}
