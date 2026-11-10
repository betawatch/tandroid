package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class d60 extends x5 {
    public final /* synthetic */ zw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d60(Bundle bundle, zw zwVar) {
        super(bundle);
        this.f = zwVar;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        super.onTransitionAnimationEnd(z9, z10);
        if (!z9 || z10) {
            return;
        }
        this.f.removeSelfFromStack();
    }
}
