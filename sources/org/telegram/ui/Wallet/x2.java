package org.telegram.ui.Wallet;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class x2 extends FrameLayout implements w2 {
    public final FrameLayout a;

    public x2(Context context) {
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
