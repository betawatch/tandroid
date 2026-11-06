package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
