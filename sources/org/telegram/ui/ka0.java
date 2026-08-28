package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ka0 implements View.OnLayoutChangeListener {
    public boolean a;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z10 = i12 - i10 > i11 - i9;
        if (z10 != this.a) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.hc(this, 26));
            this.a = z10;
        }
    }
}
