package org.telegram.ui.Components;

import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ww0 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public org.telegram.ui.ActionBar.p6 a;
    public ShapeDrawable b;
    public View c;

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.b;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.t6.C1(org.telegram.ui.ActionBar.t6.r1(0.12f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Bf, this.a)), shapeDrawable);
                View view = this.c;
                if (view != null) {
                    view.invalidate();
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
