package org.telegram.ui.Components;

import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class uv0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public org.telegram.ui.ActionBar.e6 a;
    public ShapeDrawable b;
    public View c;

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.b;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.j6.C1(org.telegram.ui.ActionBar.j6.r1(0.12f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ef, this.a)), shapeDrawable);
                View view = this.c;
                if (view != null) {
                    view.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
