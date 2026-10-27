package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class mb0 extends ai.z0 {
    public mb0(Bundle bundle) {
        super(bundle);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        AndroidUtilities.runOnUIThread(new r00(this, 18));
    }
}
