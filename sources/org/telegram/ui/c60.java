package org.telegram.ui;

import android.os.Bundle;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class c60 extends x5 {
    public final /* synthetic */ yw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c60(Bundle bundle, yw ywVar) {
        super(bundle);
        this.f = ywVar;
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
