package org.telegram.ui.Wallet;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class v2 extends FrameLayout implements u2 {
    public final FrameLayout a;

    public v2(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        addView(frameLayout, c8.ja.e(-1, -2, 80));
    }

    public FrameLayout getContent() {
        return this.a;
    }
}
