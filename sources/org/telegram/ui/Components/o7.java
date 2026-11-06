package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class o7 extends y20 {
    @Override // android.view.View
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 != 0) {
            try {
                ((ViewGroup) getParent()).removeView(this);
            } catch (Exception unused) {
            }
        }
    }
}
