package org.telegram.ui.Wallet;

import android.content.Context;
import android.widget.FrameLayout;
import b8.mf;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w2 extends FrameLayout implements v2 {
    public final FrameLayout a;

    public w2(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        addView(frameLayout, mf.e(-1, -2, 80));
    }

    public FrameLayout getContent() {
        return this.a;
    }
}
