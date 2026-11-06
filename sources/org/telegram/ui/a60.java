package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class a60 extends x5 {
    public final /* synthetic */ ww f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a60(Bundle bundle, ww wwVar) {
        super(bundle);
        this.f = wwVar;
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
