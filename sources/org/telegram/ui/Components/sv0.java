package org.telegram.ui.Components;

import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class sv0 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public org.telegram.ui.ActionBar.f6 a;
    public ShapeDrawable b;
    public View c;

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.b;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.r1(0.12f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Bf, this.a)), shapeDrawable);
                View view = this.c;
                if (view != null) {
                    view.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
