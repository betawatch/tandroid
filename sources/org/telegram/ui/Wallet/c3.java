package org.telegram.ui.Wallet;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class c3 extends FrameLayout implements b3 {
    public final FrameLayout a;

    public c3(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        addView(frameLayout, c8.ma.e(-1, -2, 80));
    }

    public FrameLayout getContent() {
        return this.a;
    }
}
